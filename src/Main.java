import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Actor actor1 = new Actor("Данила", "Козловский", Actor.Gender.MALE, 1.84);
        Actor actor2 = new Actor("Елизавета", "Боярская", Actor.Gender.FEMALE, 1.71);
        Actor actor3 = new Actor("Николай", "Цискаридзе", Actor.Gender.MALE, 1.83);

        Director director1 = new Director("Лев", "Додин", Actor.Gender.MALE, 40);
        Director director2 = new Director("Юрий", "Григорович", Actor.Gender.MALE, 55);

        String musicAuthor = "Пётр Чайковский";
        String choreographer = "Мариус Петипа";

        Show dramaShow = new Show("Гамлет", 160, director1, new ArrayList<>(), Show.Genre.DRAMA);
        Opera operaShow = new Opera("Пиковая дама", 180, director1, new ArrayList<>(),
                musicAuthor, "Сюжет по повести Пушкина о роковой тайне трёх карт...", 60);
        Ballet balletShow = new Ballet("Щелкунчик", 130, director2, new ArrayList<>(),
                musicAuthor, "Новогодняя сказка о Мари, Щелкунчике и Мышином короле...", choreographer);

        System.out.println("=== РАСПРЕДЕЛЕНИЕ АКТЁРОВ ===");
        dramaShow.addActor(actor1);
        dramaShow.addActor(actor2);
        operaShow.addActor(actor2);
        balletShow.addActor(actor3);
        System.out.println();

        System.out.println("=== ИЗНАЧАЛЬНЫЕ СОСТАВЫ ===");
        dramaShow.printActorsList();
        System.out.println();
        balletShow.printActorsList();
    }
}
