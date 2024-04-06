package day9.question4.question42;

import java.util.Comparator;

public class RatingCompare implements Comparator<Movie> {
    @Override
    public int compare(Movie left, Movie right){
        if(left.getRating() < right.getRating()) return -1;
        if(left.getRating() > right.getRating()) return 1;
        return 0;
    }
}
