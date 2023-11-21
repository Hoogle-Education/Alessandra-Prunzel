package model;

import java.util.Arrays;

public class TicTacToe {

    private int size;
    private String winner;
    private String[][] board;

    public TicTacToe() {
        this(3);
    }

    public TicTacToe(int size) {
        this.size = size;
        this.board = new String[size][size];
    }

    public boolean play(int row, int col, String symbol) {

        if(board[row][col] != null) {
          return false;
        }

        board[row][col] = symbol;

        return true;
    }

    public boolean isFinished() {
        return isBoardFilled() || hasWinner();
    }

    private boolean isBoardFilled() {
        return true;
    }

    public boolean hasWinner() {
        winner = getWinner();
        return winner != null;
    }

    public String getWinner() {
        if (winner != null)
            return winner;

        // calculo de linhas, colunas e diagonais

        return "X";
    }

    @Override
    public String toString() {
        String aux = "";

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == null)
                    aux += " ";
                else
                    aux += board[i][j];

                aux += " | ";
            }

            aux += "\n";
        }

        return aux;
    }
}
