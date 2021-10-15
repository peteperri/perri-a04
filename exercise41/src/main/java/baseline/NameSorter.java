/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Peter Perri
 */
package baseline;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NameSorter {
    public List<String> addNamesToList(List<String> names, Scanner input){
        //while loop to parse the file and add the names to the arraylist
        while(input.hasNextLine()){
            String data = input.nextLine();
            names.add(data);
        }
        return names;
    }

    public List<String> sortNamesInList(List<String> names){
        //sort the arraylist alphabetically and return it
        Collections.sort(names);
        return names;
    }

    public void printSortedNamesToFile(List<String> names){
        int nameCount = 0;
        //for loop to count how many names are in the array
        for (int i = 0; i < names.size(); i++){
            nameCount++;
        }
        try {
            //try to create a new file and print the number of names + the sorted list of names to the file
            try (PrintWriter output = new PrintWriter("data/exercise41_output.txt")) {
                output.printf("Total of %d names%n----------------------%n", nameCount);
                for (String name : names) {
                    output.println(name);
                }
            }
            //catch an exception for not creating the file successfully
        } catch (FileNotFoundException e) {
            System.out.println("File not created error");
        }
    }
}
