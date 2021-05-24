/*
Problem Description
You are given a list of marks over 5 subjects scored by n students. You need to sort the student by following rules.
Student whose sum of marks will be highest must come up the leaderboard.
Students whose total sum of marks are the same will be sorted alphabetically ascending by name.
In all other case student with lesser id will come before in the leaderboard

Input format
First line will contain a single integer n number of students.
Next n lines will contain space separated unique integer Id, string S name of the student followed by 5 integers marks scored out of 100.

Output format
Print space separated list of sorted ids of the student in a single line

Sample Input 1
3
1 Alan 45 56 21 32 74
2 Fabien 95 94 93 92 91
3 Gamora 85 65 54 65 76

Sample Output 1
2 3 1

Explanation 1
Fabien has the most marks obtained and then Gamora and followed by Alan

Constraints
1<=n<=50000
1<=|S|<=10
Name of the Student will be in alphabetically lowercase characters.
1<=Marks[i]<=100
1<=Student id<=10000000

Student id will be unique for each student
*/

import java.util.*;

class Student {
    int id;
    String name;
    int marks[] = new int[5];

    public Student(int id, String name, int marks[]) {
        this.id = id;
        this.name = name;

        for (int i = 0; i < 5; i++) {
            this.marks[i] = marks[i];
        }
    }
}

class MarksSort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Student arr[] = new Student[n];

        for (int i = 0; i < n; i++) {

            int id = sc.nextInt();
            String name = sc.next();
            int marks[] = new int[5];

            for (int j = 0; j < 5; j++)
                marks[j] = sc.nextInt();
            arr[i] = new Student(id, name, marks);
        }

        int res[] = marksSort(n, arr);

        for (int j : res) {
            System.out.print(j + " ");
        }
    }

    static int[] marksSort(int n, Student arr[]) {
        int[] result = new int[n];

       Arrays.sort(arr, new Comparator<Student>() {
            @Override 
            public int compare(Student A, Student B){
                int sum1=0, sum2=0; 
                int nameCheck = A.name.compareTo(B.name);
                
                for(int i=0; i<5; i++){
                    sum1 += A.marks[i];
                    sum2 += B.marks[i];
                }
            
            if(sum1 != sum2)
                return sum2 - sum1;
            else 
                if(nameCheck == 0)
                    return A.id - B.id;
                else
                    return nameCheck;
            }
        });

        for(int i=0; i<n; i++){
            result[i] = arr[i].id;
        }

        return result;
    }
}
        
