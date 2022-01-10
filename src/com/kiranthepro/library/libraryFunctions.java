package com.kiranthepro.library;

import java.util.Scanner;

public class libraryFunctions {

    private static int b = 7;

    public static int getInteger(String prompt) {
        System.out.println(prompt);

        try {
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Something went wrong - please type a valid integer");
            return  getInteger(prompt);
        }
    }

    public static String getString(String prompt) {
        System.out.println(prompt);

        try {
            Scanner scanner = new Scanner(System.in);
            return scanner.next();
        } catch (Exception e) {
            System.out.println("Something went wrong - please type a valid String");
            return  getString(prompt);
        }
    }

    public static Double getDouble(String prompt) {
        System.out.println(prompt);

        try {
            Scanner scanner = new Scanner(System.in);
            return scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("Something went wrong - please type a valid Double");
            return  getDouble(prompt);
        }
    }

}
