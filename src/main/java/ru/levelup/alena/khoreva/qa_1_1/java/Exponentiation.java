package ru.levelup.alena.khoreva.qa_1_1.java;

public class Exponentiation {

    public double calculate(int firstNum, double secondNum) {
        double result = 1;
        for (int i = 1; i <= firstNum; i++) {
            result *= secondNum;
        }
        return result;
    }
}
