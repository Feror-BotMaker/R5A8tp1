package calculator;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @org.junit.jupiter.api.Test
    void add() {
        assertEquals(5, calculator.add(2, 3));
    }

    @org.junit.jupiter.api.Test
    void divide() {
        assertEquals(2, calculator.divide(6, 3));
    }
}