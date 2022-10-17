//An abstract class cannot be instantiated in the main method
//An abstract class helps you make a regular class 
// An abstract class reduces code because of shared functionality
abstract class Dog {
    String breed;
    public void bark(){
        System.out.println("Bark!");
    }
    public abstract void poop ();//An abstract method doesnt have a body its just an idea and doesnt have to be implemented in the main method like when using interfaces 
}
class Chihuahuah extends Dog{
    public void poop(){
        System.out.println ("Pooped");//an abstract method must be implemented in the subclasses 
    }
    public void bark(){
        System.out.println("Bark bark");//its also possible to override original method
    }

}

public class Abstraction {
    public static void main (String[] args){
    Chihuahuah c=new Chihuahuah(); 
    c.bark()   ;
   c.poop();
    }
}
//An abstract method doesnt contain a body 
//An abstract class can have both a normal method and an abstract method 
//Bark is a normal method where as poop is an abstract method
//An abstract method just means that all subclasses of the parent class will have that method but implemented differently thats why it Has no body you  have to implement it yourself within that subclass

//Different dogs might poop differently thats why its an abstract method