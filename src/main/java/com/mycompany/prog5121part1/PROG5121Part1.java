package com.mycompany.prog5121part1;

import java.util.Scanner;

public class PROG5121Part1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // USERNAME
        System.out.println("Enter your username:");
        String username = sc.nextLine();
        boolean validUser = checkUsername(username);

        // PASSWORD
        System.out.println("Enter your password:");
        String password = sc.nextLine();
        boolean validPass = checkPasswordComplexity(password);

        // CELLPHONE
        System.out.println("Enter your cellphone number:");
        String cellphone = sc.nextLine();
        boolean validPhone = checkCellphoneNumber(cellphone);

        // REGISTRATION RESULT
        if (validUser && validPass && validPhone) {
            System.out.println("Registration successful");
        } else {
            System.out.println("Registration failed");
            return; // stop program if invalid
        }

        // LOGIN
        System.out.println("Enter username to login:");
        String loginUser = sc.nextLine();

        System.out.println("Enter password to login:");
        String loginPass = sc.nextLine();

        if (loginUser(username, password, loginUser, loginPass)) {
            System.out.println("Login successful");
        } else {
            System.out.println("Login failed");
        }
    }

    // USERNAME VALIDATION
    public static boolean checkUsername(String username) {

        if (username.length() <= 5 && username.contains("_")) {
            System.out.println("Username successfully captured");
            return true;
        } else {
            System.out.println("Username is not correctly formatted.");
            return false;
        }
    }

    // PASSWORD VALIDATION
    public static boolean checkPasswordComplexity(String password) {

        if (password.length() >= 8 &&
            password.matches(".*[A-Z].*") &&
            password.matches(".*\\d.*") &&
            password.matches(".*[^A-Za-z0-9].*")) {

            System.out.println("Password successfully captured");
            return true;

        } else {
            System.out.println("Password is not correctly formatted.");
            return false;
        }
    }

    // CELLPHONE VALIDATION
    public static boolean checkCellphoneNumber(String cellphone) {

        if (cellphone.matches("\\+27\\d{9}")) {
            System.out.println("Cellphone number successfully captured");
            return true;

        } else {
            System.out.println("Cellphone number incorrectly formatted.");
            return false;
        }
    }

    // LOGIN METHOD
    public static boolean loginUser(String regUser, String regPass, String loginUser, String loginPass) {

        return regUser.equals(loginUser) && regPass.equals(loginPass);
    }
}