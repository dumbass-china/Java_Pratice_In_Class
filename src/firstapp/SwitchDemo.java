package firstapp;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Grade: ");
        char grade = scanner.next().charAt(0);
        switch (grade){
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
            case 'C':
                System.out.println("Well Done");
                break;
            case 'D':
                System.out.println("You passed");
                break;
            case 'F':
                System.out.println("Better try again!");
                break;
            default:
                System.out.println("Invalid grade!");
        }
        scanner.close();
    }
}
