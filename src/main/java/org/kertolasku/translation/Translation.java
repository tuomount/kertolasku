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
  public static final String thirdTable(final Language language) {
    if (language == Language.FINNISH) {
      return "Kolmosen kertotaulu";
    }
    return "Third multiplication table";
  }
  public static final String fourthTable(final Language language) {
    if (language == Language.FINNISH) {
      return "Neljäs kertotaulu";
    }
    return "Fourth multiplication table";
  }
  public static final String fifthTable(final Language language) {
    if (language == Language.FINNISH) {
      return "Viides kertotaulu";
    }
    return "Fifth multiplication table";
  }
  public static final String sixthTable(final Language language) {
    if (language == Language.FINNISH) {
      return "Kuudes kertotaulu";
    }
    return "Sixth multiplication table";
  }
  public static final String seventhTable(final Language language) {
    if (language == Language.FINNISH) {
      return "Seitsemäs kertotaulu";
    }
    return "Seventh multiplication table";
  }
  public static final String eighthTable(final Language language) {
    if (language == Language.FINNISH) {
      return "Kahdeksas kertotaulu";
    }
    return "Eighth multiplication table";
  }
  public static final String ninethTable(final Language language) {
    if (language == Language.FINNISH) {
      return "Yhdeksäs kertotaulu";
    }
    return "Nineth multiplication table";
  }
  public static final String tenthTable(final Language language) {
    if (language == Language.FINNISH) {
      return "Kymmenes kertotaulu";
    }
    return "Tenth multiplication table";
  }
  public static final String failure(final Language language) {
    if (language == Language.FINNISH) {
      return "Et läpäisy koetta, yritä uudelleen";
    }
    return "You did not pass test, please try again.";
  }
  public static final String Success(final Language language) {
    if (language == Language.FINNISH) {
      return "Onneksi olkoon läpäisit kokeen!";
    }
    return "Congratulation you passed exam!";
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

  public static final String answer(final Language language) {
    if (language == Language.FINNISH) {
      return "Vastaa";
    }
    return "Answer";
  }

}
