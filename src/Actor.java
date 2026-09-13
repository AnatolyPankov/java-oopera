import java.util.Objects;

public class Actor {

    public enum Gender {
        MALE("Мужской"),
        FEMALE("Женский");

        private final String title;
        Gender(String title) {
            this.title = title;
        }
        @Override
        public String toString() {
            return title;
        }
    }

    public String name;
    public String surname;
    public Gender gender;
    public double height;

    public Actor(String name, String surname, Gender gender, double height) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.height = height;
    }

    @Override
    public String toString() {
        return  name = " " + surname + " (Рост: " + height + "м, Пол: " + gender + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Actor actor = (Actor) o;
        return Double.compare(actor.height, height) == 0 &&
                Objects.equals(name, actor.name) &&
                Objects.equals(surname, actor.surname) &&
                gender == actor.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, gender, height);
    }
}
