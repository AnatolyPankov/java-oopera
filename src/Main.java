import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Actor actor1 = new Actor("Данила", "Козловский", Gender.MALE, 1.84);
        Actor actor2 = new Actor("Елизавета", "Боярская", Gender.FEMALE, 1.71);
        Actor actor3 = new Actor("Николай", "Цискаридзе", Gender.MALE, 1.83);

        Director director1 = new Director("Лев", "Додин", Gender.MALE, 40);
        Director director2 = new Director("Юрий", "Григорович", Gender.MALE, 55);

        Person musicAuthor = new Person("Пётр", "Чайковский", Gender.MALE);
        Person choreographer = new Person("Мариус", "Петипа", Gender.MALE);

        Show dramaShow = new Show("Гамлет", 160, director1, new ArrayList<>(), Genre.DRAMA);
        Opera operaShow = new Opera("Пиковая дама", 180, director1, new ArrayList<>(),
                musicAuthor, "Сюжет по повести Пушкина о роковой тайне трёх карт...", 60);
        Ballet balletShow = new Ballet("Щелкунчик", 130, director2, new ArrayList<>(),
                musicAuthor, "Новогодняя сказка о Мари, Щелкунчике и Мышином короле...", choreographer);

        System.out.println("== РАСПРЕДЕЛЕНИЕ АКТЁРОВ ==");
        dramaShow.addActor(actor1);
        dramaShow.addActor(actor2);
        balletShow.addActor(actor3);
        System.out.println();

        System.out.println("== ПРОВЕРКА ДУБЛИРОВАНИЯ ==");
        dramaShow.addActor(actor1);
        System.out.println();

        System.out.println("== ИЗНАЧАЛЬНЫЕ СОСТАВЫ ==");
        dramaShow.printActorsList();
        System.out.println();

        System.out.println("== УСПЕШНАЯ ЗАМЕНА АКТЁРА ==");
        dramaShow.replaceActor(actor3, "Козловский");
        System.out.println();
        dramaShow.printActorsList();
        System.out.println();

        System.out.println("== ПОПЫТКА НЕКОРРЕКТНОЙ ЗАМЕНЫ ==");
        balletShow.replaceActor(actor2, "Козловский");
        System.out.println();

        System.out.println("== ПРОВЕРКА ОДНОФАМИЛЬЦЕВ ==");
        Actor cloneActor = new Actor("Иван", "Козловский", Gender.MALE, 1.80);

        operaShow.addActor(actor1);
        operaShow.addActor(cloneActor);

        operaShow.replaceActor(actor3, "Козловский");
        System.out.println();

        System.out.println("== ЧТЕНИЕ ЛИБРЕТТО ==");
        operaShow.printLibretto();
    }
}
