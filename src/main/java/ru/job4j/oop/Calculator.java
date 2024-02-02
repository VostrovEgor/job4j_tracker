package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int a) {
        return a - x;
    }

    public int divide(int a) {
        return a / x;
    }

    public int multiPly(int a) {
        return x * a;
    }

    public int sumAllOperation(int a) {
        return sum(a) + multiPly(a) + divide(a) + minus(a);
    }

    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
        Calculator calculator = new Calculator();
        System.out.println(minus(result));
        System.out.println(calculator.multiPly(result));
        System.out.println(calculator.divide(result));
        System.out.println(calculator.sumAllOperation(result));
    }
}