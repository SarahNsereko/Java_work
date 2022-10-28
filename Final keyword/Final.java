final public class Final{//a class can also be final meaning you cannot extend it 

   // final variables go up here ,global variables use the final keyword 
   final int MAX=5;//its good to give final variables in upper case to identify them easily 
   //You cant change a final variable  
   /* final int MAX; if final isnt initiailised you can use a constructor
        Final(){
            MAX=5;
        }
   
   
   
   
   
    */
   final public void sayhi(){
        System.out.println("Hi there");
        //you can have a final method meaning you cannot change it or override it 

   }
    public static void main(String[] args){
        Final c=new Final();
       System.out.println(c.MAX);   
       c.sayhi();     
    }
}