package exercise04;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Richard Lopez
 */

/*
    1. Input Scanner
    2. prompt user for noun
    3. Scan for noun
    4. Repeat process for verb, adjective, adverb
    5. Output madlibs game with all the inputs
 */

import java.util.Scanner;

public class Solution04 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        System.out.print("Enter a noun: ");
        String noun = in.nextLine();

        System.out.print("Enter a verb: ");
        String verb = in.nextLine();

        System.out.print("Enter an adjective: ");
        String adjective = in.nextLine();

        System.out.print("Enter an adverb: ");
        String adverb = in.nextLine();

        System.out.print("Do you " + verb + " your " + adjective + " " + noun + " " + adverb + "? That's hilarious!");
    }
}
