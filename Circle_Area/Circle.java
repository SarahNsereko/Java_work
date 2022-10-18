public class Circle{
    double radius;
    double area;
    double diameter;
    final double pi =3.14;
    public Circle(){
       
    }

    public double setRadius(double radius){
        this.radius=radius;
        return radius;
    }
     public double getRadius(){
        return radius;
    }
     public  double computeDiameter(double radius ){
         diameter=radius*2;
        return diameter;
    }
      public double computeArea(double radius ){
        area=pi*radius*radius;
        return area;
    }
}

