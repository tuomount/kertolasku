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
 * Language enumeration
 *
 */
package org.kertolasku.translation;

public class Translation {

  public static final String returnMainMenu(final Language language) {
    if (language == Language.FINNISH) {
      return "Palaa päävalikkoon";
    }
    return "Return to main menu";
  }

  public static final String mainMenu(final Language language) {
    if (language == Language.FINNISH) {
      return "Päävalikko";
    }
    return "Main Menu";
  }
  
  public static final String exitApplication(final Language language) {
    if (language == Language.FINNISH) {
      return "Lopeta";
    }
    return "Quit";
  }

  public static final String fileMenu(final Language language) {
    if (language == Language.FINNISH) {
      return "Tiedosto";
    }
    return "File";
  }

  public static final String practice(final Language language) {
    if (language == Language.FINNISH) {
      return "Harjoittele";
    }
    return "Practice";
  }

  public static final String secondTable(final Language language) {
    if (language == Language.FINNISH) {
      return "Kakkosen kertotaulu";
    }
    return "Second multiplication table";
  }

  public static final String score(final Language language) {
    if (language == Language.FINNISH) {
      return "Pisteesi:";
    }
    return "Your score:";
  }
  public static final String correct(final Language language) {
    if (language == Language.FINNISH) {
      return "Oikein:";
    }
    return "Correct:";
  }
  public static final String multiply(final Language language) {
    if (language == Language.FINNISH) {
      return "kertaa";
    }
    return "multiply";
  }

  public static final String equalsText(final Language language) {
    if (language == Language.FINNISH) {
      return "on yhtäkuin";
    }
    return "equals";
  }

  public static final String test(final Language language) {
    if (language == Language.FINNISH) {
      return "Tee koe";
    }
    return "Take test";
  }

  public static final String languageName(final Language language) {
    if (language == Language.FINNISH) {
      return "Suomi";
    }
    return "English";
  }

}
