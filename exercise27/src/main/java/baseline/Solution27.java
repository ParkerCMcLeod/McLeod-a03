/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Parker McLeod
 */

package baseline;

import java.util.Scanner;

public class Solution27 {

    public static void main(String[] args) {
    /*
    function int validateFirstName(String firstName):
        Check that name is at least two char long
        Check that name is filled in
        return 0 if no error
        return 1 if error
    function int validateLastName(String lastName):
        Check that name is at least two char long
        Check that name is filled in
        return 0 if no error
        return 1 if error
    function int validateID(String id):
        Check that the id is in the format two letters, a hyphen, and four numbers
        return 0 if no error
        return 1 if error
    function int validateZip(String zip):
        Check that the zip is a number
        return 0 if no error
        return 1 if error
    function void validateInput(String firstName, String lastName, String zip, String id):
        calls each of the functions above
    MAIN:
        Prompt user for 'firstName'
        Prompt user for 'lastName'
        prompt user for 'id'
        prompt user for 'zip'
        call validateInput
     */
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the first name: ");
    String firstName = scanner.nextLine();
    System.out.print("Enter the last name: ");
    String lastName = scanner.nextLine();
    System.out.print("Enter the ZIP code: ");
    String zip = scanner.nextLine();
    System.out.print("Enter the employee ID: ");
    String id = scanner.nextLine();
    validateInput(firstName,lastName,zip,id);
    }

    static int validateFirstName(String firstName) {
        int output = 0;
        if(firstName.length() < 2) {
            System.out.println("The first name must be at least 2 characters long.");
            output = 1;
        }
        if(firstName.isEmpty()) {
            System.out.println("The first name must be filled in.");
            output = 1;
        }
        return output;
    }
    static int validateLastName(String lastName) {
        int output = 0;
        if(lastName.length() < 2) {
            System.out.println("The last name must be at least 2 characters long.");
            output = 1;
        }
        if(lastName.isEmpty()) {
            System.out.println("The last name must be filled in.");
            output = 1;
        }
        return output;
    }
    static int validateZip(String zip) {
        int output = 0;
        if(zip.length() != 5) {
            System.out.println("The zipcode must be a 5 digit number.");
            output = 1;
        }
        else {
            for (int i = 0; i < zip.length(); i++) {
                if (!(Character.isDigit(zip.charAt(i)))) {
                    System.out.println("The zipcode must be a 5 digit number.");
                    output = 1;
                    break;
                }
            }
        }
        return output;
    }
    static int validateID(String id) {
        int output = 0;
        if(!(id.length() == 7 && Character.isLetter(id.charAt(0)) && Character.isLetter(id.charAt(1)) && (id.charAt(2) == '-') &&
        Character.isDigit(id.charAt(3)) && Character.isDigit(id.charAt(4)) && Character.isDigit(id.charAt(5))
        && Character.isDigit(id.charAt(6)))) {
            System.out.println("The employee ID must be in the format of AA-1234.");
            output = 1;
        }
        return output;
    }
    static void validateInput(String firstName, String lastName, String zip, String id) {
        int error = 0;
        error = error + validateFirstName(firstName);
        error = error + validateLastName(lastName);
        error = error + validateID(id);
        error = error + validateZip(zip);
        if(error == 0) {
            System.out.println("There were no errors found.");
        }
    }




}