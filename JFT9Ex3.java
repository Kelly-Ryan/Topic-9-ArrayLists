/*
Kelly Ryan
21 January 2019

Exercise 3:
Create an ArrayList object to store the names of the following ‘big 4’ Premier League football teams.

 Chelsea
 Manchester City
 Arsenal
 Manchester Utd

Use a while loop to output the contents of the ArrayList object.

Answer the following questions:

 Does the ArrayList object contain the string, "Leeds Utd"?
 Manchester Utd should be removed from the ArrayList to be replaced with Liverpool.
 Display the name of the team in the third element of the ArrayList.
 What is the index position of the team, Liverpool?
 */

import java.util.ArrayList;

public class JFT9Ex3 {

    public static void main(String[] args) {

        ArrayList<String> big4 = new ArrayList<>();

        big4.add("Chelsea");
        big4.add("Manchester City");
        big4.add("Arsenal");
        big4.add("Manchester Utd.");

        int i = 0;
        while(i < big4.size()) {
            System.out.println(big4.get(i));
            i++;
        }

        System.out.println("Does the ArrayList object contain the string, \"Leeds Utd\"? " + big4.contains("Leeds Utd"));

        System.out.println("Manchester Utd should be removed from the ArrayList to be replaced with Liverpool.");
            big4.add(big4.indexOf("Manchester Utd."), "Liverpool");
            big4.remove("Manchester Utd.");
            System.out.println(big4);

        System.out.println("Display the name of the team in the third element of the ArrayList. " + big4.get(2));

        System.out.println("What is the index position of the team, Liverpool? " + big4.indexOf("Liverpool"));

        for(String s : big4) {
            System.out.println(s);
        }
    }
}
