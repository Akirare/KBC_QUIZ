/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server.Controller;

import Models.Question;
import java.util.ArrayList;

/**
 *
 * @author MyPC
 */
public class QuestionManage_ {

    public static Question question;
    public static ArrayList<Question> questionList;

    public QuestionManage_() {
    }
    

    public  ArrayList<Question> getQuestion() {

        Question[] ques = new Question[14];

        //Question 1
        ques[0] = new Question("What is value: 35 + 15 = ?? ", "70", "40", "90", "50", "D");

        //Question 2
        ques[1] = new Question("What is value: 10 + 20 = ?? ", "35", "50", "30", "40", "C");

        //Question 3
        ques[2] = new Question("What is value: 35 + 15 = ?? ", "85", "50", "70", "30", "B");

        //Question 4
        ques[3] = new Question("What is value: 55 + 35 = ?? ", "35", "50", "30", "90", "D");

        //Question 5
        ques[4] = new Question("What is value: 45 + 30 = ?? ", "75", "50", "35", "90", "A");

        //Question 6
        ques[5] = new Question("What is value: 25 + 30 = ?? ", "95", "55", "75", "80", "B");

        //Question 7
        ques[6] = new Question("What is value: 25 + 35 = ?? ", "75", "85", "35", "60", "D");

        //Question 8
        ques[7] = new Question("What is value: 105 + 35 = ??? ", "175", "140", "135", "160", "B");

        //Question 9
        ques[8] = new Question("What is value: 125 + 135 = ??? ", "260", "340", "235", "360", "A");

        //Question 10
        ques[9] = new Question("What is value: 175 + 115 = ??? ", "390", "340", "290", "360", "C");

        //Question 11
        ques[10] = new Question("What is value: 165 + 135 = ??? ", "300", "340", "380", "360", "A");

        //Question 12
        ques[11] = new Question("What is value: 135 + 175 = ??? ", "280", "310", "390", "360", "B");

        //Question 13
        ques[12] = new Question("What is value: 115 + 185 = ??? ", "290", "310", "390", "300", "D");

        //Question 14
        ques[13] = new Question("What is value: 145 + 135 = ??? ", "280", "310", "390", "300", "A");


        questionList = new ArrayList<Question>();
        for (int i = 0; i < ques.length; i++) {
            questionList.add(ques[i]);
        }

        return questionList;
    }


//    public static void main(String[] args) {
//
//        ArrayList<Question> playQuestions = new ArrayList<>();
//
//        playQuestions = QuestionManage.getQuestion();
//        
//        for (Question qs : playQuestions) {
//            System.out.println(qs.getQuestion_Content());
//            System.out.println(qs.getQuestion_ChoiceA());
//            System.out.println(qs.getQuestion_ChoiceB());
//            System.out.println(qs.getQuestion_ChoiceC());
//            System.out.println(qs.getQuestion_ChoiceD());
//            System.out.println(qs.getQuestion_RightAnswer());
//            System.out.println("------------------");
//        }
//    }
}
