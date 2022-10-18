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
 * Main menu JPanel
 *
 */
package org.kertolasku.States;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.kertolasku.Commands;
import org.kertolasku.translation.Language;
import org.kertolasku.translation.Translation;

public class MainMenu extends JPanel {
  
  /**
   *
   */
  private static final long serialVersionUID = 1L;

  public MainMenu(final ActionListener listener, final Language language) {
    this.setLayout(new BorderLayout());
    JPanel top = new JPanel();
    JLabel label = new JLabel(Translation.mainMenu(language));
    top.add(label);
    this.add(top, BorderLayout.NORTH);
    JPanel west = new JPanel();
    west.setLayout(new BoxLayout(west, BoxLayout.Y_AXIS));
    label = new JLabel(Translation.practice(language));
    west.add(label);
    JButton btn = new JButton(Translation.secondTable(language));
    btn.addActionListener(listener);
    btn.setActionCommand(Commands.PRACTICE_TWO);
    west.add(btn);
    this.add(west, BorderLayout.WEST);
    JPanel east = new JPanel();
    east.setLayout(new BoxLayout(east, BoxLayout.Y_AXIS));
    label = new JLabel(Translation.test(language));
    east.add(label);
    btn = new JButton(Translation.secondTable(language));
    btn.addActionListener(listener);
    btn.setActionCommand(Commands.TEST_TWO);
    east.add(btn);
    this.add(east, BorderLayout.EAST);
  }
}
