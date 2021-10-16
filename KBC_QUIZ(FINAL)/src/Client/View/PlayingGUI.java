/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client.View;

import Models.Question;
import Models.UserAccount;
import Server.Controller.PrizeManage;
import Server.Controller.QuestionManage;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import keeptoo.Drag;


/**
 *
 * @author MyPC
 */
public class PlayingGUI extends javax.swing.JFrame {

    //Set 3 quyen cua ngwoi choi ---------------------------------------
    byte changeQuestion = 1;  //= 0 is Disable; = 1 is ON; = 2 is OFF 
    byte fiftyPercent = 1;
    byte twiceAnswer = 1;
    //------------------------------------------------------------------

    //-------------------------------------------------------
    UserAccount member;
    static ArrayList<Question> questionList = new ArrayList<Question>();
    PrizeManage prize = new PrizeManage();

    //Variable-------------------------------------------------
    final static int minute = 1; //Time on every 1 question
    int count;
    //---------------------------------------------------------

    int callQuestion = 1;
    static String rightAnswer = "";
    static String finalResult = "";
    //---------------------------------------------------------

    public PlayingGUI() {
        initComponents();
        setLocationRelativeTo(null);
        setFrameBG(1100, 700, "/images/bg01.jpg");

        //Set panel background------------------------------------- 
        jpn_Bg.setBackground(new Color(102, 102, 102, 80));
        jpn_Bg.setBounds(0, 0, 1100, 700);

        btn_WalkAway.setBackground(new Color(51, 51, 255, 50));
        jrb_A.setBackground(new Color(51, 51, 255, 50));
        jrb_B.setBackground(new Color(51, 51, 255, 50));
        jrb_C.setBackground(new Color(51, 51, 255, 50));
        jrb_D.setBackground(new Color(51, 51, 255, 50));

        //READY----------------------------------------------------------------

        JOptionPane.showMessageDialog(null, "Are you READY");
        lbl_Time.setText("");

//        lbl_QuestionNumber.setText("Question " + callQuestion + ": \n");
//        lbl_QuestionContent.setText("<html> "+questionList.get(callQuestion - 1).getQuestion_Content()+"</html>");
//        lbl_Answer_A.setText(questionList.get(callQuestion - 1).getQuestion_ChoiceA());
//        lbl_Answer_B.setText(questionList.get(callQuestion - 1).getQuestion_ChoiceB());
//        lbl_Answer_C.setText(questionList.get(callQuestion - 1).getQuestion_ChoiceC());
//        lbl_Answer_D.setText(questionList.get(callQuestion - 1).getQuestion_ChoiceD());

        T.start();
        //---------------------------------------------------------------------
    }

    public PlayingGUI(UserAccount user) {
        initComponents();
        setLocationRelativeTo(null);
        this.member = user;
        setFrameBG(1100, 700, "/images/bg01.jpg");

        //Display Current member----------------------------------------
        String username = member.getUser_Username();
        lbl_Member.setText("Welcome "+username);

        //Set panel background -----------------------------------------
        jpn_Bg.setBackground(new Color(102, 102, 102, 80));
        jpn_Bg.setBounds(0, 0, 1100, 700);

        btn_WalkAway.setBackground(new Color(51, 51, 255, 50));
        jrb_A.setBackground(new Color(51, 51, 255, 50));
        jrb_B.setBackground(new Color(51, 51, 255, 50));
        jrb_C.setBackground(new Color(51, 51, 255, 50));
        jrb_D.setBackground(new Color(51, 51, 255, 50));

        //READY--------------------------------------------------------------------
        
        // ngan --------------------------------
        QuestionManage qm = new QuestionManage();
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
        JOptionPane.showMessageDialog(null, "Are you READY");
        lbl_Time.setText("");

        lbl_QuestionNumber.setText("Question " + callQuestion + ": \n");
        lbl_QuestionContent.setText("<html> "+questionList.get(callQuestion - 1).getQuestion_Content()+"</html>");
        lbl_Answer_A.setText(questionList.get(callQuestion - 1).getQuestion_ChoiceA());
        lbl_Answer_B.setText(questionList.get(callQuestion - 1).getQuestion_ChoiceB());
        lbl_Answer_C.setText(questionList.get(callQuestion - 1).getQuestion_ChoiceC());
        lbl_Answer_D.setText(questionList.get(callQuestion - 1).getQuestion_ChoiceD());
        
        count = minute * 60;
        T.start();
        
        //-------------------------------------------------------------------------    
    }

