/*
 *  UCF COP3330 Fall 2021 Assignment 15 Solution
 *  Copyright 2021 Bryson Paul
 */
package org.example;
import java.util.HashMap;
import java.util.Scanner;

public class App
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("abc$123","user1");
        map.put("password123","user2");

        String input = strIO("What is the password? ",sc);
        if(map.containsKey(input)) {
            System.out.println("Welcome!");
        }
        else {
            System.out.println("I don't know you.");
        }
    }

    public static String strIO(String input, Scanner sc){
        System.out.print(input);
        String output = sc.nextLine();
        return output;
    }
}
