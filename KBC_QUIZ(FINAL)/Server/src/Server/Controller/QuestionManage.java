/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server.Controller;

import Models.Question;
import Models.UserAccount;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 *
 * @author MyPC
 */
public class QuestionManage {
    public ArrayList<Question> easyQuestionList;
    public ArrayList<Question> mediumQuestionList;
    public ArrayList<Question> hardQuestionList;
    public ArrayList<Question> veryHardQuestionList;
    public ArrayList<String> MetQuestionList;
    public ArrayList<Question> forthteenQuiz = new ArrayList<>();
    public ArrayList<Question> playQuestion = new ArrayList<>();
    public String str;
    
   
    public class hasMet_QuestionManage{
        
        public hasMet_QuestionManage(){
        }
        
        public  ArrayList<Question> getQuestion(UserAccount user) {
            ServerDAO dao = new ServerDAO();
            easyQuestionList = dao.getEasyQuestionList();
            mediumQuestionList = dao.getMediumQuestionList();
            hardQuestionList = dao.getHardQuestionList();
            veryHardQuestionList = dao.getVeryHardQuestionList();
            str = dao.getMetQuestionIDList(user.getUser_ID());
            MetQuestionList = catChui(str);
            randomQuestion();
            
            String s="";
            for(Question qs : forthteenQuiz)
            {
                s += qs.getQuestion_ID()+ " ";
            }
            dao.setMetQuestionID(String.valueOf(user.getUser_Username()), "0");
            dao.setMetQuestionID(String.valueOf(user.getUser_Username()), s);
            
            for (Question q : forthteenQuiz) { playQuestion.add(q); }
            int qID = 0;
            for (Question q : playQuestion)
            {
                q.setQuestion_ID(qID);
                qID++;
            }
            
            return playQuestion;
        }
        
        
    
        public ArrayList catChui(String str)
        {
            String pattern = "[0-9]";
            ArrayList<String> list = new ArrayList<>();
            String quesID = "";

            for(int i = 0 ; i < str.length(); i++)
            {

                if(String.valueOf(str.charAt(i)).matches(pattern))
                {
                    quesID += str.charAt(i);
                    if(i == str.length() - 1)
                    {
                        list.add(quesID);
                    }
                }
                else
                {

                    list.add(quesID);
                    quesID = "";

                }
            }
            return list;
        }

        public void randomQuestion()
        {
            Random random = new Random(); 
            ArrayList<Integer> rolledNumberList = new ArrayList<>();
            for(int i = 0; i < 5 ; i++)
            {
                int randomNumber = random.nextInt(easyQuestionList.get(easyQuestionList.size()-1).getQuestion_ID());
                if(randomNumber == 0) i--;
                else if(isRolled(randomNumber, rolledNumberList))
                {
                    i--;

                }
                else
                {
                    rolledNumberList.add(randomNumber);
                    if(isMetBefore(Integer.toString(randomNumber)))
                    {
                        i--;
                    }
                    else
                    {
                        if(isIdExistInQuestionList(Integer.toString(randomNumber), easyQuestionList))
                        {
                            for( Question q : easyQuestionList)
                            {
                                if(Integer.toString(randomNumber).equalsIgnoreCase(Integer.toString(q.getQuestion_ID())))
                                {
                                    forthteenQuiz.add(q);
                                }
                            }                     
                        }
                        else
                        {
                            i--;
                        }
                    }
                }
            }
            rolledNumberList.clear();
            for(int i = 0; i < 5 ; i++)
            {
                int randomNumber = random.nextInt(mediumQuestionList.get(mediumQuestionList.size()-1).getQuestion_ID());
                if(randomNumber == 0) i--;
                else if(isRolled(randomNumber, rolledNumberList))
                {
                    i--;

                }
                else
                {
                    rolledNumberList.add(randomNumber);
                    if(isMetBefore(Integer.toString(randomNumber)))
                    {
                        i--;
                    }
                    else
                    {
                        if(isIdExistInQuestionList(Integer.toString(randomNumber), mediumQuestionList))
                        {
                            for( Question q : mediumQuestionList)
                            {
                                if(Integer.toString(randomNumber).equalsIgnoreCase(Integer.toString(q.getQuestion_ID())))
                                {
                                    forthteenQuiz.add(q);
                                }
                            }                     
                        }
                        else
                        {
                            i--;
                        }
                    }
                }
            }
            rolledNumberList.clear();
            for(int i = 0; i < 2 ; i++)
            {
                int randomNumber = random.nextInt(hardQuestionList.get(hardQuestionList.size()-1).getQuestion_ID());
                if(randomNumber == 0) i--;
                else if(isRolled(randomNumber, rolledNumberList))
                {
                    i--;

                }
                else
                {
                    rolledNumberList.add(randomNumber);
                    if(isMetBefore(Integer.toString(randomNumber)))
                    {
                        i--;
                    }
                    else
                    {
                        if(isIdExistInQuestionList(Integer.toString(randomNumber), hardQuestionList))
                        {
                            for( Question q : hardQuestionList)
                            {
                                if(Integer.toString(randomNumber).equalsIgnoreCase(Integer.toString(q.getQuestion_ID())))
                                {
                                    forthteenQuiz.add(q);
                                }
                            }                     
                        }
                        else
                        {
                            i--;
                        }
                    }
                }
            }
            rolledNumberList.clear();
            for(int i = 0; i < 2 ; i++)
            {
                int randomNumber = random.nextInt(veryHardQuestionList.get(veryHardQuestionList.size()-1).getQuestion_ID());
                if(randomNumber == 0) i--;
                else if(isRolled(randomNumber, rolledNumberList))
                {
                    i--;

                }
                else
                {
                    rolledNumberList.add(randomNumber);
                    if(isMetBefore(Integer.toString(randomNumber)))
                    {
                        i--;
                    }
                    else
                    {
                        if(isIdExistInQuestionList(Integer.toString(randomNumber), veryHardQuestionList))
                        {
                            for( Question q : veryHardQuestionList)
                            {
                                if(Integer.toString(randomNumber).equalsIgnoreCase(Integer.toString(q.getQuestion_ID())))
                                {
                                    forthteenQuiz.add(q);
                                }
                            }                     
                        }
                        else
                        {
                            i--;
                        }
                    }
                }
            }
        }
    
