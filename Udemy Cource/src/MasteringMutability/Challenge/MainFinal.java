package MasteringMutability.Challenge;

//cant extend -> game console is FINAL!
//class SpecialGameAction<T extends  Game<? extends Player>> extends GameConsole<Game<? extends Player>> {
//    public SpecialGameAction(Game<? extends Player> game) {
//        super(game);
//    }
//}

public class MainFinal {
    static void main(String[] args) {
        GameConsole<PirateGame> game = new GameConsole<>(new PirateGame("Pirate Game"));


    }
}
