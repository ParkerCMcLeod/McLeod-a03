/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Parker McLeod
 */

package baseline;

public class Solution30 {

    public static void main(String[] args) {
    /*
        for(int row = 1;row<13;row++):
            for(int col = 1;col<13;col++):
                print( row * col) - the number of spaces will be decided by how long row*col is.
                                    ...for each digit, minus a space
            print(\n)

     */
    for(int row = 1;row<13;row++) {
        for(int col = 1;col<13;col++){
            if(row*col < 10) {
                System.out.printf("%d    ", row * col);
            } else if (row*col<100) {
                System.out.printf("%d   ", row * col);
            } else {
                System.out.printf("%d  ", row * col);
            }
        }
        System.out.printf("%n");
    }

    }






}