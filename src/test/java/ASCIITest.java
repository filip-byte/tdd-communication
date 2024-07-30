import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ASCIITest {

    ASCII ascii;

    @BeforeEach
    void setup() {
        ascii = new ASCII();
    }

    @Test
    @DisplayName("Return ASCII value when a single word without special characters input")
    void calculateAsciiValue() {

        // Arrange
        String input = "Laptop";
        int expectedOutcome = 624;

        // Act
        int testResult = ascii.calculateAsciiValue(input);

        // Assert
        assertEquals(expectedOutcome, testResult);

    }
}