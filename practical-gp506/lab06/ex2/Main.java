import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Person director = new Person("Bruno");
        Person writer = new Person("Cristiano");
        List<Person> cast = new ArrayList<>();
        cast.add(new Person("Ruben"));
        cast.add(new Person("Sam"));
        cast.add(new Person("Correia"));
        cast.add(new Person("João"));
        cast.add(new Person("Cristiano"));
        cast.add(new Person("Bruno"));
        cast.add(new Person("Diogo"));
        cast.add(new Person("Duarte"));
        cast.add(new Person("Joca"));
        cast.add(new Person("Vasco"));
        cast.add(new Person("Lucas"));
        List<Place> locations = new ArrayList<>();
        locations.add(new Place("Gulliver"));
        locations.add(new Place("Bailarico de Dem"));
        List<String> languages = new ArrayList<>();
        languages.add("Portuguese");
        languages.add("English");
        List<String> genres = new ArrayList<>();
        genres.add("Comedy");
        genres.add("Action");
        genres.add("Drama");

        Movie movie = new Movie.Builder("Pascoa", 2024)
            .director(director)
            .writer(writer)
            .cast(cast)
            .series("Season 1")
            .locations(locations)
            .languages(languages)
            .genres(genres)
            .isNetflix(true)
            .build();
            String movieString = movie.toString();
            System.out.println(movieString);
}
}