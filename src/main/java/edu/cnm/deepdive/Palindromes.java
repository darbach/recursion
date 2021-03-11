package edu.cnm.deepdive;

/**
 * The Palindromes class contains methods for determining whether a string is a palindrome.
 * According to
 * <a href="https://www.merriam-webster.com/dictionary/palindrome">Merriam-Webster, a palindrome</a>
 * is "a word, verse, or sentence (such as "Able was I ere I saw Elba") or a number (such as 1881)
 * that reads the same backward or forward".
 */
public class Palindromes {

  /**
   * Using recursion, determines whether a normalized {@code String} is a palindrome. The argument
   * must already have any whitespace and punctuation removed, and all letters must have the
   * same case.
   *
   * @param str the string to check
   * @return {@code true} if string is a palindrome, {@code false} otherwise
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
   * Using recursion, determines whether a denormalized {@code String} is a palindrome. Any
   * whitespace, punctuation, and differences in letter casing are ignored.
   *
   * @param str the string to check
   * @return {@code true} if string is a palindrome, {@code false} otherwise
   */
  public static boolean checkDenormalized(String str) {
    String clean = str.replaceAll("[\\W_]+", "").toLowerCase();
    return checkRecursive(clean);
  }

  /**
   * Using iteration, determines whether a normalized {@code String} is a palindrome. The argument
   * must already have any whitespace and punctuation removed, and all letters must have the
   * same case.
   *
   * @param str the string to check
   * @return {@code true} if string is a palindrome, {@code false} otherwise
   */
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
