/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Parker McLeod
 */

package baseline;

import java.util.*;

public class Solution37 {

    public static void main(String[] args) throws Exception {
    /*
        Prompt for 'minLen'
        Promp for 'numSpecialChars'
        Prompt for 'numNums'
        if('minLen' - ('numSpecialChars' + 'numNums') > ('numSpecialChars' + 'numNums')):
            throw error - needs to be as many letters as special chars and nums
        generate a list of random numbers,special chars, and letters in no particular order
        randomly print the list above
     */
        List<Character> list = new ArrayList<Character>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("What's the minimum length? ");
        int minLen = scanner.nextInt();
        System.out.print("How many special characters? ");
        int numSpecialChars = scanner.nextInt();
        System.out.print("How many numbers? ");
        int numNums = scanner.nextInt();
        int numLetters = minLen - (numSpecialChars + numNums);
        if(numLetters > (numSpecialChars + numNums)) {
            throw new Exception("Ensure that there are at least as many letters as there are special characters and numbers.");
        }
        list = addLetters(list,numLetters);
        list = addSpecialChars(list,numSpecialChars);
        list = addNums(list,numNums);

        Collections.shuffle(list);

        System.out.print("Your password is ");
        for(int i=0;i<minLen;i++) {
            System.out.printf("%c",list.get(i));
        }



    }

    private static List<Character> addLetters(List<Character> list,int numLetters) {
        Random rand= new Random();
        for(int i=0;i<numLetters;i++) {
            char c = (char) (rand.nextInt(26) + 'a');
            list.add(c);
        }
        return list;
    }

    private static List<Character> addSpecialChars(List<Character> list,int numSpecialChars) {
        Random rand= new Random();
        String specialChars = "~`!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?";
        for(int i=0;i<numSpecialChars;i++) {
            char c = specialChars.charAt(rand.nextInt(specialChars.length()));
            list.add(c);
        }
        return list;
    }

    private static List<Character> addNums(List<Character> list,int numNums) {
        Random rand= new Random();
        for(int i=0;i<numNums;i++) {
            char c = (char) (rand.nextInt(10)+48);
            list.add(c);
        }
        return list;
    }

}