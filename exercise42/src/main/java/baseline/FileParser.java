/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Peter Perri
 */
package baseline;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class FileParser {

    public FileReader getFile(String fileName) throws FileNotFoundException {
        //return a new FileReader object that takes the fileName as a parameter
        //no test because it is just getting input from the user
        return new FileReader(fileName);
    }

    public List<List<String>> convertCSVtoStrings(FileReader csv) throws IOException {
        //make an ArrayList of ArrayLists of Strings
        List<List<String>> data = new ArrayList<>();
        //parse and split up the file while adding each individual element to the List
        try (BufferedReader br = new BufferedReader(csv)) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                data.add(Arrays.asList(values));
            }
        }
        //return the ArrayList
        return data;
    }



}
