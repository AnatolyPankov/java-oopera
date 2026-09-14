public enum Genre {
    DRAMA("Драма"),
    OPERA("Опера"),
    BALLET("Балет");

    private final String name;

    Genre(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
