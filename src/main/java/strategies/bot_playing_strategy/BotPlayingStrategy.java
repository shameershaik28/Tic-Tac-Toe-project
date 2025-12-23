package strategies.bot_playing_strategy;

import models.Board;
import models.Pair;

public interface BotPlayingStrategy {
    public Pair<Integer, Integer> makeMove(Board board);
}
