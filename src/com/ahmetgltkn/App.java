package com.ahmetgltkn;

import java.util.Random;

public class App {

    public static void main(String[] args) throws Exception {
        FileReader fileReader = new FileReader();
        StudentListManager studentListManager = new StudentListManager();
        if (args.length != 1){
            System.out.println("Please enter an integer value.");
            return;
        }
        int numStudents = Integer.parseInt(args[0]);
        String[] studentList;

        studentList = fileReader.readStudentListFromFile("src/com/ahmetgltkn/data/studentList.txt");

        if (studentList == null || studentList.length == 0){
            System.out.println("Student list is empty.");
            return;
        }

        Random random = new Random();
        System.out.println("Selected " + numStudents + " students");
        for (int i = 0; i < numStudents; i++){
            int index = random.nextInt(studentList.length);
            String randomStudent = studentList[index];
            System.out.printf("%d-%s%n", i + 1, randomStudent);
            studentList = studentListManager.removeStudentFromArray(studentList, index);
        }
    }

}
