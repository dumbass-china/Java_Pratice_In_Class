package firstapp;

import java.util.Scanner;


public class CalculateMoney {
    public static void main(String[] args) {
        int amount, n100, n50, n20, n10, n5, n1;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the total amount ($) :");
        amount=scanner.nextInt();
        n100=amount/100;
        n50=(amount%100)/50;
        n20=((amount%100)%50)/20;
        n10=(((amount%100)%50)%20)/10;
        n5=((((amount%100)%50)%20)%10)/5;
        n1=amount-(n100*100+n50*50+n20*20+n10*10+n5*5);


        System.out.println("100 : "+n100);
        System.out.println("50 : "+n50);
        System.out.println("20 : "+n20);
        System.out.println("10 : "+n10);
        System.out.println("5 : "+n5);
        System.out.println("1 : "+n1);
        scanner.close();

    }
}