    //method set background frame
    private void setFrameBG(int width, int height, String img_bg) {
        
        ImageIcon background_image = new ImageIcon(getClass().getResource(img_bg));

        Image img = background_image.getImage();
        Image temp_img = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        background_image = new ImageIcon(temp_img);
        JLabel background = new JLabel("", background_image, JLabel.CENTER);

        background.setBounds(0, 0, width, height);
        add(background);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Group_Answers = new javax.swing.ButtonGroup();
        jpn_Bg = new javax.swing.JPanel();
        pnl_Levels = new keeptoo.KGradientPanel();
        Levels = new javax.swing.JLabel();
        lbl_Level13 = new javax.swing.JLabel();
        lbl_Level01 = new javax.swing.JLabel();
        lbl_Level02 = new javax.swing.JLabel();
        lbl_Level03 = new javax.swing.JLabel();
        lbl_Level04 = new javax.swing.JLabel();
        lbl_Level05 = new javax.swing.JLabel();
        lbl_Level06 = new javax.swing.JLabel();
        lbl_Level07 = new javax.swing.JLabel();
        lbl_Level08 = new javax.swing.JLabel();
        lbl_Level09 = new javax.swing.JLabel();
        lbl_Level10 = new javax.swing.JLabel();
        lbl_Level11 = new javax.swing.JLabel();
        lbl_Level12 = new javax.swing.JLabel();
        btn_WalkAway = new javax.swing.JToggleButton();
        lbl_Logo = new javax.swing.JLabel();
        lbl_QuestionContent = new javax.swing.JLabel();
        lbl_Answer_A = new javax.swing.JLabel();
        lbl_Answer_B = new javax.swing.JLabel();
        lbl_Answer_C = new javax.swing.JLabel();
        lbl_Answer_D = new javax.swing.JLabel();
        jrb_A = new javax.swing.JRadioButton();
        jrb_B = new javax.swing.JRadioButton();
        jrb_C = new javax.swing.JRadioButton();
        jrb_D = new javax.swing.JRadioButton();
        lbl_comitQuestion = new javax.swing.JLabel();
        lbl_Time = new javax.swing.JLabel();
        lbl_QuestionNumber = new javax.swing.JLabel();
        lbl_ChangeQuestion = new javax.swing.JLabel();
        lbl_FiftyPercent = new javax.swing.JLabel();
        lbl_TwiceAnswer = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbl_Member = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1100, 700));
        setName("Playing"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1100, 700));
        getContentPane().setLayout(null);

        jpn_Bg.setMaximumSize(new java.awt.Dimension(1100, 700));
        jpn_Bg.setOpaque(false);
        jpn_Bg.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jpn_BgMouseDragged(evt);
            }
        });
        jpn_Bg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpn_BgMousePressed(evt);
            }
        });
        jpn_Bg.setLayout(null);

        pnl_Levels.setkBorderRadius(20);
        pnl_Levels.setkEndColor(new java.awt.Color(0, 0, 204));
        pnl_Levels.setkGradientFocus(200);
        pnl_Levels.setkStartColor(new java.awt.Color(153, 153, 255));
        pnl_Levels.setOpaque(false);
        pnl_Levels.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Levels.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Levels.setForeground(new java.awt.Color(255, 255, 255));
        Levels.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Levels.setText("- Your levels -");
        Levels.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnl_Levels.add(Levels, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 160, 30));

        lbl_Level13.setBackground(new java.awt.Color(255, 0, 0));
        lbl_Level13.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lbl_Level13.setForeground(new java.awt.Color(255, 255, 0));
        lbl_Level13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Level13.setText("13}          $ 500,000");
        lbl_Level13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray));
        lbl_Level13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnl_Levels.add(lbl_Level13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 160, 30));

        lbl_Level01.setBackground(new java.awt.Color(255, 0, 0));
        lbl_Level01.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lbl_Level01.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Level01.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Level01.setText("01}                     $ 50");
        lbl_Level01.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray));
        lbl_Level01.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnl_Levels.add(lbl_Level01, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 160, 30));

        lbl_Level02.setBackground(new java.awt.Color(255, 0, 0));
        lbl_Level02.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lbl_Level02.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Level02.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Level02.setText("02}                  $ 100");
        lbl_Level02.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray));
        lbl_Level02.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnl_Levels.add(lbl_Level02, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 160, 30));

        lbl_Level03.setBackground(new java.awt.Color(255, 0, 0));
        lbl_Level03.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lbl_Level03.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Level03.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Level03.setText("03}                  $ 200");
        lbl_Level03.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray));
        lbl_Level03.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnl_Levels.add(lbl_Level03, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 160, 30));

        lbl_Level04.setBackground(new java.awt.Color(255, 0, 0));
        lbl_Level04.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lbl_Level04.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Level04.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Level04.setText("04}                  $ 400");
        lbl_Level04.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray));
        lbl_Level04.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnl_Levels.add(lbl_Level04, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 160, 30));

        lbl_Level05.setBackground(new java.awt.Color(255, 0, 0));
        lbl_Level05.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lbl_Level05.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Level05.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Level05.setText("05}                  $ 800");
        lbl_Level05.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray));
        lbl_Level05.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnl_Levels.add(lbl_Level05, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 160, 30));

        lbl_Level06.setBackground(new java.awt.Color(255, 0, 0));
        lbl_Level06.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lbl_Level06.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Level06.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Level06.setText("06}               $ 1,600");
        lbl_Level06.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray));
        lbl_Level06.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnl_Levels.add(lbl_Level06, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 160, 30));

        lbl_Level07.setBackground(new java.awt.Color(255, 0, 0));
        lbl_Level07.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lbl_Level07.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Level07.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Level07.setText("07}               $ 3,200");
        lbl_Level07.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray));
        lbl_Level07.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnl_Levels.add(lbl_Level07, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 160, 30));

        lbl_Level08.setBackground(new java.awt.Color(255, 0, 0));
        lbl_Level08.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lbl_Level08.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Level08.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Level08.setText("08}               $ 6,400");
        lbl_Level08.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray));
        lbl_Level08.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnl_Levels.add(lbl_Level08, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 160, 30));

        lbl_Level09.setBackground(new java.awt.Color(255, 0, 0));
        lbl_Level09.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lbl_Level09.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Level09.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Level09.setText("09}             $ 12,500");
        lbl_Level09.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray));
        lbl_Level09.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnl_Levels.add(lbl_Level09, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 160, 30));

        lbl_Level10.setBackground(new java.awt.Color(255, 0, 0));
        lbl_Level10.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lbl_Level10.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Level10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Level10.setText("10}             $ 25,000");
        lbl_Level10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray));
        lbl_Level10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnl_Levels.add(lbl_Level10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 160, 30));

        lbl_Level11.setBackground(new java.awt.Color(255, 0, 0));
        lbl_Level11.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lbl_Level11.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Level11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Level11.setText("11}             $ 50,000");
        lbl_Level11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray));
        lbl_Level11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnl_Levels.add(lbl_Level11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 160, 30));

        lbl_Level12.setBackground(new java.awt.Color(255, 0, 0));
        lbl_Level12.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lbl_Level12.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Level12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Level12.setText("12}          $ 100,000");
        lbl_Level12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray));
        lbl_Level12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnl_Levels.add(lbl_Level12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 160, 30));

        jpn_Bg.add(pnl_Levels);
        pnl_Levels.setBounds(920, 30, 180, 560);

        btn_WalkAway.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_WalkAway.setForeground(new java.awt.Color(255, 255, 255));
        btn_WalkAway.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/exercise_60px_white.png"))); // NOI18N
        btn_WalkAway.setText("WALK AWAY");
        btn_WalkAway.setToolTipText("Stop playing!");
        btn_WalkAway.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_WalkAway.setMaximumSize(new java.awt.Dimension(100, 100));
        btn_WalkAway.setMinimumSize(new java.awt.Dimension(100, 100));
        btn_WalkAway.setPreferredSize(new java.awt.Dimension(100, 100));
        btn_WalkAway.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/exercise_60px_red.png"))); // NOI18N
        btn_WalkAway.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_WalkAway.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_WalkAwayActionPerformed(evt);
            }
        });
        jpn_Bg.add(btn_WalkAway);
        btn_WalkAway.setBounds(920, 600, 170, 90);

        lbl_Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo_Aptech.png"))); // NOI18N
        lbl_Logo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jpn_Bg.add(lbl_Logo);
        lbl_Logo.setBounds(10, 10, 180, 110);

        lbl_QuestionContent.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        lbl_QuestionContent.setForeground(new java.awt.Color(255, 255, 255));
        lbl_QuestionContent.setText("Question   :");
        lbl_QuestionContent.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lbl_QuestionContent.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lbl_QuestionContent.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lbl_QuestionContent.setMaximumSize(new java.awt.Dimension(550, 250));
        lbl_QuestionContent.setMinimumSize(new java.awt.Dimension(550, 250));
        lbl_QuestionContent.setPreferredSize(new java.awt.Dimension(550, 250));
        lbl_QuestionContent.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jpn_Bg.add(lbl_QuestionContent);
        lbl_QuestionContent.setBounds(290, 200, 610, 210);

        lbl_Answer_A.setBackground(new java.awt.Color(255, 0, 0));
        lbl_Answer_A.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbl_Answer_A.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Answer_A.setText("Answers A");
        lbl_Answer_A.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        lbl_Answer_A.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lbl_Answer_A.setMaximumSize(new java.awt.Dimension(520, 60));
        lbl_Answer_A.setMinimumSize(new java.awt.Dimension(520, 60));
        lbl_Answer_A.setPreferredSize(new java.awt.Dimension(520, 60));
        jpn_Bg.add(lbl_Answer_A);
        lbl_Answer_A.setBounds(350, 420, 550, 60);

        lbl_Answer_B.setBackground(new java.awt.Color(255, 0, 0));
        lbl_Answer_B.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbl_Answer_B.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Answer_B.setText("Answers B");
        lbl_Answer_B.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        lbl_Answer_B.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lbl_Answer_B.setMaximumSize(new java.awt.Dimension(520, 60));
        lbl_Answer_B.setMinimumSize(new java.awt.Dimension(520, 60));
        lbl_Answer_B.setPreferredSize(new java.awt.Dimension(520, 60));
        jpn_Bg.add(lbl_Answer_B);
        lbl_Answer_B.setBounds(350, 490, 550, 60);

        lbl_Answer_C.setBackground(new java.awt.Color(255, 0, 0));
        lbl_Answer_C.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbl_Answer_C.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Answer_C.setText("Answers C");
        lbl_Answer_C.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        lbl_Answer_C.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lbl_Answer_C.setMaximumSize(new java.awt.Dimension(520, 60));
        lbl_Answer_C.setMinimumSize(new java.awt.Dimension(520, 60));
        lbl_Answer_C.setPreferredSize(new java.awt.Dimension(520, 60));
        jpn_Bg.add(lbl_Answer_C);
        lbl_Answer_C.setBounds(350, 560, 550, 60);

        lbl_Answer_D.setBackground(new java.awt.Color(255, 0, 0));
        lbl_Answer_D.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbl_Answer_D.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Answer_D.setText("Answers D");
        lbl_Answer_D.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        lbl_Answer_D.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lbl_Answer_D.setMaximumSize(new java.awt.Dimension(520, 60));
        lbl_Answer_D.setMinimumSize(new java.awt.Dimension(520, 60));
        lbl_Answer_D.setPreferredSize(new java.awt.Dimension(520, 60));
        jpn_Bg.add(lbl_Answer_D);
        lbl_Answer_D.setBounds(350, 630, 550, 60);

        Group_Answers.add(jrb_A);
        jrb_A.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jrb_A.setForeground(new java.awt.Color(255, 255, 255));
        jrb_A.setText("A");
        jrb_A.setBorder(new javax.swing.border.MatteBorder(null));
        jrb_A.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrb_A.setMaximumSize(new java.awt.Dimension(250, 60));
        jrb_A.setMinimumSize(new java.awt.Dimension(250, 60));
        jrb_A.setPreferredSize(new java.awt.Dimension(250, 60));
        jrb_A.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jrb_AMousePressed(evt);
            }
        });
        jpn_Bg.add(jrb_A);
        jrb_A.setBounds(290, 420, 60, 60);

        Group_Answers.add(jrb_B);
        jrb_B.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jrb_B.setForeground(new java.awt.Color(255, 255, 255));
        jrb_B.setText("B");
        jrb_B.setBorder(new javax.swing.border.MatteBorder(null));
        jrb_B.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrb_B.setMaximumSize(new java.awt.Dimension(250, 60));
        jrb_B.setMinimumSize(new java.awt.Dimension(250, 60));
        jrb_B.setPreferredSize(new java.awt.Dimension(250, 60));
        jrb_B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jrb_BMousePressed(evt);
            }
        });
        jpn_Bg.add(jrb_B);
        jrb_B.setBounds(290, 490, 60, 60);

        Group_Answers.add(jrb_C);
        jrb_C.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jrb_C.setForeground(new java.awt.Color(255, 255, 255));
        jrb_C.setText("C");
        jrb_C.setBorder(new javax.swing.border.MatteBorder(null));
        jrb_C.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrb_C.setMaximumSize(new java.awt.Dimension(250, 60));
        jrb_C.setMinimumSize(new java.awt.Dimension(250, 60));
        jrb_C.setPreferredSize(new java.awt.Dimension(250, 60));
        jrb_C.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jrb_CMousePressed(evt);
            }
        });
        jpn_Bg.add(jrb_C);
        jrb_C.setBounds(290, 560, 60, 60);

        Group_Answers.add(jrb_D);
        jrb_D.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jrb_D.setForeground(new java.awt.Color(255, 255, 255));
        jrb_D.setText("D");
        jrb_D.setBorder(new javax.swing.border.MatteBorder(null));
        jrb_D.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrb_D.setMaximumSize(new java.awt.Dimension(250, 60));
        jrb_D.setMinimumSize(new java.awt.Dimension(250, 60));
        jrb_D.setPreferredSize(new java.awt.Dimension(250, 60));
        jrb_D.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jrb_DMousePressed(evt);
            }
        });
        jpn_Bg.add(jrb_D);
        jrb_D.setBounds(290, 630, 60, 60);

        lbl_comitQuestion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/kbc_logo(160x160).png"))); // NOI18N
        lbl_comitQuestion.setToolTipText("Click here to Comit Answer");
        lbl_comitQuestion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_comitQuestionMouseClicked(evt);
            }
        });
        jpn_Bg.add(lbl_comitQuestion);
        lbl_comitQuestion.setBounds(80, 370, 150, 140);

        lbl_Time.setBackground(new java.awt.Color(51, 51, 255));
        lbl_Time.setFont(new java.awt.Font("Quartz", 1, 100)); // NOI18N
        lbl_Time.setForeground(new java.awt.Color(204, 0, 0));
        lbl_Time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Time.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl_Time.setOpaque(true);
        jpn_Bg.add(lbl_Time);
        lbl_Time.setBounds(70, 550, 170, 110);

        lbl_QuestionNumber.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        lbl_QuestionNumber.setForeground(new java.awt.Color(255, 255, 255));
        lbl_QuestionNumber.setText("Question   :");
        lbl_QuestionNumber.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lbl_QuestionNumber.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lbl_QuestionNumber.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lbl_QuestionNumber.setMaximumSize(new java.awt.Dimension(550, 250));
        lbl_QuestionNumber.setMinimumSize(new java.awt.Dimension(550, 250));
        lbl_QuestionNumber.setPreferredSize(new java.awt.Dimension(550, 250));
        lbl_QuestionNumber.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jpn_Bg.add(lbl_QuestionNumber);
        lbl_QuestionNumber.setBounds(290, 160, 610, 30);

        lbl_ChangeQuestion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_ChangeQuestion.setForeground(new java.awt.Color(255, 255, 255));
        lbl_ChangeQuestion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_ChangeQuestion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/change_70px_white.png"))); // NOI18N
        lbl_ChangeQuestion.setText("CHANGE");
        lbl_ChangeQuestion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        lbl_ChangeQuestion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl_ChangeQuestion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lbl_ChangeQuestion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_ChangeQuestionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_ChangeQuestionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_ChangeQuestionMouseExited(evt);
            }
        });
        jpn_Bg.add(lbl_ChangeQuestion);
        lbl_ChangeQuestion.setBounds(360, 30, 100, 100);

        lbl_FiftyPercent.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_FiftyPercent.setForeground(new java.awt.Color(255, 255, 255));
        lbl_FiftyPercent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_FiftyPercent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/invisible_64px_white.png"))); // NOI18N
        lbl_FiftyPercent.setText("50 : 50");
        lbl_FiftyPercent.setToolTipText("");
        lbl_FiftyPercent.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        lbl_FiftyPercent.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl_FiftyPercent.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lbl_FiftyPercent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_FiftyPercentMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_FiftyPercentMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_FiftyPercentMouseExited(evt);
            }
        });
        jpn_Bg.add(lbl_FiftyPercent);
        lbl_FiftyPercent.setBounds(540, 30, 100, 100);

        lbl_TwiceAnswer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_TwiceAnswer.setForeground(new java.awt.Color(255, 255, 255));
        lbl_TwiceAnswer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_TwiceAnswer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/2_70px_white.png"))); // NOI18N
        lbl_TwiceAnswer.setText("TWICE");
        lbl_TwiceAnswer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        lbl_TwiceAnswer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl_TwiceAnswer.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lbl_TwiceAnswer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_TwiceAnswerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_TwiceAnswerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_TwiceAnswerMouseExited(evt);
            }
        });
        jpn_Bg.add(lbl_TwiceAnswer);
        lbl_TwiceAnswer.setBounds(720, 30, 100, 100);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clickhere.gif"))); // NOI18N
        jLabel1.setOpaque(true);
        jpn_Bg.add(jLabel1);
        jLabel1.setBounds(40, 340, 220, 30);

        lbl_Member.setBackground(new java.awt.Color(51, 51, 255));
        lbl_Member.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbl_Member.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Member.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Member.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/circled_user_100px_white.png"))); // NOI18N
        lbl_Member.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl_Member.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jpn_Bg.add(lbl_Member);
        lbl_Member.setBounds(10, 140, 180, 180);

        getContentPane().add(jpn_Bg);
        jpn_Bg.setBounds(0, -30, 1100, 760);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jpn_BgMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpn_BgMousePressed
        // TODO add your handling code here:
        new Drag(jpn_Bg).onPress(evt);
    }//GEN-LAST:event_jpn_BgMousePressed

    private void jpn_BgMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpn_BgMouseDragged
        // TODO add your handling code here:
        new Drag(jpn_Bg).moveWindow(evt);
    }//GEN-LAST:event_jpn_BgMouseDragged

    // Walk Away--------------------------------------------------------------
    private void btn_WalkAwayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_WalkAwayActionPerformed
        // TODO add your handling code here:
        T.stop();
        if (JOptionPane.showConfirmDialog(rootPane, "Do you want Walk away?","Warning: Walk Away?",0) == 0) 
        {
            
            rightAnswer = String.valueOf(callQuestion) + "A";
            finalResult = rightAnswer;
            
            
            if (member.getUser_HighestScore() < prize.getPrize(finalResult)) {
                member.setUser_HighestScore(prize.getPrize(finalResult));
            }
            JOptionPane.showMessageDialog(null, "You have: $" + prize.getPrize(finalResult));
            member.setUser_NumberOfAttendance(prize.getPrize(finalResult));
            
//            metBeforeQuestionID += " "+ String.valueOf(callQuestion);
//            member.setUser_MetBeforeQuestionID(metBeforeQuestionID);
            
            this.dispose();
            if (member == null) {
                new UserRewardGUI().setVisible(true);
            } else {
                new UserRewardGUI(member).setVisible(true);
            }
        } else T.start();
    }//GEN-LAST:event_btn_WalkAwayActionPerformed

    // Count time for each question------------------------------------------
    Timer T = new Timer(1000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            count--;
            if (count >= 0) {
                lbl_Time.setText("" + count);
            } else {
                T.stop();
                rightAnswer = String.valueOf(callQuestion) + "M";  //Miss ----
                finalResult = rightAnswer;
                if (member.getUser_HighestScore() < prize.getPrize(finalResult)) {
                    member.setUser_HighestScore(prize.getPrize(finalResult));
                }
                JOptionPane.showMessageDialog(null, "Time up! The end..\nYou have: $" + prize.getPrize(finalResult));
                member.setUser_NumberOfAttendance(prize.getPrize(finalResult));
                
//                metBeforeQuestionID += " "+ String.valueOf(callQuestion);
//                member.setUser_MetBeforeQuestionID(metBeforeQuestionID);

                if (member == null) {
                    new UserRewardGUI().setVisible(true);
                } else {
                    new UserRewardGUI(member).setVisible(true);
                }
            }
        }
    });
    //------------------------------------------------------------------------

    // Click on LOGO : show question--------------------------------------
    private void lbl_comitQuestionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_comitQuestionMouseClicked

        //Compare answer question
        //-------------------------------------------------------------------
        if (callQuestion == 1) 
        {

            //-----------------------------------------------------------------
            String answer = "";

            if (jrb_A.isSelected() == false && jrb_B.isSelected() == false
                    && jrb_C.isSelected() == false && jrb_D.isSelected() == false) 
            {

                JOptionPane.showMessageDialog(null, "Please choose 1 Answer!");
            } 
            else 
            {
                //Gan ket qua answer---------------------------------------------------
                if (jrb_A.isSelected() == true) 
                {
                    answer = "A";
                }
                if (jrb_B.isSelected() == true) 
                {
                    answer = "B";
                }
                if (jrb_C.isSelected() == true) 
                {
                    answer = "C";
                }
                if (jrb_D.isSelected() == true) 
                {
                    answer = "D";
                }
                //Check---------------------
//                JOptionPane.showMessageDialog(null, ""+questionList.get(callQuestion - 1).getQuestion_RightAnswer());

                //---------------------------------------------------------------------
                //Compare right or wrong
                if (answer.equals(questionList.get(callQuestion - 1).getQuestion_RightAnswer())) 
                {
                    rightAnswer = String.valueOf(callQuestion) + "R";
                    finalResult = rightAnswer;
                    if (member.getUser_HighestScore() < prize.getPrize(finalResult)) 
                    {
                        member.setUser_HighestScore(prize.getPrize(finalResult));
                    }
                    
                    setLevelHighlight(callQuestion);
                    
                    //Change 3 chuc nang------------------------
                    if (changeQuestion == 2) changeQuestion = 1;
                    if (fiftyPercent == 2)  fiftyPercent = 1;
                    if (twiceAnswer == 2)  twiceAnswer = 1;
                    //------------------------------------------
                    
                    callQuestion++;
                    
                    T.stop();
                    JOptionPane.showMessageDialog(null, answer + " is Right answer! \nClick OK to be continue.."); //check
                    nextQuestion();
                } 
                else 
                {
                    T.stop();
                    rightAnswer = String.valueOf(callQuestion) + "W";
                    finalResult = rightAnswer;
                    if (member.getUser_HighestScore() < prize.getPrize(finalResult)) 
                    {
                        member.setUser_HighestScore(prize.getPrize(finalResult));
                    }
                    JOptionPane.showMessageDialog(null, "Wrong answer!\nYou have: $" + prize.getPrize(finalResult));
                    
                    member.setUser_NumberOfAttendance(prize.getPrize(finalResult));

                    this.dispose();
                    
                    if (member == null) 
                    {
                        new UserRewardGUI().setVisible(true);
                    } 
                    else 
                    {
                        new UserRewardGUI(member).setVisible(true);
                    }
                }
            }

        } 
        else 
