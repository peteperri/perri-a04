/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Peter Perri
 */
package baseline;

import java.io.IOException;
import java.util.Scanner;

public class Solution43 {
    public static void main(String[] args) throws IOException {
        Solution43 app = new Solution43();

        //prompt the user to enter the site name and author
        String siteName = app.getInput("Enter the name of the site: ");
        String author = app.getInput("Enter the author of the site: ");

        //prompt the user and assign boolean variables for if they want a folder for JS and/or CSS
        String jsString = app.getInput("Do you want a folder for JavaScript? ");
        boolean jsFolder = app.checkString(jsString);
        String cssString = app.getInput("Do you want a folder  for CSS?");
        boolean cssFolder = app.checkString(cssString);

        //create a new instance of the SiteBuilder class while passing the site name and author Strings and the jsFolder and cssFolder booleans
        SiteBuilder builder = new SiteBuilder(siteName, author, jsFolder, cssFolder);
        //call the buildWebsite function
        builder.buildWebsite();
    }

    public boolean checkString(String userEntry) {
        //return a boolean true if the user entered yes when prompted
        return userEntry.equals("y") || userEntry.equals("Y") || userEntry.equals("Yes") || userEntry.equals("yes");
    }

    private String getInput(String prompt){
        //print the prompt, return the user's entry on the next line
        Scanner input = new Scanner(System.in);
        System.out.println(prompt);
        return input.nextLine();
    }
}
