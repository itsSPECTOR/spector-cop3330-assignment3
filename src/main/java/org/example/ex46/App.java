package org.example.ex46;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution Ex 46
 *  Copyright 2021 Reese Spector
 */

public class App {

    //for junit5 tests in directory: src/test/java/org/example/ex46/AppTest.java
    public static String fileSuccess(){ return "success"; }

    //function to print badger count
    static void printBadger(int i){
        int num=0;
        System.out.format("%-10s", "badger: ");
        for (num=0; num<i;num++)
            System.out.format("%-1s", "*");
        System.out.print("\n");
    }

    //function to print mushroom count
    static void printMush(int i){
        int num=0;
        System.out.format("%-10s", "mushroom: ");
        //System.out.print("mushroom:\t");
        for (num=0; num<i;num++)
            System.out.format("%-1s", "*");
        System.out.print("\n");
    }

    //function to print snek count
    static void printSnek(int i){
        int num=0;
        System.out.format("%-10s", "snake: ");
        for (num=0; num<i;num++)
            System.out.format("%-1s", "*");
        System.out.print("\n");
    }

    //function to take in count and print result in order
    static void printResult(int i, int j, int k){

        //for(...)
        //  if( > && >)
        //      call print function
        //  if( > && >)
        //      ...
        //this for loop will run 3 times, one for each word, and print the
        //word and count respectively. The nested if's and 'continues' are to ensure
        //there's no repeating result.
        for(int t=0; t<3; t++){
            if (i > j && i > k)
                printBadger(i);
                if (i==0)
                    continue;
                i=0;
            if (j > i && j > k)
                printMush(j);
                if (j==0)
                    continue;
                j=0;
            if (k > i && k > j)
                printSnek(k);
                if (k==0)
                    continue;
                k=0;
        }
    }

    public static void main(String[] args) throws FileNotFoundException {

        //keeps count of times a word is stored
        int i=0, j=0, k=0;

        //arraylist for each line of words
        List<String> words = new ArrayList<String>();

        //temp for storing in loop
        String temp = null;

        //try
        //  import file
        //  read file (while nextline() !null)
        //  store lines as strings in a temp array, then run the temp array through splitter
        //  if("badger") (run nested loop on each word and keep count of each instance)
        //      i++;
        //  .....
        //catch
        //  any errors
        //this takes the file, reads each line, a nested loop scans each and increments a corresponding value
        try {
            File namesFile = new File("src/main/java/org/example/ex46/exercise46_input.txt");
            Scanner txtReader = new Scanner(namesFile);
            while (txtReader.hasNextLine()) {
                temp = txtReader.nextLine();
                for(String word : temp.split(" ")) {
                    words.add(word);
                    if(word.contains("badger"))
                        i++;
                    if(word.contains("mushroom"))
                        j++;
                    if(word.contains("snake"))
                        k++;
                }
            } txtReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("---ERROR---");
        }
        //run word counts through function to print result
        printResult(i,j,k);
        fileSuccess();
    }
}
