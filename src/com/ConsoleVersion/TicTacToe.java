package com.ConsoleVersion;


import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    static Scanner playerMove = new Scanner(System.in);
    static int scorePlayer1;
    static int scorePlayer2;

    public static void main(String[] args) {

        char[][] gameBoard = {
                {' ', '|', ' ', '|', ' '},
                {'-', '-', '-', '-', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '-', '-', '-', '-'},
                {' ', '|', ' ', '|', ' '}
        };

        printGameBoard(gameBoard);
        boolean checkWinner;
        boolean playAgain = true;

        while (true) {
            while (true) {
                playerMove(gameBoard);
                checkWinner = isCheckWinner(gameBoard);
                if (checkWinner) {
                    break;
                }

                player2Move(gameBoard);
                checkWinner = isCheckWinner(gameBoard);
                if (checkWinner) {
                    break;
                }
            }
            System.out.println("Player1 Score : " + scorePlayer1);
            System.out.println("Player2 Score : " + scorePlayer2);
            //todo Ask player if they want to player again
        }
    }

    public static void printGameBoard(char[][] gameBoard) {
        for (char[] row : gameBoard
        ) {
            for (char col : row
            ) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    public static void updateBoard(int position, int player, char[][] gameBoard) {
        char character;

        if (player == 1) {
            character = 'X';
        } else {
            character = 'O';
        }

        switch (position) {
            case 1:
                gameBoard[0][0] = character;
                printGameBoard(gameBoard);
                break;
            case 2:
                gameBoard[0][2] = character;
                printGameBoard(gameBoard);
                break;
            case 3:
                gameBoard[0][4] = character;
                printGameBoard(gameBoard);
                break;
            case 4:
                gameBoard[2][0] = character;
                printGameBoard(gameBoard);
                break;
            case 5:
                gameBoard[2][2] = character;
                printGameBoard(gameBoard);
                break;
            case 6:
                gameBoard[2][4] = character;
                printGameBoard(gameBoard);
                break;
            case 7:
                gameBoard[4][0] = character;
                printGameBoard(gameBoard);
                break;
            case 8:
                gameBoard[4][2] = character;
                printGameBoard(gameBoard);
                break;
            case 9:
                gameBoard[4][4] = character;
                printGameBoard(gameBoard);
                break;
            default:
                break;
        }

    }

    //getting the input
    public static void playerMove(char[][] gameBoard) {
        System.out.println(" Select move 1 to 9");

        int move = playerMove.nextInt();
        boolean result = isValidMove(move, gameBoard);

        while (!result) {
            System.out.println("invalid move, ask player to try again");
            move = playerMove.nextInt();
            result = isValidMove(move, gameBoard);
        }

        System.out.println("Player position " + move);
        updateBoard(move, 1, gameBoard);
    }

    //todo - simplify this block
    public static boolean isValidMove(int move, char[][] gameBoard) {
        switch (move) {
            case 1:
                if (gameBoard[0][0] == ' ') {
                    return true;
                } else {
                    return false;
                }
            case 2:
                if (gameBoard[0][2] == ' ') {
                    return true;
                } else {
                    return false;
                }

            case 3:
                if (gameBoard[0][4] == ' ') {
                    return true;
                } else {
                    return false;
                }
            case 4:
                if (gameBoard[2][0] == ' ') {
                    return true;
                } else {
                    return false;
                }
            case 5:
                if (gameBoard[2][2] == ' ') {
                    return true;
                } else {
                    return false;
                }
            case 6:
                if (gameBoard[2][4] == ' ') {
                    return true;
                } else {
                    return false;
                }
            case 7:
                if (gameBoard[4][0] == ' ') {
                    return true;
                } else {
                    return false;
                }
            case 8:
                if (gameBoard[4][2] == ' ') {
                    return true;
                } else {
                    return false;
                }
            case 9:
                if (gameBoard[4][4] == ' ') {
                    return true;
                } else {
                    return false;
                }
            default:
                return false;
        }
    }


    public static void player2Move(char[][] gameBoard) {
        Random random = new Random();
        int move = random.nextInt(9) + 1;

        boolean result = isValidMove(move, gameBoard);

        while (!result) {
            move = random.nextInt(9) + 1;
            result = isValidMove(move, gameBoard);
        }

        System.out.println("Player2 moved at position " + move);
        updateBoard(move, 2, gameBoard);
    }

    public static boolean isCheckWinner(char[][] gameBoard) {
        //top row
        if (gameBoard[0][0] == 'X' && gameBoard[0][2] == 'X' && gameBoard[0][4] == 'X') {
            System.out.println("player wins ");
            scorePlayer1++;
            return true;
        }
        if (gameBoard[0][0] == 'O' && gameBoard[0][2] == 'O' && gameBoard[0][4] == 'O') {
            System.out.println("player2 wins ");
            scorePlayer2++;
            return true;
        }
        //middle row
        if (gameBoard[2][0] == 'X' && gameBoard[2][2] == 'X' && gameBoard[2][4] == 'X') {
            System.out.println("player wins ");
            scorePlayer1++;
            return true;
        }
        if (gameBoard[2][0] == 'O' && gameBoard[2][2] == 'O' && gameBoard[2][4] == 'O') {
            System.out.println("player2 wins ");
            scorePlayer2++;
            return true;
        }
        //bottom row
        if (gameBoard[4][0] == 'X' && gameBoard[4][2] == 'X' && gameBoard[4][4] == 'X') {
            System.out.println("player wins ");
            scorePlayer1++;
            return true;
        }
        if (gameBoard[4][0] == 'O' && gameBoard[4][2] == 'O' && gameBoard[4][4] == 'O') {
            System.out.println("player2 wins ");
            scorePlayer2++;
            return true;
        }
        //left col
        if (gameBoard[0][0] == 'X' && gameBoard[2][0] == 'X' && gameBoard[4][0] == 'X') {
            System.out.println("player wins ");
            scorePlayer1++;
            return true;
        }
        if (gameBoard[0][0] == 'O' && gameBoard[2][0] == 'O' && gameBoard[4][0] == 'O') {
            System.out.println("player2 wins ");
            scorePlayer2++;
            return true;
        }
        //middle col
        if (gameBoard[0][2] == 'X' && gameBoard[2][2] == 'X' && gameBoard[4][2] == 'X') {
            System.out.println("player wins ");
            scorePlayer1++;
            return true;
        }
        if (gameBoard[0][2] == 'O' && gameBoard[2][2] == 'O' && gameBoard[4][2] == 'O') {
            System.out.println("player2 wins ");
            scorePlayer2++;
            return true;
        }
        //right col
        if (gameBoard[0][4] == 'X' && gameBoard[2][4] == 'X' && gameBoard[4][4] == 'X') {
            System.out.println("player wins ");
            scorePlayer1++;
            return true;
        }
        if (gameBoard[0][4] == 'O' && gameBoard[2][4] == 'O' && gameBoard[4][4] == 'O') {
            System.out.println("player2 wins ");
            scorePlayer2++;
            return true;
        }
        //diagonal left
        if (gameBoard[0][0] == 'X' && gameBoard[2][2] == 'X' && gameBoard[4][4] == 'X') {
            System.out.println("player wins ");
            scorePlayer1++;
            return true;
        }
        if (gameBoard[0][0] == 'O' && gameBoard[2][2] == 'O' && gameBoard[4][4] == 'O') {
            System.out.println("player2 wins ");
            scorePlayer2++;
            return true;
        }
        //diagonal right
        if (gameBoard[0][4] == 'X' && gameBoard[2][2] == 'X' && gameBoard[4][0] == 'X') {
            System.out.println("player wins ");
            scorePlayer1++;
            return true;
        }
        if (gameBoard[0][4] == 'O' && gameBoard[2][2] == 'O' && gameBoard[4][0] == 'O') {
            System.out.println("player2 wins ");
            scorePlayer2++;
            return true;
        }
        return false;
    }
}

