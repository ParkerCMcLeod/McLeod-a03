/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Parker McLeod
 */

package baseline;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Solution35 {

    public static void main(String[] args) {
    /*
        ArrayList<String> nameArray = new ArrayList<String>
        while(true):
            nameArray.add(<input from keyboard.)
            if(nameArray.get(nameArray.size()-1) is empty) :
                break
            generate random num 'randNum' 0 to size of nameArray
            print the winner
     */

        ArrayList<String> nameArray = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("Enter a name: ");
            nameArray.add(scanner.nextLine());
            if(nameArray.get(nameArray.size()-1).isEmpty()) {
                break;
            }
        }
        Random rand = new Random();
        int randNum = rand.nextInt(nameArray.size());
        System.out.printf("The winner is... %s",nameArray.get(randNum));

    }


}