package com.ohgiraffers.level02.normal;

public class Application {
    public static void main(String[] args) {

        RandomMaker rd = new RandomMaker();

        System.out.println(rd.randomNumber(2,30));
        System.out.println(rd.randomUpperAlpabet(6));
        System.out.println(rd.rockPaperScissors());
        System.out.println(rd.tossCoin());

    }
}
