package com.ahmetgltkn;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {

    public String[] readStudentListFromFile(String fileName) throws Exception{
        String[] studentList;
        try {
            Scanner scanner = new Scanner(new File(fileName));
            int numLines = 0;
            while (scanner.hasNextLine()){
                scanner.nextLine();
                numLines++;
            }
            studentList = new String[numLines];
        } catch (FileNotFoundException e) {
            throw new Exception("File not found.");
        }

        Scanner scanner = new Scanner(new File(fileName));
        for (int i = 0; i < studentList.length; i++){
            studentList[i] = scanner.nextLine();
        }

        return studentList;
    }
}