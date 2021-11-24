package com.thoughtworksPrograd;

import java.util.ArrayList;
import java.util.Scanner;

public class AlYasminSchool {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner=new Scanner(System.in);
        ArrayList<Student> studentList= new ArrayList<>();

        StudentRecords records = new StudentRecords();


        while(true){
            int userTye;
            System.out.println("enter 1 if admin ");
            userTye=scanner.nextInt();
            if(userTye==1) {
                int action;
                System.out.println("""
                        press 1 to add
                        press 2 to update
                        press 3 to delete
                        case 4 to display students
                        press 5 to exit\s""");
                action=scanner.nextInt();
                switch (action) {
                    case 1 -> {
                        System.out.println("Enter Student's details");
                        int rollNo = scanner.nextInt();
                        String name = scanner.next();
                        records.addStudent(studentList, rollNo, name);
                    }
                    case 2 -> {
                        System.out.println("enter roll number of the student whose name is to be updated");
                        int rollNoToBeUpdated = scanner.nextInt();
                        System.out.println("enter the updated name");
                        String updatedName = scanner.next();
                        records.updateStudentName(studentList, rollNoToBeUpdated, updatedName);
                    }
                    case 3 -> {
                        System.out.println("Enter roll number of student to be removed");
                        int rollNoRemoved = scanner.nextInt();
                        records.removeStudent(studentList, rollNoRemoved);
                    }
                    case 4 ->{
                        for(var student:studentList)
                            student.printStudentDetails();
                    }
                    case 5 -> System.exit(0);
                    default -> System.out.println("Wrong value entered");
                }

            }
            else
                for(var student:studentList)
                    student.printStudentDetails();


        }



    }
}
