package factories;

import models.BotLevel;
import strategies.bot_playing_strategy.BotPlayingStrategy;
import strategies.bot_playing_strategy.EasyBotPlayingStrategy;

public class BotPlayingStrategyFactory {

    public static BotPlayingStrategy getBotPlayingStrategy(BotLevel level){
        if(level == BotLevel.EASY){
            return new EasyBotPlayingStrategy();
        }
        else if (level == BotLevel.MEDIUM){
            return new EasyBotPlayingStrategy();
        }
        return null;
    }
}
