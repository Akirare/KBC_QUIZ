/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client.Controller;

/**
 *
 * @author lnngana17001
 */
public class RegisterValidate {
    private static final String USERNAME_REGEX 	= "^[a-zA-Z][\\w]{5,19}";
    private static final String PASSWORD_REGEX 	= "[\\w]{6,20}";
    private static final String MAIL_REGEX	= "^[a-zA-Z]\\w{5,19}@{1}[a-z]{3,6}(.{1}[a-z]{2,4}){1,3}";
    private static final String PHONE_REGEX     = "0{1}[1-9]{1}[0-9]{8,9}";
	
    public boolean isUsernameValid(String username_Temp) {
            boolean flag = false;
                    if(username_Temp.matches(USERNAME_REGEX)) {
                            flag = true;
                    } else flag = false;
            return flag;
    }

    public boolean isPasswordValid(String password_Temp) {
            boolean flag = false;
            if(password_Temp.matches(PASSWORD_REGEX)) {
                    flag = true;
            }
            else flag = false;
            return flag;
    }

    public boolean isMailValid(String mail_Temp) {
            boolean flag = false;
            if(mail_Temp.matches(MAIL_REGEX)) {
                    flag = true;
            }
            else flag = false;
            return flag;
    }
    
    public boolean isPhoneValid(String phone_Temp) {
            boolean flag = false;
            if(phone_Temp.matches(PHONE_REGEX)) {
                    flag = true;
            }
            else flag = false;
            return flag;
    }
}
