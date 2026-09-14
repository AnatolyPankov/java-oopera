import java.util.List;

public class MusicalShow extends Show {
    protected Person musicAuthor;
    protected String librettoText;

    public MusicalShow(String title, int duration, Director director, List<Actor> listOfActors,
                       Genre genre, Person musicAuthor, String librettoText) {
        super(title, duration, director, listOfActors, genre);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public Person getMusicAuthor() {
        return musicAuthor;
    }

    public void setMusicAuthor(Person musicAuthor) {
        this.musicAuthor = musicAuthor;
    }

    public String getLibrettoText() {
        return librettoText;
    }

    public void setLibrettoText(String librettoText) {
        this.librettoText = librettoText;
    }

    public void printLibretto() {
        System.out.println("-- Текст либретто для \"" + title + "\" --");
        System.out.println(librettoText);
    }
}
