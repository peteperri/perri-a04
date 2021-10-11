package baseline;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution41{

    public static void main(String[] args) {
        Solution41 app = new Solution41();
        File nameList = new File("data/exercise41_input.txt");
        Scanner input = new Scanner(nameList);

        //create an ArrayList to store the names
        //call a public method to add the names to the ArrayList
        //call a public method to sort the names in the ArrayList
        //call a private method to output the sorted ArrayList to the output file
        //print that the file was successfully opened and written to
        //include an exception handler for if the file is not found
    }

    public List<String> addNamesToList(List<String> names, Scanner input){
        //while loop to parse the file and add the names to the arraylist
    }

    public List<String> sortNamesInList(List<String> names){
        //sort the arraylist alphabetically and return it
    }

    private void printSortedNamesToFile(List<String> names){
        int nameCount = 0;
        //for loop to count how many names are in the array
        //try to create a new file and print the number of names + the sorted list of names to the file
        //catch an exception for not creating the file successfully
        }
    }
}