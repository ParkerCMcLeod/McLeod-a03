/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Parker McLeod
 */

package baseline;

import java.util.Scanner;

public class Solution24 {

    public static void main(String[] args) {
    /*
    Prompt user for 'stringOne'
    Prompt user for 'stringTwo'
    Check the strings are the same length,
    if not - tell user they are not anagrams and return
    For each letter in 'stringOne',
    compare the frequency of that letter's occurance in 'stringOne' against 'stringTwo''s (lowercase the checks)
    If they are ever different in the loops, tell user they aren't anagrams.
    Else, tell the user if the words are anagrams.
     */

    System.out.println("Enter two strings and I'll tell you if they are anagrams:");
    System.out.print("Enter the first string: ");
    Scanner scanner = new Scanner(System.in);
    String stringOne = scanner.nextLine();
    System.out.print("Enter the second string: ");
    String stringTwo = scanner.nextLine();

    if (isAnagram(stringOne,stringTwo)) {
        System.out.printf("\"%s\" and \"%s\" are anagrams.",stringOne,stringTwo);
    } else {
        System.out.printf("\"%s\" and \"%s\" are not anagrams.",stringOne,stringTwo);
    }


    }

    public static boolean isAnagram(String stringOne,String stringTwo) {

        if(stringOne.length() != stringTwo.length()) {
            return false;
        }

        for(int i=0;i<stringOne.length();i++) {

            char letterOne = stringOne.toLowerCase().charAt(i);
            int freqOne = 0;
            int freqTwo = 0;

            for(int j=0;j<stringOne.length();j++) {

                if(stringOne.toLowerCase().charAt(j) == letterOne) {
                    freqOne++;
                }

            }

            for(int j=0;j<stringTwo.length();j++) {

                if(stringTwo.toLowerCase().charAt(j) == letterOne) {
                    freqTwo++;
                }

            }

            if(freqOne != freqTwo) {
                return false;
            }

        }

        return true;

    }

}
