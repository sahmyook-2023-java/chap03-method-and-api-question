package com.ohgiraffers.level01.basic;

public class Calculator {
    public void checkMethod() {
        System.out.println("This functuon has called.");
    }
    public int sum1to10() {
        return 55;
    }
    public int checkMaxNumber(int a, int b) {
        return a > b ? a : b;
    }
    public int sumTwoNumber(int a, int b) {
        int sumTwo = a + b;
        return sumTwo;
    }
    public int minusTwoNumber(int a, int b) {
        int min_num = a < b ? a : b;
        return min_num;
    }
}



