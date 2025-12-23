package models;

import factories.BotPlayingStrategyFactory;
import strategies.bot_playing_strategy.BotPlayingStrategy;

public class Bot extends Player {

    private BotPlayingStrategy botPlayingStrategy;
    public Bot(String name, char symbol, BotLevel botLevel) {
        super(name, symbol);
        this.botLevel = botLevel;
        this.botPlayingStrategy = BotPlayingStrategyFactory.getBotPlayingStrategy(botLevel);
    }

    private BotLevel botLevel;


    @Override
    Pair<Integer, Integer> makeMove(Board board) {
        System.out.println("Bot is making it's move, beware!");
        return botPlayingStrategy.makeMove(board);
    }
}
