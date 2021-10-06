/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Parker McLeod
 */

package baseline;

public class Solution24 {

    public static void main(String[] args) {
    /*
    function passwordValidator inputs 'password':
    if 'password' is only numbers and less than eight characters return 1
    if 'password' is only letter and fewer than eight chars, return 2
    if 'password' contains letters and numbers and is eight plus characters, return 3
    if 'password' contains letter, numbers, and a special character and is more than seven chars, return 4
    based on output of function, tell the user how strong some example passwords are
     */




    }

    public static int passwordValidator(String password) {

        int length = password.length();
        int containsNums = 0;
        int containsLetters = 0;
        int containsSpecial = 0;

        for(int i=0; i<length;i++) {

            if(Character.isDigit(password.charAt(i))) {
                containsNums = 1;
            }
            else if(Character.isLetter(password.charAt(i))) {
                containsNums = 1;
            }
            else {
                containsSpecial = 1;
            }

        }

        if(length<8) {
            if(containsNums == 1 & containsLetters == 0 ) {
                return 1
            }
            else if(containsNums == 0 & containsLetters == 1) {
                return 2
            }
        } else {

        }

    }



}
