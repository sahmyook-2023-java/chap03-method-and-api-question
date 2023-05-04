package com.together_chan.level02.normal;

public class RandomMaker {

    public static int randomNumber(int min, int max) {
        return (int)(Math.random() * max) + min;
    }

    public static String randomUpperAlphabet(int length) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < length; i++){
            sb.append((char)((int)(Math.random() * 26) + 65));
        }

        return sb.toString();
    }

    public static String rockPaperScissors() {
        int n = (int)Math.random() * 3;
        String str;

        if(n == 0) str = "가위";
        else if(n == 1) str = "바위";
        else str = "보";

        return str;
    }

    public static String tossCoin() {
        int n = (int)Math.random() * 2;
        String str;

        if(n == 0) str = "앞면";
        else str = "뒷면";

        return str;
    }
}
