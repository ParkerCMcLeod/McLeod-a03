/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Parker McLeod
 */

package baseline;

public class Solution26 {

    public static void main(String[] args) {
    /*
    In function PaymentCalculator.calculateMonthsUntilPaidOff():
        Prompt user for balance 'balance' and round up to two decimals
        Prompt user for APR as a percentage 'APR'
        Prompt user for monthly payment 'payment'
        Implement the formula n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
        Round n up.
        Print the number of months it will take for you to pay the card.
    in main:
        call function PaymentCalculator.calculateMonthsUntilPaidOff()
     */
    System.out.printf("It will take you %d months to pay off this card.",PaymentCalculator.calculateMonthsUntilPaidOff());



    }




}