package ru.levelup.alena.khoreva.qa_1_3.java;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class ConditionClassTest {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before ConditionClassTest.class");
    }

    @AfterClass
    public  static void afterClass() {
        System.out.println("After ConditionClassTest.class");
    }

    @Test
    public void someSecondTest() {
        System.out.println("someSecondTest");
    }
}
