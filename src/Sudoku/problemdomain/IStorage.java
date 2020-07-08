package Sudoku.problemdomain;

import java.io.IOException;

public interface IStorage {

    void UpdateGameData(SudokuGame sudokuGame) throws IOException;
    SudokuGame getGameData() throws IOException;
}
