/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Peter Perri
 */
package baseline;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution41{

    public static void main(String[] args) {
        try {
            Solution41 app = new Solution41();
            File nameList = new File("data/exercise41_input.txt");
            Scanner input = new Scanner(nameList);

            //create an ArrayList to store the names
            ArrayList<String> names = new ArrayList<>();

            //call a public method to add the names to the ArrayList
            names = (ArrayList<String>) app.addNamesToList(names, input);

            //call a public method to sort the names in the ArrayList
            names = (ArrayList<String>) app.sortNamesInList(names);

            //call a private method to output the sorted ArrayList to the output file
            app.printSortedNamesToFile(names);

            //print that the file was successfully opened and written to
            System.out.println("Successfully wrote to file");
        }
        //include an exception handler for if the file is not found
        catch (FileNotFoundException e){
            System.out.println("File not found error");
        }
    }

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

    private void printSortedNamesToFile(List<String> names){
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