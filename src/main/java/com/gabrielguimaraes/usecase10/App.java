package com.gabrielguimaraes.usecase10;

public class App {

    public static void main(String[] args) {
        String input = args[0];
        int maxLength = Integer.parseInt(args[1]);
        boolean valid = StringValidator.isValid(input, maxLength);
        System.out.printf("The input %s is valid? %s", input, valid);
    }
}
