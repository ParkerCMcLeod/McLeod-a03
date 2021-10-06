/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Parker McLeod
 */

package baseline;

import java.util.Scanner;

public class Solution28 {

    public static void main(String[] args) {
    /*
        declare num = 0;
        for loop 5 times:
           print prompt for number
           num = num + input()
       print num
     */
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        for(int i=0; i<5; i++) {
            System.out.print("Enter a number: ");
            num = num + scanner.nextInt();
        }
        System.out.printf("The total is %d.%n",num);

    }





}