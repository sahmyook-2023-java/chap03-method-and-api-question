package com.ppotatos.level02.normal;

public class Application {
    public static void main(String[] args) {

        /* RandomMaker 클래스에 있는 각 메소드를 호출 */
        RandomMaker rm = new RandomMaker();

        System.out.println(rm.randomNumber(-50, 50));
        System.out.println(rm.randomUpperAlphabet(20));
        System.out.println(rm.rockPaperScissors());
        System.out.println(rm.tossCoin());
    }
}
