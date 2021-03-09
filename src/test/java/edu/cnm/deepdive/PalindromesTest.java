package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class PalindromesTest {

  @DisplayName("checkRecursive")
  @ParameterizedTest(name = "[{index}] Asserting checkRecursive({0}) == {1}.")
  @CsvFileSource(resources = "palindromes-test.csv", numLinesToSkip = 1)
  void checkRecursive(String input, boolean expected) {
    assertEquals(expected, Palindromes.checkRecursive(input));
  }
}