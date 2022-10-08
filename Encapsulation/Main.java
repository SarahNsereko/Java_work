public class Main {
        public static void main (String[] args){
            Pupil p =new Pupil();
            p.setName("Suzanna");//if we had used p.name we would get an error because the variables are private
            System.out.println(p.getName());// to return for us the new name we have set
        
             p.setAge(10);// it is set to 10 but if you want to print you have to use get
            System.out.println(p.getAge());//prints age even if its private
        
        }
        
        
           
                }//use encapsulation so that the user doesnt have to interact wih the variables 