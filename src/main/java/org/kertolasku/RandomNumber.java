package org.kertolasku;

import java.util.Random;

public class RandomNumber {

  /**
   * First Java's RNG
   */
  private static Random generator;

  /** Get random with using java's random
   * @param maxValue exclusive
   * @return int
   */
  public static int getRandomJava(final int maxValue) {
    if (generator == null) {
      generator = new Random();
    }
    int result = generator.nextInt(maxValue);
    return result;

  }
}
