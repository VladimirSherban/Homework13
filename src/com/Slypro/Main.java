package com.Slypro;

public class Main {
    public static void main(String[] args) {
        Author levTolstoy = new Author("Лев", "Толстой");
        Author aleksandrPushkin = new Author("Александр", "Пушкин");
        Book warAndPeace = new Book("Война и мир", levTolstoy, 1867);
        Book evgeniyOnegin = new Book("Евгений Онегин", aleksandrPushkin, 1832);
        evgeniyOnegin.setYear(1833);

        System.out.println(warAndPeace);
        System.out.println(evgeniyOnegin);
    }
}