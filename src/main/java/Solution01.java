/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Parker McLeod
 */

import java.util.Scanner;

public class Solution01 {

    public static void main(String[] args) {
        /*
        1. Prompt user for their name.
        2. Create a new instance of a Scanner object 'scanner'.
        3. Store their string response as 'name' using 'scanner'.
        4. Concatenate strings to create a custom greening with their name 'greeting'
        5. Print 'greeting' to output.
         */
        System.out.print("What is your name? ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String greeting = "Hello, " + name + ", nice to meet you!";
        System.out.print(greeting + "\n");
    }
}
