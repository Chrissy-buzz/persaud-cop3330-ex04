package org.example;
import java.util.Scanner;  // Import the Scanner class

/**

 */
public class App 
{

    public static void main(String[] args) {
        String dogColor= "";

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter a noun:");
        String noun = myObj.nextLine();  // Read user input

        if(noun.equals("dog")) {
                Scanner myDog = new Scanner(System.in);
                System.out.println("What color is your dog?");
                dogColor = myDog.nextLine();
        }

        Scanner myObj2 = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter a verb:");
        String verb = myObj2.nextLine();  // Read user input

        Scanner myObj3 = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter an adjective: ");
        String adjective = myObj3.nextLine();  // Read user input

        Scanner myObj4 = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter an adverb:");
        String adverb = myObj4.nextLine();  // Read user input

        if (dogColor.equals("")) {
            System.out.println("You " + verb + " your " + noun + " " + adjective + " " + adverb + ". ");  // Output user input
        }
        else {
            System.out.println("You " + verb + " your " + dogColor +" " + noun + " " + adjective + " " + adverb + ". ");  // Output user input
        }
        System.out.println("That's funny!");
    }
}
