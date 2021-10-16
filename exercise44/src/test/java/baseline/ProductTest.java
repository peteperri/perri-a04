/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Peter Perri
 */
package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    Product product = new Product("Pizza", 5.0, 5);
    @Test
    void getName() {
        assertEquals("Pizza", product.getName());
    }

    @Test
    void testToString() {
        String toStringExpected = String.format("Name: %s%nPrice: $%.2f%nQuantity: %d", "Pizza", 5.0, 5);
        assertEquals(toStringExpected, product.toString());
    }
}