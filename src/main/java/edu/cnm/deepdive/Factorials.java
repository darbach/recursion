package edu.cnm.deepdive;

import java.math.BigInteger;

public class Factorials {

  /**
   * Compute factorial of n using recursion.
   *
   * @param n An int value of 0 or greater.
   * @return The result of n!.
   * @throws IllegalArgumentException If n is less than 0.
   */
  public static BigInteger computeRecursive(int n) throws IllegalArgumentException {
    if (n < 0) {
      throw new IllegalArgumentException();
    }
    return (n == 0)
        ? BigInteger.ONE
        : BigInteger.valueOf(n).multiply(computeRecursive(n - 1));
  }

  public static BigInteger computeIterative(int n) throws IllegalArgumentException {
    if (n < 0) {
      throw new IllegalArgumentException();
    }
    BigInteger result = BigInteger.ONE;
    for (int i = 1; i <= n; i++) {
      result = result.multiply(BigInteger.valueOf(i));
    }
    return result;
  }
}
