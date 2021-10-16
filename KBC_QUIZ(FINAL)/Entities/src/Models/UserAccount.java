
package Models;

import java.io.Serializable;

public class UserAccount implements Serializable{
    private int user_ID;
    private String user_Username;
    private String user_Password;
    private String user_Phone;
    private String user_Mail;
    private String user_Fullname;
    private String user_Address;
    private int user_HighestScore;
    private int user_NumberOfAttendance;
    private String User_MetBeforeQuestionID;

    public UserAccount() {
    }

    public UserAccount(String user_Username, int user_HighestScore) {
        this.user_Username = user_Username;
        this.user_HighestScore = user_HighestScore;
    }
    
    
    
    public UserAccount(int user_ID, String user_Username, String user_Password, String user_Phone, String user_Mail, String user_Fullname, String user_Address, int user_HighestScore, int user_NumberOfAttendance, String User_MetBeforeQuestionID) {
        this.user_ID = user_ID;
        this.user_Username = user_Username;
        this.user_Password = user_Password;
        this.user_Phone = user_Phone;
        this.user_Mail = user_Mail;
        this.user_Fullname = user_Fullname;
        this.user_Address = user_Address;
        this.user_HighestScore = user_HighestScore;
        this.user_NumberOfAttendance = user_NumberOfAttendance;
        this.User_MetBeforeQuestionID = User_MetBeforeQuestionID;
    }

    public int getUser_ID() {
        return user_ID;
    }

    public void setUser_ID(int user_ID) {
        this.user_ID = user_ID;
    }

    public String getUser_Username() {
        return user_Username;
    }

    public void setUser_Username(String user_Username) {
        this.user_Username = user_Username;
    }

    public String getUser_Password() {
        return user_Password;
    }

    public void setUser_Password(String user_Password) {
        this.user_Password = user_Password;
    }

    public String getUser_Phone() {
        return user_Phone;
    }

    public void setUser_Phone(String user_Phone) {
        this.user_Phone = user_Phone;
    }

    public String getUser_Mail() {
        return user_Mail;
    }

    public void setUser_Mail(String user_Mail) {
        this.user_Mail = user_Mail;
    }

    public String getUser_Fullname() {
        return user_Fullname;
    }

    public void setUser_Fullname(String user_Fullname) {
        this.user_Fullname = user_Fullname;
    }

    public String getUser_Address() {
        return user_Address;
    }

    public void setUser_Address(String user_Address) {
        this.user_Address = user_Address;
    }

    public int getUser_HighestScore() {
        return user_HighestScore;
    }

    public void setUser_HighestScore(int user_HighestScore) {
        this.user_HighestScore = user_HighestScore;
    }

    public int getUser_NumberOfAttendance() {
        return user_NumberOfAttendance;
    }

    public void setUser_NumberOfAttendance(int user_NumberOfAttendance) {
        this.user_NumberOfAttendance = user_NumberOfAttendance;
    }

    public String getUser_MetBeforeQuestionID() {
        return User_MetBeforeQuestionID;
    }

    public void setUser_MetBeforeQuestionID(String User_MetBeforeQuestionID) {
        this.User_MetBeforeQuestionID = User_MetBeforeQuestionID;
    }
    
    
}
