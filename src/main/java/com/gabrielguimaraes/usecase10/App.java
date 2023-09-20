package com.gabrielguimaraes.usecase10;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the string to validate:");
            String inputString = scanner.nextLine();
            System.out.println("Enter the max length:");
            int maxLength = Integer.parseInt(scanner.nextLine());

            boolean isValid = StringValidator.isValid(inputString, maxLength);
            System.out.println("Is the string valid? " + isValid);
        }
    }
}
