/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Parker McLeod
 */

package baseline;

import java.util.Random;
import java.util.Scanner;

public class Solution32 {

    public static void main(String[] args) {
    /*
        Print formatting
        while(true):
            while(true):
                while(true):
                    Prompt user for int 'difficulty'
                    if 'difficulty' is 1,2,or 3:
                        break;
                    else:
                        print to re-enter input
            switch statement for 'difficulty':
                case 1:
                    generate random number (1-10) 'correctAnswer'
                    break
                case 2:
                    generate random number (1-100) 'correctAnswer'
                    break
                case 3:
                    generate random number (1-1000) 'correctAnswer'
                    break
            String 'guess' = "null"
            int numGuesses = 0;
            Print "I have my number. What's your guess?"
            while(true):
                get input 'guess'
                numGuesses++;
                while(!(verify input using method isValid() from exercise 31)):
                    get input 'guess'
                    numGuesses++;
                change guess to int
                if guess is too low:
                    print "num too low"
                else if guess is too high:
                    print "num too high
                else:
                    break;
            print you got it in 'numGuesses' guesses
            string playAgain = y;
            Prompt user if they want to play again 'playAgain'
            if playAgain.equals(n):
                break
     */
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        char playAgain = 'Y';

        System.out.printf("Let's play Guess the Number!%n%n");

        while(true) {
            if(playAgain == 'n' || playAgain == 'N') {
                break;
            }
            int difficulty = 0;
            while(true) {
                System.out.print("Enter the difficulty level (1, 2, or 3): ");
                difficulty = scanner.nextInt();
                if (difficulty == 1 || difficulty == 2 || difficulty == 3) {
                    break;
                } else {
                    System.out.println("Input not valid.");
                }
            }
            int correctAnswer = 0;
            switch (difficulty) {
                case 1:
                    correctAnswer = rand.nextInt(10) + 1;
                    break;
                case 2:
                    correctAnswer = rand.nextInt(100) + 1;
                    break;
                case 3:
                    correctAnswer = rand.nextInt(1000) + 1;
                    break;
                default:
                    break;
            }
            String guessStr;
            double guessDouble;
            int guessInt = 0;
            int numGuesses = 0;
            System.out.print("I have my number. What's your guess? ");
            scanner.nextLine(); // eat the newline
            while(true) {
                guessStr = scanner.nextLine();
                numGuesses++;
                while(isValid(guessStr) == 0) {
                    guessStr = scanner.nextLine();
                    numGuesses++;
                }
                guessDouble = Double.parseDouble(guessStr);
                guessInt = (int) Math.round(guessDouble);
                if(guessInt < correctAnswer) {
                    System.out.print("Too low. Guess again: ");
                }
                else if (guessInt > correctAnswer) {
                        System.out.print("Too high. Guess again: ");
                }
                else {
                    break;
                }
            }
            System.out.printf("You got it in %d guesses!%n",numGuesses);
            System.out.printf("%nDo you wish to play again (Y/N)? ");
            playAgain = scanner.next().charAt(0);
        }



    }

    public static int isValid(String num) {
        int flag = 0;
        int decimal = 0;
        for(int i=0;i<num.length();i++) {
            if(num.charAt(i) == '.') {
                decimal++;
                if (decimal > 1) {
                    flag = 1;
                }
            }
            else if(!(Character.isDigit(num.charAt(i)))) {
                flag = 1;
            }
        }
        if(flag == 1) {
            System.out.print("Sorry. That's not a valid input. Try again: ");
        }
        else{
            return 1;
        }
        return 0;
    }




}