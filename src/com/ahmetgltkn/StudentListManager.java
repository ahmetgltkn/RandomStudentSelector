package com.ahmetgltkn;

public class StudentListManager {

    public String[] removeStudentFromArray(String[] studentList, int index) {

        if (studentList == null || index < 0 || index >= studentList.length)
            return studentList;

        String[] newStudentList = new String[studentList.length -1];
        int j = 0;
        for (int i = 0 ; i< newStudentList.length; i++){
            if (i == index)
                j++;
            newStudentList[i] = studentList[j++];
        }
        return newStudentList;
    }

    public String[] removeStudentFromArrayOptimized(String[] studentList, int index) {
        if (studentList == null || index < 0 || index >= studentList.length)
            return studentList;

        String[] newStudentList = new String[studentList.length - 1];
        System.arraycopy(studentList, 0, newStudentList, 0, index);
        System.arraycopy(studentList, index + 1, newStudentList, index, studentList.length - index - 1);
        return newStudentList;
    }

}
