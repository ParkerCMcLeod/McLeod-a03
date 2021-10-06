/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Parker McLeod
 */

package baseline;

import java.util.Scanner;

public class Solution34 {

    public static void main(String[] args) {
    /*
        print employees
        Create String array of employee names 'nameArray1'
        Create empty String array of employee names 'nameArray2'
        Prompt user for name to remove 'nameForRemoval'
        for i to length of 'nameArray':
            if not nameArray[i].equals(nameForRemoval):
                add that element to nameArray2
        print employees
     */
        String[] nameArray1 = {"John Smith","Jackie Jackson","Chris Jones","Amanda Cullen","Jeremy Goodwin"};
        String[] nameArray2 = new String[5];
        System.out.printf("There are %d employees: %n",nameArray1.length);

        for (String s : nameArray1) {
            System.out.printf("%s%n", s);
        }

        System.out.printf("%nEnter an employee name to remove: ");
        Scanner scanner = new Scanner(System.in);
        String nameForRemoval = scanner.nextLine();
        System.out.println("");

        int j = 0;
        for (String s : nameArray1) {
            if (!(s.equals(nameForRemoval))) {
                nameArray2[j] = s;
                j++;
            }
        }

        for (String s : nameArray2) {
            if(s != null) {
                System.out.printf("%s%n", s);
            }
        }

    }

}