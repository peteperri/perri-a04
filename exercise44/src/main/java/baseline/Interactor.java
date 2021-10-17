/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Peter Perri
 */
package baseline;

import java.util.Map;
import java.util.Scanner;

//class for interacting with the user. wanted to call it "interface" or something similar, but figured that could
//be confusing given that "interface" means something in java already
public class Interactor {

    //private method to prompt the user for a product name and return their entry
    public String promptUser() {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the product name?");
        return input.nextLine();
    }

    //method that returns the product from the right key, or null if that product doesn't exist
    public Product getProduct(Map<String, Product> inventory, String input){
            if(inventory.containsKey(input)){
                return inventory.get(input);
            }
            else{
                System.out.println("Sorry, that product was not found in our inventory.");
            }
        return null;
    }
}
