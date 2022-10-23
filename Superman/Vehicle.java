class Vehicle {
    int speed=120;
     // super Is a keyword in java that refers to the reference class in an inheritance relationship 
     Vehicle(){
        System.out.println("Lets move faster in the vehicle constructor");
     }
     void drive(){
        System.out.println("Drive");
     }
}

//If you have multiple classes take out the public word 
class Car extends Vehicle {
    Car(){
        super();//calls the constructor  in the parent class
    }
   
    void drive(){
        
         //System.out.println("Driving fast");
         super.drive();// super helps us get a method from the parent class
    }
//If the program has two methods that are the same we can use the super.drive to prioritise the main method
}
