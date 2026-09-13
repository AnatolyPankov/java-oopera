import java.lang.management.ThreadInfo;
import java.util.ArrayList;
import java.util.List;

public class Show {

    public enum Genre {
        DRAMA("Драма"),
        OPERA("Опера"),
        BALLET("Баллет");

        private final String name;
        Genre(String name) {
            this.name = name;
        }
        @Override
        public String toString() {
            return name;
        }
    }

    public String title;
    public int duration;
    public Director director;
    public List<Actor> listOfActors;
    public Genre genre;

    public Show(String title, int duration, Director director, List<Actor> listOfActors, Genre genre) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>(listOfActors);
        this.genre = genre;
    }

    public void printDirectorInfo() {
        System.out.println("Режиссёр спектакля \"" + title + "\" (" + genre + "): " + director.toString());
    }

    public void printActorsList() {
        System.out.println("-- Состав актёров спектакля \"" + title + "\" (" + genre + ") --");
        if (listOfActors.isEmpty()) {
            System.out.println("Список актёров пуст");
        } else {
            for (Actor actor : listOfActors) {
                System.out.println("- " + actor.toString());
            }
        }
    }

    public void addActor(Actor newActor) {
        if (newActor != null) {
            listOfActors.add(newActor);
            System.out.println("Актёр " + newActor.name + " " + newActor.surname + " успешно добавлен");
        }
    }

    public void replaceActor(Actor targetActor, Actor replacementActor) {
        int index = listOfActors.indexOf(targetActor);
        if (index != -1) {
            listOfActors.set(index, replacementActor);
            System.out.println("Актёр " + targetActor.name + " " + targetActor.surname + " успешно заменён на " + replacementActor.name + replacementActor.surname);
        } else {
            System.out.println("Актёр " + targetActor.name + " " + targetActor.surname + " не найден в этом спектакле");
        }
    }
}
