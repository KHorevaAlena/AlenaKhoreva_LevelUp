package ru.levelup.alena.khoreva.qa_1_3.java;

import com.epam.tat.module4.Calculator;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@RunWith(Enclosed.class)
public class SummationTest {

    @RunWith(Parameterized.class)
    public static class SumPositive {

        @Parameterized.Parameters
        public static Object[][] data() {
            return new Object[][]{
                    {1.0, 2.0, 3.0},
                    {0, 3.0, 3.0},
                    {8.0, 2.0, 10.0},
                    {-1.0, 4.0, 3.0},
                    {3256.0, 4.0, 3260.0}
            };
        }

        @Parameterized.Parameter(0)
        public double valueA;
        @Parameterized.Parameter(1)
        public double valueB;
        @Parameterized.Parameter(2)
        public double expected;

        @Test
        public void testAdd() throws Exception {
            Calculator calculator = new Calculator();
            double actualResult = calculator.sum(valueA, valueB);
            assertEquals(expected, actualResult, 0.0001);
        }
    }

    @RunWith(Parameterized.class)
    public static class SumNegative {

        @Parameterized.Parameters
        public static Object[][] data() {
            return new Object[][]{
                    {2.0, 3.0, 4.0},
                    {1.0, 0.0, 3.0},
                    {8.0, 2.0, 6.0},
                    {-1.0, 4.0, -5.0},
                    {3250.0, 4.0, 3252.0}
            };
        }

        @Parameterized.Parameter(0)
        public double valueA;
        @Parameterized.Parameter(1)
        public double valueB;
        @Parameterized.Parameter(2)
        public double unexpected;

        @Test
        public void testSub() throws Exception {
            Calculator calculator = new Calculator();
            double actualResult = calculator.sum(valueA, valueB);
            assertNotEquals(unexpected, actualResult, 0.00001);
        }
    }
}