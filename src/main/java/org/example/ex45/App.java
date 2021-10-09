package org.example.ex45;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution Ex 45
 *  Copyright 2021 Reese Spector
 */

public class App {

    //for junit5 tests in directory: src/test/java/org/example/ex45/AppTest.java
    public static String fileSuccess(){ return "success"; }

    public static void main(String[] args) throws FileNotFoundException {

        //i for loops
        int i;

        //arraylist
        List<String> sentence = new ArrayList<String>();

        //temp for storing then initializing arraylist
        String temp;
        String mainPath = "src/main/java/org/example/ex41/";
        String replaceString = null;

        //try
        //  import file
        //  read file (while has nextline()
        //  store lines as strings in a temp array, then add to array list
        //catch
        //  any errors
        //this section takes in the input file, and parses the lines of text into strings
        try {
            File namesFile = new File("src/main/java/org/example/ex45/exercise45_input.txt");
            Scanner txtReader = new Scanner(namesFile);
            while (txtReader.hasNextLine()) {
                temp = txtReader.nextLine();
                sentence.add(temp);
            }
            txtReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("---ERROR---");
        }

        //grab output file name
        System.out.print("Name of the output file: ");
        Scanner input = new Scanner(System.in);
        String outputPath = input.next();

        //try
        //  write file using input (path + input + .txt)
        //  for(...) to traverse array list of strings
        //      swap words 'utilize' and 'use'
        //      write corrected string
        //  end for
        //catch
        //  any errors
        //write corrected text to output file
        try {
            FileWriter txtOut = new FileWriter("src/main/java/org/example/ex45/" + outputPath + ".txt");

            //for(...)
            //  swap characters and store corrected line into a temp string
            //  write temp string
            //end for
            //this for loop takes the lines of text, corrects it and writes it to the output file
            for(i=0;i<sentence.size(); i++) {
                replaceString = sentence.get(i).replaceAll("utilize", "use");
                txtOut.write(replaceString);
                txtOut.write("\n");
            } txtOut.close();
            fileSuccess();
        } catch (IOException e) {
            System.out.println("---ERROR---");
        }
    }
}
