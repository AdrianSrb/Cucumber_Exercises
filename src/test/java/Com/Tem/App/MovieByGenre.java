package Com.Tem.App;

public class MovieByGenre extends Movie {

        private String genre;

        public MovieByGenre(String movie, String genre) {
            super(movie);
            this.genre = genre;
        }
        public void setGenre(String genre) {
            this.genre = genre;
        }
        public String getGenre() {
            return genre;
        }

}

