/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Parker McLeod
 */

package baseline;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution36 {

    public static void main(String[] args) {
    /*
        while(true):
            Prompt user to enter a string 'num'
            if 'num' equals "done":
                break
            if 'num' isn't a number - using isValid function from exercise 31:
                print invalid
                continue:
            add 'num' to ArrayList 'numArray'
        print nums
        call functions average(),min(),max(),and standardDeviation()

        function void average(ArrayList array):
            double total
            for i = 0 to size of array
                total = total + array[i]
            double average = total / size of array
            print average

        function void min(ArrayList array):
            double min = 0
            for i = 0 to size of array
                if min < array[i]:
                    min = array[i];
            print min

        function void max(ArrayList array):
            double max = array[0]
            for i = 0 to size of array
                if max > array[i]:
                    max = array[i];
            print max

        function void standardDeviation(ArrayList array):
           double total
            for i = 0 to size of array
                total = total + array[i]
            double average = total / size of array
            double sum = 0
            for i = 0 to size of array
                sum = sum + math.pow(array[i] - average,2)
            double variance = sum / size of array
            double standardDeviation = pow(variance,.5)
            print standardDeviation

     */
        Scanner scanner = new Scanner(System.in);
        String num;
        ArrayList<Double> numArray = new ArrayList<>();
        while(true) {
            System.out.print("Enter a number: ");
            num = scanner.nextLine();
            if (num.equals("done")) {
                break;
            } else if (isValid(num) == 0) {
                continue;
            } else {
                numArray.add(Double.parseDouble(num));
            }
        }
        System.out.print("Numbers: ");
        for (Double aDouble : numArray) {
            System.out.printf("%.0f, ", aDouble);
        }
        System.out.printf("%n");
        System.out.printf("The average is %.1f%n",average(numArray));
        System.out.printf("The min is %.0f%n",min(numArray));
        System.out.printf("The max is %.0f%n",max(numArray));
        System.out.printf("The standard deviation is %.2f%n",standardDeviation(numArray));

    }

    public static double average(ArrayList<Double> numArray) {
        double total = 0;
        for (Double aDouble : numArray) {
            total = total + aDouble;
        }
        double average = total / numArray.size();
        return average;
    }

    public static double min(ArrayList<Double> numArray) {
        double min = 0;
        for(int i = 0; i < numArray.size();i++) {
            if (min < numArray.get(i)) {
                min = numArray.get(i);
            }
        }
        return min;
    }

    public static double max(ArrayList<Double> numArray) {
        double max = numArray.get(0);
        for(int i = 0; i < numArray.size();i++) {
            if (max > numArray.get(i)) {
                max = numArray.get(i);
            }
        }
        return max;
    }

    public static double standardDeviation(ArrayList<Double> numArray) {
        double total = 0;
        for (Double aDouble : numArray) {
            total = total + aDouble;
        }
        double average = total / numArray.size();
        double sum = 0;
        for (Double aDouble : numArray) {
            sum = sum + Math.pow(aDouble - average, 2);
        }
        double variance = sum / numArray.size();
        double standardDeviation = Math.sqrt(variance);
        return standardDeviation;
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
            System.out.println("Sorry. That's not a valid input.");
        }
        else{
            return 1;
        }
        return 0;
    }


}