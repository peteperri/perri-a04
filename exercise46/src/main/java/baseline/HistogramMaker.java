package baseline;

import java.util.*;

public class HistogramMaker {
    private final String filePath;

    //constructor; user specifies path and name of the file to make a histogram out of
    public HistogramMaker(String filePath){
        this.filePath = filePath;
    }

    //method to call each function
    public String makeHistogram(){
        //call parseFile, createMap, sortMap, and finally createOutputString.
        //return finalized histogram as a String
    }

    private ArrayList<String> parseFile(){
        //while loop that adds words from the input file to ArrayList of words
    }

    private Map<String, Integer> createMap(List<String> words){
        //convert the raw list of all words into a map where the word is the key and the frequency is an integer
        //if the map already contains the word as a key, increment its value
    }

    private List<Map.Entry<String, Integer>> sortMap(Map<String, Integer> map){
        //function that converts map back to a list of map entries, so it can be sorted
        //sort the entries in order of the highest word frequency, which is the value (not the key, key is the word itself)
    }

    private String createOutputString(List<Map.Entry<String, Integer>> listOfMapEntries){
        //for each Map entry in the list of map entries:
            //convert the map entry's value into a string of asterisks
            //create a formatted output string combining the key (word) and the asterisks
    }