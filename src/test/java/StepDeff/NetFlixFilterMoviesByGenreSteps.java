package StepDeff;

import Com.Tem.App.Movie;
import Com.Tem.App.MovieByGenre;
import Com.Tem.App.MoviesOnNetflixByActor;
import Com.Tem.App.MoviesOnNetflixByGenre;
import Urils.DependencyUtil;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class NetFlixFilterMoviesByGenreSteps {

    DependencyUtil service;

    public NetFlixFilterMoviesByGenreSteps(DependencyUtil service) {
        this.service = service;
    }

//        String userName = "ase";
//        String password = "123";
//        Login login;

        MovieByGenre moviebyGenre;
        MoviesOnNetflixByGenre moviesOnNetflix = new MoviesOnNetflixByGenre();
        int movieOnNetflixfiltredbyactor;


//        @Before
//        public void setup(Scenario scenario) {
//            System.out.println("============================================================================");
//            System.out.println("Scenario name::" + service.scenario.getName());
//            System.out.println("Scenario name::" + service.scenario.getSourceTagNames());
//            System.out.println("Scenario name::" + service.scenario.getStatus());
//            System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
//
//        }
//        @After
//        public void teardown() {
//            System.out.println("============================================================================");
//        }

//        @Given("I have signed in to Netflix")
//        public void i_have_signed_in_to_netflix() {
//
//            login = new Login(userName, password);
//            System.out.println("Signed in..." + " " + login.getUserName() + " " + login.getPassword());
//
//        }
        // given e paretea cu setarea a ceva
        @Given("I have the following movies by genre on Netflix")
        public void i_have_the_following_movies_on_netflix(DataTable dataTable) {
            // Write code here that turns the phrase above into concrete actions
            // For automatic transformation, change DataTable to one of
            // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
            // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
            // Double, Byte, Short, Long, BigInteger or BigDecimal.
            //
            // For other transformations you can register a DataTableType.

            // incepem mereu cu variabila pe care noi am creat o
            // asLsit e o lista de liste

            List<List<String>> rows = dataTable.asLists(String.class);

            for (List<String> list: rows) {
                System.out.println("Movie:" + " " + list.get(0) + " --- " + " Actor:" + " " + list.get(1));
                //System.out.println("Actor" + " " + list.get(1));

                moviebyGenre = new MovieByGenre(list.get(0),list.get(1));
                moviesOnNetflix.setMovieList(moviebyGenre);
            }

        }
        //when e partea cand get uim ceva, preluam ceva
        @When("I search for movies by Genre {string}")
        public void i_search_for_movies_by(String actor) {

            movieOnNetflixfiltredbyactor = moviesOnNetflix.getMovieList(actor).size();
            System.out.println("Movies count by Actor: " + " " + movieOnNetflixfiltredbyactor);

        }
        //then e partea cand bagam assertion pentru a verifica daca merege cum trebuie
        @Then("I find Number of {string} by Genre")
        public void i_find_number_of(String expected) {

            try {
                System.out.println("Actual: " + movieOnNetflixfiltredbyactor);
                System.out.println("Expected: " + expected);
                Assert.assertEquals(Integer.parseInt(expected), movieOnNetflixfiltredbyactor);
                System.out.println("test passed");
            } catch (AssertionError e) {
                System.out.println("test failed");
                Assert.fail();

            }
        }



}
