package com.ohgiraffers.level01.basic;

public class Calculator {
    public void checkMethod() {
        System.out.println("메서드 호출 확인");
    }

    public int sum1to10() {
        return 55;
    }

    public void checkMaxNumber(int a, int b) {
        int c = Math.max(a, b);
        System.out.println("두 수 중 더 큰 수는 " + c + "입니다.");
    }

    public int sumTwoNumber(int a, int b) {
        int c = a + b;
        return c;
    }

    public int minusTwoNumber(int a, int b) {
        int c = a - b;
        return c;
    }
}
