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
            double firstNum = readDoubleFromKeyboard("Введите первое число:");
            double secondNum = readDoubleFromKeyboard("Введите второе число:");

            Summation sum = new Summation();
            double result = sum.calculate(firstNum, secondNum);
            System.out.println("Сумма введенных значений: " + result);
        } else if (operation.equals("-")) {
            int firstNum = readIntFromKeyboard("Введите первое число:");
            int secondNum = readIntFromKeyboard("Введите второе число:");

            Subtraction sub = new Subtraction();
            int result = sub.calculate(firstNum, secondNum);
            System.out.println("Разница введенных значений: " + result);
        } else if (operation.equals("*")) {
            double firstNum = readDoubleFromKeyboard("Введите первое число:");
            double secondNum = readDoubleFromKeyboard("Введите второе число:");

            Multiplication multipl = new Multiplication();
            double result = multipl.calculate(firstNum, secondNum);
            System.out.println("Произведение введенных значений: " + result);
        } else if (operation.equals("^")) {
            double argNum = readDoubleFromKeyboard("Введите значение аргумента:");
            int degreeNum = readIntFromKeyboard("Введите значение степени:");

            Exponentiation exp = new Exponentiation();
            double result = exp.calculate(argNum, degreeNum);
            System.out.println("Степень введенного значения: " + result);
        } else if (operation.equals("!")) {
            int number = readIntFromKeyboard("Введите число для расчета факториала:");

            Factorial factorial = new Factorial();
            int result = factorial.calculate(number);
            System.out.println("Факториал введенного числа: " + result);
        } else if (operation.equals("Fibonacci")) {
            int firstNum = readIntFromKeyboard("Введите значение для расчета числа Фибоначчи:");

            FibonacciNumber fibnc = new FibonacciNumber();
            int result = fibnc.calculate(firstNum);
            System.out.println("Число Фибоначчи: " + result);
        } else {
            System.out.println("Введенная операция не определена");
        }
    }

    private double readDoubleFromKeyboard(String prompt) {
        System.out.println(prompt);
        return sc.nextDouble();
    }

    private int readIntFromKeyboard(String prompt) {
        System.out.println(prompt);
        return sc.nextInt();
    }
}