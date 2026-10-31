package org.example;

public class Main {
    public static void main(String[] args) {
        Game game = new Game("The Witcher 3", "RPG", 10);
        System.out.println("Игра: " + game.getTitle());
        System.out.println("Жанр: " + game.getGenre());
        System.out.println("Рейтинг: " + game.getRating());
        System.out.println("Топовая: " + game.isTop());
        System.out.println(game);

        Game game2 = new Game("Some Game", "Action", 7);
        System.out.println("\nИгра: " + game2.getTitle());
        System.out.println("Рейтинг: " + game2.getRating());
        System.out.println("Топовая: " + game2.isTop());

        Lake[] lakes = {
                new Lake("Волга", 35, 43),
                new Lake("Енисей", 106, 56),
                new Lake("Лена", 21, 15)
        };

        Lake deepestLake = Lake.findBiggerDepth(lakes);
        System.out.println("\nСамая глубокая озеро: " + deepestLake.getName());
    }
}
