
import java.util.Scanner;
public class Calculator {
    public int addition(int a, int b){
        return a+b;

    }
    public int minus(int a, int b){
        return a-b;
    }
    public int multiplication(int a, int b){
        return a*b;
    }
    public int division(int a, int b){
        return a/b;

    }
    public int power(int a, int b){
        return (int) Math.pow(a,b);
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Calculator calc=new Calculator();
        System.out.println("Thanks for choosing this super Calculator.");
        System.out.println("Here are the choices: ");
        boolean exit=false;
        while(!exit){
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Power");
            System.out.println("5. Exit");
            System.out.print("Choose a number matching the operation you wnat:");
            int choice=scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the first number: ");
                    int a=scanner.nextInt();
                    System.out.print("Enter the second number: ");
                    int b=scanner.nextInt();
                    System.out.println("The result is: "+calc.addition(a, b));
                    break;
                case 2:
                    System.out.print("Enter the first number: ");
                    int c=scanner.nextInt();
                    System.out.print("Enter the second number: ");
                    int d=scanner.nextInt();
                    System.out.println("The result is: "+calc.minus(c, d));
                    break;
                case 3:
                    System.out.print("Enter the first number: ");
                    int e=scanner.nextInt();
                    System.out.print("Enter the second number: ");
                    int f=scanner.nextInt();
                    System.out.println("The result is: "+calc.multiplication(e, f));
                    break;
                case 4:
                    System.out.print("Enter the first number: ");
                    int g=scanner.nextInt();
                    System.out.print("Enter the second number: ");
                    int h=scanner.nextInt();
                    System.out.println("The result is: "+calc.division(g, h));
                    break;
                case 5:
                    System.out.print("Enter the first number: ");
                    int i=scanner.nextInt();
                    System.out.print("Enter the second number: ");
                    int j=scanner.nextInt();
                    System.out.println("The result is: "+calc.power(i, j));
                    break;
                case 6:
                    exit=true;
                    break;
            
                default:
                    break;
            }
        }
        scanner.close();
    }
}
