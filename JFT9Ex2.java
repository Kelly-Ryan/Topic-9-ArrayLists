/*
Kelly Ryan
21 January 2019

Exercise 2:

You work for a travel company and are creating a list of holiday destinations for the coming summer season. So far, you have the following destinations confirmed.
 Ibiza
 Gran Canaria
 Nice
 Tropea

Create an ArrayList object to store the names of holiday destinations (strings).

Output the contents of the ArrayList object using a standard for loop (i.e. not an enhanced for loop).

You will need to determine the size of the ArrayList object. Please refer to the ArrayList class description in the Java API. Which method will return the size of an ArrayList?

Now answer the following questions.

 Is the ArrayList empty?
 What is the size of the ArrayList?
 At what index position in the ArrayList is item, "Tropea"?
 Add the entry "Fuerteventura" at index position 2 of the array list.
 Remove the entry, "Gran Canaria" from the ArrayList.
 Does the ArrayList contain the string, "Nice"?

 */

import java.util.ArrayList;

public class JFT9Ex2 {

    public static void main(String[] args) {

        ArrayList<String> destinations = new ArrayList<>();

        destinations.add("Ibiza");
        destinations.add("Gran Canaria");
        destinations.add("Nice");
        destinations.add("Tropea");

        for(int i = 0; i < destinations.size(); i++) {

            System.out.println(destinations.get(i));
        }

        System.out.println("Is the ArrayList empty? " + destinations.isEmpty());

        System.out.println("What is the size of the ArrayList? " + destinations.size());

        System.out.println("At what index position in the ArrayList is item, \"Tropea\"? " + destinations.indexOf("Tropea"));

        System.out.println("Add the entry \"Fuerteventura\" at index position 2 of the array list.");

            destinations.add(2,"Fuerteventura");
            System.out.println(destinations);

        System.out.println("Remove the entry, \"Gran Canaria\" from the ArrayList.");

            destinations.remove("Gran Canaria");
            System.out.println(destinations);

        System.out.println("Does the ArrayList contain the string, \"Nice\"? " + destinations.contains("Nice"));
    }
}
