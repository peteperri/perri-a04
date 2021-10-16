/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Peter Perri
 */
package baseline;
import com.google.gson.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class ProductParser {

    public Map<String, Product>  parseProducts() throws FileNotFoundException {

        //create a map ("inventory") of Product objects using the product names (strings) as the keys
        Map<String, Product> inventory = new HashMap<>();
        JsonElement element = JsonParser.parseReader(new FileReader("data/exercise44_input.json"));
        JsonObject obj = element.getAsJsonObject();
        JsonArray arrayOfProducts = obj.get("products").getAsJsonArray();

        //for each product listed in the json file:
        for (JsonElement product : arrayOfProducts) {
            JsonObject productObj = product.getAsJsonObject();

            //get the name, price, and quantity of those objects and assign them to variables
            String name = productObj.get("name").getAsString();
            double price = productObj.get("price").getAsDouble();
            int quantity = productObj.get("quantity").getAsInt();

            //create a temporary product object
            Product temp = new Product(name, price, quantity);

            //add the temporary product object to the map ("inventory"), resulting in the inventory being filled with all the products from the map
            inventory.put(temp.getName(), temp);
        }

        //return the map "inventory"
        return inventory;
    }
}
