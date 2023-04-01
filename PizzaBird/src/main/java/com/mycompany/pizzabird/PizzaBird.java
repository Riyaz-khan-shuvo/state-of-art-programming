
package com.mycompany.pizzabird;

import java.util.Scanner;
import java.util.Vector;
public class PizzaBird {

    public static void main(String[] args) {
        Vector<String> availableSizes = new Vector<String>();
        Scanner sc = new Scanner(System.in);
        enum time{lunch, afternoon, dinner}
        time t;
        System.out.print("Enter the time slot (Lunch/Afternoon/Dinner): ");
        String timeSlot = sc.nextLine();
        if (timeSlot.equalsIgnoreCase(time.lunch.toString()) || timeSlot.equalsIgnoreCase(time.afternoon.toString())) {
            availableSizes.add("Small");
            availableSizes.add("Medium");
            availableSizes.add("Large");
        } else if (timeSlot.equalsIgnoreCase("Dinner")) {
            availableSizes.add("Small");
            availableSizes.add("Medium");
            availableSizes.add("Large");
            availableSizes.add("Family Size");
        } else {
            System.out.println("Invalid time slot.");
            return;
        }
        System.out.println("Available pizza sizes for " + timeSlot + " are: " +availableSizes);
    }
}
