public class Main{
    public static void main(String arg []){
        Calculator c = new Calculator();
        c.digit(1);//0*10+1
         c.digit(0);//1*10+0
          c.subtract();//-
           c.digit(1);//0*10+1
            c.digit(0);//1*10+0
             c.compute();
             System.out.println(c.display());
    }
}