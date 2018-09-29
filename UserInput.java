import java.util.Scanner;
public class UserInput
{
public static void main(String []args)
{
Scanner input=new Scanner(System.in);
System.out.println("Enter two numbers");
int a=input.nextInt();
int b=input.nextInt();
int c=a+b;
  int d=a*b;
System.out.println("The Sum Of " +a+ " and " +b+ " is "+c+ "multiplication of a*b is ="+d);
}}
