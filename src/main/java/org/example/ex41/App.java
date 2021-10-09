package org.example.ex41;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution Ex 41
 *  Copyright 2021 Reese Spector
 */

public class App {

    //for junit5 test in directory: src/test/java/org/example/ex41/AppTest.java
    public static String fileSuccess(){
        String success = "File Created.";
        return success;
    }

    public static void main(String[] args) {

        //loop variables
        int i = 0, j;

        //arraylist
        List<String> names = new ArrayList<String>();

        //temp for storing then initializing arraylist
        String temp = "";

        //read the file, and add it into an array list
        //try{
        //  get file path
        //  scan input based on next line
        //  add text to array list
        //  increment i to keep track of entry #
        //}
        //catch{
        //  print if error
        //}
        try {
            File namesFile = new File("src/main/java/org/example/ex41/exercise41_input.txt");
            Scanner txtReader = new Scanner(namesFile);
            while (txtReader.hasNextLine()) {
                temp = txtReader.nextLine();
                names.add(temp);
                i++;
            } txtReader.close();
            fileSuccess();
        } catch (FileNotFoundException e) {
            System.out.println("---ERROR---");
        }

        //sort arraylist
        Collections.sort(names);

        //write to file, print sorted list within
        //try{
        //  get file path for output
        //  print # of entries
        //  for (i...) {
        //      loop through array list
        //  }
        //  increment i to keep track of entry #
        //}
        //catch{
        //  print if error
        //}

        //write to output file
        try {
            FileWriter txtOut = new FileWriter("src/main/java/org/example/ex41/exercise41_output.txt");
            txtOut.write("Total of " + i + " names\n");
            txtOut.write("-----------------\n");

            //loop through sorted array list
            for (j=0;j<i;j++){
                txtOut.write(names.get(j));
                txtOut.write("\n");
            } txtOut.close();
            System.out.println("File Created.");
        } catch (IOException e) {
            System.out.println("---ERROR---");
        }

    }
}