//-----------------------------------------------------------------------------
        if (callQuestion > 1 && callQuestion < 13 && rightAnswer != "") 
        {

            String answer = "";

            //---------------------------------------------------------------------
            if (jrb_A.isSelected() == false && jrb_B.isSelected() == false
                    && jrb_C.isSelected() == false && jrb_D.isSelected() == false) 
            {

                JOptionPane.showMessageDialog(null, "Please choose 1 Answer!");
            } 
            else 
            {
                //Gan ket qua answer---------------------------------------------------
                if (jrb_A.isSelected() == true) 
                {
                    answer = "A";
                }
                if (jrb_B.isSelected() == true) 
                {
                    answer = "B";
                }
                if (jrb_C.isSelected() == true) 
                {
                    answer = "C";
                }
                if (jrb_D.isSelected() == true) 
                {
                    answer = "D";
                }

                //---------------------------------------------------------------------  
                //Compare right or wrong
                if (answer.equals(questionList.get(callQuestion - 1).getQuestion_RightAnswer())) 
                {
                    rightAnswer = String.valueOf(callQuestion) + "R";
                    finalResult = rightAnswer;
                    if (member.getUser_HighestScore() < prize.getPrize(finalResult)) 
                    {
                        member.setUser_HighestScore(prize.getPrize(finalResult));
                    }
                    
                    setLevelHighlight(callQuestion);
                    
                    //Change 3 chuc nang------------------------
                    if (changeQuestion == 2) changeQuestion = 1;
                    if (fiftyPercent == 2)  fiftyPercent = 1;
                    if (twiceAnswer == 2)  twiceAnswer = 1;
                    //------------------------------------------
                    
                    callQuestion++;
                    
                    T.stop();
                    JOptionPane.showMessageDialog(null, answer + " is Right answer! \nClick OK to be continue.."); //check
                    nextQuestion();
                } 
                else 
                {
                    T.stop();
                    rightAnswer = String.valueOf(callQuestion) + "W";
                    finalResult = rightAnswer;
                    if (member.getUser_HighestScore() < prize.getPrize(finalResult)) 
                    {
                        member.setUser_HighestScore(prize.getPrize(finalResult));
                    }
                    
                    JOptionPane.showMessageDialog(null, "Wrong answer!\nYou have: $" + prize.getPrize(finalResult));
                    
                    member.setUser_NumberOfAttendance(prize.getPrize(finalResult));

                    this.dispose();
                    
                    if (member == null) 
                    {
                        new UserRewardGUI().setVisible(true);
                    } 
                    else 
                    {
                        new UserRewardGUI(member).setVisible(true);
                    }
                }
            }
        } 
        else 
