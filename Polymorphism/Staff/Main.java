public class Main{
    public static void main(String[] args){
    StaffMember staff;
    staff=new Volunteer();
    System.out.println(staff.salary()+" For the volunteer");
    staff=new Employee();
    System.out.println(staff.salary()+" For the employee");
    staff=new Executive();
    System.out.print(staff.salary()+ " For the executive\n");
    staff=new Hourly();
    System.out.println(staff.salary()+ " For the Hourly");




    }

}