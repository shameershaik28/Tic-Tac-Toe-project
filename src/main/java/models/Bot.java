package models;

public class Bot extends Player {

    public Bot(String name, char symbol, BotLevel botLevel) {
        super(name, symbol);
        this.botLevel = botLevel;
    }

    private BotLevel botLevel;


    @Override
    Pair<Integer, Integer> makeMove() {
      return null;
    }
}
