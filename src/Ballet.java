import java.util.List;

public class Ballet extends MusicalShow {
    public String choreographet;

    public Ballet(String title, int duration, Director director, List<Actor> listOfActors,
                  String musicAuthor, String librettoText, String choreographer) {
        super(title, duration, director, listOfActors, Show.Genre.BALLET, musicAuthor, librettoText);
        this.choreographet = choreographer;
    }
}
