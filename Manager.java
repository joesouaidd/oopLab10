/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ooplab10.pkg2;

/**
 *
 * @author souai
 */
public class Manager extends Employee {

    private String department;
    private Employee[] supervised = new Employee[10];
    private int numWOrkersSupervised = 0;

    public Manager(String name, int age, double salary, String department) {
        super(name, age, salary);
        setManager(department);

    }

    public void setManager(String department) {
        setDepartment(department);
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return this.department;
    }

    public int getNum() {
        return this.numWOrkersSupervised;
    }

    public void addWorker(Employee name) {
        supervised[this.numWOrkersSupervised] = name;
        this.numWOrkersSupervised++;
    }

    public String toString() {
        String print = "Name: "+this.getName() + "\n" +"Age: "+ this.getAge() + "\n" +"Salary: " + this.getSalary() + "\n"+"Department: " + this.getDepartment() + "\n";
        for (int i = 0; i < this.getNum(); i++) {
            print += this.supervised[i].getName() + "\n";
        }
        return print;
    }

}
