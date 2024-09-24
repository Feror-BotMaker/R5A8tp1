package calculator;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @org.junit.jupiter.api.Test
    void add() {
        assertEquals(5, Calculator.add(2, 3));
    }

    @org.junit.jupiter.api.Test
    void divide() {
        assertEquals(2, Calculator.divide(6, 3));
    }
}