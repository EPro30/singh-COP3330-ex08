/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Riya Singh
 */

import java.util.Scanner;
public class exPizzaParty {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many people?");
        int numPeople = sc.nextInt();
        System.out.println("How many pizzas do you have?");
        int numPizzas = sc.nextInt();
        System.out.println("How many slices per pizza?");
        int numSlices = sc.nextInt();;
        int pizPrsn = (numPizzas*numSlices)/numPeople;
        int leftover = (numPizzas*numSlices)%numPeople;

        System.out.println(numPeople + " people with " + numPizzas + " pizzas");
        System.out.println("Each person gets " +  pizPrsn + " pieces of pizza.");
        System.out.println("There are " +  leftover+ " leftover pieces.");
    }
}
