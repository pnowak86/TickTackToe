package TickTackToe;

/**
 * Created by mirasomo on 22.06.2017.
 */
public class BoardField {
    String mark;
    int player;

    public BoardField(String mark) {
        this.mark = mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setPlayer(int player) {
        this.player = player;
    }

    public String getMark() {
        return mark;
    }

    public int getPlayer() {
        return player;
    }
}
