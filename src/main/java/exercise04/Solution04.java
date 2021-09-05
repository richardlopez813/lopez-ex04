package exercise04;

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
