package MasteringMutability.Challenge;

public class Main {
    static void main(String[] args) {

        var console = new GameConsole<>(new PirateGame("The Pirate Game"));
        int playerIndex = console.addPlayer();
        console.playGame(playerIndex);

    }
}
