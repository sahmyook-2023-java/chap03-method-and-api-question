package com.ohgiraffers.level01.basic;

public class Application {
    public static void main(String[] args) {

        Calculator cal = new Calculator();

        cal.checkMethod();

        System.out.println("1부터 10까지의 합 : " + cal.sum1to10());

        System.out.println("두 수 중 큰 수는 " + cal.checkMaxNumber(10, 20) + "이다.");

        System.out.println("10과 20의 합은 : " + cal.sumTwoNumber(10, 20) + "이다.");

        System.out.println("10과 5의 차는 : " + cal.minusTwoNumber(10, 5) + "이다.");
    }
}
