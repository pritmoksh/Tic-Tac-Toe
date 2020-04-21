package com.ConsoleVersion;

public class TicTacToe {


    //2d array board var
    private static char gameBoard[][];
    //game symbol var
    private static final String X = "X";
    private static final String Y = "Y";

    //initialize board method
    public TicTacToe() {
        gameBoard = new char[][]
                {{' ', '|', ' ', '|', ' '},
                        {' ', '|', ' ', '|', ' '},
                        {' ', '|', ' ', '|', ' '}};
        initializeBoard(gameBoard);
    }

    private static void initializeBoard(char[][] gameBoard) {
        for (char[] row : TicTacToe.gameBoard
        ) {
            for (char c : row
            ) {
                System.out.print(c);
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        new TicTacToe();
    }
}
