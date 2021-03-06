package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigInteger;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class FactorialsTest {

  @DisplayName("computeRecursive(non-exceptions)")
  @ParameterizedTest(name = "[{index}] Asserting computeRecursive({0}) == {1}.")
  @CsvFileSource(resources = "factorials-test-non-exception.csv", numLinesToSkip = 1)
  void computeRecursive_nonException(int input, BigInteger expected) {
    assertEquals(expected, Factorials.computeRecursive(input));
  }

  @DisplayName("computerRecursive(exceptions)")
  @ParameterizedTest(name = "[{index}] Asserting computeRecursive_exception({0}) throws {1}.")
  @CsvFileSource(resources = "factorials-test-exception.csv", numLinesToSkip = 1)
  void computeRecursive_exception(int input, Class<? extends Throwable> expectedException) {
    assertThrows(expectedException, () -> Factorials.computeRecursive(input));
  }

  @DisplayName("computeIterative(non-exceptions)")
  @ParameterizedTest(name = "[{index}] Asserting computeIterative({0}) == {1}.")
  @CsvFileSource(resources = "factorials-test-non-exception.csv", numLinesToSkip = 1)
  void computeIterative_nonException(int input, BigInteger expected) {
    assertEquals(expected, Factorials.computeIterative(input));
  }

  @DisplayName("computeIterative(exceptions)")
  @ParameterizedTest(name = "[{index}] Asserting computeIterative_exception({0}) throws {1}.")
  @CsvFileSource(resources = "factorials-test-exception.csv", numLinesToSkip = 1)
  void computeIterative_exception(int input, Class<? extends Throwable> expectedException) {
    assertThrows(expectedException, () -> Factorials.computeIterative(input));
  }
}