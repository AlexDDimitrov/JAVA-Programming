package MasteringMutability.Challenge;

import MasteringMutability.Person;

import java.util.Scanner;

public final class GameConsole <T extends Game<? extends  Player>>{

    private final T game;
    private static final Scanner scanner = new Scanner(System.in);

    public GameConsole(T game) {
        this.game = game;
    }

    public int addPlayer() {

        System.out.println("Enter your plsying name: ");
        String name = scanner.nextLine();

        System.out.printf("Welcome to %s, %s!%n".formatted(game.getGameName(), name));
        return game.addPlayer(name);
    }

    public void playGame(int index) {
        boolean done = false;
        while(!done) {
            var gameActiosn = game.getGameActions(index);
            System.out.println("Select from one of the following Actions: ");
            for (Character c : gameActiosn.keySet()) {
                String prompt = gameActiosn.get(c).prompt();
                System.out.println("\t" + prompt + " (" + c + ")");
            }
            System.out.print("Enter Next Action: ");

            char nextMove = scanner.nextLine().toUpperCase().charAt(0);
            GameAction gameAction = gameActiosn.get(nextMove);

            if (gameAction != null) {
                System.out.println("----------------------------");
                done = game.executeGameAction(index, gameAction);

                if (!done) {
                    System.out.println("----------------------------");
                }
            }
        }
    }
}
