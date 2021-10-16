/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Peter Perri
 */
package baseline;

import java.io.FileNotFoundException;
import java.util.*;

public class Solution44 {

    public static void main(String[] args) throws FileNotFoundException {
        Interactor app = new Interactor();
        ProductParser parser = new ProductParser();

        //create a map of products with String keys (key being the product name)
        //set it equal to the list of products from the json
        Map<String, Product> inventory = parser.parseProducts();


        //create a new product object searchedProduct and set it equal to the product the user searched for
        //if we can't find that object, loop through the prompting again
        Product searchedProduct = null;
        while (searchedProduct == null) {
            String input = app.promptUser();
            searchedProduct = app.getProduct(inventory, input);
        }

        //print out the product the user searched for by calling the toString method
        System.out.println(searchedProduct.toString());
    }
}