//-----------------------------------------------------------------
        if (callQuestion == 13) 
        {
            String answer = "";

            //---------------------------------------------------------------------
            if (jrb_A.isSelected() == false && jrb_B.isSelected() == false
                    && jrb_C.isSelected() == false && jrb_D.isSelected() == false) 
            {

                JOptionPane.showMessageDialog(null, "Please choose 1 Answer!");
            } 
            else
            {
            //---------------------------------------------------------------------
            if (jrb_A.isSelected() == false && jrb_B.isSelected() == false
                    && jrb_C.isSelected() == false && jrb_D.isSelected() == false) 
            {
                JOptionPane.showMessageDialog(null, "Please choose 1 Answer!");
            } 
            else 
            {
                //Gan ket qua answer-----------------------------------------------
                if (jrb_A.isSelected() == true) 
                {
                    answer = "A";
                }
                if (jrb_B.isSelected() == true) 
                {
                    answer = "B";
                }
                if (jrb_C.isSelected() == true) 
                {
                    answer = "C";
                }
                if (jrb_D.isSelected() == true) 
                {
                    answer = "D";
                }

                //---------------------------------------------------------------------
                //Compare right or wrong
                if (answer.equals(questionList.get(callQuestion - 1).getQuestion_RightAnswer())) 
                {
                    rightAnswer = String.valueOf(callQuestion) + "R";
                    finalResult = rightAnswer;
                    if (member.getUser_HighestScore() < prize.getPrize(finalResult)) 
                    {
                        member.setUser_HighestScore(prize.getPrize(finalResult));
                    }
                    
                    setLevelHighlight(callQuestion);
                    
                    T.stop();
                    JOptionPane.showMessageDialog(null, answer + " is Right answer! \n"
                            + "You have Highest Reward: $" + prize.getPrize(finalResult)); //check

                    member.setUser_HighestScore(prize.getPrize(finalResult));
                    member.setUser_NumberOfAttendance(prize.getPrize(finalResult));

                    this.dispose();
                    
                    if (member == null) 
                    {
                        new UserRewardGUI().setVisible(true);
                    } 
                    else 
                    {
                        new UserRewardGUI(member).setVisible(true);
                    }
                } 
                else 
                {
                    T.stop();
                    rightAnswer = String.valueOf(callQuestion) + "W";
                    finalResult = rightAnswer;
                    if (member.getUser_HighestScore() < prize.getPrize(finalResult)) 
                    {
                        member.setUser_HighestScore(prize.getPrize(finalResult));
                    }
                    JOptionPane.showMessageDialog(null, "Wrong answer!\nYou have: $" + prize.getPrize(finalResult));
                    
                    member.setUser_NumberOfAttendance(prize.getPrize(finalResult));

                    this.dispose();
                    
                    if (member == null) 
                    {
                        new UserRewardGUI().setVisible(true);
                    } 
                    else 
                    {
                        new UserRewardGUI(member).setVisible(true);
                    }
                }
            }
            
        } 

            
            if (callQuestion > 13) 
            {
                JOptionPane.showMessageDialog(null, "This is the Highest question!");
            } 

        }
    }//GEN-LAST:event_lbl_comitQuestionMouseClicked

    private void lbl_ChangeQuestionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_ChangeQuestionMouseEntered
        // TODO add your handling code here:
        if (changeQuestion == 1) {
            lbl_ChangeQuestion.setIcon(new ImageIcon("D:\\APTECH\\KBC_QUIZ\\src\\icons\\change_70px_red.png"));
        }
    }//GEN-LAST:event_lbl_ChangeQuestionMouseEntered

    private void lbl_ChangeQuestionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_ChangeQuestionMouseExited
        // TODO add your handling code here:
        if (changeQuestion == 1) {
            lbl_ChangeQuestion.setIcon(new ImageIcon("D:\\APTECH\\KBC_QUIZ\\src\\icons\\change_70px_white.png"));
        }
    }//GEN-LAST:event_lbl_ChangeQuestionMouseExited

    //Change question----------------------------------------
    private void lbl_ChangeQuestionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_ChangeQuestionMouseClicked
        // TODO add your handling code here:
        if (changeQuestion == 1) 
        {
            lbl_ChangeQuestion.setIcon(new ImageIcon("D:\\APTECH\\KBC_QUIZ\\src\\icons\\Xchange_70px_white.png"));
            if (JOptionPane.showConfirmDialog(null, "You choose Change current question?", "Warning", 0)==0)
            {
            
            
            lbl_Answer_A.setOpaque(false); lbl_Answer_A.repaint();
            lbl_Answer_B.setOpaque(false); lbl_Answer_B.repaint();
            lbl_Answer_C.setOpaque(false); lbl_Answer_C.repaint();
            lbl_Answer_D.setOpaque(false); lbl_Answer_D.repaint();
            
            changeQuestion = 0;
            if (fiftyPercent == 1) fiftyPercent = 2;
            if (twiceAnswer == 1) twiceAnswer = 2;
            
            
            
            //Change current question----------------------------------
            questionList.set(callQuestion-1, questionList.get(13));
            //----------------------------------------------------------------
            lbl_QuestionNumber.setText("Question " + callQuestion + ": \n");
//            lbl_QuestionContent.setText(questionList.get(13).getQuestion_Content());
            lbl_QuestionContent.setText("<html> "+questionList.get(callQuestion-1).getQuestion_Content()+"</html>");
            lbl_Answer_A.setText(questionList.get(callQuestion).getQuestion_ChoiceA());
            lbl_Answer_B.setText(questionList.get(callQuestion).getQuestion_ChoiceB());
            lbl_Answer_C.setText(questionList.get(callQuestion).getQuestion_ChoiceC());
            lbl_Answer_D.setText(questionList.get(callQuestion).getQuestion_ChoiceD());

            //----------------------------------------------------------------
            } 
        }
        else {
                JOptionPane.showMessageDialog(null, "You can't use!");
             }
    }//GEN-LAST:event_lbl_ChangeQuestionMouseClicked

    private void lbl_FiftyPercentMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_FiftyPercentMouseEntered
        // TODO add your handling code here:
        if (fiftyPercent == 1) {
            lbl_FiftyPercent.setIcon(new ImageIcon("D:\\APTECH\\KBC_QUIZ\\src\\icons\\invisible_64px_red.png"));
        }
    }//GEN-LAST:event_lbl_FiftyPercentMouseEntered

    private void lbl_FiftyPercentMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_FiftyPercentMouseExited
        // TODO add your handling code here:
        if (fiftyPercent == 1) {
            lbl_FiftyPercent.setIcon(new ImageIcon("D:\\APTECH\\KBC_QUIZ\\src\\icons\\invisible_64px_white.png"));
        }
    }//GEN-LAST:event_lbl_FiftyPercentMouseExited

    //FiftyPercent--------------------------------------------
    private void lbl_FiftyPercentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_FiftyPercentMouseClicked
        // TODO add your handling code here:
        if (fiftyPercent == 1) 
        {
                lbl_FiftyPercent.setIcon(new ImageIcon("D:\\APTECH\\KBC_QUIZ\\src\\icons\\Xinvisible_64px_white.png"));
        
            if (JOptionPane.showConfirmDialog(null, "You choose 50:50?", "Warning", 0)==0)
            {
                fiftyPercent = 0;
                if (changeQuestion == 1) changeQuestion = 2;
                if (twiceAnswer == 1) twiceAnswer = 2;


                String right = questionList.get(callQuestion - 1).getQuestion_RightAnswer();
                switch (right)
                {
                    case "A": 
                    {
                        lbl_Answer_B.setText("");
                        lbl_Answer_C.setText("");
                        break;
                    }
                    case "B": 
                    {
                        lbl_Answer_C.setText("");
                        lbl_Answer_D.setText("");
                        break;
                    }
                    case "C": 
                    {
                        lbl_Answer_D.setText("");
                        lbl_Answer_A.setText("");
                        break;
                    }
                    case "D": 
                    {
                        lbl_Answer_A.setText("");
                        lbl_Answer_B.setText("");
                        break;
                    }
                }
            } 
        }
        else {
                JOptionPane.showMessageDialog(null, "You can't use!");
             }
    }//GEN-LAST:event_lbl_FiftyPercentMouseClicked

    private void lbl_TwiceAnswerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_TwiceAnswerMouseEntered
        // TODO add your handling code here:
        if (twiceAnswer == 1) {
            lbl_TwiceAnswer.setIcon(new ImageIcon("D:\\APTECH\\KBC_QUIZ\\src\\icons\\2_70px_red.png"));
        }
    }//GEN-LAST:event_lbl_TwiceAnswerMouseEntered

    private void lbl_TwiceAnswerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_TwiceAnswerMouseExited
        // TODO add your handling code here:
        if (twiceAnswer == 1) {
            lbl_TwiceAnswer.setIcon(new ImageIcon("D:\\APTECH\\KBC_QUIZ\\src\\icons\\2_70px_white.png"));
        }
    }//GEN-LAST:event_lbl_TwiceAnswerMouseExited

    //TwiceAnswer---------------------------------------------
    private void lbl_TwiceAnswerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_TwiceAnswerMouseClicked
        // TODO add your handling code here:
        if (twiceAnswer == 1) 
            {
                lbl_TwiceAnswer.setIcon(new ImageIcon("D:\\APTECH\\KBC_QUIZ\\src\\icons\\X2_70px_white.png"));
                if (jrb_A.isSelected() == false && jrb_B.isSelected() == false
                        && jrb_C.isSelected() == false && jrb_D.isSelected() == false) 
                {

                    JOptionPane.showMessageDialog(null, "Please choose 1 Answer!");
                } 
                else
        if (JOptionPane.showConfirmDialog(null, "You choose Twice Answer?", "Warning", 0)==0)
        {
                String answer = "";

                //---------------------------------------------------------------------
                 
                {
                    twiceAnswer = 0;
                    if (changeQuestion == 1) changeQuestion = 2;
                    if (fiftyPercent == 1) fiftyPercent = 2;

                    //Gan ket qua answer---------------------------------------------------
                    if (jrb_A.isSelected() == true) 
                    {
                        answer = "A";
                    }
                    if (jrb_B.isSelected() == true) 
                    {
                        answer = "B";
                    }
                    if (jrb_C.isSelected() == true) 
                    {
                        answer = "C";
                    }
                    if (jrb_D.isSelected() == true) 
                    {
                        answer = "D";
                    }

                    if (!(answer.equals(questionList.get(callQuestion - 1).getQuestion_RightAnswer()))) 
                    {
                        JOptionPane.showMessageDialog(null, "Wrong answer!\nYou can choose one time...Again!");
                    }
                }    

            } 
        }
        else 
            {
                    JOptionPane.showMessageDialog(null, "You can't use!");
            }
    }//GEN-LAST:event_lbl_TwiceAnswerMouseClicked

    // Highlight Answer--------------------------------------------
    private void jrb_AMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrb_AMousePressed
        // TODO add your handling code here:
        lbl_Answer_A.setOpaque(true); lbl_Answer_A.repaint();
        
        lbl_Answer_B.setOpaque(false); lbl_Answer_B.repaint();
        lbl_Answer_C.setOpaque(false); lbl_Answer_C.repaint();
        lbl_Answer_D.setOpaque(false); lbl_Answer_D.repaint();
    }//GEN-LAST:event_jrb_AMousePressed

    private void jrb_BMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrb_BMousePressed
        // TODO add your handling code here:
        lbl_Answer_B.setOpaque(true); lbl_Answer_B.repaint();
        
        lbl_Answer_A.setOpaque(false); lbl_Answer_A.repaint();
        lbl_Answer_C.setOpaque(false); lbl_Answer_C.repaint();
        lbl_Answer_D.setOpaque(false); lbl_Answer_D.repaint();
    }//GEN-LAST:event_jrb_BMousePressed

    private void jrb_CMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrb_CMousePressed
        // TODO add your handling code here:
        lbl_Answer_C.setOpaque(true); lbl_Answer_C.repaint();
        
        lbl_Answer_A.setOpaque(false); lbl_Answer_A.repaint();
        lbl_Answer_B.setOpaque(false); lbl_Answer_B.repaint();
        lbl_Answer_D.setOpaque(false); lbl_Answer_D.repaint();
    }//GEN-LAST:event_jrb_CMousePressed

    private void jrb_DMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrb_DMousePressed
        // TODO add your handling code here:
        lbl_Answer_D.setOpaque(true); lbl_Answer_D.repaint();
        
        lbl_Answer_A.setOpaque(false); lbl_Answer_A.repaint();
        lbl_Answer_C.setOpaque(false); lbl_Answer_C.repaint();
        lbl_Answer_B.setOpaque(false); lbl_Answer_B.repaint();
    }//GEN-LAST:event_jrb_DMousePressed

    // Method display highlight at Level------------------------------------------------
    public void setLevelHighlight(int level) 
    {
        
        switch (level) {
            case 1: {
                lbl_Level01.setOpaque(true);
                lbl_Level02.setOpaque(false);
                lbl_Level03.setOpaque(false);
                lbl_Level04.setOpaque(false);
                lbl_Level05.setOpaque(false);
                lbl_Level06.setOpaque(false);
                lbl_Level07.setOpaque(false);
                lbl_Level08.setOpaque(false);
                lbl_Level09.setOpaque(false);
                lbl_Level10.setOpaque(false);
                lbl_Level11.setOpaque(false);
                lbl_Level12.setOpaque(false);
                lbl_Level13.setOpaque(false);
            }
            break;
            case 2: {
                lbl_Level01.setOpaque(false);
                lbl_Level02.setOpaque(true);
                lbl_Level03.setOpaque(false);
                lbl_Level04.setOpaque(false);
                lbl_Level05.setOpaque(false);
                lbl_Level06.setOpaque(false);
                lbl_Level07.setOpaque(false);
                lbl_Level08.setOpaque(false);
                lbl_Level09.setOpaque(false);
                lbl_Level10.setOpaque(false);
                lbl_Level11.setOpaque(false);
                lbl_Level12.setOpaque(false);
                lbl_Level13.setOpaque(false);
            }
            break;
            case 3: {
                lbl_Level01.setOpaque(false);
                lbl_Level02.setOpaque(false);
                lbl_Level03.setOpaque(true);
                lbl_Level04.setOpaque(false);
                lbl_Level05.setOpaque(false);
                lbl_Level06.setOpaque(false);
                lbl_Level07.setOpaque(false);
                lbl_Level08.setOpaque(false);
                lbl_Level09.setOpaque(false);
                lbl_Level10.setOpaque(false);
                lbl_Level11.setOpaque(false);
                lbl_Level12.setOpaque(false);
                lbl_Level13.setOpaque(false);
            }
            break;
            case 4: {
                lbl_Level01.setOpaque(false);
                lbl_Level02.setOpaque(false);
                lbl_Level03.setOpaque(false);
                lbl_Level04.setOpaque(true);
                lbl_Level05.setOpaque(false);
                lbl_Level06.setOpaque(false);
                lbl_Level07.setOpaque(false);
                lbl_Level08.setOpaque(false);
                lbl_Level09.setOpaque(false);
                lbl_Level10.setOpaque(false);
                lbl_Level11.setOpaque(false);
                lbl_Level12.setOpaque(false);
                lbl_Level13.setOpaque(false);
            }
            break;
            case 5: {
                lbl_Level01.setOpaque(false);
                lbl_Level02.setOpaque(false);
                lbl_Level03.setOpaque(false);
                lbl_Level04.setOpaque(false);
                lbl_Level05.setOpaque(true);
                lbl_Level06.setOpaque(false);
                lbl_Level07.setOpaque(false);
                lbl_Level08.setOpaque(false);
                lbl_Level09.setOpaque(false);
                lbl_Level10.setOpaque(false);
                lbl_Level11.setOpaque(false);
                lbl_Level12.setOpaque(false);
                lbl_Level13.setOpaque(false);
            }
            break;
            case 6: {
                lbl_Level01.setOpaque(false);
                lbl_Level02.setOpaque(false);
                lbl_Level03.setOpaque(false);
                lbl_Level04.setOpaque(false);
                lbl_Level05.setOpaque(false);
                lbl_Level06.setOpaque(true);
                lbl_Level07.setOpaque(false);
                lbl_Level08.setOpaque(false);
                lbl_Level09.setOpaque(false);
                lbl_Level10.setOpaque(false);
                lbl_Level11.setOpaque(false);
                lbl_Level12.setOpaque(false);
                lbl_Level13.setOpaque(false);
            }
            break;
            case 7: {
                lbl_Level01.setOpaque(false);
                lbl_Level02.setOpaque(false);
                lbl_Level03.setOpaque(false);
                lbl_Level04.setOpaque(false);
                lbl_Level05.setOpaque(false);
                lbl_Level06.setOpaque(false);
                lbl_Level07.setOpaque(true);
                lbl_Level08.setOpaque(false);
                lbl_Level09.setOpaque(false);
                lbl_Level10.setOpaque(false);
                lbl_Level11.setOpaque(false);
                lbl_Level12.setOpaque(false);
                lbl_Level13.setOpaque(false);
            }
            break;
            case 8: {
                lbl_Level01.setOpaque(false);
                lbl_Level02.setOpaque(false);
                lbl_Level03.setOpaque(false);
                lbl_Level04.setOpaque(false);
                lbl_Level05.setOpaque(false);
                lbl_Level06.setOpaque(false);
                lbl_Level07.setOpaque(false);
                lbl_Level08.setOpaque(true);
                lbl_Level09.setOpaque(false);
                lbl_Level10.setOpaque(false);
                lbl_Level11.setOpaque(false);
                lbl_Level12.setOpaque(false);
                lbl_Level13.setOpaque(false);
            }
            break;
            case 9: {
                lbl_Level01.setOpaque(false);
                lbl_Level02.setOpaque(false);
                lbl_Level03.setOpaque(false);
                lbl_Level04.setOpaque(false);
                lbl_Level05.setOpaque(false);
                lbl_Level06.setOpaque(false);
                lbl_Level07.setOpaque(false);
                lbl_Level08.setOpaque(false);
                lbl_Level09.setOpaque(true);
                lbl_Level10.setOpaque(false);
                lbl_Level11.setOpaque(false);
                lbl_Level12.setOpaque(false);
                lbl_Level13.setOpaque(false);
            }
            break;
            case 10: {
                lbl_Level01.setOpaque(false);
                lbl_Level02.setOpaque(false);
                lbl_Level03.setOpaque(false);
                lbl_Level04.setOpaque(false);
                lbl_Level05.setOpaque(false);
                lbl_Level06.setOpaque(false);
                lbl_Level07.setOpaque(false);
                lbl_Level08.setOpaque(false);
                lbl_Level09.setOpaque(false);
                lbl_Level10.setOpaque(true);
                lbl_Level11.setOpaque(false);
                lbl_Level12.setOpaque(false);
                lbl_Level13.setOpaque(false);
            }
            break;
            case 11: {
                lbl_Level01.setOpaque(false);
                lbl_Level02.setOpaque(false);
                lbl_Level03.setOpaque(false);
                lbl_Level04.setOpaque(false);
                lbl_Level05.setOpaque(false);
                lbl_Level06.setOpaque(false);
                lbl_Level07.setOpaque(false);
                lbl_Level08.setOpaque(false);
                lbl_Level09.setOpaque(false);
                lbl_Level10.setOpaque(false);
                lbl_Level11.setOpaque(true);
                lbl_Level12.setOpaque(false);
                lbl_Level13.setOpaque(false);
            }
            break;
            case 12: {
                lbl_Level01.setOpaque(false);
                lbl_Level02.setOpaque(false);
                lbl_Level03.setOpaque(false);
                lbl_Level04.setOpaque(false);
                lbl_Level05.setOpaque(false);
                lbl_Level06.setOpaque(false);
                lbl_Level07.setOpaque(false);
                lbl_Level08.setOpaque(false);
                lbl_Level09.setOpaque(false);
                lbl_Level10.setOpaque(false);
                lbl_Level11.setOpaque(false);
                lbl_Level12.setOpaque(true);
                lbl_Level13.setOpaque(false);
            }
            break;
            case 13: {
                lbl_Level01.setOpaque(false);
                lbl_Level02.setOpaque(false);
                lbl_Level03.setOpaque(false);
                lbl_Level04.setOpaque(false);
                lbl_Level05.setOpaque(false);
                lbl_Level06.setOpaque(false);
                lbl_Level07.setOpaque(false);
                lbl_Level08.setOpaque(false);
                lbl_Level09.setOpaque(false);
                lbl_Level10.setOpaque(false);
                lbl_Level11.setOpaque(false);
                lbl_Level12.setOpaque(false);
                lbl_Level13.setOpaque(true);
            }
            break;
        }
        pnl_Levels.repaint();
    }
    //------------------------------------------------------------------------

    // Method fill next Question-------------------------------------------------
    public void nextQuestion() 
    {
        if (callQuestion > 1 && callQuestion < 13 && rightAnswer != "") 
        {
            T.stop();
            lbl_Time.setText("");
            Group_Answers.clearSelection();
            
            lbl_Answer_A.setOpaque(false); lbl_Answer_A.repaint();
            lbl_Answer_B.setOpaque(false); lbl_Answer_B.repaint();
            lbl_Answer_C.setOpaque(false); lbl_Answer_C.repaint();
            lbl_Answer_D.setOpaque(false); lbl_Answer_D.repaint();

            lbl_QuestionNumber.setText("Question " + callQuestion + ": \n");
//            lbl_QuestionContent.setText(questionList.get(callQuestion - 1).getQuestion_Content());
            lbl_QuestionContent.setText("<html> "+questionList.get(callQuestion - 1).getQuestion_Content()+"</html>");
            lbl_Answer_A.setText(questionList.get(callQuestion - 1).getQuestion_ChoiceA());
            lbl_Answer_B.setText(questionList.get(callQuestion - 1).getQuestion_ChoiceB());
            lbl_Answer_C.setText(questionList.get(callQuestion - 1).getQuestion_ChoiceC());
            lbl_Answer_D.setText(questionList.get(callQuestion - 1).getQuestion_ChoiceD());

            count = minute * 60;
            T.start();
        }
        else
            if (callQuestion == 13) 
                {
                    T.stop();
                    if (JOptionPane.showConfirmDialog(null, "Do you want continue to Level 13! Continue?")==0)
                    {
                        lbl_Time.setText("");
                        Group_Answers.clearSelection();
                        
                        lbl_Answer_A.setOpaque(false); lbl_Answer_A.repaint();
                        lbl_Answer_B.setOpaque(false); lbl_Answer_B.repaint();
                        lbl_Answer_C.setOpaque(false); lbl_Answer_C.repaint();
                        lbl_Answer_D.setOpaque(false); lbl_Answer_D.repaint();

                        lbl_QuestionNumber.setText("Question " + callQuestion + ": \n");
//                        lbl_QuestionContent.setText(questionList.get(callQuestion - 1).getQuestion_Content());
                        lbl_QuestionContent.setText("<html> "+questionList.get(callQuestion - 1).getQuestion_Content()+"</html>");
                        lbl_Answer_A.setText(questionList.get(callQuestion - 1).getQuestion_ChoiceA());
                        lbl_Answer_B.setText(questionList.get(callQuestion - 1).getQuestion_ChoiceB());
                        lbl_Answer_C.setText(questionList.get(callQuestion - 1).getQuestion_ChoiceC());
                        lbl_Answer_D.setText(questionList.get(callQuestion - 1).getQuestion_ChoiceD());

                        count = minute * 60;
                        T.start();
                    }
                    else
                    {
                        T.stop();
                        rightAnswer = String.valueOf(callQuestion-1) + "R";
                        finalResult = rightAnswer;
                        if (member.getUser_HighestScore() < prize.getPrize(finalResult)) 
                        {
                            member.setUser_HighestScore(prize.getPrize(finalResult));
                        }
                        JOptionPane.showMessageDialog(null, "You Stop at Level 12!\n"
                                            + "You have: $" + prize.getPrize(finalResult));
                        member.setUser_NumberOfAttendance(prize.getPrize(finalResult));
                        this.dispose();
                        if (member == null) {
                            new UserRewardGUI().setVisible(true);
                        } else {
                            new UserRewardGUI(member).setVisible(true);
                        }
                    }
                }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PlayingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlayingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlayingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlayingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //TIMER BEGIN COUNTDOWN
//        timerCountdown(3, 100);
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlayingGUI().setVisible(true);
            }
        });
    }

    public static void timerCountdown(int minuteDown, int delay, boolean listen) {

        //-----------------------------------------------------
        //Timer run
//        t= new Timer(delay, new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                    for (int a = 1; a<=minuteDown*60; a++){
//                        timeCircle.countDown(a, minuteDown);
//                        timeCircle.repaint();
//                    }
//                }
//        });
//        if (listen == true){
//            t.start();
//        }
//        else {
//            t.restart();
//        }
        //---------------------------------------------
        //Thread run
//        Thread th1 = new Thread(){
//            @Override
//            public void run() {
//                try {
////                    for (int a = 1; a <= minuteDown * 60; a++) {
////                        Thread.sleep(delay);
////                        timeCircle.countDown(a, minuteDown);
////                        timeCircle.repaint();
////                    }
//                    
//                    int a = 1;
//                    while(a <= minuteDown * 60){
//                        Thread.sleep(delay);
//                        timeCircle.countDown(a, minuteDown);
//                        timeCircle.repaint();
//                        if (listen == true){
//                            a++;
//                        }
//                        else {
//                            a=minuteDown * 60;
//                            break;
//                        }
//                    }
//                        
//                }                  
//                    
//                catch (InterruptedException ex) {
//                    
//                }
//            }
//            
//        };
//        if (listen == true){
//            th1.start();
//        }
//        else {
//            th1.interrupt();
//        }
        //---------------------------------------------------    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Group_Answers;
    private javax.swing.JLabel Levels;
    private javax.swing.JToggleButton btn_WalkAway;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jpn_Bg;
    private javax.swing.JRadioButton jrb_A;
    private javax.swing.JRadioButton jrb_B;
    private javax.swing.JRadioButton jrb_C;
    private javax.swing.JRadioButton jrb_D;
    private javax.swing.JLabel lbl_Answer_A;
    private javax.swing.JLabel lbl_Answer_B;
    private javax.swing.JLabel lbl_Answer_C;
    private javax.swing.JLabel lbl_Answer_D;
    private javax.swing.JLabel lbl_ChangeQuestion;
    private javax.swing.JLabel lbl_FiftyPercent;
    private javax.swing.JLabel lbl_Level01;
    private javax.swing.JLabel lbl_Level02;
    private javax.swing.JLabel lbl_Level03;
    private javax.swing.JLabel lbl_Level04;
    private javax.swing.JLabel lbl_Level05;
    private javax.swing.JLabel lbl_Level06;
    private javax.swing.JLabel lbl_Level07;
    private javax.swing.JLabel lbl_Level08;
    private javax.swing.JLabel lbl_Level09;
    private javax.swing.JLabel lbl_Level10;
    private javax.swing.JLabel lbl_Level11;
    private javax.swing.JLabel lbl_Level12;
    private javax.swing.JLabel lbl_Level13;
    private javax.swing.JLabel lbl_Logo;
    private javax.swing.JLabel lbl_Member;
    private javax.swing.JLabel lbl_QuestionContent;
    private javax.swing.JLabel lbl_QuestionNumber;
    private javax.swing.JLabel lbl_Time;
    private javax.swing.JLabel lbl_TwiceAnswer;
    private javax.swing.JLabel lbl_comitQuestion;
    private keeptoo.KGradientPanel pnl_Levels;
    // End of variables declaration//GEN-END:variables

}
