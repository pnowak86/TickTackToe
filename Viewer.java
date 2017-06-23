package TickTackToe;

/**
 * Created by mirasomo on 22.06.2017.
 */
public class Viewer {
    Game game;
    int coutner;
    public void view(Game game){
        for (int i = 0; i < 3 ; i++) {
            for (int j = 0; j < 3; j++) {
                if (coutner==1){
                    System.out.print("| "+ game.board[i][j].getMark()+ " |");
                }
                else System.out.print(" "+ game.board[i][j].getMark()+ " ");
                coutner++;
            }
            coutner=0;
            if (i!=2){
                System.out.println("\n"+"---+---+---");}
        }
    }
}
