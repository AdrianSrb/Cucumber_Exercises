package Com.Tem.App;

import java.util.ArrayList;
import java.util.List;

public class MoviesOnNetflixByGenre {

    private List<MovieByGenre> movieList = new ArrayList<MovieByGenre>();
    private List<MovieByGenre> foundList = new ArrayList<MovieByGenre>();

    /**
     *
     * @param MovieByGenre
     */
    public void setMovieList(MovieByGenre MovieByGenre) {
        movieList.add(MovieByGenre);
    }

    /**
     *
     * @param genre
     * @return foundList
     */
    public List<MovieByGenre> getMovieList(String genre) {

        /*

         */
        for (MovieByGenre MovieByGenre : movieList) {
            if(MovieByGenre.getGenre().equals(genre)){
                foundList.add(MovieByGenre);
                continue;
            }
        }
    return foundList;

    }
}
