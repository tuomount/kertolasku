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
 * Test JPanel
 *
 */
package org.kertolasku.States;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.kertolasku.Commands;
import org.kertolasku.RandomNumber;
import org.kertolasku.translation.Language;
import org.kertolasku.translation.Translation;

public class TestState extends JPanel {

  /**
   *
   */
  private static final long serialVersionUID = 1L;

  /**
   * Which table to practice.
   */
  private int number;
  /**
   * Random number
   */
  private int number2;
  /**
   * How many questions in total
   */
  private int total;
  /**
   * How many questions correct
   */
  private int correct;
  /**
   * Label for calculation
   */
  private JLabel calculationLabel;
  /**
   * Label for total and correct
   */
  private JLabel totalLabel;
  /**
   * Answer field
   */
  private JTextField answer;
  /**
   * Langauge
   */
  private Language language;
  /**
   * Constructor for state.
   * @param title Title for state
   * @param number Which number to practice
   * @param listener Action Listener
   */
  public TestState(final String title, final int number,
      final ActionListener listener, final Language language) {
    this.language = language;
    this.number = number;
    this.number2 = RandomNumber.getRandomJava(10) + 1;
    total = 0;
    correct = 0;
    this.setLayout(new BorderLayout());
    JPanel top = new JPanel();
    JLabel label = new JLabel(title);
    top.add(label);
    this.add(top, BorderLayout.NORTH);
    JPanel center = new JPanel();
    center.setLayout(new BoxLayout(center, BoxLayout.Y_AXIS));
    totalLabel = new JLabel("Correct 100/12020");
    center.add(totalLabel);
    calculationLabel = new JLabel("8 kertaa 8 on yhtäkuin");
    center.add(calculationLabel);
    answer = new JTextField();
    answer.addKeyListener(new KeyListener() {
      
      @Override
      public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        
      }
      
      @Override
      public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        
      }
      
      @Override
      public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
          listener.actionPerformed(new ActionEvent(answer, 1, Commands.ANSWER));
        }
      }
    });
    center.add(answer);
    JButton btn = new JButton(Translation.answer(language));
    
    btn.addActionListener(listener);
    btn.setActionCommand(Commands.ANSWER);
    center.add(btn);
    this.add(center, BorderLayout.CENTER);
    updatePanel();
  }

  private void updatePanel() {
    totalLabel.setText(Translation.correct(language) + " " + correct + "/"
        + total);
    if (RandomNumber.getRandomJava(2) == 0) {
      calculationLabel.setText(number + " " + Translation.multiply(language)
          + " " + number2 + " " + Translation.equalsText(language));
    } else {
      calculationLabel.setText(number2 + " " + Translation.multiply(language)
      + " " + number + " " + Translation.equalsText(language));
    }
  }

  public void handleAction(final ActionEvent e) {
    if (e.getActionCommand().equals(Commands.ANSWER)
        && !answer.getText().isEmpty()) {
      try {
        int result = Integer.parseInt(answer.getText());
        total++;
        if (result == number * number2) {
          correct++;
        }
        this.number2 = RandomNumber.getRandomJava(10) + 1;
        answer.setText("");
      } catch (NumberFormatException exp) {
        // Do nothing
      }
      updatePanel();
    }
  }

  /**
   * Is test done?
   * @return True if done
   */
  public boolean isDone() {
    if (total == 12) {
      return true;
    }
    return false;
  }

  public boolean isSuccess() {
    if (total == 12 && total == correct) {
      return true;
    }
    return false;
  }
}
