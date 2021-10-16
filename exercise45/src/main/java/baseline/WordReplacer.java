package baseline;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class WordReplacer {

    private ArrayList<String> sentence = new ArrayList<>();
    private final String inputFileName;
    private final String filePath;
    private final String outputFileName;

    //constructor
    public WordReplacer(String filePath, String outputFileName){
        this.filePath = filePath;
        this.inputFileName = filePath + "exercise45_input.txt";
        this.outputFileName = outputFileName;

    }

    public void replaceWord(String replacedWord, String replaceWith) throws FileNotFoundException {
        //assign sentence to the return value of readFile()
        sentence = readFile();

        //call printSentence to show the user the input
        printSentence("Input: ");

        //replace the contents of ArrayList sentence with the new contents using a for loop
        for (int i = 0; i < sentence.size() - 1; i++) {
            String current = sentence.get(i);
            String replaced = current.replace(replacedWord, replaceWith);
            sentence.set(i, replaced);
        }

        //call printSentence to show the user the output
        printSentence("Output: ");

        //call writeFile
        writeFile();
    }


    private ArrayList<String> readFile(){
        //creates an ArrayList of Strings
        ArrayList<String> result = new ArrayList<>();

        //assigns each element of the ArrayList a word of the opened File (specified in the constructor)
        try (Scanner input = new Scanner(new File(inputFileName)).useDelimiter("\s+")) {
            while (input.hasNext()) {
                result.add(input.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //returns the ArrayList of Strings
        return result;

    }

    private void writeFile() throws FileNotFoundException {

        //create a new File in the same directory as the input File
        File output = new File(filePath + outputFileName + ".txt");

        try (PrintWriter writer = new PrintWriter(output)) {
            for (String s : sentence) {
                //write the ArrayList sentence to the new File
                writer.print(s + " ");
            }
            System.out.println("\nSuccessfully wrote to file. Check " + filePath + outputFileName + ".txt");
        }
    }

    private void printSentence(String io){
        //small private method to print ArrayList sentence to console
        System.out.print("\n" + io);
        for (String s: sentence)  {
            System.out.print(s + " ");
        }
    }
}
