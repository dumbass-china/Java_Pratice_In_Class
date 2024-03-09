package firstapp;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        double salary,fringebenefits,netsalary,taxonsalary;
        Scanner scanner =  new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("#,##0.00 Riels");

        System.out.println("-----------------------------------");
        System.out.println("Please enter your salary and benefits (Monthly)");
        System.out.println("-----------------------------------");
        System.out.println();

        System.out.print("Your Salary (Riels) : ");
        netsalary=scanner.nextFloat();
        System.out.print("Fringe Benefits (Riels) : ");
        fringebenefits=scanner.nextFloat();

        System.out.println();
        System.out.println("-----------------------------------");
        System.out.println("Tax on Salary");
        System.out.println("-----------------------------------");

        if(netsalary<=1500000){
            taxonsalary=(fringebenefits*0.2)+(netsalary*0);
            salary=(netsalary+fringebenefits)-taxonsalary;
        } else if (netsalary <= 2000000) {
            taxonsalary=(fringebenefits*0.2)+(netsalary*0.05);
            salary=(netsalary+fringebenefits)-taxonsalary;
        } else if (netsalary <= 8500000) {
            taxonsalary=(fringebenefits*0.2)+(netsalary*0.1);
            salary=(netsalary+fringebenefits)-taxonsalary;
        } else if (netsalary <= 12500000) {
            taxonsalary=(fringebenefits*0.2)+(netsalary*0.15);
            salary=(netsalary+fringebenefits)-taxonsalary;
        }
        else {
            taxonsalary=(fringebenefits*0.2)+(netsalary*0.2);
            salary=(netsalary+fringebenefits)-taxonsalary;
        }

        System.out.println("Tax on Salary : "+ format.format(taxonsalary));
        System.out.println("Salary : "+ format.format(salary));
    }
}
