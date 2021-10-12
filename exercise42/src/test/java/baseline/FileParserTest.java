/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Peter Perri
 */
package baseline;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FileParserTest {
    Solution42 testApp = new Solution42();
    FileParser testParser = new FileParser();

    @Test
    void convertCSVtoStrings() throws IOException {
        FileReader reader = testParser.getFile("data/exercise42_input.txt");
        List<List<String>> actualData;
        actualData = testParser.convertCSVtoStrings(reader);
        List<List<String>> expectedData = new ArrayList<>();
        List<String> ling = new ArrayList<>();
        ling.add("Ling");
        ling.add("Mai");
        ling.add("55900");
        List<String> johnson = new ArrayList<>();
        johnson.add("Johnson");
        johnson.add("Jim");
        johnson.add("56500");
        List<String> jonesA = new ArrayList<>();
        jonesA.add("Jones");
        jonesA.add("Aaron");
        jonesA.add("46000");
        List<String> jonesC = new ArrayList<>();
        jonesC.add("Jones");
        jonesC.add("Chris");
        jonesC.add("34500");
        List<String> swift = new ArrayList<>();
        swift.add("Swift");
        swift.add("Geoffrey");
        swift.add("14200");
        List<String> xiong = new ArrayList<>();
        xiong.add("Xiong");
        xiong.add("Fong");
        xiong.add("65000");
        List<String> zarnecki = new ArrayList<>();
        zarnecki.add("Zarnecki");
        zarnecki.add("Sabrina");
        zarnecki.add("51500");
        expectedData.add(ling);
        expectedData.add(johnson);
        expectedData.add(jonesA);
        expectedData.add(jonesC);
        expectedData.add(swift);
        expectedData.add(xiong);
        expectedData.add(zarnecki);
        System.out.println(actualData);
        System.out.println(expectedData);
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 3; j++) {
                assertEquals(expectedData.get(i).get(j), actualData.get(i).get(j));
            }
        }
    }

}