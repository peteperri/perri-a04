/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Peter Perri
 */
package baseline;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NameSorterTest {

    NameSorter test = new NameSorter();

    @Test
    void addNamesToList() throws FileNotFoundException {
        File nameList = new File("data/exercise41_input.txt");
        Scanner input = new Scanner(nameList);
        ArrayList<String> actual = new ArrayList<>();
        actual = (ArrayList<String>) test.addNamesToList(actual, input);
        ArrayList<String> expected = new ArrayList<>();
        expected.add("Ling, Mai");
        expected.add("Johnson, Jim");
        expected.add("Zarnecki, Sabrina");
        expected.add("Jones, Chris");
        expected.add("Jones, Aaron");
        expected.add("Swift, Geoffrey");
        expected.add("Xiong, Fong");
        expected.add("Alexanderson, Carrie");
        expected.add("Voege, Robert");
        expected.add("Turner, Timmy");
        expected.add("Zim, Invader");
        for(int i = 0; i < expected.size(); i++){
            assertEquals(expected.get(i), actual.get(i));
        }
    }

    @Test
    void sortNamesInList() throws FileNotFoundException {
        File nameList = new File("data/exercise41_input.txt");
        Scanner input = new Scanner(nameList);
        ArrayList<String> actual = new ArrayList<>();
        actual = (ArrayList<String>) test.addNamesToList(actual, input);
        actual = (ArrayList<String>) test.sortNamesInList(actual);
        ArrayList<String> expected = new ArrayList<>();
        expected.add("Alexanderson, Carrie");
        expected.add("Johnson, Jim");
        expected.add("Jones, Aaron");
        expected.add("Jones, Chris");
        expected.add("Ling, Mai");
        expected.add("Swift, Geoffrey");
        expected.add("Turner, Timmy");
        expected.add("Voege, Robert");
        expected.add("Xiong, Fong");
        expected.add("Zarnecki, Sabrina");
        expected.add("Zim, Invader");
        for(int i = 0; i < expected.size(); i++){
            assertEquals(expected.get(i), actual.get(i));
        }
    }

    @Test
    void printSortedNamesToFile() throws IOException {
        File nameList = new File("data/exercise41_input.txt");
        Scanner input = new Scanner(nameList);
        ArrayList<String> names = new ArrayList<>();
        names = (ArrayList<String>) test.addNamesToList(names, input);
        names = (ArrayList<String>) test.sortNamesInList(names);
        test.printSortedNamesToFile(names);
        String outputActual = Files.readString(Path.of("data/exercise41_output.txt"));
        String outputExpected = Files.readString(Path.of("data/exercise41_expectedOutput.txt"));
        assertEquals(outputActual, outputExpected);
    }
}