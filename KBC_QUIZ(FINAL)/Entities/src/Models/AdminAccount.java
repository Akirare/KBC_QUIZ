
package Models;

import java.io.Serializable;

public class AdminAccount implements Serializable{
    private String admin_ID;
    private String Admin_Username;
    private String Admin_Password;
    private String Admin_Fullname;

    public AdminAccount() {
    }

    public AdminAccount(String admin_ID, String Admin_Username, String Admin_Password, String Admin_Fullname) {
        this.admin_ID = admin_ID;
        this.Admin_Username = Admin_Username;
        this.Admin_Password = Admin_Password;
        this.Admin_Fullname = Admin_Fullname;
    }

    public String getAdmin_ID() {
        return admin_ID;
    }

    public void setAdmin_ID(String admin_ID) {
        this.admin_ID = admin_ID;
    }

    public String getAdmin_Username() {
        return Admin_Username;
    }

    public void setAdmin_Username(String Admin_Username) {
        this.Admin_Username = Admin_Username;
    }

    public String getAdmin_Password() {
        return Admin_Password;
    }

    public void setAdmin_Password(String Admin_Password) {
        this.Admin_Password = Admin_Password;
    }

    public String getAdmin_Fullname() {
        return Admin_Fullname;
    }

    public void setAdmin_Fullname(String Admin_Fullname) {
        this.Admin_Fullname = Admin_Fullname;
    }
    
    
}
