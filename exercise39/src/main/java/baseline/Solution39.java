/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Parker McLeod
 */

package baseline;

public class Solution39 {

    public static void main(String[] args) {
        /*
            Create class Record that stores Strings 'firstName','lastName','department',and 'seperationDate'
            Create 'recordArray' filled with Records of sample data
            Create 'recordArraySorted' the size of recordArray
            sort each of the records using quicksort and copying the array
            print the sorted records
         */
        Record[] recordArray = {
                new Record("John", "Johnson", "Manager", "2016-12-31"),
                new Record("Tou", "Xiong", "Software Engineer", "2016-10-05"),
                new Record("Michaela", "Michaelson", "District Manager", "2015-12-19"),
                new Record("Jake", "Jacobson", "Programmer", ""),
                new Record("Jackquelyn", "Jackson", "DBA", ""),
                new Record("Sally", "Webber", "Web Developer", "2015-12-18")
        };

        Record[] recordArraySorted = new Record[Record.numRecords];


        for (int i = 0; i < Record.numRecords; i++) {
            int position = 0;
            for (int j = 0; j < Record.numRecords; j++) {
                 if(recordArray[i].lastName.compareTo(recordArray[j].lastName) > 0) {
                     position++;
                 }
            }
            recordArraySorted[position] = recordArray[i];
        }

        System.out.println("Name                | Position          | Separation Date");
        System.out.println("--------------------|-------------------|----------------");
        for (int i = 0; i < Record.numRecords; i++) {
            String temp = recordArraySorted[i].firstName + " " + recordArraySorted[i].lastName;
            System.out.printf("%-20.20s| %-18.18s| %-20.20s%n",temp,recordArraySorted[i].department,recordArraySorted[i].seperationDate);
        }

    }

}