        public boolean isRolled(int randomNumber, ArrayList<Integer> rolledNumberList)
            {
                    boolean flag = false;
                            Iterator<Integer> itr = rolledNumberList.iterator();
                            while(itr.hasNext())
                            {
                                    if(itr.next() == randomNumber)
                                    {
                                            flag = true;
                                    }
                            }
                    return flag;
            }

        public boolean isMetBefore(String ID) {
                    boolean flag = false;
                    Iterator<String> itr = MetQuestionList.iterator();
                    while(itr.hasNext())
                    {
                            if(itr.next().equalsIgnoreCase(ID))
                            {
                                    flag = true;
                            }
                    }
                    return flag;
            }

        public boolean isIdExistInQuestionList(String ID, ArrayList<Question> list) 
            {
                    boolean flag = false;

                    Iterator<Question> itr = list.iterator();
                    while(itr.hasNext())
                    {
                            if(Integer.toString(itr.next().getQuestion_ID()).equalsIgnoreCase(ID))
                            {
                                    flag = true;
                            }
                    }
                    return flag;
            }

        }
        
    
// Check -----------------------------------------------------------------
    public static void main(String[] args) {

        QuestionManage qm = new QuestionManage();
        UserAccount member = new UserAccount(1, "whjtemask", "duyanhinfo", "0932802929", 
                "whjtemask@gmail.com", "Chau Duy Anh", "Ninh Kieu, TPCT", 500000, 0, "0");
        ArrayList<Question> questionList = new ArrayList<Question>();
//        String MetBefore = "NULL";
        if(member.getUser_MetBeforeQuestionID().equalsIgnoreCase("0"))
        {
            
            QuestionManage.noMet_QuestionManage nm = qm.new noMet_QuestionManage();
            questionList = nm.getQuestion(member);
        }
        else
        {
            QuestionManage.hasMet_QuestionManage hm = qm.new hasMet_QuestionManage();
            questionList = hm.getQuestion(member);
        }
        
        for (Question qs : questionList)
        {
            System.out.print(qs.getQuestion_ID()+": ");
            System.out.println(qs.getQuestion_Content());
            System.out.println(qs.getQuestion_RightAnswer());
        }
    }
//--------------------------------------------------------------------------

    
    public class noMet_QuestionManage{
        
        public noMet_QuestionManage(){
        }
        
        public  ArrayList<Question> getQuestion(UserAccount user) 
        {
            ServerDAO dao = new ServerDAO();
            easyQuestionList = dao.getEasyQuestionList();
            mediumQuestionList = dao.getMediumQuestionList();
            hardQuestionList = dao.getHardQuestionList();
            veryHardQuestionList = dao.getVeryHardQuestionList();
            randomQuestion();
            
            //Set value MetBefore in sql
            String s="";
            for(Question qs : forthteenQuiz)
            {
                s += " " + qs.getQuestion_ID();
            }
            dao.setMetQuestionID(user.getUser_Username(), s);
            
            for (Question q : forthteenQuiz) { playQuestion.add(q); }
            int qID = 0;
            for (Question q : playQuestion)
            {
                q.setQuestion_ID(qID);
                qID++;
            }
            return playQuestion;
        }
    


