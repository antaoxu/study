package com.xat.pojo;

import java.util.Random;
import java.util.Scanner;

public class Minesweeper {
    private static final int BOARD_SIZE = 9;
    private static final int NUM_MINES = 10;
    private static final char BLANK_CELL = '-';
    private static final char MINE_CELL = '*';
    private static final char FLAG_CELL = 'F';

    private static char[][] board;
    private static boolean[][] revealed;
    private static boolean[][] flagged;
    private static int numMinesLeft;

    public static void main(String[] args) {
        board = new char[BOARD_SIZE][BOARD_SIZE];
        revealed = new boolean[BOARD_SIZE][BOARD_SIZE];
        flagged = new boolean[BOARD_SIZE][BOARD_SIZE];

        initBoard();
        scatterMines();
        numMinesLeft = NUM_MINES;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            printBoard();

            System.out.print("Enter row and column (e.g. 1 2): ");
            int row = scanner.nextInt() - 1;
            int col = scanner.nextInt() - 1;

            if (row < 0 || row >= BOARD_SIZE || col < 0 || col >= BOARD_SIZE) {
                System.out.println("Invalid input!");
                continue;
            }

            if (flagged[row][col]) {
                System.out.println("This cell is flagged. Are you sure you want to reveal it? (Y/N)");
                if (scanner.next().equalsIgnoreCase("N")) {
                    continue;
                }
                flagged[row][col] = false;
            }

            if (board[row][col] == MINE_CELL) {
                System.out.println("You lose!");
                revealed[row][col] = true;
                break;
            }

            revealCell(row, col);

            if (isGameWon()) {
                System.out.println("Congratulations! You win!");
                break;
            }
        }

        scanner.close();
    }

    private static void initBoard() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                board[i][j] = BLANK_CELL;
            }
        }
    }

    private static void scatterMines() {
        Random random = new Random();
        int count = 0;
        while (count < NUM_MINES) {
            int row = random.nextInt(BOARD_SIZE);
            int col = random.nextInt(BOARD_SIZE);
            if (board[row][col] != MINE_CELL) {
                board[row][col] = MINE_CELL;
                count++;
            }
        }
    }

    private static void printBoard() {
        System.out.print("   ");
        for (int i = 1; i <= BOARD_SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < BOARD_SIZE; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < BOARD_SIZE; j++) {
                System.out.print((revealed[i][j] || flagged[i][j]) ? board[i][j] : BLANK_CELL);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("Mines left: " + numMinesLeft);
    }

    private static void revealCell(int row, int col) {
        if (revealed[row][col] || flagged[row][col]) {
            return;
        }

        revealed[row][col] = true;

        if (board[row][col] == MINE_CELL) {
            return;
        }

        int numMines = countNeighbors(row, col, MINE_CELL);
        if (numMines == 0) {
            revealNeighbors(row, col);
        } else {
            board[row][col] = Integer.toString(numMines).charAt(0);
        }
    }

    private static void revealNeighbors(int row, int col) {
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                int r = row + i;
                int c = col + j;
                if (r >= 0 && r < BOARD_SIZE && c >= 0 && c < BOARD_SIZE && !revealed[r][c]) {
                    revealCell(r, c);
                }
            }
        }
    }

    private static int countNeighbors(int row, int col, char value) {
        int count = 0;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                int r = row + i;
                int c = col + j;
                if (r >= 0 && r < BOARD_SIZE && c >= 0 && c < BOARD_SIZE && board[r][c] == value) {
                    count++;
                }
            }
        }
        return count;
    }

    private static boolean isGameWon() {
        int numCovered = 0;
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                if (!revealed[i][j]) {
                    numCovered++;
                }
                if (board[i][j] == MINE_CELL && !flagged[i][j]) {
                    return false;
                }
            }
        }
        return numCovered == NUM_MINES;
    }
}

