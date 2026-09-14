import java.util.ArrayList;
import java.util.List;

public class Show {
    protected String title;
    protected int duration;
    protected Director director;
    protected List<Actor> listOfActors;
    protected Genre genre;

    public Show(String title, int duration, Director director, List<Actor> listOfActors, Genre genre) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>(listOfActors);
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public List<Actor> getListOfActors() {
        return listOfActors;
    }

    public void setListOfActors(List<Actor> listOfActors) {
        this.listOfActors = new ArrayList<>(listOfActors);
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
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
            if (listOfActors.contains(newActor)) {
                System.out.println("Предупреждение: Актёр " + newActor.getName() + " " + newActor.getSurname() +
                        " уже участвует в спектакле \"" + title + "\"!");
            } else {
                listOfActors.add(newActor);
                String actorWord = (newActor.getGender() == Gender.FEMALE) ? "Актриса" : "Актёр";
                String statusWord = (newActor.getGender() == Gender.FEMALE) ? "успешно добавлена" : "успешно добавлен";
                System.out.println(actorWord + " " + newActor.getName() + " " + newActor.getSurname() +
                        " " + statusWord + " в спектакль \"" + title + "\".");
            }
        }
    }

    public void replaceActor(Actor actor, String previousActorSurname) {
        if (actor == null || previousActorSurname == null) {
            System.out.println("Ошибка: передан пустой актёр или некорректная фамилия для замены");
            return;
        }

        int countMatches = 0;
        int indexToReplace = -1;

        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equalsIgnoreCase(previousActorSurname)) {
                countMatches++;
                indexToReplace = i;
            }
        }

        if (countMatches == 0) {
            System.out.println("Ошибка замены: Актёр с фамилией \"" + previousActorSurname + "\" не найден в этом спектакле.");
        } else if (countMatches > 1) {
            System.out.println("Ошибка замены: В спектакле \"" + title + "\" найдено несколько актёров с фамилией \""
                    + previousActorSurname + "\". Замена отменена для предотвращения ошибки.");
        } else {
            Actor oldActor = listOfActors.get(indexToReplace);
            listOfActors.set(indexToReplace, actor);
            System.out.println("Актёр " + oldActor.getName() + " " + oldActor.getSurname() +
                    " успешно заменён на " + actor.getName() + " " + actor.getSurname());
        }
    }
}
