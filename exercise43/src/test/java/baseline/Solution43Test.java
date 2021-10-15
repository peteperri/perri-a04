/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Peter Perri
 */
package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution43Test {

    @Test
    void checkString() {
        Solution43 app = new Solution43();
        boolean iAmTrue = app.checkString("Yes");
        boolean iAmFalse = app.checkString("No");
        assertTrue(iAmTrue);
        assertFalse(iAmFalse);
    }
}