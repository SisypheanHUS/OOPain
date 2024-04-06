package day9.question4.question41;

import day9.question1.Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Collection;

public class ComparableTest {
    public static void main(String[] args) {
        List<Movie> list = new ArrayList<>();
        list.add(new Movie("Forces Awakens", 8.3, 2015));
        list.add(new Movie("Star Wars", 8.7, 1977));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie("Return of the Jedi", 8.4, 1983));
        Collections.sort(list);
        System.out.println("Movies after sorting : ");
        for(Movie movie : list){
            System.out.println(movie.getName() + " " + movie.getRating() + " " + movie.getYear());
        }
    }
}
