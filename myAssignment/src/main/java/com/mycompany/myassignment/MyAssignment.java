package com.mycompany.myassignment;

import java.util.Scanner;
import java.io.*;
import java.util.*;
import Interface_Assignment.Rectangle;
import polymorphism_assignment.*;

public class MyAssignment {

    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args) {

        //interface
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter Your height of the ractangle : "); 
//        float a = scan.nextInt(); 
//        System.out.println("Enter the width of the ractangle : ");
//        float b = scan.nextInt();
//        Rectangle re = new Rectangle();
//        re.Area(a, b);
//polymorphism
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter the value of A : "); 
//        int a = scan.nextInt(); 
//        System.out.println("Enter the value of B : ");
//        int b = scan.nextInt();
//        System.out.println("Enter the value of C : ");
//        int c = scan.nextInt();
//        Overloading ovl = new Overloading();
//        System.out.println("Addition in overloading is : " + ovl.add(a, b));
//        System.out.println("Addition in overloading is : " + ovl.add(a, b,c));
//        Overriding ovr = new Overriding();
//        System.out.println("Addition from overriding : "+ovr.add(a, b, c));
//        Level myVar = Level.MEDIUM;
//
//        switch(myVar) {
//            case LOW:
//                System.out.println("Low level");
//                break;
//            case MEDIUM:
//                System.out.println("Medium level");
//                break;
//            case HIGH:
//                System.out.println("High level");
//                break;
//        }

 // Size of the Vector
//        int n = 5;
// 
//        // Declaring the Vector with
//        // initial size n
//        Vector<Integer> v = new Vector<Integer>(n);
// 
//        // Appending new elements at
//        // the end of the vector
//        for (int i = 1; i <= n; i++)
//            v.add(i);
// 
//        // Printing elements
//        System.out.println(v);
// 
//        // Remove element at index 3
//        v.remove(3);
// 
//        // Displaying the vector
//        // after deletion
//        System.out.println(v);
// 
//        // iterating over vector elements
//        // using for loop
//        for (int i = 0; i < v.size(); i++)
// 
//            // Printing elements one by one
//            System.out.print(v.get(i) + " ");


//exfeption handaling

      try {
      int[] myNumbers = {1, 2, 3};
      System.out.println(myNumbers[10]);
    } catch (Exception e) {
      System.out.println("Something went wrong.");
    }
  
    }
}
