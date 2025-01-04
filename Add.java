/*Program purpose:-take input from user and add those numbers and import scanner class for the same
Program date:-04/01/2025
Program author:-Akshat Shah
Program flaws(if any):-NA*/
import java.util.Scanner;
public class Add {
    public static void main(String[] args)
    {
      Scanner obj = new Scanner(System.in);
      System.out.println("Enter 1st number=");
      int a= obj.nextInt();
      System.out.println("Enter 2nd number=");
      int b= obj.nextInt();
      int sum = a+b;
      System.out.print("sum=");
      System.out.print(sum);
    }
    
}
