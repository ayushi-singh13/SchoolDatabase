package com.thoughtworksPrograd;


import java.util.ArrayList;
public class StudentRecords {
    //private static=new ArrayList<Student>();

    public void addStudent( ArrayList<Student> studentList,int studentRollNumber,String studentName){
        Student student=new Student();

        student.setRollNumber(studentRollNumber);
        student.setName(studentName);



        studentList.add(student);
    }

    public void removeStudent( ArrayList<Student> studentList,int deleteStudentRollNumber){
        studentList.removeIf(student -> student.getRollNumber() == deleteStudentRollNumber);
    }

    public void updateStudentName( ArrayList<Student> studentList,int rollNo,String newName){

        for (var student : studentList) {
            if (student.getRollNumber() == rollNo)
                student.setName(newName);
        }
    }



}
