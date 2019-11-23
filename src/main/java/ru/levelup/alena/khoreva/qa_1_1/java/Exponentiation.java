package ru.levelup.alena.khoreva.qa_1_1.java;

public class Exponentiation {

    public double calculate(double argNum, int degreeNum) {
        double result = 1;
        for (int i = 1; i <= degreeNum; i++) {
            result *= argNum;
        }
        return result;
    }
}
