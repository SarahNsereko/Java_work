public class Main{
public static void main (String[] args){
        Wrestler1 wrestler1=new Wrestler1();
        wrestler1.Themesong();
        wrestler1.Tagmate();
        Wrestler2 wrestler2=new Wrestler2();
         System.out.println("The match is going to take place in " + wrestler1.matchplace);
         System.out.println("The first wrestler is " + wrestler1.name);
        System.out.println("The second wrestler is " + wrestler2.name);
        wrestler2.Themesong();
        wrestler2.Tagmate();
    }
    
}