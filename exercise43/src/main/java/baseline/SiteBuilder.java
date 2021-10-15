/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Peter Perri
 */
package baseline;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class SiteBuilder {

    private final String siteName;
    private final String author;
    private final boolean jsFolder;
    private final boolean cssFolder;

    private static final String SITE_FOLDER_NAME = "data\\website";

    //constructor
    public SiteBuilder(String siteName, String author, boolean jsFolder, boolean cssFolder) {
        this.siteName = siteName;
        this.author = author;
        this.jsFolder = jsFolder;
        this.cssFolder = cssFolder;
    }

    public void buildWebsite() throws IOException {
        //call createFolder twice to create the website folder and the folder for the specific named site inside
        createFolder(SITE_FOLDER_NAME);
        createFolder(SITE_FOLDER_NAME + File.separator + siteName);

        //call the createHTMLFile method to create an HTML file
        createHTMLFile(populateHTML());

        //include two if statements to see if the user wants js and css folders. call createFolder for each if true
        if (jsFolder) {
            createFolder(SITE_FOLDER_NAME + File.separator + siteName + File.separator + "js");
        }
        if (cssFolder) {
            createFolder(SITE_FOLDER_NAME + File.separator + siteName + File.separator + "css");
        }
    }

    private void createHTMLFile(String contents) {
        try {
            //create a new HTML file at the specified path
            String path = SITE_FOLDER_NAME + File.separator + siteName + File.separator + "index.html";
            File file = new File(path);

            //make a new PrintWriter object, use it to print the specified contents of the HTML file
            try (PrintWriter writer = new PrintWriter(file)) {
                writer.println(contents);
                writer.flush();
            }
            //print the path if it was successfully created
            System.out.println("Created " + file.getCanonicalPath());
        } catch (Exception e) {
            System.out.println("Couldn't create HTML file! Does it already exist?");
        }
    }

    private void createFolder(String name) throws IOException {

        //create a new File folder
        File folder = new File(name);
        boolean created = folder.mkdir();

        //print the path if it was successfully created
        if (created) {
            System.out.println("Created " + folder.getCanonicalPath());
        } else {
            System.out.println("Couldn't create " + name + " folder! Does it already exist?");
        }
    }

    private String populateHTML() {
        //returns a string that contains the HTML code that should populate the HTML file
        return String.format("""
                <!DOCTYPE html>
                <html>
                  <head>
                    <title>%s</title>
                    <meta name="author" content="%s">
                  </head>
                 \s
                  <body>
                  </body>
                </html>""", siteName, author);
    }
}

