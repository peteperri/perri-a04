/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Peter Perri
 */
package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HistogramMakerTest {

    //only one test because all other functions are tested implicitly by testing the function that calls them all
    @Test
    void makeHistogram() {
        HistogramMaker test = new HistogramMaker("data/testInput.txt");
        String actual = test.makeHistogram();
        String expected = String.format("%-12s %s%n", "jim:", "*******") +
                          String.format("%-12s %s%n", "joe:", "****") +
                          String.format("%-12s %s%n", "bob:", "*");
        assertEquals(expected, actual);
    }
}