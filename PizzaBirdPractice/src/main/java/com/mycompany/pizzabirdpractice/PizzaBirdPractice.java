/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pizzabirdpractice;

import java.util.*;
public class PizzaBirdPractice {

    public static void main(String[] args) {
        Vector<String> availableSize = new Vector<String>();
        enum time{ Morning , launch , dinner};
        Scanner scan = new Scanner(System.in);
        String timeSlote = scan.nextLine();
        if(timeSlote.equalsIgnoreCase(time.Morning.toString()))
        {
            availableSize.add("High");
            availableSize.add("Medium");
        }
        
        System.out.println("the size is " + availableSize);
            
    }
}
