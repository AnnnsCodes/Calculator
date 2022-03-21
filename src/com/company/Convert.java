package com.company;

import exceptions.*;

public class Convert {

    public static int arab (String s) throws NumberException {
        return switch (s) {
            case "I" -> 1;
            case "II" -> 2;
            case "III" -> 3;
            case "IV" -> 4;
            case "V" -> 5;
            case "VI" -> 6;
            case "VII" -> 7;
            case "VIII" -> 8;
            case "IX" -> 9;
            case "X" -> 10;
            default -> throw new NumberException();
        };
    }

    public static String rom (int n) throws ResultException {
        if (n < 1) throw new ResultException();
        int[] arabNums = { 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] romNums = {"M", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < arabNums.length; i++) {
            while (n >= arabNums[i]) {
                str.append(romNums[i]);
                n -= arabNums[i];
            }
        }
        return str.toString();
    }
}
