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
 * End state
 *
 */
package org.kertolasku.States;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class EndState extends JPanel {

  /**
   *
   */
  private static final long serialVersionUID = 1L;

  public EndState(final String title) {
    this.setLayout(new BorderLayout());
    JPanel center = new JPanel();
    JLabel label = new JLabel(title);
    center.add(label);
    this.add(center, BorderLayout.CENTER);
  }
}
