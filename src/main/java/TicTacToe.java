import controllers.GameController;
import exceptions.InvalidBotCountException;
import models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) throws InvalidBotCountException {

        /* It dynamically creates player objects based on user input and stores them polymorphically
         as Player references for flexible game creation. */

        GameController gameController = new GameController();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of human players: ");
        int n = input.nextInt();
        List<Player> playerList = new ArrayList<>();

        for(int i = 0; i < n; i++) {

            System.out.println("Enter player name: " );
            String name = input.next();
            System.out.println("Enter symbol: ");
            char symbol = input.next().charAt(0);
            Player humanPlayer = new HumanPlayer(name, symbol);
            playerList.add(humanPlayer);
        }


/*
This code optionally creates a Bot object based on user input and adds it to the same player list as humans,
leveraging polymorphism. */

        System.out.println("Are bots going to play? (Y/N");
        if(input.next().charAt(0) == 'Y')
        {
            System.out.println("Enter bot level: (E/M/H)");
            char level = input.next().charAt(0);

            //Default bot level assignment
            BotLevel botLevel = BotLevel.EASY;

            if(level == 'E')
                botLevel = BotLevel.EASY;
            else if(level == 'M')
                botLevel = BotLevel.MEDIUM;
            else if(level == 'H')
                botLevel = BotLevel.HARD;

            playerList.add(new Bot("Bot - 1", 'B', botLevel ));
        }

        /*This loop continuously prints the board and processes player moves through the controller
         until the game reaches a terminal state. */

        Game game =  gameController.createGame(playerList);
        while(gameController.getGameStatus(game)== GameStatus.IN_PROGRESS)
        {
          gameController.printBoard(game);
          gameController.makeMove(game);

        }



    }
}
