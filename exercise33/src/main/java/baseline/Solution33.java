/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Parker McLeod
 */

package baseline;

import java.util.Random;
import java.util.Scanner;

public class Solution33 {

    public static void main(String[] args) {
    /*
        generate random number 0-3 'randNum'
        create string array "Yes," "No," "Maybe," or "Ask again later."
        Prompt user for their question
        print string[randNum]
     */

    System.out.printf("What's your question?%n> ");
    Random rand = new Random();
    Scanner scanner = new Scanner(System.in);
    String stringArray[] = {"Yes","No","Maybe","Ask again later"};
    scanner.nextLine();
    System.out.println("");
    System.out.printf("%s",stringArray[rand.nextInt(4)]);
    }

}