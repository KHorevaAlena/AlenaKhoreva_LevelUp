package ru.levelup.alena.khoreva.qa_1_3.java;

import org.junit.Test;
import com.epam.tat.module4.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import javax.naming.Name;
import java.util.Arrays;

@RunWith(Parameterized.class)
public class SummationTest {

    Calculator calculator = new Calculator();

    private long valueA;
    private long valueB;
    private long expected;

    public SummationTest(long valueA, long valueB, long expected){
        this.valueA = valueA;
        this.valueB = valueB;
        this.expected = expected;
    }

    @Parameterized.Parameters (name = "{index}: first argument: {0}, second argument: {1}, expected: {2}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, 4, 5},
                {2, -2, 0},
                {3, -10, -7}
        });
    }

    @Test
    public void positiveSumIntegersTest() {
        long result = calculator.sum(valueA, valueB);

        assertEquals(expected, result);
    }

    @Test
    public void positiveSumDoubleTest(){
        double result = calculator.sum(5.5,7.7);

        assertEquals(13.2, result, 0.00001);
    }

    @Test
    public void negativeSumIntegersTest() {
        long result = calculator.sum(4,3);

        assertNotEquals(8, result);
    }

    @Test
    public void negativeSumDoubleTest(){
        double result = calculator.sum(3.2,4.6);

        assertNotEquals(8.8, result, 0.00001);
    }
}
