/*Program purpose:-very very very basics of a string input from keyboard and output on terminal
Program date:-04/01/2025
Program author:-Akshat Shah
Program flaws(if any):-NA*/
import java.util.Scanner;
public class BasicString {
    public static void main(String[] args)
    {
      Scanner obj = new Scanner(System.in);
      String str1,str2;
      System.out.println("Enter your string(consider Whole)=");
      str1=obj.nextLine();
      System.out.println(str1);
      System.out.println("Enter your string(consider First Word)=");
      str2=obj.next();
      System.out.println(str2);
      obj.close();
    }
    
}
