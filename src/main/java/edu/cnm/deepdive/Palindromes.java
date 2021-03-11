package edu.cnm.deepdive;

public class Palindromes {

  /**
   * Determine if a string is a palindrome. Input should have nothing but alphabet characters,
   * or be an empty string.
   *
   * @param str The string to check.
   * @return Is the string is a palindrome?
   */
  public static boolean checkRecursive(String str) {
    // Base case.
    if (str.length() == 0 || str.length() == 1) {
      return true;
    }
    // Compare the first and last characters.
    String first = str.substring(0, 1);
    String last = str.substring(str.length() - 1);
    if (!first.equals(last)) {
      return false;
    }
    // Check the middle part of the input.
    return checkRecursive(str.substring(1, str.length() - 1));
  }

  /**
   * Determine if a string is a palindrome. Strips out all punctuation and whitespace.
   *
   * @param str The string to check.
   * @return Is the string is a palindrome?
   */
  public static boolean checkDenormalized(String str) {
    String clean = str.replaceAll("[\\W_]+", "").toLowerCase();
    return checkRecursive(clean);
  }

  public static boolean checkIterative(String str) {
    if (str.length() == 0 || str.length() == 1) {
      return true;
    }
    char[] strChar = str.toCharArray();
    for (int i = 0, j = strChar.length - 1; i < j; i++, j--) {
      if (strChar[i] != strChar[j]) {
        return false;
      }
    }
    return true;
  }
}
