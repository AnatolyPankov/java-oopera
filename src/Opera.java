import java.util.List;

public class Opera extends MusicalShow {
    public int choirSize;

    public Opera(String title, int duration, Director director, List<Actor> listOfActors,
                 String musicAuthor, String librettoText, int choirSize) {
        super(title, duration, director, listOfActors, Show.Genre.OPERA, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }
}
