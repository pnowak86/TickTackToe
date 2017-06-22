package TickTackToe;

/**
 * Created by mirasomo on 22.06.2017.
 */
public class Game {
    BoardField[][] board = new BoardField[SIZE][SIZE];
    int moveCounter;
    int playerWhoTemp=2;
    String markTemp;
    int xTemp=4;
    int yTemp=4;
    boolean isEnded;
    int winner;
    public final static int SIZE=3;

    boolean makeMove(int x, int y, int playerWho, String markUsed) {

        if ((board[x][y].mark != "E")) {
            return false;
        }
        if (playerWhoTemp == playerWho) {
            return false;
        }
        if (markUsed.equals(markTemp)){
            return false;
        }
        if (xTemp==x&&yTemp==y){
            return false;
        }

        board[x][y].mark = markUsed;
        board[x][y].player = playerWho;
        this.playerWhoTemp = playerWho;
        this.xTemp=x;
        this.yTemp=y;
        this.markTemp=markUsed;
        return true;
    }

    boolean isDone() {
        int counterForX1=0;
        int counterForX2=0;
        int counterForO1=0;
        int counterForO2=0;
        int counterForX3=0;
        int counterForX4=0;
        int counterForO3=0;
        int counterForO4=0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
               if (board[i][j].mark.equals("X")){
                   counterForX1++;
                   if (counterForX1==SIZE){
                       winner=board[i][j].player;
                       return true;
                   }
               }
                if (board[j][i].mark.equals("X")){
                    counterForX2++;
                    if (counterForX2==SIZE){
                        winner=board[j][i].player;
                        return true;
                    }
                }
                if (board[i][j].mark.equals("O")){
                    counterForO1++;
                    if (counterForO1==SIZE){
                        winner=board[i][j].player;
                        return true;
                    }
                }
                if (board[j][i].mark.equals("O")){
                    counterForO2++;
                    if (counterForO2==SIZE){
                        winner=board[j][i].player;
                        return true;
                    }
                }

            }
        }
        for (int i = 0; i < SIZE ; i++) {

            if(board[i][i].mark.equals("X")){
                counterForX3++;
                if (counterForX3==SIZE){
                    winner=board[i][i].player;
                    return true;
                }

            }
        }
        for (int i = 0; i < SIZE; i++) {
            if (board[SIZE-i-1][i].mark.equals("X")){
                counterForX4++;
                if (counterForX4==SIZE){
                    winner=board[SIZE-i-1][i].player;
                    return true;
                }
            }
        }
        for (int i = 0; i < SIZE ; i++) {

            if(board[i][i].mark.equals("O")){
                counterForO3++;
                if (counterForO3==SIZE){
                    winner=board[i][i].player;
                    return true;
                }

            }
        }
        for (int i = 0; i < SIZE; i++) {
            if (board[SIZE-i-1][i].mark.equals("O")){
                counterForO4++;
                if (counterForO4==SIZE){
                    winner=board[SIZE-i-1][i].player;
                    return true;
                }
            }
        }
       return false;
    }
}
