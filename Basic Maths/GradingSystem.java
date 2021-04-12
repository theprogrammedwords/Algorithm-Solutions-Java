/*
A school has following rules for grading system:

[0, 25) - F

[25, 45) - E

[45, 50) - D

[50, 60) - C

[60, 80) - B

[80, 100] - A

If the input is less than 0 or greater than 100 then it is considered invalid.

You are given a real number score, print the corresponding grade or "Invalid" if the input is invalid.
*/

import java.util.*;

import javax.lang.model.util.ElementScanner6;

class GradingSystem {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        float marks = sc.nextFloat();
        String result = gradingSystem(marks);

        System.out.println(result);

    }

    static String gradingSystem(float marks) {
        String grade = "";
        if(marks < 0 || marks > 100) grade= "Invalid";
        else if(marks >= 0 && marks < 25) grade= "F";
        else if(marks >= 25 && marks < 45) grade= "E";
        else if(marks >= 45 && marks < 50) grade= "D";
        else if(marks >= 50 && marks < 60) grade= "C";
        else if(marks >= 60 && marks < 80) grade= "B";
        else if(marks >= 80 && marks <= 100) grade= "A";
    
    return grade;
    }
}
