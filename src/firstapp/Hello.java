package firstapp;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name brother?");
        String name=scanner.nextLine();
        System.out.printf("My name is "+name);
        System.out.println("what about you? what your name?");
        String name2=scanner.nextLine();
        System.out.printf("My name is "+name2);
        scanner.close();

    }
}



