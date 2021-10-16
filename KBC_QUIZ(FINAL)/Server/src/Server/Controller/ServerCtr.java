/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server.Controller;

import Server.View.ServerView;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import Models.UserAccount;

/**
 *
 * @author MyPC
 */
public class ServerCtr {
    private int port;
    private String host;
    private ServerDAO dao;
    private ServerSocket myServer;
    private ArrayList<Socket> list;

    
    public ServerCtr(){
        port = 1796;
//        host = "localhost";
        dao = new ServerDAO();
        list = new ArrayList<Socket>();
        
        openSocket();
        while (true){
            try {
               Socket s = myServer.accept();
                list.add(s);
                execute(s);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    public void sendResult(String res){
        try {
            ObjectOutputStream oos = new ObjectOutputStream(list.get(list.size()-1).getOutputStream());
            oos.writeObject(res);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void execute(Socket s){
        try {
            UserAccount user = receiveUser(s);
            
            if (dao.addUser(user)){
                sendResult("ok");
                new ServerView().showMessage("Receive Success!");
            } else {
                sendResult("failed");
                new ServerView().showMessage("Receive Failed!");
            }
            
        } catch (Exception e) {
            sendResult("failed");
            new ServerView().showMessage("Receive Exception Failed!");
            e.printStackTrace();
        }
    }
    
       
    public void openSocket(){
        try {
            myServer = new ServerSocket(port);
            System.out.println("Server is running...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public UserAccount receiveUser(Socket s){
        UserAccount user = null;
        try {
            ObjectInputStream ois = new ObjectInputStream(s.getInputStream());
            user = (UserAccount)ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return user;
    }
}
