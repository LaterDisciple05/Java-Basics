/*Program purpose:-program to have a little more understanding of class,object,attributes(properties),methods(functions)
Program date:-04/01/2025
Program author:-Akshat Shah
Program flaws(if any):-NA*/
class car//car class (consider it to be a blueprint)
{
  String color;//properties possessed by objects of car class
  String model;
  void drive()
  {
    System.out.println("Currently driving "+model);
  }
} 

public class UnderstandConcept {
    public static void main(String[] args)
    {
        car car1 = new car();
        car1.color="White";
        car1.model="Maruti Van";
        car car2 = new car();
        car2.color="black";
        car2.model="Volkswagon Vento";
        car car3 = new car();
        car3.color="silver";
        car3.model="Toyota Glanza";

        System.out.println("car no.1 is "+car1.model+" of "+car1.color+" color");
        System.out.println("car no.2 is "+car2.model+" of "+car2.color+" color");
        System.out.println("car no.3 is "+car3.model+" of "+car3.color+" color");
        
        car1.drive();//calling method drive for object car1 
    }
    
}
