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
