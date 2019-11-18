package ru.levelup.alena.khoreva.qa_1_1.java;

public class Factorial {

    public int calculate(int firstNum) {
        if (firstNum <= 0)
            throw new IllegalArgumentException("Введенное значение должно быть положительным");

        int result = 1;
        for (int i = 1; i <= firstNum; i++) {
            result *= i;
        }
        return result;
    }
}
