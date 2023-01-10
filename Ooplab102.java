/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ooplab10.pkg2;

/**
 *
 * @author souai
 */
public class Ooplab102 {


    public static void main(String[] args) {
        // TODO code application logic here

        Employee[] emp = new Employee[6];
        emp[0] = new Employee("Walid", 35, 2000);
        emp[1] = new Programmer("Lina", 37, 5000, "java");
        emp[2] = new Programmer("Marie", 22, 1500, "C++");
        emp[3] = new Manager("Maguy", 22, 1500, "IT");
        emp[4] = new Employee("Fares", 30, 3500);
        emp[5] = new Manager("Khaled", 45, 6100, "Translation");

        for (int i = 0; i < 6; i++) {
            System.out.println(emp[i]);
            if (emp[i] instanceof Manager) {
                System.out.println( emp[i].getName() +" is a Manager");
            }

            if (emp[i] instanceof Programmer) {
                System.out.println(emp[i].getName() +" is a Programmer");
            }
            if (emp[i] instanceof Employee) {
                System.out.println(emp[i].getName() +" is a Employee");
            }
        }

        Manager man1 = new Manager("Maria", 58, 15000, "CEO");
        Manager man2 = new Manager("Marc", 50, 10000, "Translation Team");
        Manager man3 = new Manager("Ola", 55, 11000, "Developing Team");

        man3.addWorker(emp[0]);
        man3.addWorker(emp[2]);

        man2.addWorker(emp[0]);
        man2.addWorker(emp[4]);

        man1.addWorker(emp[0]);
        man1.addWorker(emp[1]);
        man1.addWorker(emp[2]);
        man1.addWorker(emp[3]);
        man1.addWorker(emp[4]);
        man1.addWorker(emp[5]);

        System.out.println(man1);
        System.out.println(man2);
        System.out.println(man3);

        if (man1 instanceof Manager) {
            System.out.println("M1 is manager");
        }
        if (man1 instanceof Employee) {
            System.out.println("M1 is Employee");
        }
        if (man1 instanceof Object) {
            System.out.println("M1 is an Object as well");
        }
    }

}
