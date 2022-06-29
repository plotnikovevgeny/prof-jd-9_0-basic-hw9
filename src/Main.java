public class Main {
    public static void main(String[] args) {
        Author alexandrPushkin = new Author("Александр", "Пушкин");
        Author levTolstoy = new Author("Лев", "Толстой");
        Book onegin = new Book("Евгений Онегин", alexandrPushkin, 1833);
        Book blizzard = new Book("Метель", levTolstoy, 1856);
        onegin.setPublicationYear(2021);
        System.out.println(onegin);
        System.out.println(blizzard);
    }
}