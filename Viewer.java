package TickTackToe;

/**
 * Created by mirasomo on 22.06.2017.
 */
public class Viewer {
    Game game;
    public void view(Game game){
        for (int i = 0; i < 3 ; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(game.board[i][j].getMark()+" ");
            }
            System.out.println();
        }
    }
}
