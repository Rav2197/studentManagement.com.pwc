package com.pwc;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentUtility {

    public static int validateStudentId(String message){
        System.out.println(message);

        while (true){
            Scanner scan = new Scanner(System.in);
            String line = scan.nextLine();
            try{
                int n = Integer.parseInt(line);
                if (n > 0){
                    return  n;
                }
            }catch ( NumberFormatException e){
                //
            }
            System.out.println("Invalid Input  !! please provide a valid id ");
        }
    }

    public static boolean isStringOnlyAlphabet(String str){

            return ((str!= null) && (!str.equals("")) && (str.matches("[a-zA-Z]*$")));
    }

    public static  String isStringAlphabetOnly(String message){
        System.out.println(message);
        while (true){
            Scanner scan = new Scanner(System.in);
            String input = scan.next();
            try{
                if ((input != null) && (!input.equals("")) && input.matches("[a-zA-Z]*$")){
                    return input;
                }
            }
            catch (InputMismatchException e){
                //
            }
            System.out.println("Invalid Input !! Kindly provide a valid Input");
        }
    }

    public static String isValidContact(String message){
        System.out.println(message);
        while (true){
            Scanner scan = new Scanner(System.in);
            String input = scan.next();
            try {
                if ((input != null) && (!input.equals("")) && input.matches("^[0-9]*$")){
                    return input;
                }
            }
            catch (InputMismatchException e){
                //
            }
            System.out.println("Invalid Contact Number !! please enter a valid 10 digit number \n");
        }
    }

    public static void main (String [] args){
        isValidContact("Please enter the contact number");
    }
}