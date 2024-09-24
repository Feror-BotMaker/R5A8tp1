package calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @ParameterizedTest
    @CsvSource({
            "0, 1, 1",     // opG = 0, opD = 1, expected = 1
            "1, 1, 2",     // opG = 1, opD = 1, expected = 2
            "3, -2, 1",    // opG = 3, opD = -2, expected = 1
            "2, 0, 2",     // opG = 2, opD = 0, expected = 2
            "0, 0, 0",     // opG = 0, opD = 0, expected = 0
            "-1, -2, -3"   // opG = -1, opD = -2, expected = -3
    })
    void addWithParams(int opG, int opD, int expected) {
        assertEquals(expected, Calculator.add(opG, opD));
    }

    @Test
    void divide() {
        assertEquals(2, Calculator.divide(6, 3));
    }
}