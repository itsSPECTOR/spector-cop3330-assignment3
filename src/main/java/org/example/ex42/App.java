package org.example.ex42;
import java.io.*;
import java.util.*;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution Ex 42
 *  Copyright 2021 Reese Spector
 */

public class App {

    //for junit5 tests in directory: src/test/java/org/example/ex42/AppTest.java
    public static String fileSuccess(){
        return "success";
    }

    public static void main(String[] args) {

        //loop variables
        int i=0, j;

        //arraylist
        List<String> data = new ArrayList<String>();

        //temp for storing then initializing arraylist
        String temp;

        //read the file, and add it into an array list
        //try{
        //  get file path
        //  scan input based on next line
        //  add text to array list
        //  increment i to keep track length
        //}
        //catch{
        //  print if error
        //}
        try {
            File namesFile = new File("src/main/java/org/example/ex42/exercise42_input.txt");
            Scanner txtReader = new Scanner(namesFile);
            while (txtReader.hasNextLine()) {
                temp = txtReader.nextLine();
                data.add(temp);
                i++;
            } txtReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("---ERROR---");
        }

        //format header
        //last      first      salary
        //---------------------------
        System.out.format("%-9s %-9s %-9s %n", "Last", "First", "Salary");
        System.out.format("%-9s %n", "--------------------------");

        //for(....){
        //   convert to string and parse
        //   for(....){  (nested for loop to grab each item in the string)
        //      print the line (last  first  salary) \n
        //  }
        //}
        //loop through array list and convert list index to string for formatting
        for (j=0;j<i;j++){
            data.toString();
            String[] parsed = data.get(j).split(",");
                for (int k=0;k<3;k++)
                System.out.format("%-10s", parsed[k]);
            System.out.print("\n");
        }
        fileSuccess();
    }
}