//An interface is an outline for a class 
// you have to have every method of the interface in the main class 
// An interface  is outside a class and above the main method
// if you want to make a car but dont know how to start you can use the outline
//Everything in the interface has to be in the class
interface Car{
    String color="Pink";
    void drive();// void is used to specify the method doest return any type
    void reverse();

}


public class Car1 implements Car{//implements uses the car outline to implement methods and attributes
    public static void main (String[] args){
        System.out.println(color);

        Car1 cars=new Car1();//since we used void only when making the method we have to create an object 
        cars.drive(); //call the method in the main class
        cars.reverse();
            }

    public void drive (){
        System.out.println("Driving mode activated");
    }
    public void reverse(){
        System.out.println("Reverse mode activated");
    }


    
}