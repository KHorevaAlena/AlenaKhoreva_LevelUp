package ru.levelup.alena.khoreva.qa_1_3.java;
import com.epam.tat.module4.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;


public class SubstractionTest {

    Calculator calculator = new Calculator();

    @Test
    public void positiveSubLongTest() {
        long result = calculator.sub(7, 6);
        assertEquals(1, result);
    }

    @Test
    public void positiveSubDoubleTest() {
        double result = calculator.sub(2.2, 1.1);
        assertEquals(1.1, result, 0.00001);
    }

    @Test
    public void negativeSubLongTest() {
        long result = calculator.sub(5,2);
        assertNotEquals(2, result);
    }

    @Test
    public void negativeSubDoubleTest() {
        double result = calculator.sub(9.4, 8.3);
        assertNotEquals(4.4, result, 0.00001);
    }
}
