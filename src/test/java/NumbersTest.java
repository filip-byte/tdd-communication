import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

    @Test
    @DisplayName("Sums up all numbers from the array without the smallest and largest ones")
    void sumNumbersWithoutTheMaxAndMin() {

        Numbers numbers = new Numbers();

        // Arrange
        int[] inputArray1 = new int[]{10, 20, 50};
        int[] inputArray2 = new int[]{};
        int[] inputArray3 = null;
        int[] inputArray4 = new int[]{10};
        int[] inputArray5 = new int[]{1,1,1,1,1,1};

        int expectedOutcome1 = 20;
        int expectedOutcome2 = 0;
        int expectedOutcome3 = 0;
        int expectedOutcome4 = 0;
        int expectedOutcome5 = 0;

        // Act

        int testResult1 = numbers.sumNumbersWithoutTheMaxAndMin(inputArray1);
        int testResult2 = numbers.sumNumbersWithoutTheMaxAndMin(inputArray2);
        int testResult3 = numbers.sumNumbersWithoutTheMaxAndMin(inputArray3);
        int testResult4 = numbers.sumNumbersWithoutTheMaxAndMin(inputArray4);
        int testResult5 = numbers.sumNumbersWithoutTheMaxAndMin(inputArray5);

        // Assert

        assertAll(
                () -> assertEquals(expectedOutcome1, testResult1),
                () -> assertEquals(expectedOutcome2, testResult2),
                () -> assertEquals(expectedOutcome3, testResult3),
                () -> assertEquals(expectedOutcome4, testResult4),
                () -> assertEquals(expectedOutcome5, testResult5)
        );


    }
}