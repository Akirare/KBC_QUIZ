
package Server.Controller;

import Models.Prize;
import Models.Question;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Models.UserAccount;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class ServerDAO {
    public static Connection connection;
    public static DBConnection jdbc;
    
    
//    ArrayList<Prize> prizeList;
    
    
    
    public ServerDAO() {
          jdbc = new DBConnection();
          connection = jdbc.createConnection("KBC_QUIZ", "sa", "sa");
    }
    // Admin------------------------------------------------------------------
    public boolean queryAdmin(String userName, String Password){
        boolean isExist = false;

        String query="SELECT * FROM AdminAccount_TB WHERE Admin_Username=? AND Admin_Password=?";
        
        try {
            PreparedStatement ps = connection.prepareStatement(query);
                      
            ps.setString(1, userName);
            ps.setString(2, Password);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()){
                isExist = true;
            } 
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isExist;
    }
    
    public ArrayList<Question> getQuestions(){
        ArrayList<Question> questionList = new ArrayList<Question>();
        String sql2 = "SELECT * FROM Question_TB";
    
    
        try {
            
            Statement st = connection.createStatement();
            
//            ps.setInt(1, id);
            ResultSet rs = st.executeQuery(sql2);
            Question question;
            while (rs.next()){
                question = new Question();
                question.setQuestion_ID(rs.getInt("Question_ID"));
                question.setQuestion_DifficultyLevel(rs.getString("Question_DifficultyLevel"));
                question.setQuestion_Topic(rs.getString("Question_Topic"));
                question.setQuestion_Content(rs.getString("Question_Content"));
                question.setQuestion_ChoiceA(rs.getString("Question_Choice1"));
                question.setQuestion_ChoiceB(rs.getString("Question_Choice2"));
                question.setQuestion_ChoiceC(rs.getString("Question_Choice3"));
                question.setQuestion_ChoiceD(rs.getString("Question_Choice4"));
                question.setQuestion_RightAnswer(rs.getString("Question_RightAnswer"));
                
                
                questionList.add(question);
            }
            
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        
        return questionList;
    }
    
    // Adding question object into sql--------------------------------------
    public boolean setQuestion(Question question)
    {
        String sql = "INSERT INTO Question_TB(Question_DifficultyLevel, Question_Topic, "
                + "Question_Content, Question_Choice1, Question_Choice2, Question_Choice3, "
                + "Question_Choice4, Question_RightAnswer) VALUES(?,?,?,?,?,?,?,?)";
        try {
            
            
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setString(1, question.getQuestion_DifficultyLevel());
            ps.setString(2, question.getQuestion_Topic());
            ps.setString(3, question.getQuestion_Content());
            ps.setString(4, question.getQuestion_ChoiceA());
            ps.setString(5, question.getQuestion_ChoiceB());
            ps.setString(6, question.getQuestion_ChoiceC());
            ps.setString(7, question.getQuestion_ChoiceD());
            ps.setString(8, question.getQuestion_RightAnswer());

            ps.executeUpdate(); //Insert to sql
            
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    // Update Question---------------------------------------------------
    public boolean saveQuestion(Question question)
    {
        String sql = "UPDATE Question_TB SET Question_DifficultyLevel = ?, "
                + "Question_Topic = ?, Question_Content = ?, Question_Choice1 = ?, "
                + "Question_Choice2 = ?, Question_Choice3 = ?, Question_Choice4 = ?, "
                + "Question_RightAnswer = ? WHERE Question_ID = "+question.getQuestion_ID();
        try {
            
            
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setString(1, question.getQuestion_DifficultyLevel());
            ps.setString(2, question.getQuestion_Topic());
            ps.setString(3, question.getQuestion_Content());
            ps.setString(4, question.getQuestion_ChoiceA());
            ps.setString(5, question.getQuestion_ChoiceB());
            ps.setString(6, question.getQuestion_ChoiceC());
            ps.setString(7, question.getQuestion_ChoiceD());
            ps.setString(8, question.getQuestion_RightAnswer());

            ps.executeUpdate(); 
            
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    //-------------------------------------------------------------------
    
    // Delete question-------------------------------------------------
    public boolean deleteQuestion(Question question)
    {
        String sql = "DELETE FROM Question_TB WHERE Question_ID = "+question.getQuestion_ID();
        try {
            
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.executeUpdate(); 
            
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    //----------------------------------------------------------------
    
    //------------------------------------------------------------------------
    
    // User-------------------------------------------------------------------
    public boolean addUser(UserAccount user){
        String sql = "INSERT INTO UserAccount_TB(User_Username, User_Password, "
                + "User_Phone, User_Mail, User_FullName, User_Address) "
                + "VALUES(?,?,?,?,?,?)";
        try {
            
            
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setString(1, user.getUser_Username());
            ps.setString(2, user.getUser_Password());
            ps.setString(3, user.getUser_Phone());
            ps.setString(4, user.getUser_Mail());
            ps.setString(5, user.getUser_Fullname());
            ps.setString(6, user.getUser_Address());

            ps.executeUpdate(); //Insert to sql
            
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean queryAccount(String userName){
        boolean isExist = false;

        String query="SELECT * FROM UserAccount_TB WHERE User_Username=?";
        
        try {
            PreparedStatement ps = connection.prepareStatement(query);
                      
            ps.setString(1, userName);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()){
                isExist = true;
            } 
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isExist;
    }
    public boolean queryAccount(String userName, String userPassword){
        boolean isExist = false;

        String query="SELECT * FROM UserAccount_TB WHERE User_Username=? AND User_Password=?";
        
        try {
            PreparedStatement ps = connection.prepareStatement(query);
                      
            ps.setString(1, userName);
            ps.setString(2, userPassword);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()){
                isExist = true;
            } 
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isExist;
    }
    
    public UserAccount getInfo(String username, String password){
        
        UserAccount userInfo = new UserAccount();
        String query="SELECT * FROM UserAccount_TB WHERE User_Username=? AND User_Password=?";
        
        try {
            PreparedStatement ps = connection.prepareStatement(query);
                      
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()){
                userInfo.setUser_ID(rs.getInt("User_ID"));
                userInfo.setUser_Username(rs.getString("User_Username"));
                userInfo.setUser_Password(rs.getString("User_Password"));
                userInfo.setUser_Mail(rs.getString("User_Mail"));
                userInfo.setUser_Fullname(rs.getString("User_Fullname"));
                userInfo.setUser_Phone(rs.getString("User_Phone"));
                userInfo.setUser_Address(rs.getString("User_Address"));
                userInfo.setUser_HighestScore(rs.getInt("User_HighestScore"));
                userInfo.setUser_NumberOfAttendance(rs.getInt("User_NumberOfAttendance"));
                userInfo.setUser_MetBeforeQuestionID(rs.getString("User_MetBeforeQuestionID"));
            } 
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userInfo;
    }

    //update UserAcount--------------------------------------------------------
    public void setPrize(UserAccount user, int bestScore, int lastScore){
        
        String query="UPDATE UserAccount_TB SET User_HighestScore = ?, "
            + "User_NumberOfAttendance = ? WHERE User_ID = ?";
        
        try {
            PreparedStatement ps = connection.prepareStatement(query);
                      
            ps.setInt(1, bestScore);
            ps.setInt(2, lastScore);
            ps.setInt(3, user.getUser_ID());
            
            ps.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //-------------------------------------------------------------------------
    
    public ArrayList<Prize> getRules(){
//        prize = new Prize();
        ArrayList<Prize> prizeList = new ArrayList<Prize>();
        String sql2 = "SELECT * FROM Prize_TB";
    
    
        try {
            
            Statement st = connection.createStatement();
            
//            ps.setInt(1, id);
            ResultSet rs = st.executeQuery(sql2);
            Prize prize;
            while (rs.next()){
                prize = new Prize();
                prize.setPrize_ID(rs.getInt("Prize_ID"));
                prize.setPrize_RightAnswer(rs.getInt("Prize_RightAnswer"));
                prize.setPrize_MissAnswer(rs.getInt("Prize_MissAnswer"));
                prize.setPrize_WalkAway(rs.getInt("Prize_WalkAway"));
                prize.setPrize_WrongAnswer(rs.getInt("Prize_WrongAnswer"));
                
                prizeList.add(prize);
            }
            
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        
        return prizeList;
    }
    
    public ArrayList<Prize> getPrize(){
//        prize = new Prize();
        ArrayList<Prize> prizeList = new ArrayList<Prize>();
        String sql2 = "SELECT * FROM Prize_TB";
    
    
        try {
            
            Statement st = connection.createStatement();
            
//            ps.setInt(1, id);
            ResultSet rs = st.executeQuery(sql2);
            Prize prize;
            while (rs.next()){
                prize = new Prize();
                prize.setPrize_ID(rs.getInt("Prize_ID"));
                prize.setPrize_RightAnswer(rs.getInt("Prize_RightAnswer"));
                prize.setPrize_MissAnswer(rs.getInt("Prize_MissAnswer"));
                prize.setPrize_WalkAway(rs.getInt("Prize_WalkAway"));
                prize.setPrize_WrongAnswer(rs.getInt("Prize_WrongAnswer"));
                
                prizeList.add(prize);
            }
            
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        
        return prizeList;
    }
    
    // Ranking---------------------------------------------------------
    public ArrayList<UserAccount> getRanking()
    {
        ArrayList<UserAccount> topList = new ArrayList<UserAccount>();
        String sql = "SELECT TOP 10 User_Username, User_HighestScore "
                + "FROM UserAccount_TB ORDER BY User_HighestScore DESC";
    
        try {
            
            Statement st = connection.createStatement();
            
            ResultSet rs = st.executeQuery(sql);
            UserAccount user;
            while (rs.next()){
                user = new UserAccount();
                user.setUser_Username(rs.getString("User_Username"));
                user.setUser_HighestScore(Integer.parseInt(rs.getString("User_HighestScore")));
                
                topList.add(user);
            }
            
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        
        return topList;
    }
    //-----------------------------------------------------------------
    
    
    public void getUser(UserAccount user, int id){

        String sql2 = "SELECT * FROM UserAccount_TB WHERE User_ID=?";
        try {
            
            PreparedStatement ps = connection.prepareStatement(sql2);
            
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()){
                user.setUser_ID(rs.getInt("User_ID"));
                user.setUser_Username(rs.getString("User_Username"));
                user.setUser_Password(rs.getString("User_Password"));
                user.setUser_Phone(rs.getString("User_Phone"));
                user.setUser_Mail(rs.getString("User_Mail"));
                user.setUser_Fullname("User_FullName");
                user.setUser_Address(rs.getString("User_Address"));
                user.setUser_HighestScore(rs.getInt("User_HighestScore"));
                user.setUser_NumberOfAttendance(rs.getInt("User_NumberOfAttendance"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    //Overloaded---------------------------------------
    public UserAccount getInfo(String username){
        
        UserAccount userInfo = new UserAccount();
        String query="SELECT * FROM UserAccount_TB WHERE User_Username=?";
        
        try {
            PreparedStatement ps = connection.prepareStatement(query);
                      
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()){
                userInfo.setUser_ID(rs.getInt("User_ID"));
                userInfo.setUser_Username(rs.getString("User_Username"));
                userInfo.setUser_Password(rs.getString("User_Password"));
                userInfo.setUser_Mail(rs.getString("User_Mail"));
                userInfo.setUser_Fullname(rs.getString("User_Fullname"));
                userInfo.setUser_Phone(rs.getString("User_Phone"));
                userInfo.setUser_Address(rs.getString("User_Address"));
                userInfo.setUser_HighestScore(rs.getInt("User_HighestScore"));
                userInfo.setUser_NumberOfAttendance(rs.getInt("User_NumberOfAttendance"));
                userInfo.setUser_MetBeforeQuestionID(rs.getString("User_MetBeforeQuestionID"));
            } 
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userInfo;
    }
    
    

// Ngan-----------------------------------------------------------------------
//------------------------------------------------------------
    public ArrayList<Question> getEasyQuestionList()
    {
        String sql2 = "SELECT * FROM Question_TB WHERE Question_DifficultyLevel=?";
        ArrayList<Question> list = new ArrayList<Question>();
        try {

            PreparedStatement ps = connection.prepareStatement(sql2);

            ps.setString(1, "1");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Question ques = new Question(rs.getInt("Question_ID"), rs.getString("Question_DifficultyLevel"), rs.getString("Question_Topic"), rs.getString("Question_Content"), rs.getString("Question_Choice1"), rs.getString("Question_Choice2"), rs.getString("Question_Choice3"), rs.getString("Question_Choice4"), rs.getString("Question_RightAnswer"));
                list.add(ques);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public ArrayList<Question> getMediumQuestionList()
    {
        String sql2 = "SELECT * FROM Question_TB WHERE Question_DifficultyLevel=?";
        ArrayList<Question> list = new ArrayList<Question>();
        try {

            PreparedStatement ps = connection.prepareStatement(sql2);

            ps.setString(1, "2");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Question ques = new Question(rs.getInt("Question_ID"), rs.getString("Question_DifficultyLevel"), rs.getString("Question_Topic"), rs.getString("Question_Content"), rs.getString("Question_Choice1"), rs.getString("Question_Choice2"), rs.getString("Question_Choice3"), rs.getString("Question_Choice4"), rs.getString("Question_RightAnswer"));
                list.add(ques);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public ArrayList<Question> getHardQuestionList()
    {
        String sql2 = "SELECT * FROM Question_TB WHERE Question_DifficultyLevel=?";
        ArrayList<Question> list = new ArrayList<Question>();
        try {

            PreparedStatement ps = connection.prepareStatement(sql2);

            ps.setString(1, "3");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Question ques = new Question(rs.getInt("Question_ID"), rs.getString("Question_DifficultyLevel"), rs.getString("Question_Topic"), rs.getString("Question_Content"), rs.getString("Question_Choice1"), rs.getString("Question_Choice2"), rs.getString("Question_Choice3"), rs.getString("Question_Choice4"), rs.getString("Question_RightAnswer"));
                list.add(ques);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public ArrayList<Question> getVeryHardQuestionList()
    {
        String sql2 = "SELECT * FROM Question_TB WHERE Question_DifficultyLevel=?";
        ArrayList<Question> list = new ArrayList<Question>();
        try {

            PreparedStatement ps = connection.prepareStatement(sql2);

            ps.setString(1, "4");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Question ques = new Question(rs.getInt("Question_ID"), rs.getString("Question_DifficultyLevel"), rs.getString("Question_Topic"), rs.getString("Question_Content"), rs.getString("Question_Choice1"), rs.getString("Question_Choice2"), rs.getString("Question_Choice3"), rs.getString("Question_Choice4"), rs.getString("Question_RightAnswer"));
                list.add(ques);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public String getMetQuestionIDList(int UserID)
    {
        String sql2 = "SELECT User_MetBeforeQuestionID FROM UserAccount_TB WHERE User_ID=?";
        String str = null;
        try {

            PreparedStatement ps = connection.prepareStatement(sql2);

            ps.setInt(1, UserID);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                str = rs.getString("User_MetBeforeQuestionID");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str;
    }

    public void setMetQuestionID(String user, String str)
    {
        
        String sql2 = "UPDATE UserAccount_TB SET User_MetBeforeQuestionID = ? WHERE User_Username = '"+user+"'";
        
        try {

            PreparedStatement ps = connection.prepareStatement(sql2);

            ps.setString(1, str);
            ps.executeUpdate();

            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //Check----------------------------------------------------
//    public static void main(String[] args) {
//        ServerDAO dao = new ServerDAO();
////        UserAccount userInfo1 = new UserAccount();
////        Prize prize = new Prize();
//        ArrayList<Prize> prizeList = new ArrayList<>();
//        
//        prizeList = dao.getRules();
//        
//        for(Prize pr : prizeList){
//            System.out.println(pr.getPrize_ID()+" "+pr.getPrize_RightAnswer()+" "+pr.getPrize_MissAnswer()
//            +" "+pr.getPrize_WalkAway()+" "+pr.getPrize_WrongAnswer());
//        }
//        dao.getUser(userInfo1,1);
//        
//        System.out.print("ID: "+userInfo1.getUser_ID()+"; ");
//        System.out.print("User: "+userInfo1.getUser_Username()+"; ");
//        System.out.print("Password: "+userInfo1.getUser_Password()+"; ");
//        System.out.println();
        
//    }
    //------------------------------------------------------------

    

}