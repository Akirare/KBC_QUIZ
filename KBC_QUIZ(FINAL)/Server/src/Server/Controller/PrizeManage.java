/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server.Controller;

import Models.Prize;
import java.util.ArrayList;

/**
 *
 * @author MyPC
 */
public class PrizeManage {
    ServerDAO dao = new ServerDAO();
    ArrayList<Prize> prizeList = new ArrayList<Prize>();
    
    // R --> Right
    // M --> Miss
    // A --> Away
    // W --> Wrong
    
    public int getPrize(String result)
    {
        prizeList = dao.getPrize();
        
        int finalResult = 0;
        for (Prize prize : prizeList)
        {
            if (result.length()==2)
            {
                if(Integer.parseInt(String.valueOf(result.charAt(0))) == prize.getPrize_ID())
                {
    //                System.out.println(prize.getPrize_ID());  //check
                    if (result.charAt(1)=='R')
                    {
                        finalResult = prize.getPrize_RightAnswer();
    //                    System.out.println(prize.getPrize_RightAnswer()); //check
                    }
                    else 
                        if (result.charAt(1)=='M')
                        {
                            finalResult = prize.getPrize_MissAnswer();
                        }
                        else 
                            if (result.charAt(1)=='A')
                            {
                                finalResult = prize.getPrize_WalkAway();
                            }
                            else 
                                if (result.charAt(1)=='W')
                                {
                                    finalResult = prize.getPrize_WrongAnswer();
                                }
                }
            }
            else
            {
                String id = result.substring(0, 2);
                if(Integer.parseInt(id) == prize.getPrize_ID())
                {
    //                System.out.println(prize.getPrize_ID());  //check
                    if (result.charAt(2)=='R')
                    {
                        finalResult = prize.getPrize_RightAnswer();
    //                    System.out.println(prize.getPrize_RightAnswer()); //check
                    }
                    else 
                        if (result.charAt(2)=='M')
                        {
                            finalResult = prize.getPrize_MissAnswer();
                        }
                        else 
                            if (result.charAt(2)=='A')
                            {
                                finalResult = prize.getPrize_WalkAway();
                            }
                            else 
                                if (result.charAt(2)=='W')
                                {
                                    finalResult = prize.getPrize_WrongAnswer();
                                }
                }
            }
        }
        
        
        return finalResult;
    }
    
    //check-----------------------------------------------------------------
//    public static void main(String[] args) {
//        String p = "13R";
//        PrizeManage pm = new PrizeManage();
//        System.out.println(pm.getPrize(p));
//    }
    //----------------------------------------------------------------------
}
