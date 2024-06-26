package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie movie = new Movie();
        movie.setTitle("myMovie");
        movie.setDescription("desc");
        movieService.add(movie);

        Movie movie1 = new Movie();
        movie1.setTitle("mymovie1");
        movie1.setDescription("desc1");
        movieService.add(movie1);

        System.out.println(movieService.get(1L));
    }
}
