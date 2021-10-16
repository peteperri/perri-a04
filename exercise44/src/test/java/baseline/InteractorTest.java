/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Peter Perri
 */
package baseline;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class InteractorTest {

    @Test
    void getProduct() throws FileNotFoundException {

        Interactor app = new Interactor();
        ProductParser parser = new ProductParser();
        Map<String, Product> inventory = parser.parseProducts();

        Product expected1 = new Product("Thing", 15.00, 5);
        Product actual1 = app.getProduct(inventory, "Thing");
        assertEquals(actual1.toString(), expected1.toString());

        Product actual2 = app.getProduct(inventory, "pipis");
        assertNull(actual2);
    }
}