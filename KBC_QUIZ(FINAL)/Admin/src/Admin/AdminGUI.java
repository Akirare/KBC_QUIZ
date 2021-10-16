/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import Models.AdminAccount;
import Models.Question;
import Models.UserAccount;
import Server.Controller.ServerDAO;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import keeptoo.Drag;

/**
 *
 * @author MyPC
 */
public class AdminGUI extends javax.swing.JFrame {

    /**
     * Creates new form AdminGUI
     */
    
    AdminAccount adminLogIn;
    UserAccount member;
    
    Question question;
    ServerDAO dao;
    ArrayList<Question> questionList = new ArrayList<Question>();
    
    public AdminGUI() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public AdminGUI(AdminAccount admin) {
        initComponents();
        setLocationRelativeTo(null);
        this.adminLogIn = admin;
        pnl_QuestionManage.setVisible(true);pnl_QuestionManage.repaint();
        pnl_UserManage.setVisible(false);pnl_UserManage.repaint();
        btn_QuestionManage.setSelected(true);btn_QuestionManage.repaint();
        btn_UserManage.setSelected(false);btn_UserManage.repaint();
        
        // Invisible all panel------------------------
        
        pnl_ViewQuestion.setVisible(false);pnl_ViewQuestion.repaint();
        pnl_AddQuestion.setVisible(false);pnl_AddQuestion.repaint();
        pnl_EditQuestion.setVisible(false);pnl_EditQuestion.repaint();
        
        //--------------------------------------------
        
        // Set Value panel--------------------------------------------
        viewQuestions();
        editQuestions();
        
        //------------------------------------------------------------
    }
    
    public void viewQuestions()
    {
//        prizeList = new ArrayList<Prize>();
        dao = new ServerDAO();
        questionList = dao.getQuestions();
        
        DefaultTableModel tblModel = (DefaultTableModel)tbl_ViewQuestions.getModel();
        
        //set Alignment Column
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        tbl_ViewQuestions.setShowGrid(true);
        int column = 9;
        for (int c = 0; c<column;c++){
        tbl_ViewQuestions.getColumnModel().getColumn(c).setCellRenderer(centerRenderer);
        }
        
        Object[] row = new Object[column];
        for(int i=0;i<questionList.size();i++){
            
            row[0]=questionList.get(i).getQuestion_ID();
            row[1]=questionList.get(i).getQuestion_DifficultyLevel();
            row[2]=questionList.get(i).getQuestion_Topic();
            row[3]=questionList.get(i).getQuestion_Content();
            row[4]=questionList.get(i).getQuestion_ChoiceA();
            row[5]=questionList.get(i).getQuestion_ChoiceB();
            row[6]=questionList.get(i).getQuestion_ChoiceC();
            row[7]=questionList.get(i).getQuestion_ChoiceD();
            row[8]=questionList.get(i).getQuestion_RightAnswer();
            
            tblModel.addRow(row);
        }
    }
    
