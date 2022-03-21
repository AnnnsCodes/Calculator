package com.company;

import exceptions.*;
import java.io.*;


public class Main {

    public static void main(String[] args) {
        try {
            Calculator expr = new Calculator();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String str = bufferedReader.readLine();
            expr.count(str);
        }
        catch (IOException | SignException | NumberException | ResultException | LengthException e) {
            e.printStackTrace();
        }

    }
}
