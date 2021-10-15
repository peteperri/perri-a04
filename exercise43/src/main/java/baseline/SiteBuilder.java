/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Peter Perri
 */
package baseline;

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

    public void buildWebsite() {
        //call createFolder twice to create the website folder and the folder for the specific named site inside
        //call the createHTMLFile method to create an HTML file
        //include two if statements to see if the user wants js and css folders. call createFolder for each if true
    }

    private void createHTMLFile(String contents) {
        //create a new HTML file at the specified path
        //make a new PrintWriter object, use it to print the specified contents of the HTML file
        //print the path if it was successfully created
    }

    private void createFolder(String name){
        //create a new File folder
        //print the path if it was successfully created
    }

    private String populateHTML() {
        //returns a string that contains the HTML code that should populate the HTML file
    }
}

