class Bird{
    void sing (){
        System.out.println("tweet tweet");// if we dont specify the way we want to implement the sing method then by default it will use the above sing method
    }
}
class Pelican extends Bird{//but if we come here and specify the way the bird sings then it wont take  the default sing method 
    void sing (){
         System.out.println("Tweedle dee dee");
    }
}
   
    public class Polymorphism{
        public static void main(String[] args){
            Pelican b=new Pelican();
            b.sing();

    }
}