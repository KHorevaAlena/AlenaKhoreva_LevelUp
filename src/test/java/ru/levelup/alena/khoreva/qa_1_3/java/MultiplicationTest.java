package ru.levelup.alena.khoreva.qa_1_3.java;
import com.epam.tat.module4.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;


public class MultiplicationTest {

    Calculator calculator = new Calculator();

    @Test
    public void positiveMultiLongTest() {
        long result = calculator.mult(3,2);
        assertEquals(6, result);
    }

    @Test
    public void positiveMultiDoubleTest() {
        double result = calculator.mult(1.5, 2.5);
        assertEquals(3.75, result, 0.00001);
    }

    @Test
    public void negativeMultiLongTest() {
        long result = calculator.mult(2,5);
        assertNotEquals(9, result);
    }

    @Test
    public void negativeDoubleTest() {
        double result = calculator.mult(1.2, 3.2);
        assertNotEquals(3.3, result, 0.00001);
    }

}
