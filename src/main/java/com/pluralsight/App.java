package com.pluralsight;

import jdk.internal.logger.BootstrapLogger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

import static com.sun.org.apache.xml.internal.serializer.Version.getProduct;

public class App {public static void main(String[] args) {
    Logger.log("program launch");
    HashMap<Integer, Product>  = getProduct();

    Scanner keyboard = new Scanner(System.in);
    System.out.println("---Welcome to the Inventory Management System---\n");

    while(true) {
        System.out.println("Please choose from the following options\n\n");

        System.out.println("What do you want to do?");
        System.out.println("1- List all products\n" +
                        "2- Lookup a product\n" +
                        "3- Add a product\n"
                        "4- Remove the product"

        System.out.print("Enter Selection: ");
        int selection = keyboard.nextInt();
        keyboard.nextLine(); //consume CRLF
        Logger.log("user selection : " + selection);

        switch (selection) {
            case 1:
        }
}
    public static HashMap<Integer, Product> getProduct() {
        Logger.log("get product: initialized");

        HashMap<Integer, Product> product = new HashMap<Integer, Product>();

        try {
            BufferedReader br = new BufferedReader(new FileReadersrc/main/resources/products.csv());
            String line;

            while((line = String.valueOf(br.readLine() != null)) {
        }
    } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
