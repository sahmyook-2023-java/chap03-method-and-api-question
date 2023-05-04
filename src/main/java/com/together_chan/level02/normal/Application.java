package com.together_chan.level02.normal;

public class Application {

    public static void main(String[] args) {
        RandomMaker rm = new RandomMaker();

        System.out.println(rm.randomNumber(10, 30));
        System.out.println(rm.randomUpperAlphabet(10));
        System.out.println(rm.rockPaperScissors());
        System.out.println(rm.tossCoin());

    }
}
