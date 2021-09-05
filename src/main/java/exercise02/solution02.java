/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Joao Pedro Oliveira
 */

package exercise02;

import java.util.Scanner;

public class solution02 {

    /*
        Print "What is the input string?"

        'str' = string input from user

        determine length of 'str'

        'count' = length of 'str'

        print "'str' has 'count' characters"
     */

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the input string");

        String str = scanner.nextLine();

        int count = str.length();

        System.out.println(str + " has " + count + " characters.");




    }
}
