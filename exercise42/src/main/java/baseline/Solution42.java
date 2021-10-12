/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Peter Perri
 */
package baseline;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Solution42 {
    public static void main(String[] args) throws IOException {
        //create instances of a file parser and of Solution42
        FileParser parser = new FileParser();
        Solution42 app = new Solution42();
        //make a new FileReader and set it to the result FileParser's getFile function
        FileReader reader = parser.getFile("data/exercise42_input.txt");
        //make an ArrayList of ArrayLists of Strings called data
        List<List<String>> data;
        //pass data to the Parser's function that will convert the CSV into an ArrayList of an ArrayList of Strings
        data = parser.convertCSVtoStrings(reader);
        //pass the ArrayList to the output creator function
        app.createOutput(data);
    }
    private void createOutput(List<List<String>> data){
        //formatted print statement to print every element of data
        System.out.println("Last       First      Salary");
        System.out.println("----------------------------");
        for(List<String> i : data) {
            System.out.format("%-10s %-10s %-15s%n", i.get(0), i.get(1), i.get(2));
        }
    }
}
