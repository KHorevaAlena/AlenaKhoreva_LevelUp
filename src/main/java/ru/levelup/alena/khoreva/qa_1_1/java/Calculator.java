package ru.levelup.alena.khoreva.qa_1_1.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    private Scanner sc;

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        try {
            calc.startCalculatorApp();
        } catch (InputMismatchException ex) {
            System.out.println("Введенное значение не соотвествует числу");
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getLocalizedMessage());
        }
    }

    private void startCalculatorApp() {

        sc = new Scanner(System.in);
        System.out.println("Введите необходимую операцию: +, -, *, ^, !, Fibonacci: ");
        String operation = sc.next();

        if (operation.equals("+")) {
            double firstNum = ReadDoubleFromKeyboard("Введите первое число:");
            double secondNum = ReadDoubleFromKeyboard("Введите второе число:");

            Summation sum = new Summation();
            double result = sum.calculate(firstNum, secondNum);
            System.out.println("Сумма введенных значений: " + result);
        } else if (operation.equals("-")) {
            int firstNum = ReadIntFromKeyboard("Введите первое число:");
            int secondNum = ReadIntFromKeyboard("Введите второе число:");

            Subtraction sub = new Subtraction();
            int result = sub.calculate(firstNum, secondNum);
            System.out.println("Разница введенных значений: " + result);
        } else if (operation.equals("*")) {
            double firstNum = ReadDoubleFromKeyboard("Введите первое число:");
            double secondNum = ReadDoubleFromKeyboard("Введите второе число:");

            Multiplication multipl = new Multiplication();
            double result = multipl.calculate(firstNum, secondNum);
            System.out.println("Произведение введенных значений: " + result);
        } else if (operation.equals("^")) {
            int firstNum = ReadIntFromKeyboard("Введите значение степени:");
            double secondNum = ReadDoubleFromKeyboard("Введите значение аргумента:");

            Exponentiation exp = new Exponentiation();
            double result = exp.calculate(firstNum, secondNum);
            System.out.println("Степень введенного значения: " + result);
        } else if (operation.equals("!")) {
            int firstNum = ReadIntFromKeyboard("Введите число для расчета факториала:");

            Factorial factorial = new Factorial();
            int result = factorial.calculate(firstNum);
            System.out.println("Факториал введенного числа: " + result);
        } else if (operation.equals("Fibonacci")) {
            int firstNum = ReadIntFromKeyboard("Введите значение для расчета числа Фибоначчи:");

            FibonacciNumber fibnc = new FibonacciNumber();
            int result = fibnc.calculate(firstNum);
            System.out.println("Число Фибоначчи: " + result);
        } else {
            System.out.println("Введенная операция не определена");
        }
    }

    private double ReadDoubleFromKeyboard(String prompt) {
        System.out.println(prompt);
        return sc.nextDouble();
    }

    private int ReadIntFromKeyboard(String prompt) {
        System.out.println(prompt);
        return sc.nextInt();
    }
}