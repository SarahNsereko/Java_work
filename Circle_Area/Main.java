public class Main extends Circle {
    public static void main (String[] args){
        Circle c1=new Circle();
        Circle c2=new Circle();
        c1.setRadius(10.0);
         c1.getRadius();
         c2.setRadius(5.0);
        System.out.println(c1.computeArea(10.0));
        c2.computeArea(5.0);
    }
}