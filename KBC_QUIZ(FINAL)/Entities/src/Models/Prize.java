
package Models;

import java.io.Serializable;

public class Prize implements Serializable{
    private int prize_ID;
    private int prize_RightAnswer;
    private int prize_MissAnswer;
    private int prize_WalkAway;    
    private int prize_WrongAnswer;

    public Prize() {
    }

    public Prize(int prize_ID, int prize_RightAnswer, int prize_MissAnswer, int prize_WalkAway, int prize_WrongAnswer) {
        this.prize_ID = prize_ID;
        this.prize_RightAnswer = prize_RightAnswer;
        this.prize_MissAnswer = prize_MissAnswer;
        this.prize_WalkAway = prize_WalkAway;
        this.prize_WrongAnswer = prize_WrongAnswer;
    }

    public int getPrize_ID() {
        return prize_ID;
    }

    public void setPrize_ID(int prize_ID) {
        this.prize_ID = prize_ID;
    }

    public int getPrize_RightAnswer() {
        return prize_RightAnswer;
    }

    public void setPrize_RightAnswer(int prize_RightAnswer) {
        this.prize_RightAnswer = prize_RightAnswer;
    }

    public int getPrize_MissAnswer() {
        return prize_MissAnswer;
    }

    public void setPrize_MissAnswer(int prize_MissAnswer) {
        this.prize_MissAnswer = prize_MissAnswer;
    }

    public int getPrize_WalkAway() {
        return prize_WalkAway;
    }

    public void setPrize_WalkAway(int prize_WalkAway) {
        this.prize_WalkAway = prize_WalkAway;
    }

    public int getPrize_WrongAnswer() {
        return prize_WrongAnswer;
    }

    public void setPrize_WrongAnswer(int prize_WrongAnswer) {
        this.prize_WrongAnswer = prize_WrongAnswer;
    }
    
    
}

    