package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        hello();
        help();
        double firstNumber = usersFirstNumbers();
        String choice = usersChoise();
        double secondNumber = usersSecondNumber();
        results(firstNumber, secondNumber, choice);
        stopCalculator();

    }

    public static void hello() {
        System.out.println("Hello! Let`s start");
    }

    public static void help() {
        System.out.println("You can use any numbers");
        System.out.println("Sum : +");
        System.out.println("Difference : -");
        System.out.println("multiplication : *");
        System.out.println("division : /");


    }

    public static double usersFirstNumbers() {

        System.out.println("Enter the first number");
        Scanner scn = new Scanner(System.in);
        double firstNumber = scn.nextDouble();
        return firstNumber;

    }

    public static String usersChoise() {
        System.out.println("Select an action");
        Scanner in = new Scanner(System.in);
        String enter = in.nextLine();
        return enter;
    }

    public static double usersSecondNumber() {

        System.out.println("Enter the second number");
        Scanner scn = new Scanner(System.in);
        double secondNumber = scn.nextDouble();
        return secondNumber;
    }

    public static void results(double firstNumber, double secondNumber, String choice) {
        if (choice.equals("+")) {
            System.out.println("Result:");
            System.out.println(firstNumber + secondNumber);

        } else if (choice.equals("-")) {
            System.out.println("Result:");
            System.out.println(firstNumber - secondNumber);

        } else if (choice.equals("*")) {
            System.out.println("Result:");
            System.out.println(firstNumber * secondNumber);

        } else if (choice.equals("/")) {
            System.out.println("Result:");
            System.out.println(firstNumber / secondNumber);

        } else if (choice.equals("^")) {
            System.out.println(pow(firstNumber, secondNumber));

        } else if (choice.equals("cos")) {
            System.out.println(cos(firstNumber));

        } else if (choice.equals("sin")) {
            System.out.println(sin(firstNumber));
        }


    }

    public static double cos(double firstNumber) {
        double rad = (firstNumber * 3.14) / 180;
        double cosX = 1 - (pow(rad, 2) / factorial(2)) + (pow(rad, 4) / factorial(4)) - (pow(rad, 6) / factorial(6));
        return cosX;
    }

    public static double sin(double firstNumber) {
        double rad = (firstNumber * 3.14) / 180;
        double sinX = rad - (pow(rad, 3)) / factorial(3) + (pow(rad, 5)) / factorial(5) - (pow(rad, 7)) / factorial(7);
        return sinX;
    }


    public static double pow(double firstNumber, double secondNumber) {
        double power = 0;

        if (secondNumber < 0) {
            System.out.println("Do not enter negative numbers!");
        } else {
            power = 1;
            for (int i = 0; i < secondNumber; i++) {
                power = power * firstNumber;
            }

        }

        return power;
    }


    public static int factorial(int num) {
        int fact;

        for (fact = 1; num > 0; fact *= num--) ;

        return fact;
    }

    public static void restart() {

        double firstNumber = usersFirstNumbers();
        String choise = usersChoise();
        double secondNumber = usersSecondNumber();
        results(firstNumber, secondNumber, choise);
        stopCalculator();
    }

    public static void stopCalculator() {
        System.out.println("Do yo wont to exit y/n?");
        Scanner enter = new Scanner(System.in);
        String userChoise = enter.nextLine();
        if (userChoise.equals("y")) {

        } else if (userChoise.equals("n")) {
            restart();
        }

    }


}
