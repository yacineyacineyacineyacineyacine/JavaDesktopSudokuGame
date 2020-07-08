package Sudoku.problemdomain;

import Sudoku.constants.GameState;

import java.io.Serializable;

public class SudokuGame implements Serializable {
    private final GameState gameState;
    private final int [][] gridState;

    private static final int GRID_BOUDARY = 9;

    public SudokuGame(GameState gameState, int[][] gridState) {
        this.gameState = gameState;
        this.gridState = gridState;
    }

    public GameState getGameState() {
        return gameState;
    }

    public int [][] getCopyOfGridState() {
        return SudokuUtilities.copyToNewArray(gridState);
    }
}
