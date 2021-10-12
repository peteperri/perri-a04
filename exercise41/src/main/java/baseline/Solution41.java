/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Peter Perri
 */
package baseline;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution41{

    public static void main(String[] args) {
        try {
            NameSorter ns = new NameSorter();
            File nameList = new File("data/exercise41_input.txt");
            Scanner input = new Scanner(nameList);

            //create an ArrayList to store the names
            ArrayList<String> names = new ArrayList<>();

            //call a public method to add the names to the ArrayList
            names = (ArrayList<String>) ns.addNamesToList(names, input);

            //call a public method to sort the names in the ArrayList
            names = (ArrayList<String>) ns.sortNamesInList(names);

            //call a private method to output the sorted ArrayList to the output file
            ns.printSortedNamesToFile(names);

            //print that the file was successfully opened and written to
            System.out.println("Successfully wrote to file");
        }
        //include an exception handler for if the file is not found
        catch (FileNotFoundException e){
            System.out.println("File not found error");
        }
    }


}