/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Peter Perri
 */
package baseline;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


import static org.junit.jupiter.api.Assertions.*;

class WordReplacerTest {

    //test code only tests one function because all others are tested implicitly.
    //constructor: used in the test
    //private readFile, writeFile, and printSentence all called by public replaceWord
    //printSentence also only prints to console, so it shouldn't need a test either way
    @Test
    void replaceWord() throws FileNotFoundException {
        WordReplacer replacer = new WordReplacer("data/", "testOutput");
        replacer.replaceWord("Java", "C#");
        File output = new File("data/testOutput.txt");
        StringBuilder sb = new StringBuilder();
        try(Scanner input = new Scanner(output).useDelimiter("\s+")){
            while (input.hasNext()) {
                sb.append(input.next() + " ");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String actual = sb.toString();
        String expected = "One should never utilize the word \"utilize\" in writing. Use \"use\" instead. For example, \"She uses an IDE to write her C# programs\" instead of \"She utilizes an IDE to write her C# programs\". ";
        assertEquals(expected, actual);
    }
}