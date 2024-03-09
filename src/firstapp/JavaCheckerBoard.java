package firstapp;

import java.util.Scanner;

public class JavaCheckerBoard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.print("Please enter number of symbol (#): ");
        num=scanner.nextInt();
        for(int i=1; i<=num; i++){
            if(i%2==0){
                System.out.print(" ");
            }
            for(int j=1; j<=num; j++){
                System.out.print("#");
                System.out.print(" ");
        }
            System.out.print("\n");
        }
        scanner.close();
    }
}
