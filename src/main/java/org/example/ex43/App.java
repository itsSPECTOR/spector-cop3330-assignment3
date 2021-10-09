package org.example.ex43;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution Ex 43
 *  Copyright 2021 Reese Spector
 */

public class App {

    //for junit5 tests in directory: src/test/java/org/example/ex43/AppTest.java
    public static String fileSuccess(){
        return "success";
    }

    //create html file and directory
    static void createHTML(String path, String author, String dir) throws IOException {
        FileWriter txtOut = new FileWriter(path + "/index.html");
        txtOut.write("Title: " + dir);
        txtOut.write("\nAuthor: " + author);
        txtOut.close();
        fileSuccess();
        System.out.println("Created ./" + dir + "/index.html");
    }

    //create js directory
    static void createJS(String path, String dir){
        File folder = new File(path + "/js/");
        folder.mkdir();
        System.out.println("Created ./" + dir + "/js/");
    }

    //create css directory
    static void createCSS(String path, String dir){
        //creating css directory
        File folder = new File(path + "/css/");
        folder.mkdir();
        System.out.println("Created ./" + dir + "/css/");
    }

    public static void main(String[] args) throws IOException {

        //define the projects path - so we can append the desired directory name
        String path = "src/main/java/org/example/ex43/";

        //get site name
        System.out.print("Site name: ");
        Scanner userPath = new Scanner(System.in);

        //store the site name / path
        String dir = userPath.next();
        path = path + dir;

        //get author name
        System.out.print("Author: ");
        String author = userPath.next();

        //creating directory
        File folder = new File(path);
        folder.mkdir();

        //prompt user if they'd like a js directory
        System.out.print("Do you want a folder for JavaScript? ");
        String ynJS = userPath.next();

        //prompt user if they'd like a css directory
        System.out.print("Do you want a folder for CSS? ");
        String ynCSS = userPath.next();

        //create html file path using function
        //directory/index.html
        //  create filepath
        System.out.println("Created ./" + dir);
        createHTML(path, author, dir);

        //conditionals to construct css folder using function
        //if(true)
        //  create filepath
        if(ynCSS.contains("y") || ynCSS.contains("Y"))
            createCSS(path, dir);

        //conditionals to construct js folder usng function
        //if(true)
        //  create filepath
        if(ynJS.contains("y") || ynJS.contains("Y"))
            createJS(path, dir);


    }
}
