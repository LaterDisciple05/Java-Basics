/*Program purpose:-to check whether no. entered by user is integer or not
Program date:-04/01/2025
Program author:-Akshat Shah
Program flaws(if any):-NA*/
import java.util.Scanner;
public class CheckForInt {
    public static void main(String[] args)
    {
        System.out.println("Enter a literal you wanna check for (integer or not)=");
        Scanner num = new Scanner(System.in);
        boolean b=num.hasNextInt();
        System.out.println(b);
        num.close();
    }
}
