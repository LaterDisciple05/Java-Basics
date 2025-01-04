/*Program purpose:-km to mile 
Program date:-04/01/2025
Program author:-Akshat Shah
Program flaws(if any):-NA*/
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        double dis;
        System.out.print("Enter distance in kilometers = ");
        dis=obj.nextFloat();
        dis=dis*0.62137119;
        System.out.println("distance in miles = "+dis);
        obj.close();
    }
}
