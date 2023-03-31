/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.polymorphism_assignment;

/**
 *
 * @author Riyaz khan Shuvo
 */

class Person{
    public void behave(){
        System.out.println("I am normal behave");
    }
}

class Student extends Person{
    public void behave()
    {
        System.out.println("In classroom bahave like student");
    }
}

class Customer extends Person {
    public void behave()
    {
        System.out.println("In shopping mall behave like Customer");
    }
}





public class Polymorphism_Assignment {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Person p = new Person();
        p.behave();
        p=new Student();
        p.behave();
        p=new Customer();
        p.behave();
    }
}
