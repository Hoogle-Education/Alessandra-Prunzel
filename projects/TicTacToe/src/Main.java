import model.TicTacToe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TicTacToe game = new TicTacToe();
        boolean playerToggle = false;

        do {
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            String playerSymbol = playerToggle ? "X" : "0";
            game.play(row, col, playerSymbol);

            System.out.println(game);

            playerToggle = !playerToggle;
        } while(!game.isFinished());

        if(game.hasWinner()) {
            System.out.println("Winner: " + game.getWinner());
        }

    }
}

//    int n = 3;
//    String[][] matriz = new String[3][4];
//
//        for (int i = 0; i < 3; i++) {
//        for (int j = 0; j < 3; j++) {
//        matriz[i][j] = scanner.next();
//        }
//        }

//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                if(i + j == n - 1 ) {
//                    System.out.print(matriz[i][j] + " ");
//                } else {
//                    System.out.print("  ");
//                }
//            }
//
//            System.out.println();
//        }

//        for (int i = 0; i < n; i++) {
//        System.out.print(matriz[i][i] + " ");
//        }

// TODO: testar
// if ( matrix[0][0] == matrix[1][0] && matrix[2][0] == matrix[1][0] )

// [ (0,0) (0,1) (0,2)]
// [ (1,0) (1,1) (1,2)]
// [ (2,0) (2,1) (2,2)]

// [ (0,0) (0,1) (0,2) (0,3)]
// [ (1,0) (1,1) (1,2) (1,3)]
// [ (2,0) (2,1) (2,2) (2,3)]
// [ (3,0) (3,1) (3,2) (3,3)]

// (i, j) => (i + 1, j - 1) (SOMA CONSTANTE!)

// diag princ => (i, i)

// generalizando para n por n

// i + j = n - 1 (se estou na diagonal secundaria)
// j = n - i -1

// diag sec => (i, j) => (i, n - i -1)