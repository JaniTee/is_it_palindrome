package com.company;

// Program asks for input and check if it is a palindrome.

import java.lang.StringBuilder;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        while(true) {

            Scanner reader = new Scanner(System.in);
            StringBuilder sb = new StringBuilder();

            System.out.println("Give a word, let's check if it is a palindrome. Type 'quit' to end the program.");

            String input = reader.nextLine();   // Input of the user.

            // If input is "quit"(case spesific), the program will end.
            if(input.equals("quit")) {
                break;
            }

            sb.setLength(input.length());

            int j = 0;
            for (int i = input.length() - 1; i >= 0; i--) {
                sb.setCharAt(j, input.charAt(i));
                j++;
            }

            String inputReversed = sb.toString();

            //Now we have string and reversed string, lets compare them.

            input = input.toLowerCase();
            inputReversed = inputReversed.toLowerCase();

            if (input.equals(inputReversed)) {
                System.out.println("The word is a palindrome!\n");
            } else {
                System.out.println("The word is not a palindrome!\n");
            }
        }
    }
}
