/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Parker McLeod
 */

package baseline;

import java.util.Scanner;

public class Solution29 {

    public static void main(String[] args) {
    /*
        int valid = 0
        while 'valid' = 0:
            Prompt user for rate of return 'rate'
            check if input is a number and non-zero
            if valid, 'valid' = 1
        print years it takes to double investment

     */
        Scanner scanner = new Scanner(System.in);
        int valid = 0;
        String rate = "null";
        while (valid == 0) {
            System.out.print("What is the rate of return? ");
            rate = scanner.nextLine();
            valid = isValid(rate);
        }

        System.out.printf("It will take %d years to double your initial investment.",(int) Math.ceil(72/(Double.parseDouble(rate))));
    }

    public static int isValid(String rate) {
        int flag = 0;
        int decimal = 0;
        for(int i=0;i<rate.length();i++) {
            if(rate.charAt(i) == '.') {
                decimal++;
                if (decimal > 1) {
                    flag = 1;
                }
            }
            else if(!(Character.isDigit(rate.charAt(i)))) {
                flag = 1;
            }
        }
        if(rate.equals("0")) {
            flag = 1;
        }
        if(flag == 1) {
            System.out.println("Sorry. That's not a valid input.");
        }
        else{
            return 1;
        }
        return 0;
    }




}