package com.pwc.Records;

import com.pwc.Model.Student;

import java.util.LinkedList;
import java.util.Scanner;

public class StudentRecord {

    // Creating an empty LinkedList to store Student Object

    LinkedList<Student> studentList;

    public StudentRecord() {
        studentList = new LinkedList<>();
    }

    //Searching the student record in student list

    public boolean search(int studentId) {
        for (Student student1 : studentList){
            if (student1.getStudentID() == studentId){
                System.out.println(student1);
                return true;
            }
        }
        return false;
    }

    // Adding student to studentlist

    public void add(Student student) {
        if (!search(student.getStudentID())) {
            studentList.add(student);
        }
        else {
            System.out.println("Record already exist !! \n");
        }
    }

    //Deletion of record from student list

    public void deleteRecord(int studentId) {

        Student studentRecord = null;
        
        for (Student student2 : studentList) {
            if (student2.getStudentID() == studentId) {
                studentRecord = student2;
            }
        }
        
        if (studentRecord == null) {
            System.out.println("Student identity Number is Invalid \n");
        }
        else {
            studentList.remove(studentRecord);
            System.out.println("Student record for "+ studentId +" has been deleted");
            
        }
    }
    
    // find student details 
    
    public Student findStudentRecord(int studentID){
        for (Student student3 : studentList){
            if (student3.getStudentID() == studentID){
                return student3;
            }
        }
        return null;
    }
    
    //updating Student Records
    
    public void  updateRecord(int studentId) {

        Scanner input = new Scanner(System.in);

        if (search(studentId)) {
            String firstName = null;
            String lastName = null;
            int studentIdntity;
            String grade = null;
            String contactNumber = null;
            String stream = null;
            Student student1 = findStudentRecord(studentId);
            System.out.println("Which data you want to update for " + student1 + " ?\n");
            int choice = 0;
            do {
                updateMenu();
                System.out.println("Please enter your choice");
                choice = input.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Please enter the Updated first name \n");
                        firstName = input.next();
                        break;
                    case 2:
                        System.out.println("Please enter the updated last name \n");
                        lastName = input.next();
                        break;
                    case 3:
                        System.out.println("Please enter the updated Student Id\n");
                        studentIdntity = input.nextInt();
                        break;
                    case 4:
                        System.out.println("Please Enter the updated grade\n");
                        grade = input.next();
                        break;
                    case 5:
                        System.out.println("Please enter the updated Contact Number \n");
                        contactNumber = input.next();
                        break;
                    case 6:
                        System.out.println("Please enter the Updated stream \n");
                        stream = input.next();
                        break;
                    case 7:
                        System.out.println("Exiting the update menu");
                    default:
                        System.out.println("Invalid Input Please try again !!! \n");

                }

            }
            while (choice != 7);
            student1.setFirstName(firstName);
            student1.setLastName(lastName);
            student1.setStudentID(studentId);
            student1.setGrade(grade);
            student1.setContactNumber(contactNumber);
            student1.setStream(stream);
        } else {
            System.out.println("Studdent record is not available in student list \n");
        }
    }

    private void updateMenu() {
        System.out.println("Please select the following ");
        System.out.println("1. for first name");
        System.out.println("2. for last name ");
        System.out.println("3. for StudentID");
        System.out.println("4. for grades");
        System.out.println("5. for Contact Number");
        System.out.println("6. for stream ");
        System.out.println("7. for Exit");
    }

    public void display() {
        if (studentList.isEmpty()){
            System.out.println("The Student list has no record Available !!");
        }
        for (Student studen : studentList) {
            System.out.println(studen.toString());
        }
    }
}

