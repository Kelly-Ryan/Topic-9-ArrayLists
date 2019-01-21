/*
Kelly Ryan
21 January 2019

Exercise 1:

Create a Java program to store the names of your favourite pop albums. Over time, you intend to add further titles to your list. For this reason, you decide to use an ArrayList object
to store album names, as its size can dynamically grow.

 Thriller
 The Dark Side of the Moon
 Bat Out of Hell
 Back in Black
 Come On Over
 Led Zeppelin IV
 Jagged Little Pill

Create an ArrayList object that will store strings, as you saw in the video tutorials. Add the names of the albums above to the ArrayList.
Once you have populated the ArrayList, display its contents, using an enhanced for loop.
Save the program as JFT9Ex1.java.
 */

import java.util.ArrayList;

public class JFT9Ex1 {

    public static void main(String[] args) {

        ArrayList<String> favouriteAlbums = new ArrayList<>();

        favouriteAlbums.add("Thriller");
        favouriteAlbums.add("The Dark Side of the Moon");
        favouriteAlbums.add("Bat Out of Hell");
        favouriteAlbums.add("Back in Black");
        favouriteAlbums.add("Come on Over");
        favouriteAlbums.add("Led Zeppelin IV");
        favouriteAlbums.add("Jagged Little Pill");

        for(String s:favouriteAlbums) {

            System.out.println(s);
        }
    }
}
