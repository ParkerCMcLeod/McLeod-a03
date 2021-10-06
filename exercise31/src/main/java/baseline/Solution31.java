/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Parker McLeod
 */

package baseline;

import java.util.Scanner;

public class Solution31 {

    public static void main(String[] args) {
    /*
        Prompt for 'restingPulseString'
        Validate input using while loop and isValid() from exercise29
        Prompt for 'ageString'
        Validate input using while loop and isValid() from exercise29
        Format print intensity and rate
        for(double intensity = .55; intensity < 1; intensity + .05):
            calculate BPM
            print intensity and BPM formatted

     */
        String restingPulseString = "null";
        String ageString = "null";

        Scanner scanner = new Scanner(System.in);
        int valid = 0;
        String rate = "null";
        while (valid == 0) {
            System.out.print("Resting Pulse: ");
            restingPulseString = scanner.nextLine();
            valid = isValid(restingPulseString);
        }
        valid = 0;
        while (valid == 0) {
            System.out.print("Age: ");
            ageString = scanner.nextLine();
            valid = isValid(ageString);
        }

        double restingPulse = Double.parseDouble(restingPulseString);
        double age = Double.parseDouble(ageString);

        double targetHeartRate;
        System.out.printf("Resting Pulse: %.0f        Age: %.0f%n%nIntensity    | Rate%n-------------|--------%n",restingPulse,age);
        for(double intensity = .55; intensity < 1.0; intensity = intensity + .05) {
            targetHeartRate = ((220-age) - restingPulse)*intensity+restingPulse;
            System.out.printf("%.0f%%          | %.0f bpm%n",(intensity * 100),targetHeartRate);
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
        if(num.equals("0")) {
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