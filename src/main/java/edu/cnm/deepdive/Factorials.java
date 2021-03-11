package edu.cnm.deepdive;

import java.math.BigInteger;

/**
 * The Factorials class contains methods for computing the factorial value of (n!) using,
 * recursion and iteration.
 */
public class Factorials {

  /**
   * Using recursion, computes the factorial function value (n!) for the provided parameter value.
   *
   * @param n the factorial value to be calculated
   * @return the result of (n!)
   * @throws IllegalArgumentException if n is less than 0
   */
  public static BigInteger computeRecursive(int n) throws IllegalArgumentException {
    if (n < 0) {
      throw new IllegalArgumentException();
    }
    return (n == 0)
        ? BigInteger.ONE
        : BigInteger.valueOf(n).multiply(computeRecursive(n - 1));
  }

  /**
   * Using iteration, computes the factorial function value (n!) for the provided parameter value.
   *
   * @param n the factorial value to be calculated
   * @return the result of (n!)
   * @throws IllegalArgumentException if n is less than 0
   */
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
