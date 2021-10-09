package org.example.ex44;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

import javax.naming.Name;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution Ex 44
 *  Copyright 2021 Reese Spector
 */


public class App {

    class Response{

    }

    class Products{
        String name;
        String price;
        String quantity;
    }

    public static void main(String[] args) throws FileNotFoundException {

        Gson gson = new Gson();

        try (Reader reader = new FileReader("src/main/java/org/example/ex44/exercise44_input.json")) {

            // Convert JSON File to Java Object
            Products staff = gson.fromJson(reader, Products.class);

            // print staff
            System.out.println();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
