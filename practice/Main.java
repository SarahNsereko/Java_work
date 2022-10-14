public class Main{
    public static void main (String[] args){
        Cow a=new Cow();
        Hen b=new Hen();
        a.animalSound("Mooo");

        a.numberoflegs=4;
        b.numberoflegs=2;
        System.out.println("Cow has "+a.numberoflegs+"legs");
        System.out.println("Hen has "+b.numberoflegs+"legs");
    }
}