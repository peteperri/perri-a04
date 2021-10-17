/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Peter Perri
 */
package baseline;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution45 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        System.out.println("What's the name of the output file?");
        String outputFileName = input.nextLine();

        //create an instance of the WordReplacer object
        WordReplacer replacer = new WordReplacer("data/", outputFileName);

        //call the replaceWord() method
        replacer.replaceWord("utilize", "use");
    }
}
