package ru.levelup.alena.khoreva.qa_1_3.java;
import com.epam.tat.module4.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;


public class DivisionTest {

    Calculator calculator = new Calculator();

    @Test
    public void positiveDivLongTest() {
        long result = calculator.div(8, 4);
        assertEquals(2, result);
    }

    @Test
    public void positiveDivDoubleTest() {
        double result = calculator.div(10.2, 5.1);
        assertEquals(2, result, 0.00001);
    }

    @Test
    public void negativeDivLongTest() {
        long result = calculator.div(9, 3);
        assertNotEquals(5, result);
    }

    @Test
    public void negativeDivDoubleTest() {
        double result = calculator.div(6.6, 2.2);
        assertNotEquals(4, result, 0.00001);
    }
}
