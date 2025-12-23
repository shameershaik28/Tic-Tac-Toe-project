package models;

import java.util.Scanner;

public class HumanPlayer extends Player {

    public HumanPlayer(String name, char symbol) {
        super(name, symbol);
    }

    @Override
    Pair<Integer, Integer> makeMove(Board board) {
        Scanner input = new Scanner(System.in);
        System.out.println("It's "+ getName() +"'s turn");
        System.out.println("Enter x: ");
        int x = input.nextInt();
        System.out.println("Enter y: ");
        int y = input.nextInt();
        return new Pair<>(x, y);

    }

    void undo()
    {

    }
}