        public void randomQuestion()
        {
            Random random = new Random(); 
            ArrayList<Integer> rolledNumberList = new ArrayList<>();
            for(int i = 0; i < 5 ; i++)
            {
                int randomNumber = random.nextInt(easyQuestionList.get(easyQuestionList.size()-1).getQuestion_ID());
                if(randomNumber == 0) i--;
                else if(isRolled(randomNumber, rolledNumberList))
                {
                    i--;

                }
                else
                {
                    rolledNumberList.add(randomNumber);
                        if(isIdExistInQuestionList(Integer.toString(randomNumber), easyQuestionList))
                        {
                            for( Question q : easyQuestionList)
                            {
                                if(Integer.toString(randomNumber).equalsIgnoreCase(Integer.toString(q.getQuestion_ID())))
                                {
                                    forthteenQuiz.add(q);
                                }
                            }                     
                        }
                    }
                }
            rolledNumberList.clear();
            for(int i = 0; i < 5 ; i++)
            {
                int randomNumber = random.nextInt(mediumQuestionList.get(mediumQuestionList.size()-1).getQuestion_ID());
                if(randomNumber == 0) i--;
                else if(isRolled(randomNumber, rolledNumberList))
                {
                    i--;

                }
                else
                {
                    rolledNumberList.add(randomNumber);

                    
                        if(isIdExistInQuestionList(Integer.toString(randomNumber), mediumQuestionList))
                        {
                            for( Question q : mediumQuestionList)
                            {
                                if(Integer.toString(randomNumber).equalsIgnoreCase(Integer.toString(q.getQuestion_ID())))
                                {
                                    forthteenQuiz.add(q);
                                }
                            }                     
                        }
                        else
                        {
                            i--;
                        }
                    
                }
            }
            rolledNumberList.clear();
            for(int i = 0; i < 2 ; i++)
            {
                int randomNumber = random.nextInt(hardQuestionList.get(hardQuestionList.size()-1).getQuestion_ID());
                if(randomNumber == 0) i--;
                else if(isRolled(randomNumber, rolledNumberList))
                {
                    i--;

                }
                else
                {
                    rolledNumberList.add(randomNumber);
                  
                    
                        if(isIdExistInQuestionList(Integer.toString(randomNumber), hardQuestionList))
                        {
                            for( Question q : hardQuestionList)
                            {
                                if(Integer.toString(randomNumber).equalsIgnoreCase(Integer.toString(q.getQuestion_ID())))
                                {
                                    forthteenQuiz.add(q);
                                }
                            }                     
                        }
                        else
                        {
                            i--;
                        }
                    
                }
            }
            rolledNumberList.clear();
            for(int i = 0; i < 2 ; i++)
            {
                int randomNumber = random.nextInt(veryHardQuestionList.get(veryHardQuestionList.size()-1).getQuestion_ID());
                if(randomNumber == 0) i--;
                else if(isRolled(randomNumber, rolledNumberList))
                {
                    i--;

                }
                else
                {
                    rolledNumberList.add(randomNumber);

                    
                        if(isIdExistInQuestionList(Integer.toString(randomNumber), veryHardQuestionList))
                        {
                            for( Question q : veryHardQuestionList)
                            {
                                if(Integer.toString(randomNumber).equalsIgnoreCase(Integer.toString(q.getQuestion_ID())))
                                {
                                    forthteenQuiz.add(q);
                                }
                            }                     
                        }
                        else
                        {
                            i--;
                        }
                    
                }
            }
        }
    
        public boolean isRolled(int randomNumber, ArrayList<Integer> rolledNumberList)
            {
                    boolean flag = false;
                            Iterator<Integer> itr = rolledNumberList.iterator();
                            while(itr.hasNext())
                            {
                                    if(itr.next() == randomNumber)
                                    {
                                            flag = true;
                                    }
                            }
                    return flag;
            }



        public boolean isIdExistInQuestionList(String ID, ArrayList<Question> list) 
            {
                    boolean flag = false;

                    Iterator<Question> itr = list.iterator();
                    while(itr.hasNext())
                    {
                            if(Integer.toString(itr.next().getQuestion_ID()).equalsIgnoreCase(ID))
                            {
                                    flag = true;
                            }
                    }
                    return flag;
            }

        
    }
}



