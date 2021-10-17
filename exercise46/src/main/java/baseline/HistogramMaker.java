/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Peter Perri
 */
package baseline;

import java.io.File;
import java.io.FileNotFoundException;
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
        ArrayList<String> words = parseFile();
        Map<String, Integer> map = createMap(words);
        List<Map.Entry<String, Integer>> listOfMapEntries = sortMap(map);

        //return finalized histogram as a String
        return createOutputString(listOfMapEntries);
    }

    private ArrayList<String> parseFile(){
        ArrayList<String> words = new ArrayList<>();
        try (Scanner input = new Scanner(new File(filePath)).useDelimiter("\\s|\\n")) {

            //while loop that adds words from the input file to ArrayList of words
            while (input.hasNext()) {
                words.add(input.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        words.removeAll(Arrays.asList("", null));
        return words;
    }

    private Map<String, Integer> createMap(List<String> words){

        //convert the raw list of all words into a map where the word is the key and the frequency is an integer
        Map<String, Integer> map = new HashMap<>();
        for (String w : words) {
            Integer n = map.get(w);

            //if the map already contains the word as a key, increment its value
            n = (n == null) ? 1 : ++n;
            map.put(w, n);
        }
        return map;
    }

    private List<Map.Entry<String, Integer>> sortMap(Map<String, Integer> map){

        //function that converts map back to a list of map entries, so it can be sorted
        List<Map.Entry<String, Integer>> listOfMapEntries = new LinkedList<>(map.entrySet());

        //sort the entries in order of the highest word frequency, which is the value (not the key, key is the word itself)
        listOfMapEntries.sort((entry1, entry2) -> (entry2.getValue()).compareTo(entry1.getValue()));

        return listOfMapEntries;
    }

    private String createOutputString(List<Map.Entry<String, Integer>> listOfMapEntries){
        StringBuilder outputStringBuilder = new StringBuilder();

        //for each Map entry in the list of map entries:
        for (Map.Entry<String, Integer> e : listOfMapEntries) {

            //convert the map entry's value into a string of asterisks
            StringBuilder asteriskAdder = new StringBuilder();
            int asteriskCount = e.getValue();
            asteriskAdder.append("*".repeat(Math.max(0, asteriskCount)));

            //create a formatted output string combining the key (word) and the asterisks
            outputStringBuilder.append(String.format("%-12s %s%n", e.getKey() + ":", asteriskAdder.toString()));
        }

        return outputStringBuilder.toString();
    }
}
