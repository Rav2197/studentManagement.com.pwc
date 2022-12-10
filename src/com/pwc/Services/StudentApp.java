package com.pwc.Services;

import com.pwc.Model.Student;
import com.pwc.Records.StudentRecord;

import java.awt.*;
import java.util.Scanner;

import static com.pwc.StudentUtility.*;
import static com.pwc.StudentUtility.validateStudentId;

public class StudentApp {

    // main method

    public static void main (String [] args) {

        StudentRecord studentRecord = new StudentRecord();

        Student student = new Student("Ravi", "Kumar", 1234, "12th", "004290831", "PCM");

        studentRecord.add(student);

        Scanner scan = new Scanner(System.in);

        int operation = 0;

        do {
            mainMenu();
            try {
                operation = scan.nextInt();
            }
            catch (Exception e){
                System.out.println("Invalid Input !!!");
            }

            // switch case

            switch (operation) {

                // ADD NEW STUDENT

                case 1:
                    //System.out.println("please enter the first name");
                    //String firstName = scan.next();
                    String firstName = isStringAlphabetOnly("Please enter first name");
                    //System.out.println("Please enter the Last name ");
                    String lastName = isStringAlphabetOnly("Please enter last name");
                    //System.out.println("Please enter the student ID");
                    //int studentID = scan.nextInt();
                    int studentID = validateStudentId("please enter student id");
                    System.out.println("Please Enter the Grade of student ");
                    String grade = scan.next();
                    //System.out.println("please enter the Contact number of the student");
                    String contactNumber = isValidContact("Please Enter the contact Number");
                    System.out.println("Please enter the Stream of student");
                    String stream = scan.next();
                    Student student1 = new Student(firstName,lastName,studentID,grade,contactNumber,stream);
                    studentRecord.add(student1);
                    System.out.println("New student added successfully !!! \n");
                    System.out.println(student1.toString());
                    break;

                case 2:
                    // searching the student

                    System.out.println("Please enter the student ID for Searching the details");
                    int stdId = validateStudentId("Enter the student ID");

                    if (!studentRecord.search(stdId)){
                        System.out.println("Student ID does not exists !! ");
                    }
                    break;

                case 3:
                    // displaying the entire student record
                    studentRecord.display();
                    break;

                case 4:
                    // updating the record
                    System.out.println("Please enter the student ID for updating the student details \n");
                    int studId = validateStudentId("Enter the student ID");
                    studentRecord.updateRecord(studId);

                    break;

                case 5:
                    System.out.println("Please enter student ID for deletion of record");
                    int studentIdentity = validateStudentId("Enter the student ID");
                    studentRecord.deleteRecord(studentIdentity);
                    break;

                case 6:
                    System.out.println("Thank you !! ");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid Input");



            }
        } while (operation !=6);

    }

    public static void mainMenu(){
        System.out.println("___________________________________________________\n");
        System.out.println("The following Operations are available inside MENU");
        System.out.println("1: Add Student");
        System.out.println("2: Search Student");
        System.out.println("3: Display Student Details");
        System.out.println("4 Update Student data");
        System.out.println("5: Delete Student");
        System.out.println("6: Exit the program");
        System.out.println("____________________________________________________________");
    }
}
