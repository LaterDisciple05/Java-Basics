/*Program purpose:-make program of taking 5 subject marks from user and calculate percentage
Program date:-04/01/2025
Program author:-Akshat Shah
Program flaws(if any):-NA*/
import java.util.Scanner;
class sub{
    String name;
    float marks;
}
public class Q1 {
    public static void main(String[] args) 
    {
     Scanner obj = new Scanner(System.in);
     sub s1 = new sub();
     System.out.println("Enter name of 1st subject");
     s1.name=obj.nextLine();
     System.out.println("Enter marks obtained in "+s1.name+" =");
     s1.marks=obj.nextFloat();
     obj.nextLine();
     sub s2 = new sub();
     System.out.println("Enter name of 2nd subject");
     s2.name=obj.nextLine();
     System.out.println("Enter marks obtained in "+s2.name+" =");
     s2.marks=obj.nextFloat();
     obj.nextLine();
     sub s3 = new sub();
     System.out.println("Enter name of 3rd subject");
     s3.name=obj.nextLine();
     System.out.println("Enter marks obtained in "+s3.name+" =");
     s3.marks=obj.nextFloat();
     obj.nextLine();
     sub s4 = new sub();
     System.out.println("Enter name of 4th subject");
     s4.name=obj.nextLine();
     System.out.println("Enter marks obtained in "+s4.name+" =");
     s4.marks=obj.nextFloat();
     obj.nextLine();
     sub s5 = new sub();
     System.out.println("Enter name of 5th subject");
     s5.name=obj.nextLine();
     System.out.println("Enter marks obtained in "+s5.name+" =");
     s5.marks=obj.nextFloat();
     obj.nextLine();
     float sum = s1.marks+s2.marks+s3.marks+s4.marks+s5.marks;
     System.out.println("Total Sum of all 5 subjects = "+sum);
     float p = (sum*100)/500;
     System.out.println("Overall percentage = "+p+"%");
     obj.close();
    }
}
