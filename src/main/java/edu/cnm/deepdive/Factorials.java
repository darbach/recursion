package edu.cnm.deepdive;

public class Factorials {

  /**
   * Compute factorial of n using recursion.
   *
   * @param n An int value of 0 or greater.
   * @return The result of n!.
   * @throws IllegalArgumentException If n is less than 0.
   */
  public static long computeRecursive(int n) throws IllegalArgumentException {
    if (n < 0) {
      throw new IllegalArgumentException();
    }
    return (n == 0)
        ? 1
        : n * computeRecursive(n - 1);
  }
}
