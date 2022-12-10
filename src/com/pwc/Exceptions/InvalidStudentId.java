package com.pwc.Exceptions;

public class InvalidStudentId extends Exception{
    public String getMessage() {
        return "Invalid Student Id ! Please provide a Valid Id ";
    }
}
