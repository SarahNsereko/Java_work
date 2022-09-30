public class Shirt{
    public static String color;
    public static char size;

    Shirt (){//This is a constructor, you get the name of the class and open parenthesis

    }//defalut constructor -not necessary

    Shirt(String newcolor,char newsize){// make a  constructor if you want to take in parameters
    color=newcolor;
    size=newsize;
    }
    public static void puton(){//puton() is a method inside a shirt class
        System.out.println("The shirt is on");
    }
      public static void putoff(){//putoff() is a method inside a shirt class
        System.out.println("The shirt is off");
    }


    //if we are going to call in the main class
    public static void setColor (String newcolor){//this is how we can access a private variable
    color=newcolor;
    }
//we use set if we want to re-assign the value

    public static void setSize (char newsize){//this is how we can access a private variable
    size=newsize;
    }




}