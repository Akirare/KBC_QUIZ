
package Models;

import java.io.Serializable;

public class Question implements Serializable{
    private int question_ID;
    private String question_DifficultyLevel;
    private String question_Topic;
    private String question_Content;
    private String question_ChoiceA;
    private String question_ChoiceB;
    private String question_ChoiceC;
    private String question_ChoiceD;
    private String question_RightAnswer;

    public Question() {
    }

    public Question(int question_ID, String question_DifficultyLevel, String question_Topic, String question_Content, String question_ChoiceA, String question_ChoiceB, String question_ChoiceC, String question_ChoiceD, String question_RightAnswer) {
        this.question_ID = question_ID;
        this.question_DifficultyLevel = question_DifficultyLevel;
        this.question_Topic = question_Topic;
        this.question_Content = question_Content;
        this.question_ChoiceA = question_ChoiceA;
        this.question_ChoiceB = question_ChoiceB;
        this.question_ChoiceC = question_ChoiceC;
        this.question_ChoiceD = question_ChoiceD;
        this.question_RightAnswer = question_RightAnswer;
    }

    public Question(String question_Content, String question_ChoiceA, String question_ChoiceB, String question_ChoiceC, String question_ChoiceD, String question_RightAnswer) {
        this.question_Content = question_Content;
        this.question_ChoiceA = question_ChoiceA;
        this.question_ChoiceB = question_ChoiceB;
        this.question_ChoiceC = question_ChoiceC;
        this.question_ChoiceD = question_ChoiceD;
        this.question_RightAnswer = question_RightAnswer;
    }
    
    
    
    public int getQuestion_ID() {
        return question_ID;
    }

    public void setQuestion_ID(int question_ID) {
        this.question_ID = question_ID;
    }

    public String getQuestion_DifficultyLevel() {
        return question_DifficultyLevel;
    }

    public void setQuestion_DifficultyLevel(String question_DifficultyLevel) {
        this.question_DifficultyLevel = question_DifficultyLevel;
    }

    public String getQuestion_Topic() {
        return question_Topic;
    }

    public void setQuestion_Topic(String question_Topic) {
        this.question_Topic = question_Topic;
    }

    public String getQuestion_Content() {
        return question_Content;
    }

    public void setQuestion_Content(String question_Content) {
        this.question_Content = question_Content;
    }

    public String getQuestion_ChoiceA() {
        return question_ChoiceA;
    }

    public void setQuestion_ChoiceA(String question_ChoiceA) {
        this.question_ChoiceA = question_ChoiceA;
    }

    public String getQuestion_ChoiceB() {
        return question_ChoiceB;
    }

    public void setQuestion_ChoiceB(String question_ChoiceB) {
        this.question_ChoiceB = question_ChoiceB;
    }

    public String getQuestion_ChoiceC() {
        return question_ChoiceC;
    }

    public void setQuestion_ChoiceC(String question_ChoiceC) {
        this.question_ChoiceC = question_ChoiceC;
    }

    public String getQuestion_ChoiceD() {
        return question_ChoiceD;
    }

    public void setQuestion_ChoiceD(String question_ChoiceD) {
        this.question_ChoiceD = question_ChoiceD;
    }

    public String getQuestion_RightAnswer() {
        return question_RightAnswer;
    }

    public void setQuestion_RightAnswer(String question_RightAnswer) {
        this.question_RightAnswer = question_RightAnswer;
    }
    
    
}
