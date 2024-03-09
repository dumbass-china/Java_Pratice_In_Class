package firstapp;
import java.util.Scanner;

public class FindYears {
    public static void main(String[] args) {
        int days, weeks, years;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter number of the days : ");
        days=scanner.nextInt();

        //calculate the years
        years=days/365;
        weeks=(days % 365)/7;
        days=days-((years*365)+(weeks*7));


        //show the result
        System.out.println("Years: "+years);
        System.out.println("Weeks: "+weeks);
        System.out.println("days: "+days);

        scanner.close();
    }
}
