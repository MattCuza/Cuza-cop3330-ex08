/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Matthew Cuza
 */
package org.example;
import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("How many people? ");
        int people = sc.nextInt();

        System.out.println("How many pizzas do you have? ");
        int pizza = sc.nextInt();

        System.out.println("How many slices per pizza? ");
        int slices = sc.nextInt();

        System.out.println(people + " people with " + pizza + " pizzas (" + (pizza * slices) + " slices)\n" +
                "Each person gets " + ((slices * pizza) / people) + " pieces of pizza.\n" +
                "There are " + ((slices * pizza) % people) + " leftover pieces.");


    }
}
