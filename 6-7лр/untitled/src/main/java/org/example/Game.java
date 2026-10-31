package org.example;

public class Game {
    private String title;
    private String genre;
    private int rating;

    public Game(String title, String genre, int rating) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
    }

    public boolean isTop() {
        return rating >= 9;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Игра: " + title + " (жанр: " + genre + ", рейтинг: " + rating + ")";
    }
}

