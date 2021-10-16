/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Peter Perri
 */
package baseline;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ProductParserTest {

    @Test
    void parseProducts() throws FileNotFoundException {
        ProductParser test = new ProductParser();
        Map<String, Product> actual = test.parseProducts();
        Map<String, Product> expected = new HashMap<>();
        Product a = new Product("Widget", 25.00, 5);
        Product b = new Product("Doodad", 5.00, 10);
        Product c = new Product("Thing", 15.00, 5);
        expected.put(a.getName(), a);
        expected.put(b.getName(), b);
        expected.put(c.getName(), c);
        for(Map.Entry<String, Product> entry: expected.entrySet()){
            Product product1 = entry.getValue();
            Product product2 = actual.get(entry.getKey());
            assertEquals(product1.toString(), product2.toString());
        }

    }
}