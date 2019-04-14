package sda.AAAStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMapMovie {

    public static void main(String[] args) {
        List<Episode> episodes = Arrays.asList(
                new Episode("Ep1", 1,
                        Arrays.asList(new Movie("Test", "test.com"),
                                new Movie("Start wars", "sw.com"))),
                new Episode("Ep2", 2,
                        Arrays.asList(new Movie("Test2", "test2.com"),
                                new Movie("Test3", "test3.com")))
        );
        System.out.println("Map");
        episodes.stream()
                .map((Episode episode) -> {
                    return episode.movies;
                }).forEach((List<Movie> movies) ->{
            System.out.println(movies);
        });
        System.out.println("FlatMap");
        episodes.stream()
                .flatMap((Episode episode) -> episode.movies.stream())
                .forEach((Movie movie) ->{
                    System.out.println(movie);
                });
        System.out.println("Standardowy sposób");
        List<Movie> movies = new ArrayList<>();
        for (Episode episode : episodes) {
            for(Movie movie : episode.movies) {
                movies.add(movie);
            }
        }
        System.out.println(movies);
    }

    static class Episode {
        public String title;
        public int episodeNumber;
        public List<Movie> movies;

        public Episode(String title, int episodeNumber, List<Movie> movies) {
            this.title = title;
            this.episodeNumber = episodeNumber;
            this.movies = movies;
        }
    }

    static class Movie {
        public String title;
        public String url;

        public Movie(String title, String url) {
            this.title = title;
            this.url = url;
        }

        @Override
        public String toString() {
            return "Movie{" +
                    "title='" + title + '\'' +
                    ", url='" + url + '\'' +
                    '}';
        }
    }
}
