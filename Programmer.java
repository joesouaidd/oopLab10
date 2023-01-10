/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ooplab10.pkg2;

/**
 *
 * @author souai
 */
public class Programmer extends Employee {

    private String language;

    public Programmer(String name, int age, double salary, String language) {
        super(name, age, salary);
        setProgrammer(language);

    }

    public void setProgrammer(String language) {
        this.language = language;;
    }

    public String getLanguage() {
        return this.language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String toString() {
        return String.format("Name: %-10s\nAge: %-5d\nSalary: %-10.2f\nLanguage: %-10s \n", this.getName(), this.getAge(), this.getSalary(), this.getLanguage());
        //or  return super.toString() + "\nLanguage: " + language;
    }

}
