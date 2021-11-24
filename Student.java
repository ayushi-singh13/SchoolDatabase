package com.thoughtworksPrograd;

public class Student {
    protected int rollNumber;
    protected String name;


    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected int getRollNumber(){
        return rollNumber;
    }

    public String getName(){
        return name;
    }



    public void printStudentDetails(){
        System.out.println("Roll number: " + rollNumber + " name: " + name );
    }

}
