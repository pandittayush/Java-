import java.util.*;

class Employee{
    private int salary;
  public  Employee(int salary){
        this.salary=salary;
    }
    public void work(){
        System.out.println("I am on work");
    }
   public int getSalary(){
        return salary;
    }
}
class HRManager extends Employee {
    public HRManager(int salary){
        super(salary);
    }
    public void work(){
        System.out.println("HR is on fire: ");
    }
    public void addEmployee(){
        System.out.println("Add a employee: ");
    }
}

public class p4Inheritance {
    public static void main(String[] args) {
        Employee e = new Employee(4000);
        HRManager hr = new HRManager(70000);
        e.work();
        e.getSalary();
        System.out.println("Employee salary: "+e.getSalary());
        hr.work();
        System.out.println("HR salary: "+hr.getSalary());
        hr.addEmployee();
    }
}
