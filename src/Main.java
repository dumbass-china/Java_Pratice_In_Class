import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Random;
public class Main {
    public static void main(String[] args) {

//Swap two variable
      /*  String x = "china";
        String y = "frida";
        String temp;

        temp=x;
        x=y;
        y=temp;

        System.out.println("x:"+x);
        System.out.println("y:"+y);*/

//user input
       /* Scanner scanner=new Scanner(System.in);
        System.out.println("What is your name? ");
        String name=scanner.nextLine();
        System.out.println("How old are you? ");
        int age=scanner.nextInt();
        scanner.nextLine();
        System.out.println("What is your favorite food? ");
        String food=scanner.nextLine();

        System.out.println("My name is "+name);
        System.out.println("I am "+age+"years old");
        System.out.println("My favorite food is "+food);*/

//Expression
        // expression = operands & operators
        // operands = values, variable, numbers, quantity
        // operators = + - * / %
       /* int friend=10;
        friend--;
        System.out.println(friend);*/

//GUI intro GUI = Graphical User Interface
        //Before you can use GUI you have to import some class
        //import javax.swing.JOptionPane;
       /* String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null,"Hello "+name);
        Integer age =Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null,"You are "+age+" years old");
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showMessageDialog(null,"You are "+height+" cm tall");*/

//Math class
        /*double x = 3.14;
        double y = -10;

        double z=Math.min(x,y);
        double a=Math.abs(y); // abs = absolute is mean that is your number is -10 when u use abs it will convert to 10
        double b=Math.round(x); //បង្គត់ចុះ
        double d=Math.floor(x); //បង្គត់ចុះ
        double c=Math.ceil(x); //បង្គត់ឡើង
        System.out.println(z);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);*/

//Create Program to find hypotenuse
        /*double x;
        double y;
        double z;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side x: ");
        x = scanner.nextDouble();
        System.out.println("Enter side y: ");
        y = scanner.nextDouble();

        z = Math.sqrt((x*x)+(y*y));
        System.out.println("The hypotenuse is : "+z);
        scanner.close();*/

//If statement
        //Before you can use if statement you have to use import java.util.Random;
       /* Random random = new Random();

        int x = random.nextInt(6)+1;
        double y = random.nextDouble();
        boolean z = random.nextBoolean();

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);*/

       /* int age = 75;
        if(age==75) {
            System.out.println("Ok Boomer!");
        }
        else if(age>=18){
            System.out.println("You are an adult!");
        }
        else if(age>=13){
            System.out.println("You are a teenager");
        }
        else{
            System.out.println("You are still baby");
        }*/

//Switches
        /*String day = "Pizza";
        switch (day){
            case "Sunday": System.out.println("It is Sunday");
                break;
            case "Monday": System.out.println("It is Monday");
                break;
            case "Tuesday": System.out.println("It is Tuesday");
                break;
            case "Wednesday": System.out.println("It is Wednesday");
                break;
            case "Thursday": System.out.println("It is Thursday");
                break;
            case "Friday": System.out.println("It is Friday");
                break;
            case "Saturday": System.out.println("It is Saturday");
                break;
            default: System.out.println("That is not a day!!!");
        }*/

//Logical Operators
        //Logical operators = used to connect two or more expressions
        //                  && = (AND) both conditions must be true
        //                  || = (OR) either condition must be true
        //                  !  = (NOT) reverses boolean value of condition
       /* int temp = 25;
        if(temp>30){
            System.out.println("It hot outside");
        }
        else if(temp>=20 && temp<=30){
            System.out.println("It is warm outside");
        }
        else{
            System.out.println("It is cold outside");
        }*/

 /*       Scanner scanner = new Scanner(System.in);
        System.out.println("You are playing a game! Press q or Q to quit");
        String response=scanner.next();
*/
      /*  if(response.equals("q")||response.equals("Q")){
            System.out.println("You quit the game");
        }
        else{
            System.out.println("You are still playing the game *pew pew*");
        }*/
       /* if(!response.equals("q")&&!response.equals("Q")){
            System.out.println("You are still playing the game *pew pew*");
        }
        else{
            System.out.println("You quit the game");
        }*/

//While Loop
        //While Loop = executes a block of code as long as condition remains true
/*        Scanner scanner = new Scanner(System.in);
        String name="";*/

        /*while (name.isBlank()){
            System.out.print("Enter your name: ");
            name=scanner.nextLine();
        }*/

        /*do {
            System.out.print("Enter your name: ");
            name=scanner.nextLine();
        }while ((name.isBlank()));*/

      /*  for(;;) {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
            if (!name.isBlank()) {
                break;
            }
        }
        System.out.println("Hello, " + name + "!");*/

//For Loop = executes a block of code a limited amount of times
     /*   for(int i=10; i>0; i--){
            System.out.println(i);
        }*/


    }
}