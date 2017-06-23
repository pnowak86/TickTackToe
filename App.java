package TickTackToe;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        boolean isGameDone=false;
        Game game = new Game();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <3 ; j++) {
                game.board[i][j] = new BoardField(" ");
            }
        }
        Viewer viewer = new Viewer();
        while(isGameDone==false){
        viewer.view(game);
        System.out.println("\n"+"Which player is making move?(0/1)");
        int player = scanner1.nextInt();
        System.out.println("Which mark you want to use?(X/O)");
        String mark = scanner.nextLine();
        System.out.println("Which field you want to use(x)?");
        int x = scanner1.nextInt();
        System.out.println("Which field you want to use(y)?");
        int y = scanner1.nextInt();
        boolean move = game.makeMove(x,y,player,mark);
        if (move==false) {
            System.out.println("Your move was not sucesfull, please repeat");
        }
        isGameDone = game.isDone();
        }
        System.out.println("Winner is player " + game.winner);

    }
}
