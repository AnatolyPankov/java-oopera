import java.util.List;

public class MusicalShow extends Show {
    public String musicAuthor;
    public String librettoText;

    public MusicalShow(String title, int duration, Director director, List<Actor> listOfActors,
                       Show.Genre genre, String musicAuthor, String librettoText) {
        super(title, duration, director, listOfActors, genre);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void printLibretto() {
        System.out.println("-- Текст либретто для \"" + title + "\" --");
        System.out.println(librettoText);
    }
}
