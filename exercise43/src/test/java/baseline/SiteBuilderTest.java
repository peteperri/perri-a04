/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Peter Perri
 */
package baseline;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class SiteBuilderTest {

    @Test
    void buildWebsite() throws IOException {

        SiteBuilder testBuilder = new SiteBuilder("myTestSite", "me", true, true);
        testBuilder.buildWebsite();

        assertTrue(Files.exists(Path.of("data/website")));
        assertTrue(Files.exists(Path.of("data/website/myTestSite")));
        assertTrue(Files.exists(Path.of("data/website/myTestSite/css")));
        assertTrue(Files.exists(Path.of("data/website/myTestSite/js")));
        assertTrue(Files.exists(Path.of("data/website/myTestSite/index.html")));

        SiteBuilder testBuilder2 = new SiteBuilder("myTestSite2", "me", false, false);
        testBuilder2.buildWebsite();

        assertTrue(Files.exists(Path.of("data/website")));
        assertTrue(Files.exists(Path.of("data/website/myTestSite2")));
        assertFalse(Files.exists(Path.of("data/website/myTestSite2/css")));
        assertFalse(Files.exists(Path.of("data/website/myTestSite2/js")));
        assertTrue(Files.exists(Path.of("data/website/myTestSite2/index.html")));
    }
}