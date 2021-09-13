/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Chris Mathew
 */
package base;

import java.util.Scanner;

public class App
{
    public static void main( String[] args ){
        Scanner in = new Scanner(System.in);
        //input
        System.out.print("What is the order amount? ");
        String order = in.nextLine();
        System.out.print("What is the state? ");
        String state = in.nextLine();

        //string conversion
        double total = Double.parseDouble(order);

        //math + output if state is WI
        if (state.contains("WI")) {
            double tax = Math.round((0.055*total) * 100.0) / 100.0;
            double ntotal = Math.round((tax + total) * 100.0) / 100.0;
            System.out.println("The subtotal is $"+ total +".\nThe tax is $"+tax+".\nThe total is $"+ntotal+".");
            return;
        }
        //other output
        System.out.println("The total is $"+total+".");
    }
}
