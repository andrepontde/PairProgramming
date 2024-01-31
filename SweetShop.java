/*
 * @authors : Andre Pont & Jordan Carthy
 * SweetShop.java
 * 31/01/2024
 */


import java.util.Scanner;

public class SweetShop{
    public static void main (String args[]){
        // Assorted the variables provided with the desired price
        double sweets = 0.50;
        int crisps = 1;
        int drinks = 2;
        // Introduce the user to the programme
        System.out.println("Hey, welcome to our sweetshop!");
        // Let the machine know we will be taking user input
        Scanner userInput = new Scanner(System.in);
        System.out.println("How many drinks would you like to buy? ");
        int amountDrinks = userInput.nextInt();
        System.out.println("How many sweets would you like to buy? ");
        int amountSweets = userInput.nextInt();
        System.out.println("How many crisps would you like to buy? ");
        int amountCrisps = userInput.nextInt();
        // Create total sum
        double total = ((amountCrisps*crisps)+(amountDrinks*drinks)+(amountSweets*sweets));

        // Print final answer
        System.out.printf("The total will be %.2f please! \n ", total);

    }


}
