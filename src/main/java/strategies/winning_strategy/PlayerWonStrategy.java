package strategies.winning_strategy;

import models.Cell;

public interface PlayerWonStrategy {

    boolean checkIfWon(Cell cell);
}
