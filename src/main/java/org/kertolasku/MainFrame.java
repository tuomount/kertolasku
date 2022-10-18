/**
 *
 * Kertolasku
 * Copyright (C) 2022 Tuomo Untinen
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, see http://www.gnu.org/licenses/
 *
 *
 * Main class
 *
 */

package org.kertolasku;

import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import org.kertolasku.States.EndState;
import org.kertolasku.States.MainMenu;
import org.kertolasku.States.PracticeState;
import org.kertolasku.States.TestState;
import org.kertolasku.translation.Language;
import org.kertolasku.translation.Translation;

public class MainFrame implements ActionListener {

  /**
   * JFrame for main dialog.
   */
  private JFrame frame;

  /**
   * Menu bar for main frame;
   */
  private MenuBar menuBar;
  /**
   * Selected language
   */
  private Language language;
  /**
   * Current state;
   */
  private State state;
  /**
   * Practice state
   */
  private PracticeState practiceState;
  /**
   * Test state
   */
  private TestState testState;
  /**
   * Application name
   */
  private static final String APPLICATION_NAME = "Kertolasku";
  /**
   * Constructor for main JFrame.
   */
  public MainFrame() {
    frame = new JFrame(APPLICATION_NAME);
    frame.setLocationRelativeTo(null);
    frame.setSize(800, 600);
    frame.setVisible(true);
    rebuildMenus();
    changeState(State.MAIN_MENU);
  }

  /**
   * Change state.
   * @param newState New state where to change.
   */
  public void changeState(final State newState) {
    this.state = newState;
    if (state == State.MAIN_MENU) {
      frame.getContentPane().removeAll();
      frame.getContentPane().add(new MainMenu(this, language));
      frame.validate();
    }
    if (state == State.FAILURE) {
      frame.getContentPane().removeAll();
      frame.getContentPane().add(new EndState(Translation.failure(language)));
      frame.validate();
    }
    if (state == State.SUCCESS) {
      frame.getContentPane().removeAll();
      frame.getContentPane().add(new EndState(Translation.Success(language)));
      frame.validate();
    }
  }

  /**
   * Start practice
   * @param title Title for state
   * @param number Number to practice
   */
  public void startPractice(final String title, final int number) {
    this.state = State.PRACTICE;
    frame.getContentPane().removeAll();
    practiceState = new PracticeState(title, number, this, language);
    frame.getContentPane().add(practiceState);
    frame.validate();
  }
  /**
   * Start test
   * @param title Title for state
   * @param number number to test
   */
  public void startTest(final String title, final int number) {
    this.state = State.TEST;
    frame.getContentPane().removeAll();
    testState = new TestState(title, number, this, language);
    frame.getContentPane().add(testState);
    frame.validate();
  }

  /**
   * Rebuild menus;
   */
  private void rebuildMenus() {
    menuBar = new MenuBar();
    Menu fileMenu = new Menu(Translation.fileMenu(language));
    MenuItem backToMainMenu = new MenuItem(
        Translation.returnMainMenu(language));
    backToMainMenu.setActionCommand(Commands.RETURN_MAIN_MENU);
    backToMainMenu.addActionListener(this);
    fileMenu.add(backToMainMenu);
    MenuItem exit = new MenuItem(
        Translation.exitApplication(language));
    exit.setActionCommand(Commands.EXIT);
    exit.addActionListener(this);
    fileMenu.add(exit);
    menuBar.add(fileMenu);
    Menu langMenu = new Menu("Language");
    MenuItem english = new MenuItem(
        Translation.languageName(Language.ENGLISH));
    english.setActionCommand(Translation.languageName(Language.ENGLISH));
    english.addActionListener(this);
    langMenu.add(english);
    MenuItem finnish = new MenuItem(
        Translation.languageName(Language.FINNISH));
    finnish.setActionCommand(Translation.languageName(Language.FINNISH));
    finnish.addActionListener(this);
    langMenu.add(finnish);
    menuBar.add(langMenu);
    frame.setMenuBar(menuBar);
  }
  /**
   * Main method for starting the application
   * @param args Command line parameters.
   */
  public static void main(String[] args) {
    MainFrame frame = new MainFrame();
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getActionCommand().equals(Commands.EXIT)) {
      System.exit(0);
    }
    if (e.getActionCommand().equals(Commands.RETURN_MAIN_MENU)) {
      changeState(State.MAIN_MENU);
    }
    if (e.getActionCommand().equals(Translation.languageName(
        Language.ENGLISH))) {
      language = Language.ENGLISH;
      rebuildMenus();
      frame.repaint();
    }
    if (e.getActionCommand().equals(Translation.languageName(
        Language.FINNISH))) {
      language = Language.FINNISH;
      rebuildMenus();
      frame.repaint();
    }
    if (state == State.MAIN_MENU) {
      if (e.getActionCommand().equals(Commands.PRACTICE_TWO)) {
        startPractice(Translation.practice(language)
            + " " + Translation.secondTable(language), 2);
      }
      if (e.getActionCommand().equals(Commands.TEST_TWO)) {
        startTest(Translation.test(language)
            + " " + Translation.secondTable(language), 2);
      }
    }
    if (state == State.PRACTICE && practiceState != null) {
      practiceState.handleAction(e);
    }
    if (state == State.TEST && testState != null) {
      testState.handleAction(e);
      if (testState.isDone()) {
        if (testState.isSuccess()) {
          changeState(State.SUCCESS);
        } else {
          changeState(State.FAILURE);
        }
      }
    }
  }

}
