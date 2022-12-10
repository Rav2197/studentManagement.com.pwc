package com.pwc.Model;

public class Student {

    // Instance Variables

    private String firstName;
    private String lastName;
    private int studentID;
    private String grade;
    private String contactNumber;
    private String stream;

    // Default Constructor

    public Student(){};

    // Parametrized Constructor

    public Student(String firstName, String lastName, int studentID, String grade, String contactNumber, String stream){
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentID = studentID;
        this.grade = grade;
        this.contactNumber = contactNumber;
        this.stream = stream;
    }

    // getters and setters method


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", studentID=" + studentID +
                ", grade='" + grade + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", stream='" + stream + '\'' +
                '}';
    }
}
