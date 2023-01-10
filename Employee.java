package ooplab10.pkg2;

/**
 *
 * @author souaid
 */
public class Employee {

    private String name;
    private int age;
    private double salary;

    public Employee() {
        this("No infos", 22, 800);
    }

    public Employee(String Name, int age, double salary) {
        setEmployee(Name, age, salary);
    }

    public void setEmployee(String name, int age, double salary) {
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int Age) {
        this.age = Age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public double getSalary() {
        return this.salary;
    }

    public String toString() {
        return String.format("Name: %-20s\nAge: %-10d\nSalary: %13.2f\n ", this.name, this.age, this.salary);

    }

}
