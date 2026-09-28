import java.util.Scanner;

public class PartyAffiliation {
    public static void main(String[] args) {

        // Create a Scanner for keyboard input
        // Display a menu with D, R, and I choices
        // Ask the user to enter their party affiliation
        // Read the user's choice
        // If the choice is D
        //     Display Democratic Donkey
        // Else if the choice is R
        //     Display Republican Elephant
        // Else if the choice is I
        //     Display Independent Person
        // Otherwise
        //     Display Other

        Scanner in = new Scanner(System.in);

        String choice;

        System.out.println("Party Affiliation");
        System.out.println("D - Democrat");
        System.out.println("R - Republican");
        System.out.println("I - Independent");

        System.out.print("Enter your choice: ");
        choice = in.nextLine();

        if (choice.equalsIgnoreCase("D")) {
            System.out.println("You get a Democratic Donkey.");
        } else if (choice.equalsIgnoreCase("R")) {
            System.out.println("You get a Republican Elephant.");
        } else if (choice.equalsIgnoreCase("I")) {
            System.out.println("You get an Independent Person.");
        } else {
            System.out.println("You get Other.");
        }
    }
}

