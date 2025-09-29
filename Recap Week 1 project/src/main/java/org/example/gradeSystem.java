package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class gradeSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter exam score (0-100) :");
        int score = scanner.nextInt();
    char grade;
    scanner.close();
    if (score >= 90) {
        grade = 'A';
        System.out.print("Your grade is : " + grade);
    }else if (score >=80 && score <= 89) {
        grade = 'B';
        System.out.print("Your grade is : " + grade);
    } else if (score >= 70 && score <= 79) {
        grade = 'C';
        System.out.print("Your grade is : " + grade);
    } else if (score >= 60 && score <= 69) {
        grade = 'D';
        System.out.print("Your grade is : " + grade);
    }else {
        grade = 'F';
        System.out.print("Your grade is : " + grade);
    }
    }
}