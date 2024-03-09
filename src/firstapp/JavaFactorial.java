package firstapp;

import java.util.Scanner;

public class JavaFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n");
        System.out.print("Enter a number to calculate the sum of factorials: ");
        int number = scanner.nextInt();
        scanner.close();

        long sum = 0;
        long factorial = 1;

        for (int i = 1; i <= number; ++i) {
            factorial = factorial*i;
            sum += factorial;
        }

        System.out.println("Sum of factorials up to " + number + " is: " + sum);
    }

}
