/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server.Controller;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import Models.UserAccount;

/**
 *
 * @author MyPC
 */
public class UserManage {

    private int port;
    private String host;
    private Socket mySocket;

    public UserManage() {
        host = "localhost";
        port = 1796;
    }
    
    public void openSocket(){
        try {
            mySocket = new Socket(host, port);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public void sendUser(UserAccount user){
        try {
            ObjectOutputStream oos = new ObjectOutputStream(mySocket.getOutputStream());
            oos.writeObject(user); //send user to server
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public String getResult(){
        String res = "";
        try {
            ObjectInputStream ois = new ObjectInputStream(mySocket.getInputStream());
            res = (String)ois.readObject(); //result message connect
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }
    
    public void closeConnection(){
        try {
            mySocket.close();
        } catch (Exception e) {
        }
    }
}
