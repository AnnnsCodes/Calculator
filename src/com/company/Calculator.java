package com.company;

import exceptions.*;

public class Calculator {
    public void count(String in) throws SignException, NumberException, ResultException, LengthException {
        if (in.length() > 5) throw new LengthException();
        int a, b, result;
        boolean numType = false;
        String[] mas = in.split(" ");
        try {
            a = Integer.parseInt(mas[0]);
            b = Integer.parseInt(mas[2]);
        } catch (NumberFormatException e) {
            a = Convert.arab(mas[0]);
            b = Convert.arab(mas[2]);
            numType = true;
        }

        if ((a > 0 && a < 11) && (b > 0 && b < 11)) {
            result = switch (mas[1]) {
                case "+" -> a + b;
                case "-" -> a - b;
                case "*" -> a * b;
                case "/" -> a / b;
                default -> throw new SignException();

            };
        } else
            throw new NumberException();


        if (numType)
            System.out.println(Convert.rom(result));
        else
            System.out.println(result);
    }

}
