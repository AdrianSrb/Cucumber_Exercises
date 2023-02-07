package Runners;

import Com.Tem.App.Movie;
import Com.Tem.App.MovieByActor;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Run   {
    List<String> testList = new ArrayList<String>();

    @Test
    public void testListMovies(){
        testList.add("movie1");
        testList.add("movie2");

        System.out.println(testList);

        for (String list: testList)
                System.out.println(list);
              {
        }
        System.out.println(testList.size());
    }
    @Test
    public void testMovies () {
        List<Movie> movieList = new ArrayList<Movie>();
        MovieByActor movie = new MovieByActor("movie1","movie2");
        movieList.add(movie);
        System.out.println(movie.getMovie());
    }
}
