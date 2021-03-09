package edu.cnm.deepdive;

public class Palindromes {

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

}
