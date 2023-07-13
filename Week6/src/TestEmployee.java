import java.util.Scanner;
public class TestEmployee {
    public static void main(String[] args) {
        String name;
        double salary;
        long ID;
        Employee emp;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter employee's first name");
        name = input.next();
        emp=new Employee(name);

        System.out.println("Employee " + name + ":");
        System.out.println(emp);

        System.out.println("\nEnter initial salary");
        salary = input.nextDouble();
        emp = new Employee(salary,name);

        System.out.println("Employee " + name + ":");
        System.out.println(emp);

        System.out.println("\nEnter employee number");
        ID=input.nextLong();
        emp = new Employee(salary,name,ID);
        System.out.println("Employee " + name + ":");
        System.out.println(emp);

        System.out.print("\nIncreasing salary by 100 with 2 as bonus, salary is now "+emp.increase(100,2));
        System.out.println();
        System.out.print("\nDecreasing by 25, salary is now "+emp.decrease(25));

    }
}