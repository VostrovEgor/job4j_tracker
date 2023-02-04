package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return y + x;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int divide(int y) {
        return y / x;
    }

    public int multiPly(int y) {
        return y * x;
    }

    public int sumAllOperation(int y) {
        return sum(y) + multiPly(y) + minus(y) + divide(y);
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