package Com.Tem.App;

import java.util.ArrayList;
import java.util.List;

public class MoviesOnNetflixByActor {

    private List<MovieByActor> movieList = new ArrayList<MovieByActor>();
    private List<MovieByActor> foundList = new ArrayList<MovieByActor>();

    /**
     *
     * @param MovieByActor
     */
    public void setMovieList(MovieByActor MovieByActor) {
        movieList.add(MovieByActor);
    }

    /**
     *
     * @param actor
     * @return foundList
     */
    public List<MovieByActor> getMovieList(String actor) {

        /*

         */
        for (MovieByActor MovieByActor : movieList) {
            if(MovieByActor.getActor().equals(actor)){
                foundList.add(MovieByActor);
                continue;
            }
        }
    return foundList;

    }
}
