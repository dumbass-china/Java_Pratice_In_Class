package firstapp;

import java.util.Scanner;

public class ByteTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number 1: ");
        byte num1 = scanner.nextByte();

        System.out.println("Enter Number 1: ");
        byte num2 = scanner.nextByte();

        byte sum = (byte) (num1+num2);
        System.out.println("Sum = " + sum);
        scanner.close();
    }
}
