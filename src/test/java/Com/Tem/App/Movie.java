package Com.Tem.App;

public class Movie {

    private String movie;
    //private String actor;

    public Movie(String movie) {
        this.movie = movie;
        //this.actor = actor;
    }
//    public void setActor(String actor) {
//        this.actor = actor;
//    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

//    public String getActor() {
//        return actor;
//    }

    public String getMovie() {
        return movie;
    }
}
