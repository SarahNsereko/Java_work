public class Pupil{//we use encapsulation to have access to private variables
    private String name;
    private int age;
    //Encapsulation uses getters and setters 
    public void setName(String name){ //if you dont want to return anything use void since we are setting 
        this.name=name;
    }
    public String getName(){// since we are returning a string we put the return type after public
        return name;
    }

    public void setAge(int age){
        this.age=age;//set method
    }
    public int getAge(){//since we are just returning we shall not put any parameters
        return age;
    }

}
 /*You can also use this 

public void setName(String Newname){  
        name=Newname;

 */
