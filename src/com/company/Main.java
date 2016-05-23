package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double firstNumber;
        double secondNumber;
        String choice;
        hello();
        help();
        firstNumber = usersFirstNumbers();
        choice = usersChoice();
        validationOfEnter(choice);
        checkUserChoice(firstNumber, choice);
        secondNumber = usersSecondNumber();
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
        System.out.println("You can find cos and sin");


    }

    public static double usersFirstNumbers() {

        System.out.println("Enter the first number");
        Scanner scn = new Scanner(System.in);
        double firstNumber = scn.nextDouble();
        return firstNumber;

    }

    public static String usersChoice() {
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

    /**
     * Method checks what user choice: cos and sin or another action
     */

    public static void checkUserChoice(double firstNumber, String choice) {
        if (choice.equals("cos") || choice.equals("sin")) {
            resultsCosAndSin(firstNumber, choice);
        }
    }

    /**
     * Method takes results from sin and cos
     */

    public static void resultsCosAndSin(double firstNumber, String choice) {
        if (choice.equals("cos")) {
            System.out.println(cos(firstNumber));
        } else if (choice.equals("sin")) {
            System.out.println(sin(firstNumber));
        }
        stopCalculator();
    }


    public static void restart() {

        double firstNumber = usersFirstNumbers();
        String choice = usersChoice();
        validationOfEnter(choice);
        checkUserChoice(firstNumber, choice);
        double secondNumber = usersSecondNumber();
        results(firstNumber, secondNumber, choice);
        stopCalculator();
    }

    /**
     * Method asks about exit
     */
    public static void stopCalculator() {
        System.out.println("Do yo wont to exit y/n?");
        Scanner enter = new Scanner(System.in);
        String userChoice = enter.nextLine();
        if (userChoice.equals("y")) {
            System.out.println("Goodbye!");
            System.exit(0);
        } else if (userChoice.equals("n")) {
            restart();
        }

    }

    /**
     * Method checks you entered is correct
     */
    public static void validationOfEnter(String choice) {
        String q = "quit";
        String sum = "+";
        String sub = "-";
        String multi = "*";
        String div = "/";
        String cos = "cos";
        String sin = "sin";
        if (!choice.equals(sum) && !choice.equals(sub) && !choice.equals(multi) && !choice.equals(div) && !choice.equals(cos) && !choice.equals(sin)) {
            System.out.println("Incorrect enter");
            restart();
        }
    }


}