    // table Edit question--------------------------------------------
    public void editQuestions()
    {
        dao = new ServerDAO();
        questionList = dao.getQuestions();
        
        DefaultTableModel tblModel = (DefaultTableModel)tbl_EditQuestions.getModel();
        
        //set Alignment Column
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        tbl_EditQuestions.setShowGrid(true);
        int column = 9;
        for (int c = 0; c<column;c++){
        tbl_EditQuestions.getColumnModel().getColumn(c).setCellRenderer(centerRenderer);
        }
        
        Object[] row = new Object[column];
        for(int i=0;i<questionList.size();i++){
            
            row[0]=questionList.get(i).getQuestion_ID();
            row[1]=questionList.get(i).getQuestion_DifficultyLevel();
            row[2]=questionList.get(i).getQuestion_Topic();
            row[3]=questionList.get(i).getQuestion_Content();
            row[4]=questionList.get(i).getQuestion_ChoiceA();
            row[5]=questionList.get(i).getQuestion_ChoiceB();
            row[6]=questionList.get(i).getQuestion_ChoiceC();
            row[7]=questionList.get(i).getQuestion_ChoiceD();
            row[8]=questionList.get(i).getQuestion_RightAnswer();
            
            tblModel.addRow(row);
        }
    }
    //------------------------------------------------------------------

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Group_Top = new javax.swing.ButtonGroup();
        Group_QuestionManage = new javax.swing.ButtonGroup();
        pnl_Title = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        lbl_Close = new javax.swing.JLabel();
        pnl_Background = new keeptoo.KGradientPanel();
        pnl_Top = new javax.swing.JPanel();
        btn_UserManage = new javax.swing.JToggleButton();
        btn_QuestionManage = new javax.swing.JToggleButton();
        pnl_QuestionManage = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btn_AddQuestion = new javax.swing.JToggleButton();
        btn_EditQuestion = new javax.swing.JToggleButton();
        btn_ViewQuestion = new javax.swing.JToggleButton();
        pnl_AddQuestion = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jcb_Difficulty = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jcb_Topic = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_AnswerA = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txt_ContentQuestion = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txt_AnswerB = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txt_AnswerC = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txt_AnswerD = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        btn_AddNewQuestion = new javax.swing.JButton();
        btn_ResetFields = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jcb_RightAnswer = new javax.swing.JComboBox<>();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        pnl_ViewQuestion = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_ViewQuestions = new javax.swing.JTable();
        pnl_EditQuestion = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tbl_EditQuestions = new javax.swing.JTable();
        jScrollPane9 = new javax.swing.JScrollPane();
        txt_editContent = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        txt_editAnswerD = new javax.swing.JTextArea();
        jScrollPane11 = new javax.swing.JScrollPane();
        txt_editAnswerA = new javax.swing.JTextArea();
        jScrollPane12 = new javax.swing.JScrollPane();
        txt_editAnswerB = new javax.swing.JTextArea();
        jScrollPane13 = new javax.swing.JScrollPane();
        txt_editAnswerC = new javax.swing.JTextArea();
        btn_Save = new javax.swing.JButton();
        btn_editClear = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jcb_editDifficulty = new javax.swing.JComboBox<>();
        jcb_editTopic = new javax.swing.JComboBox<>();
        jcb_editRightAnswer = new javax.swing.JComboBox<>();
        btn_editClear1 = new javax.swing.JButton();
        pnl_UserManage = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lbl_userUserName = new javax.swing.JLabel();
        btn_SearchUser = new javax.swing.JButton();
        jSeparator12 = new javax.swing.JSeparator();
        txt_searchUserName = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        lbl_userFullName = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        lbl_userEmail = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        lbl_userAddress = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        lbl_userPhone = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        jLabel33 = new javax.swing.JLabel();
        lbl_userLastPrize = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        lbl_userHighestPrize = new javax.swing.JLabel();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        jSeparator16 = new javax.swing.JSeparator();
        jSeparator17 = new javax.swing.JSeparator();
        jSeparator18 = new javax.swing.JSeparator();
        jSeparator19 = new javax.swing.JSeparator();
        jSeparator20 = new javax.swing.JSeparator();
        jSeparator21 = new javax.swing.JSeparator();
        jSeparator22 = new javax.swing.JSeparator();
        jLabel26 = new javax.swing.JLabel();
        lbl_userUserID = new javax.swing.JLabel();
        jSeparator23 = new javax.swing.JSeparator();
        lbl_Logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(860, 560));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_Title.setkBorderRadius(0);
        pnl_Title.setkEndColor(new java.awt.Color(0, 0, 102));
        pnl_Title.setkGradientFocus(200);
        pnl_Title.setkStartColor(new java.awt.Color(0, 0, 255));
        pnl_Title.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/edit_property_64px_white.png"))); // NOI18N
        jLabel1.setText("ADMINISTRATOR");
        pnl_Title.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 50));

        lbl_Close.setBackground(new java.awt.Color(0, 0, 255));
        lbl_Close.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbl_Close.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Close.setText("x");
        lbl_Close.setOpaque(true);
        lbl_Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_CloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_CloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_CloseMouseExited(evt);
            }
        });
        pnl_Title.add(lbl_Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 0, 50, 50));

        getContentPane().add(pnl_Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 50));

        pnl_Background.setkEndColor(new java.awt.Color(0, 0, 102));
        pnl_Background.setkStartColor(new java.awt.Color(0, 0, 255));
        pnl_Background.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnl_BackgroundMouseDragged(evt);
            }
        });
        pnl_Background.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnl_BackgroundMousePressed(evt);
            }
        });
        pnl_Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_Top.setOpaque(false);
        pnl_Top.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_UserManage.setBackground(new java.awt.Color(0, 0, 255));
        Group_Top.add(btn_UserManage);
        btn_UserManage.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_UserManage.setForeground(new java.awt.Color(255, 255, 255));
        btn_UserManage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/edit_user_male_50px_white.png"))); // NOI18N
        btn_UserManage.setText("Manage Users");
        btn_UserManage.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/edit_user_male_50px_red.png"))); // NOI18N
        btn_UserManage.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/edit_user_male_50px_red.png"))); // NOI18N
        btn_UserManage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_UserManageMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_UserManageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_UserManageMouseExited(evt);
            }
        });
        pnl_Top.add(btn_UserManage, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 260, 50));

        btn_QuestionManage.setBackground(new java.awt.Color(0, 0, 255));
        Group_Top.add(btn_QuestionManage);
        btn_QuestionManage.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_QuestionManage.setForeground(new java.awt.Color(255, 255, 255));
        btn_QuestionManage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/administrative_tools_50px_white.png"))); // NOI18N
        btn_QuestionManage.setText("Manage Questions");
        btn_QuestionManage.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/administrative_tools_50px_red.png"))); // NOI18N
        btn_QuestionManage.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/administrative_tools_50px_red.png"))); // NOI18N
        btn_QuestionManage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_QuestionManageMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_QuestionManageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_QuestionManageMouseExited(evt);
            }
        });
        pnl_Top.add(btn_QuestionManage, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 260, 50));

        pnl_Background.add(pnl_Top, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 840, 70));

        pnl_QuestionManage.setBackground(new java.awt.Color(0, 0, 255));
        pnl_QuestionManage.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.darkGray, null, java.awt.Color.darkGray));
        pnl_QuestionManage.setForeground(new java.awt.Color(255, 255, 255));
        pnl_QuestionManage.setMaximumSize(new java.awt.Dimension(840, 410));
        pnl_QuestionManage.setMinimumSize(new java.awt.Dimension(840, 410));
        pnl_QuestionManage.setOpaque(false);
        pnl_QuestionManage.setPreferredSize(new java.awt.Dimension(840, 410));
        pnl_QuestionManage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Question Managing..");
        pnl_QuestionManage.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 30));
        pnl_QuestionManage.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 150, 10));

        btn_AddQuestion.setBackground(new java.awt.Color(0, 0, 255));
        Group_QuestionManage.add(btn_AddQuestion);
        btn_AddQuestion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_AddQuestion.setForeground(new java.awt.Color(255, 255, 255));
        btn_AddQuestion.setText("ADD question");
        btn_AddQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddQuestionActionPerformed(evt);
            }
        });
        pnl_QuestionManage.add(btn_AddQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        btn_EditQuestion.setBackground(new java.awt.Color(0, 0, 255));
        Group_QuestionManage.add(btn_EditQuestion);
        btn_EditQuestion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_EditQuestion.setForeground(new java.awt.Color(255, 255, 255));
        btn_EditQuestion.setText("EDIT question");
        btn_EditQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditQuestionActionPerformed(evt);
            }
        });
        pnl_QuestionManage.add(btn_EditQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, -1, -1));

        btn_ViewQuestion.setBackground(new java.awt.Color(0, 0, 255));
        Group_QuestionManage.add(btn_ViewQuestion);
        btn_ViewQuestion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_ViewQuestion.setForeground(new java.awt.Color(255, 255, 255));
        btn_ViewQuestion.setText("VIEW question");
        btn_ViewQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ViewQuestionActionPerformed(evt);
            }
        });
        pnl_QuestionManage.add(btn_ViewQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, -1, -1));

        pnl_AddQuestion.setBackground(new java.awt.Color(0, 0, 255));
        pnl_AddQuestion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        pnl_AddQuestion.setForeground(new java.awt.Color(255, 255, 255));
        pnl_AddQuestion.setMaximumSize(new java.awt.Dimension(820, 360));
        pnl_AddQuestion.setMinimumSize(new java.awt.Dimension(820, 360));
        pnl_AddQuestion.setPreferredSize(new java.awt.Dimension(820, 360));
        pnl_AddQuestion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(0, 0, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Answer (A):");
        pnl_AddQuestion.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 80, 20));

        jcb_Difficulty.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcb_Difficulty.setMaximumRowCount(4);
        jcb_Difficulty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        pnl_AddQuestion.add(jcb_Difficulty, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 50, 30));

        jLabel6.setBackground(new java.awt.Color(0, 0, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Topic:");
        pnl_AddQuestion.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 70, 20));

        jcb_Topic.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jcb_Topic.setMaximumRowCount(4);
        jcb_Topic.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Other", "Environmental Protection", "Traffic Safety" }));
        pnl_AddQuestion.add(jcb_Topic, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 200, 30));

        txt_AnswerA.setColumns(20);
        txt_AnswerA.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        txt_AnswerA.setLineWrap(true);
        txt_AnswerA.setRows(2);
        txt_AnswerA.setTabSize(0);
        txt_AnswerA.setNextFocusableComponent(txt_AnswerB);
        jScrollPane2.setViewportView(txt_AnswerA);

        pnl_AddQuestion.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 390, 40));

        jLabel7.setBackground(new java.awt.Color(0, 0, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Difficulty:");
        pnl_AddQuestion.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 70, 20));

        jLabel8.setBackground(new java.awt.Color(0, 0, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Content:");
        pnl_AddQuestion.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 70, 20));

        txt_ContentQuestion.setColumns(20);
        txt_ContentQuestion.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        txt_ContentQuestion.setLineWrap(true);
        txt_ContentQuestion.setRows(6);
        txt_ContentQuestion.setTabSize(0);
        txt_ContentQuestion.setNextFocusableComponent(txt_AnswerA);
        jScrollPane3.setViewportView(txt_ContentQuestion);

        pnl_AddQuestion.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 500, 130));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add_rule_70px_white.png"))); // NOI18N
        pnl_AddQuestion.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 80, 90));

        txt_AnswerB.setColumns(20);
        txt_AnswerB.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        txt_AnswerB.setLineWrap(true);
        txt_AnswerB.setRows(2);
        txt_AnswerB.setTabSize(0);
        txt_AnswerB.setNextFocusableComponent(txt_AnswerC);
        jScrollPane4.setViewportView(txt_AnswerB);

        pnl_AddQuestion.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 390, 40));

        jLabel10.setBackground(new java.awt.Color(0, 0, 255));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Answer (B):");
        pnl_AddQuestion.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 80, 20));

        txt_AnswerC.setColumns(20);
        txt_AnswerC.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        txt_AnswerC.setLineWrap(true);
        txt_AnswerC.setRows(2);
        txt_AnswerC.setTabSize(0);
        txt_AnswerC.setNextFocusableComponent(txt_AnswerD);
        jScrollPane5.setViewportView(txt_AnswerC);

        pnl_AddQuestion.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 390, 40));

        jLabel11.setBackground(new java.awt.Color(0, 0, 255));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Answer (C):");
        pnl_AddQuestion.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 80, 20));

        txt_AnswerD.setColumns(20);
        txt_AnswerD.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        txt_AnswerD.setLineWrap(true);
        txt_AnswerD.setRows(2);
        txt_AnswerD.setTabSize(0);
        txt_AnswerD.setNextFocusableComponent(jcb_RightAnswer);
        jScrollPane6.setViewportView(txt_AnswerD);

        pnl_AddQuestion.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 390, 40));

        jLabel12.setBackground(new java.awt.Color(0, 0, 255));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Answer (D):");
        pnl_AddQuestion.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 80, 20));

        btn_AddNewQuestion.setBackground(new java.awt.Color(0, 0, 255));
        btn_AddNewQuestion.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_AddNewQuestion.setForeground(new java.awt.Color(255, 255, 255));
        btn_AddNewQuestion.setText("ADD");
        btn_AddNewQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddNewQuestionActionPerformed(evt);
            }
        });
        pnl_AddQuestion.add(btn_AddNewQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 210, 160, 50));

        btn_ResetFields.setBackground(new java.awt.Color(0, 0, 255));
        btn_ResetFields.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_ResetFields.setForeground(new java.awt.Color(255, 255, 255));
        btn_ResetFields.setText("clear");
        btn_ResetFields.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ResetFieldsActionPerformed(evt);
            }
        });
        pnl_AddQuestion.add(btn_ResetFields, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 290, 120, 30));

        jLabel13.setBackground(new java.awt.Color(0, 0, 255));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Right Answer");
        pnl_AddQuestion.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, 90, 20));

        jcb_RightAnswer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcb_RightAnswer.setMaximumRowCount(4);
        jcb_RightAnswer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---", "A", "B", "C", "D" }));
        pnl_AddQuestion.add(jcb_RightAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, 50, 30));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        pnl_AddQuestion.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 70, 10));

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        pnl_AddQuestion.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 80, 20));

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        pnl_AddQuestion.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, 90, 20));

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        pnl_AddQuestion.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 50, 20));

        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));
        pnl_AddQuestion.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 80, 20));

        jSeparator8.setForeground(new java.awt.Color(255, 255, 255));
        pnl_AddQuestion.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 80, 20));

        jSeparator9.setForeground(new java.awt.Color(255, 255, 255));
        pnl_AddQuestion.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 80, 20));

        jSeparator10.setForeground(new java.awt.Color(255, 255, 255));
        pnl_AddQuestion.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 80, 20));

        jSeparator11.setForeground(new java.awt.Color(255, 255, 255));
        pnl_AddQuestion.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 180, 10));

        jLabel14.setBackground(new java.awt.Color(0, 0, 255));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Add new question..");
        pnl_AddQuestion.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 150, 20));

        pnl_QuestionManage.add(pnl_AddQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 820, 360));

        pnl_ViewQuestion.setBackground(new java.awt.Color(0, 0, 255));
        pnl_ViewQuestion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        pnl_ViewQuestion.setForeground(new java.awt.Color(255, 255, 255));
        pnl_ViewQuestion.setMaximumSize(new java.awt.Dimension(820, 360));
        pnl_ViewQuestion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_ViewQuestions.setBackground(new java.awt.Color(0, 0, 255));
        tbl_ViewQuestions.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tbl_ViewQuestions.setForeground(new java.awt.Color(255, 255, 255));
        tbl_ViewQuestions.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Difficulty", "Topic", "Content question", "(A) Answer", "(B) Answer", "(C) Answer", "(D) Answer", "(Right)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_ViewQuestions.setGridColor(new java.awt.Color(255, 255, 255));
        tbl_ViewQuestions.getTableHeader().setResizingAllowed(false);
        tbl_ViewQuestions.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbl_ViewQuestions);

        pnl_ViewQuestion.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 360));

        pnl_QuestionManage.add(pnl_ViewQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 820, 360));

        pnl_EditQuestion.setBackground(new java.awt.Color(0, 0, 255));
        pnl_EditQuestion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        pnl_EditQuestion.setForeground(new java.awt.Color(255, 255, 255));
        pnl_EditQuestion.setMaximumSize(new java.awt.Dimension(820, 360));
        pnl_EditQuestion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_EditQuestions.setBackground(new java.awt.Color(0, 0, 255));
        tbl_EditQuestions.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tbl_EditQuestions.setForeground(new java.awt.Color(255, 255, 255));
        tbl_EditQuestions.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Difficulty", "Topic", "Content question", "(A) Answer", "(B) Answer", "(C) Answer", "(D) Answer", "(Right)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_EditQuestions.setGridColor(new java.awt.Color(255, 255, 255));
        tbl_EditQuestions.getTableHeader().setResizingAllowed(false);
        tbl_EditQuestions.getTableHeader().setReorderingAllowed(false);
        tbl_EditQuestions.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_EditQuestionsMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tbl_EditQuestions);

        pnl_EditQuestion.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 400, 350));

        txt_editContent.setColumns(20);
        txt_editContent.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_editContent.setLineWrap(true);
        txt_editContent.setRows(5);
        txt_editContent.setWrapStyleWord(true);
        jScrollPane9.setViewportView(txt_editContent);

        pnl_EditQuestion.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 310, 90));

        txt_editAnswerD.setColumns(20);
        txt_editAnswerD.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_editAnswerD.setLineWrap(true);
        txt_editAnswerD.setRows(5);
        jScrollPane10.setViewportView(txt_editAnswerD);

        pnl_EditQuestion.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 310, 40));

        txt_editAnswerA.setColumns(20);
        txt_editAnswerA.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_editAnswerA.setLineWrap(true);
        txt_editAnswerA.setRows(5);
        txt_editAnswerA.setWrapStyleWord(true);
        jScrollPane11.setViewportView(txt_editAnswerA);

        pnl_EditQuestion.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 310, 40));

        txt_editAnswerB.setColumns(20);
        txt_editAnswerB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_editAnswerB.setLineWrap(true);
        txt_editAnswerB.setRows(5);
        txt_editAnswerB.setWrapStyleWord(true);
        jScrollPane12.setViewportView(txt_editAnswerB);

        pnl_EditQuestion.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 310, 40));

        txt_editAnswerC.setColumns(20);
        txt_editAnswerC.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_editAnswerC.setLineWrap(true);
        txt_editAnswerC.setRows(5);
        txt_editAnswerC.setWrapStyleWord(true);
        jScrollPane13.setViewportView(txt_editAnswerC);

        pnl_EditQuestion.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 310, 40));

        btn_Save.setBackground(new java.awt.Color(0, 0, 255));
        btn_Save.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_Save.setForeground(new java.awt.Color(255, 255, 255));
        btn_Save.setText("SAVE");
        btn_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SaveActionPerformed(evt);
            }
        });
        pnl_EditQuestion.add(btn_Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 100, 30));

        btn_editClear.setBackground(new java.awt.Color(0, 0, 255));
        btn_editClear.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_editClear.setForeground(new java.awt.Color(255, 255, 255));
        btn_editClear.setText("clear");
        btn_editClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editClearActionPerformed(evt);
            }
        });
        pnl_EditQuestion.add(btn_editClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 70, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Right answer:");
        pnl_EditQuestion.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 80, 30));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Difficulty:");
        pnl_EditQuestion.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 60, 20));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Topic:");
        pnl_EditQuestion.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 40, 30));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Answer (A):");
        pnl_EditQuestion.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 70, 30));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Answer (B):");
        pnl_EditQuestion.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 70, 30));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Answer (C):");
        pnl_EditQuestion.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 70, 30));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Answer (D):");
        pnl_EditQuestion.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 70, 30));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Content:");
        pnl_EditQuestion.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 50, 30));

        jcb_editDifficulty.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jcb_editDifficulty.setMaximumRowCount(4);
        jcb_editDifficulty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        pnl_EditQuestion.add(jcb_editDifficulty, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 50, 20));

        jcb_editTopic.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jcb_editTopic.setMaximumRowCount(4);
        jcb_editTopic.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Other", "Environmental Protection", "Traffic Safety" }));
        pnl_EditQuestion.add(jcb_editTopic, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 180, 30));

        jcb_editRightAnswer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcb_editRightAnswer.setMaximumRowCount(4);
        jcb_editRightAnswer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D" }));
        pnl_EditQuestion.add(jcb_editRightAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 50, 30));

        btn_editClear1.setBackground(new java.awt.Color(0, 0, 255));
        btn_editClear1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_editClear1.setForeground(new java.awt.Color(255, 0, 0));
        btn_editClear1.setText("DELETE");
        btn_editClear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editClear1ActionPerformed(evt);
            }
        });
        pnl_EditQuestion.add(btn_editClear1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 90, 30));

        pnl_QuestionManage.add(pnl_EditQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 820, 360));

        pnl_Background.add(pnl_QuestionManage, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 840, 410));

        pnl_UserManage.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.darkGray, null, java.awt.Color.darkGray));
        pnl_UserManage.setMaximumSize(new java.awt.Dimension(840, 410));
        pnl_UserManage.setMinimumSize(new java.awt.Dimension(840, 410));
        pnl_UserManage.setOpaque(false);
        pnl_UserManage.setPreferredSize(new java.awt.Dimension(840, 410));
        pnl_UserManage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("UserAccount Viewing:");
        pnl_UserManage.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 30));
        pnl_UserManage.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 170, 10));

        lbl_userUserName.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lbl_userUserName.setForeground(new java.awt.Color(255, 255, 255));
        pnl_UserManage.add(lbl_userUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 190, 40));

        btn_SearchUser.setBackground(new java.awt.Color(0, 0, 255));
        btn_SearchUser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_SearchUser.setForeground(new java.awt.Color(255, 255, 255));
        btn_SearchUser.setText("Search");
        btn_SearchUser.setOpaque(false);
        btn_SearchUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SearchUserActionPerformed(evt);
            }
        });
        pnl_UserManage.add(btn_SearchUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 110, 30));

        jSeparator12.setOrientation(javax.swing.SwingConstants.VERTICAL);
        pnl_UserManage.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 30, 320));

        txt_searchUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_searchUserNameActionPerformed(evt);
            }
        });
        pnl_UserManage.add(txt_searchUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 170, 30));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("User name:");
        pnl_UserManage.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 90, 40));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("User name:");
        pnl_UserManage.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 80, 40));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Full name:");
        pnl_UserManage.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 80, 40));

        lbl_userFullName.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lbl_userFullName.setForeground(new java.awt.Color(255, 255, 255));
        pnl_UserManage.add(lbl_userFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 190, 40));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Email:");
        pnl_UserManage.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 80, 40));

        lbl_userEmail.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lbl_userEmail.setForeground(new java.awt.Color(255, 255, 255));
        pnl_UserManage.add(lbl_userEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 190, 40));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Address:");
        pnl_UserManage.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 80, 40));

        lbl_userAddress.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lbl_userAddress.setForeground(new java.awt.Color(255, 255, 255));
        pnl_UserManage.add(lbl_userAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 190, 40));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Phone");
        pnl_UserManage.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 80, 40));

        lbl_userPhone.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lbl_userPhone.setForeground(new java.awt.Color(255, 255, 255));
        pnl_UserManage.add(lbl_userPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 190, 40));

        jSeparator13.setOrientation(javax.swing.SwingConstants.VERTICAL);
        pnl_UserManage.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 30, 380));

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("Prize of last Playing");
        pnl_UserManage.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 50, 200, 50));

        lbl_userLastPrize.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_userLastPrize.setForeground(new java.awt.Color(255, 255, 255));
        lbl_userLastPrize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnl_UserManage.add(lbl_userLastPrize, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 280, 50));

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 0, 0));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("Highest Prize");
        pnl_UserManage.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, 250, 50));

        lbl_userHighestPrize.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lbl_userHighestPrize.setForeground(new java.awt.Color(255, 0, 0));
        lbl_userHighestPrize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnl_UserManage.add(lbl_userHighestPrize, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, 320, 50));
        pnl_UserManage.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 320, 20));
        pnl_UserManage.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 270, 20));
        pnl_UserManage.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 270, 20));
        pnl_UserManage.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 270, 20));
        pnl_UserManage.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 270, 20));
        pnl_UserManage.add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 270, 20));

        jSeparator20.setOrientation(javax.swing.SwingConstants.VERTICAL);
        pnl_UserManage.add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 190, 40, 140));
        pnl_UserManage.add(jSeparator21, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, 320, 20));

        jSeparator22.setOrientation(javax.swing.SwingConstants.VERTICAL);
        pnl_UserManage.add(jSeparator22, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 40, 140));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("User ID:");
        pnl_UserManage.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 80, 40));

        lbl_userUserID.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lbl_userUserID.setForeground(new java.awt.Color(255, 255, 255));
        pnl_UserManage.add(lbl_userUserID, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 80, 40));
        pnl_UserManage.add(jSeparator23, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 270, 20));

        pnl_Background.add(pnl_UserManage, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 840, 410));

        lbl_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/kbc_logo(160x160).png"))); // NOI18N
        pnl_Background.add(lbl_Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, -1, -1));
        lbl_Logo.getAccessibleContext().setAccessibleParent(pnl_Background);

        getContentPane().add(pnl_Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_CloseMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_lbl_CloseMouseClicked

    private void lbl_CloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_CloseMouseEntered
        // TODO add your handling code here:
        lbl_Close.setBackground(Color.red);
    }//GEN-LAST:event_lbl_CloseMouseEntered

    private void lbl_CloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_CloseMouseExited
        // TODO add your handling code here:
        lbl_Close.setBackground(Color.blue);
    }//GEN-LAST:event_lbl_CloseMouseExited

    private void pnl_BackgroundMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_BackgroundMousePressed
        // TODO add your handling code here:
        new Drag(rootPane).onPress(evt);
    }//GEN-LAST:event_pnl_BackgroundMousePressed

    private void pnl_BackgroundMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_BackgroundMouseDragged
        // TODO add your handling code here:
        new Drag(rootPane).moveWindow(evt);
    }//GEN-LAST:event_pnl_BackgroundMouseDragged

    private void btn_QuestionManageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_QuestionManageMouseEntered
        // TODO add your handling code here:
        btn_QuestionManage.setForeground(Color.red);
    }//GEN-LAST:event_btn_QuestionManageMouseEntered

    private void btn_QuestionManageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_QuestionManageMouseExited
        // TODO add your handling code here:
        if (!btn_QuestionManage.isSelected())
        {
            btn_QuestionManage.setForeground(Color.white);
        } 
    }//GEN-LAST:event_btn_QuestionManageMouseExited
   
    private void btn_UserManageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_UserManageMouseEntered
        // TODO add your handling code here:
        btn_UserManage.setForeground(Color.red);
    }//GEN-LAST:event_btn_UserManageMouseEntered

    private void btn_UserManageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_UserManageMouseExited
        // TODO add your handling code here:
        if (!btn_UserManage.isSelected())
        {
            btn_UserManage.setForeground(Color.white);
        }
    }//GEN-LAST:event_btn_UserManageMouseExited

    private void btn_QuestionManageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_QuestionManageMouseClicked
        // TODO add your handling code here:
        btn_UserManage.setForeground(Color.white);
        btn_UserManage.repaint();
        
        
        pnl_UserManage.setVisible(false);
        pnl_QuestionManage.setVisible(true);
        
        pnl_AddQuestion.setVisible(true);
        pnl_ViewQuestion.setVisible(false);
        pnl_EditQuestion.setVisible(false);
        
                
    }//GEN-LAST:event_btn_QuestionManageMouseClicked

    private void btn_UserManageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_UserManageMouseClicked
        // TODO add your handling code here:
        btn_QuestionManage.setForeground(Color.white);
        btn_QuestionManage.repaint();
        
        
        
        pnl_UserManage.setVisible(true);
        pnl_QuestionManage.setVisible(false);
        
        pnl_AddQuestion.setVisible(false);
        pnl_ViewQuestion.setVisible(false);
        pnl_EditQuestion.setVisible(false);
    }//GEN-LAST:event_btn_UserManageMouseClicked

    private void btn_ViewQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ViewQuestionActionPerformed
        // TODO add your handling code here:
        pnl_QuestionManage.setVisible(true);
        
        pnl_ViewQuestion.setVisible(true);
        DefaultTableModel viewModel = (DefaultTableModel)tbl_ViewQuestions.getModel();
        for (int r = 0; r <viewModel.getRowCount();r++)
        {
            viewModel.removeRow(r);
        }
        viewModel.setRowCount(0);
        viewQuestions();
        
        pnl_AddQuestion.setVisible(false);
        pnl_EditQuestion.setVisible(false);
        
    }//GEN-LAST:event_btn_ViewQuestionActionPerformed

    private void btn_AddQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddQuestionActionPerformed
        // TODO add your handling code here:
        pnl_QuestionManage.setVisible(true);
        
        pnl_ViewQuestion.setVisible(false);
        pnl_AddQuestion.setVisible(true);
        pnl_EditQuestion.setVisible(false);
        
    }//GEN-LAST:event_btn_AddQuestionActionPerformed

    private void btn_EditQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditQuestionActionPerformed
        // TODO add your handling code here:
        pnl_QuestionManage.setVisible(true);
        
        pnl_ViewQuestion.setVisible(false);
        pnl_AddQuestion.setVisible(false);
        pnl_EditQuestion.setVisible(true);
        DefaultTableModel editModel = (DefaultTableModel)tbl_EditQuestions.getModel();
        for (int r = 0; r < editModel.getRowCount();r++)
        {
            editModel.removeRow(r);
        }
        editModel.setRowCount(0);
        editQuestions();
        
        
    }//GEN-LAST:event_btn_EditQuestionActionPerformed

    private void btn_ResetFieldsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ResetFieldsActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(null, "Clear all, are you sure ? (Yes/No)","Warning", 0)==0)
        {
            jcb_Difficulty.setSelectedIndex(0);
            jcb_Topic.setSelectedIndex(0);
            txt_ContentQuestion.setText("");
            txt_AnswerA.setText("");
            txt_AnswerB.setText("");
            txt_AnswerC.setText("");
            txt_AnswerD.setText("");
            jcb_RightAnswer.setSelectedIndex(0);
        }
    }//GEN-LAST:event_btn_ResetFieldsActionPerformed

    // ADD question -------------------------------------------------------------
    private void btn_AddNewQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddNewQuestionActionPerformed
        // TODO add your handling code here:
        question = new Question();
        dao = new ServerDAO();
        
        if ( txt_ContentQuestion.getText().length()== 0 
                || txt_AnswerA.getText().length() == 0
                || txt_AnswerB.getText().length() == 0
                || txt_AnswerC.getText().length() == 0
                || txt_AnswerD.getText().length() == 0
                || "---".equals((String)jcb_RightAnswer.getSelectedItem()) )
        {
            JOptionPane.showMessageDialog(null, "Must fill all value!");
        }
        else
        {
            question.setQuestion_DifficultyLevel((String)jcb_Difficulty.getSelectedItem());
            question.setQuestion_Topic((String)jcb_Topic.getSelectedItem());
            question.setQuestion_Content(txt_ContentQuestion.getText());
            question.setQuestion_ChoiceA(txt_AnswerA.getText());
            question.setQuestion_ChoiceB(txt_AnswerB.getText());
            question.setQuestion_ChoiceC(txt_AnswerC.getText());
            question.setQuestion_ChoiceD(txt_AnswerD.getText());
            question.setQuestion_RightAnswer((String)jcb_RightAnswer.getSelectedItem());
            
            // INSERT INTO SQL-------------------------------
            if (dao.setQuestion(question))
            {
                JOptionPane.showMessageDialog(null, "Success ! Added 1 question..");
            }
            else JOptionPane.showMessageDialog(null, "Failed !");
            //-----------------------------------------------
        }
    }//GEN-LAST:event_btn_AddNewQuestionActionPerformed

    // Edit & Update question---------------------------------------------------
    private void tbl_EditQuestionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_EditQuestionsMouseClicked
        // TODO add your handling code here:
        int row = tbl_EditQuestions.getSelectedRow();
        TableModel editModel = tbl_EditQuestions.getModel();
        
        // Display Difficulty
        String editDifficulty = editModel.getValueAt(row, 1).toString();
        switch (editDifficulty)
        {
                case "0":
                    jcb_editDifficulty.setSelectedIndex(0);
                    break;
                case "1":
                    jcb_editDifficulty.setSelectedIndex(1);
                    break;
                case "2":
                    jcb_editDifficulty.setSelectedIndex(2);
                    break;
                case "3":
                    jcb_editDifficulty.setSelectedIndex(3);
                    break;
                case "4":
                    jcb_editDifficulty.setSelectedIndex(4);
                    break;
        }
        // Display Topic
        String editTopic = editModel.getValueAt(row, 2).toString();
        switch (editTopic)
        {
                case "Other":
                    jcb_editTopic.setSelectedIndex(0);
                    break;
                case "Environmental Protection":
                    jcb_editTopic.setSelectedIndex(1);
                    break;
                case "Traffic Safety":
                    jcb_editTopic.setSelectedIndex(2);
                    break;
        }
        
        txt_editContent.setText(editModel.getValueAt(row, 3).toString());
        txt_editAnswerA.setText(editModel.getValueAt(row, 4).toString());
        txt_editAnswerB.setText(editModel.getValueAt(row, 5).toString());
        txt_editAnswerC.setText(editModel.getValueAt(row, 6).toString());
        txt_editAnswerD.setText(editModel.getValueAt(row, 7).toString());
        
        // Display Right Answer
        String editRightAnswer = editModel.getValueAt(row, 8).toString();
        switch (editRightAnswer)
        {
                case "A":
                    jcb_editRightAnswer.setSelectedIndex(0);
                    break;
                case "B":
                    jcb_editRightAnswer.setSelectedIndex(1);
                    break;
                case "C":
                    jcb_editRightAnswer.setSelectedIndex(2);
                    break;
                case "D":
                    jcb_editRightAnswer.setSelectedIndex(3);
                    break;
        }
        
    }//GEN-LAST:event_tbl_EditQuestionsMouseClicked

    private void btn_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SaveActionPerformed
        // TODO add your handling code here:
        // Update Question-----------------------------------------------------
        question = new Question();
        dao = new ServerDAO();
        int row = tbl_EditQuestions.getSelectedRow();
        if (row != -1)
        {
            String questionID = tbl_EditQuestions.getModel().getValueAt(row, 0).toString();

            // Add object question--------------------------------------------------
            question.setQuestion_ID(Integer.parseInt(questionID));
            question.setQuestion_DifficultyLevel(jcb_editDifficulty.getSelectedItem().toString());
            question.setQuestion_Topic(jcb_editTopic.getSelectedItem().toString());
            question.setQuestion_Content(txt_editContent.getText());
            question.setQuestion_ChoiceA(txt_editAnswerA.getText());
            question.setQuestion_ChoiceB(txt_editAnswerB.getText());
            question.setQuestion_ChoiceC(txt_editAnswerC.getText());
            question.setQuestion_ChoiceD(txt_editAnswerD.getText());
            question.setQuestion_RightAnswer(jcb_editRightAnswer.getSelectedItem().toString());

            if (dao.saveQuestion(question))
            {
                JOptionPane.showMessageDialog(null, "Update Successfully!");
            }
            else JOptionPane.showMessageDialog(null, "Update Failed!");
            // Refresh Table--------------------------------------------------------------
            DefaultTableModel editModel = (DefaultTableModel)tbl_EditQuestions.getModel();
            for (int r = 0; r < editModel.getRowCount();r++)
            {
                editModel.removeRow(r);
            }
            editModel.setRowCount(0);
            editQuestions();
        }
        else JOptionPane.showMessageDialog(null, "Please select 1 row..");
        //---------------------------------------------------------------------
    }//GEN-LAST:event_btn_SaveActionPerformed

    private void btn_editClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editClearActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(null, "Clear all, are you sure ? (Yes/No)","Warning", 0) == 0)
        {
            jcb_editDifficulty.setSelectedIndex(0);
            jcb_editTopic.setSelectedIndex(0);
            txt_editContent.setText("");
            txt_editAnswerA.setText("");
            txt_editAnswerB.setText("");
            txt_editAnswerC.setText("");
            txt_editAnswerD.setText("");
            jcb_editRightAnswer.setSelectedIndex(0);
        }
    }//GEN-LAST:event_btn_editClearActionPerformed

    // Delete question selected------------------------------------------------
    private void btn_editClear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editClear1ActionPerformed
        // TODO add your handling code here:
        question = new Question();
        dao = new ServerDAO();
        int row = tbl_EditQuestions.getSelectedRow();
        
        if (JOptionPane.showConfirmDialog(null, "Delete 1 Question! Are you sure? (Yes/No)", "Warning", 0) == 0)
        {
            if (row != -1)
            {
                String questionID = tbl_EditQuestions.getModel().getValueAt(row, 0).toString();

                // Add object question--------------------------------------------------
                question.setQuestion_ID(Integer.parseInt(questionID));
                question.setQuestion_DifficultyLevel(jcb_editDifficulty.getSelectedItem().toString());
                question.setQuestion_Topic(jcb_editTopic.getSelectedItem().toString());
                question.setQuestion_Content(txt_editContent.getText());
                question.setQuestion_ChoiceA(txt_editAnswerA.getText());
                question.setQuestion_ChoiceB(txt_editAnswerB.getText());
                question.setQuestion_ChoiceC(txt_editAnswerC.getText());
                question.setQuestion_ChoiceD(txt_editAnswerD.getText());
                question.setQuestion_RightAnswer(jcb_editRightAnswer.getSelectedItem().toString());

                if (dao.deleteQuestion(question))
                {
                    JOptionPane.showMessageDialog(null, "Delete Successfully!");
                }
                else JOptionPane.showMessageDialog(null, "Delete Failed!");
                // Refresh Table--------------------------------------------------------------
                DefaultTableModel editModel = (DefaultTableModel)tbl_EditQuestions.getModel();
                for (int r = 0; r < editModel.getRowCount();r++)
                {
                    editModel.removeRow(r);
                }
                editModel.setRowCount(0);
                editQuestions();
            }
            else JOptionPane.showMessageDialog(null, "Please select 1 row..");
        }
    }//GEN-LAST:event_btn_editClear1ActionPerformed

    private void btn_SearchUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SearchUserActionPerformed
        // TODO add your handling code here:
        String userSearch = txt_searchUserName.getText();
        if (userSearch.length() == 0)
        {
            JOptionPane.showMessageDialog(null, "Enter username...");
        }
        else
            if (dao.queryAccount(userSearch))
            {
                UserAccount user = new UserAccount();
                user = dao.getInfo(userSearch);
                lbl_userUserID.setText(String.valueOf(user.getUser_ID()));
                lbl_userUserName.setText(user.getUser_Username());
                lbl_userFullName.setText(user.getUser_Fullname());
                lbl_userEmail.setText(user.getUser_Mail());
                lbl_userAddress.setText(user.getUser_Address());
                lbl_userPhone.setText(user.getUser_Phone());
                lbl_userLastPrize.setText(String.valueOf(user.getUser_NumberOfAttendance()));
                lbl_userHighestPrize.setText(String.valueOf(user.getUser_HighestScore()));
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Username does not exist..");
            }
        
        
    }//GEN-LAST:event_btn_SearchUserActionPerformed

    private void txt_searchUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_searchUserNameActionPerformed
        // TODO add your handling code here:
        btn_SearchUserActionPerformed(evt);
    }//GEN-LAST:event_txt_searchUserNameActionPerformed
    //---------------------------------------------------------------------------
    
    
    
    
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
            java.util.logging.Logger.getLogger(AdminGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Group_QuestionManage;
    private javax.swing.ButtonGroup Group_Top;
    private javax.swing.JButton btn_AddNewQuestion;
    private javax.swing.JToggleButton btn_AddQuestion;
    private javax.swing.JToggleButton btn_EditQuestion;
    private javax.swing.JToggleButton btn_QuestionManage;
    private javax.swing.JButton btn_ResetFields;
    private javax.swing.JButton btn_Save;
    private javax.swing.JButton btn_SearchUser;
    private javax.swing.JToggleButton btn_UserManage;
    private javax.swing.JToggleButton btn_ViewQuestion;
    private javax.swing.JButton btn_editClear;
    private javax.swing.JButton btn_editClear1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JComboBox<String> jcb_Difficulty;
    private javax.swing.JComboBox<String> jcb_RightAnswer;
    private javax.swing.JComboBox<String> jcb_Topic;
    private javax.swing.JComboBox<String> jcb_editDifficulty;
    private javax.swing.JComboBox<String> jcb_editRightAnswer;
    private javax.swing.JComboBox<String> jcb_editTopic;
    private javax.swing.JLabel lbl_Close;
    private javax.swing.JLabel lbl_Logo;
    private javax.swing.JLabel lbl_userAddress;
    private javax.swing.JLabel lbl_userEmail;
    private javax.swing.JLabel lbl_userFullName;
    private javax.swing.JLabel lbl_userHighestPrize;
    private javax.swing.JLabel lbl_userLastPrize;
    private javax.swing.JLabel lbl_userPhone;
    private javax.swing.JLabel lbl_userUserID;
    private javax.swing.JLabel lbl_userUserName;
    private javax.swing.JPanel pnl_AddQuestion;
    private keeptoo.KGradientPanel pnl_Background;
    private javax.swing.JPanel pnl_EditQuestion;
    private javax.swing.JPanel pnl_QuestionManage;
    private keeptoo.KGradientPanel pnl_Title;
    private javax.swing.JPanel pnl_Top;
    private javax.swing.JPanel pnl_UserManage;
    private javax.swing.JPanel pnl_ViewQuestion;
    private javax.swing.JTable tbl_EditQuestions;
    private javax.swing.JTable tbl_ViewQuestions;
    private javax.swing.JTextArea txt_AnswerA;
    private javax.swing.JTextArea txt_AnswerB;
    private javax.swing.JTextArea txt_AnswerC;
    private javax.swing.JTextArea txt_AnswerD;
    private javax.swing.JTextArea txt_ContentQuestion;
    private javax.swing.JTextArea txt_editAnswerA;
    private javax.swing.JTextArea txt_editAnswerB;
    private javax.swing.JTextArea txt_editAnswerC;
    private javax.swing.JTextArea txt_editAnswerD;
    private javax.swing.JTextArea txt_editContent;
    private javax.swing.JTextField txt_searchUserName;
    // End of variables declaration//GEN-END:variables
}
