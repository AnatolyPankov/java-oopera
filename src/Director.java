public class Director {
    public String name;
    public String surname;
    public Actor.Gender gender;
    public int numberOfShow;

    public Director(String name, String surname, Actor.Gender gender, int numberOfShow) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this. numberOfShow = numberOfShow;
    }

    @Override
    public String toString() {
        return name + " " + surname + " (Поставлено спектаклей: " + numberOfShow + ", Пол: " + gender + ")";
    }
}
