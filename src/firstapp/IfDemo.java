package firstapp;

import java.util.Scanner;

public class IfDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String houseType = "Unknown";
        int choice = 0;
        System.out.println("Enter the type of house you want to purchase:");
        System.out.println("1. Single Family");
        System.out.println("2. Townhouse");
        System.out.println("3. Condominium");
        System.out.print("Your choise? ");
        choice = scanner.nextInt();

        if(choice==1) houseType="Single Family";
        else if(choice==2) houseType="Townhouse";
        else houseType="Condominium";
        System.out.println("Desired House type: "+ houseType);
        scanner.close();
    }
}
