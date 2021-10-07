/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Parker McLeod
 */

package baseline;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution38 {

    public static void main(String[] args) {
    /*
        Prompt to enter number String 'numListString'
        Covert the input into an ArrayList
        call filterEvenNumbers
        print list
        function list filterEvenNumbers(list):
            create list2
            for i = 0 to list.size():
                if list.get(i) % 2 == 0:
                    list2.add(list.get(i))
     */
        System.out.print("Enter a list of numbers, separated by spaces: ");
        Scanner scanner = new Scanner(System.in);
        String numListString = scanner.nextLine();
        ArrayList<Integer> list = new ArrayList<Integer>();
        String[] convertedList = numListString.split(" ");
        for (String number : convertedList) {
            list.add(Integer.parseInt(number.trim()));
        }
        list = filterEvenNumbers(list);
        System.out.print("The even numbers are ");
        for(Integer number : list) {
            System.out.printf("%d ",number);
        }


    }

    public static ArrayList<Integer> filterEvenNumbers(ArrayList<Integer> list) {
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        for(Integer number : list) {
            if(number % 2 == 0) {
                list2.add(number);
            }
        }
        return list2;
    }


}