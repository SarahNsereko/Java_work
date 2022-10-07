public class Main {
    public static void main (String[] args ){
        Mouse1 m1=new Mouse1();//making an object for class mouse1
        Mouse2 m2=new Mouse2();//making an object for class mouse2
        Mouse3 m3=new Mouse3();
        m1.light();//the object m1 can use the light method because it inherited the properties of the mouse class
        m2.rightclick();// object m2 has inherited rightclickmethod
        m3.leftclick();
        m2.Doubleclicks();//object m2 can use double clicks because class mouse 2 inherited mouse1 properties
        System.out.println(m2.date);//returns date that is inherited from mouse1 that inherited from mouse2
        

    }
}