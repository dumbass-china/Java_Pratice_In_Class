package firstapp;

import java.util.Scanner;

public class ScoreCalculator {
    public static void main(String[] args) {
        double total, sub1,sub2,sub3,sub4,sub5;
        double average;
        char grade;

        System.out.println("-----------------------------------");
        System.out.println("Please Enter your score by subject");
        System.out.println("-----------------------------------");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Subject 1 : ");
        sub1 = scanner.nextInt();
        System.out.print("Subject 2 : ");
        sub2 = scanner.nextInt();
        System.out.print("Subject 3 : ");
        sub3 = scanner.nextInt();
        System.out.print("Subject 4 : ");
        sub4 = scanner.nextInt();
        System.out.print("Subject 5 : ");
        sub5 = scanner.nextInt();

        total = (sub1+sub2+sub3+sub4+sub5);
        average = total/5;
        if(average<60){
            grade='F';
        } else if (average < 70) {
            grade='D';
        } else if (average < 80) {
            grade='C';      
        } else if (average < 90) {
            grade='B';
        }
        else {
            grade = 'A';
        }
        System.out.println("-----------------------------------");
        System.out.println("Your Result");
        System.out.println("-----------------------------------");
        System.out.println("Total : "+total);
        System.out.println("Average : "+average);
        System.out.println("Grade : "+grade);
        scanner.close();
    }
}
