package ru.levelup.alena.khoreva.qa_1_1.java;

public class FibonacciNumber {

    public int calculate(int num) {
        if (num == 0)
            return 0;

        if (num == 1)
            return 1;

        int prev = 0;
        int current = 1;
        int next = 1;

        for (int i = 2; i < num; i++) {
            next = current + prev;
            int temp = current;
            current = next;
            prev = temp;
        }

        return next;
    }
}
