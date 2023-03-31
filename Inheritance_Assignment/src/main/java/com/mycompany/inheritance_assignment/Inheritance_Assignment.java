/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.inheritance_assignment;

/**
 *
 * @author Riyaz khan Shuvo
 */

class Parent {
    public void Display(){
        System.out.println("I am form Parent Class");
    }
}
class Children extends Parent{
    public void Display(){
        System.out.println("I am from Children class");
    }
}


public class Inheritance_Assignment {

    public static void main(String[] args) {
        Parent pt = new Parent();
        pt.Display();
        pt = new Children();
        pt.Display();              
    }
}
