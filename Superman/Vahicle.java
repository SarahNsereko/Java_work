class Vehicle {
    int speed=120;
     // super Is a keyword in java that refers to the reference class in an inheritance relationship 
     void drive(){
        System.out.println("Drive");
     }
}

//If you have multiple classes take out the public word 
class Car extends Vehicle {
    void drive(){
         System.out.println("Driving fast");
    }
//If the program 
}
