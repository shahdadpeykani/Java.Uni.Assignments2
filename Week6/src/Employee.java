import java.util.Random;
public class Employee {
    Random random = new Random();
    private String name;
    private double salary;
    private long ID;
    public Employee(double initSalary, String name, long ID){
        this.salary=initSalary;
        this.name=name;
        this.ID=ID;
    }
    public Employee(double initSalary, String name){
        this.salary=initSalary;
        this.name=name;
        this.ID=random.nextLong();
    }
    public Employee(String name){
        this.salary=0.0;
        this.name=name;
        this.ID= random.nextLong();
    }

    public double increase(int amount){
        salary+=amount;
        return salary;
    }
    public double increase(int amount,int bonus){
        salary+=(amount+bonus);
        return salary;
    }
    public double decrease(int amount){
        salary-=amount;
        return salary;
    }


    public String toString(){
        return "Name: "+name+"\nEmployee #:"+ID+ "\nSalary:"+salary;
    }
}
