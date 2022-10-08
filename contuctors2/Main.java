public class Main {
    public static void main (String[] args){
//program to printout the sizes of shirts using a constructor in Threeshirts class
        Threeshirts T1 = new Threeshirts('L',10);//T1 is an object of the Three shirts class
        Threeshirts T2 = new Threeshirts('S',20);
        Threeshirts T3= new Threeshirts('M',30);
        System.out.println(T1.size + " :" + T1.sizeno);
        System.out.println(T2.size + " :" + T2.sizeno);
        System.out.println(T3.size + " :" + T3.sizeno);
    }
    }
    
