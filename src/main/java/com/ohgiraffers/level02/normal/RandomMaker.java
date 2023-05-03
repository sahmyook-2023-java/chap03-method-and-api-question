package com.ohgiraffers.level02.normal;

public class RandomMaker {
    public int randomNumber(int min, int max) {
        return (int)((Math.random() * (max - min)) + min);
    }

    public String randomUpperAlpabet(int length) {
        String str = "";
        for(int i = 0; i < length; i++) {
            char c = (char)((int)(Math.random()*26 +65));
            str = str.concat(String.valueOf(c));
        }

        return  str;
    }

    public String rockPaperScissors() {
        String[] rpc = {"바위", "보", "가위"};
        int i = (int)(Math.random()*3 + 0);

        return rpc[i];
    }

    public String tossCoin() {
        String[] coin = {"앞", "뒤"};
        int i = (int)(Math.random()*2 + 0);

        return coin[i];
    }

}
