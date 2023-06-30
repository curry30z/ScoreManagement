/*
 * Created by JFormDesigner on Fri Dec 30 12:03:22 CST 2022
 */

package Ui;

import javax.swing.event.*;
import Work.ListToArray;
import dao.SelectchoosecDao;
import model.ClassScore;
import model.CoursScore;
import model.User;

import java.awt.*;
import java.awt.event.*;
import java.util.List;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;
import javax.swing.table.*;

/**
 * @author 冉毓
 */
public class ScoreManage extends JFrame {



    public ScoreManage(User user) {

        this.loginuser=user;

        initComponents();


    }
    public ScoreManage() {
        initComponents();
    }

    private void button1MouseClicked(MouseEvent e) {

        String Sname=textField1.getText();


        SelectchoosecDao selectchoosecDao=new SelectchoosecDao();

        List<CoursScore> list=selectchoosecDao.selectName(Sname, loginuser.getuName());

                if(list==null||list.size()==0) {

                data=new Object[0][];
                JOptionPane.showMessageDialog(this.getContentPane(),"没有查到该数据");

                }else {
                    System.out.println("找到数据");
                    data = ListToArray.listToArrayWay(list);
                }
        table1.setModel(new DefaultTableModel(
               data,
               new String[] {
                      "\u59d3\u540d", "\u5b66\u53f7", "\u6210\u7ee9", "\u5f55\u5165\u65f6\u95f4", "\u8bfe\u7a0b\u540d\u79f0", "\u5b66\u5206"
               }
        ));




        // TODO add your code here
    }

    private void button2MouseClicked(MouseEvent e) {
        // TODO add your code here
        try{
        long sId= Long.parseLong(textField2.getText());
        String cId=textField4.getText();
        float score= Float.parseFloat(textField3.getText());
        if(score>=0&&score<=150) {
            SelectchoosecDao selectchoosecDao = new SelectchoosecDao();
            selectchoosecDao.updateScoreBysIdAndcId(sId, cId, score);
            data = new Object[0][];
            if (selectchoosecDao.selectupdateScore(sId, cId, loginuser.getuName()) == score) {
                JOptionPane.showMessageDialog(this.getContentPane(), "录入成功");
                table1.setModel(new DefaultTableModel(
                        data,
                        new String[]{
                                "\u59d3\u540d", "\u5b66\u53f7", "\u6210\u7ee9", "\u5f55\u5165\u65f6\u95f4", "\u8bfe\u7a0b\u540d\u79f0", "\u5b66\u5206"
                        }
                ));
            } else {
                JOptionPane.showMessageDialog(this.getContentPane(), "录入失败或录入无效");
            }
        }else{
            JOptionPane.showMessageDialog(this.getContentPane(), "录入成绩不在范围内");


        }
        }
        catch (NumberFormatException a){
            JOptionPane.showMessageDialog(this.getContentPane(),"数据输入有误");
            a.printStackTrace();


        }







    }

    private void cancelButtonMouseClicked(MouseEvent e) {
        // TODO add your code here

        System.exit(1);
    }

    private void menu2AncestorAdded(AncestorEvent e) {
        // TODO add your code here


    }

    private void menu3AncestorAdded(AncestorEvent e) {
        // TODO add your code here


    }

    private void menu2MouseClicked(MouseEvent e) {
        // TODO add your code here

    }

    private void menu9MouseClicked(MouseEvent e) {
        // TODO add your code here

        this.dispose();
        Login login = new Login();
    }

    private void menu8MouseClicked(MouseEvent e) {
        // TODO add your code here
        System.exit(1);
    }

    private void button3MouseClicked(MouseEvent e) {
        // TODO add your code here
        SelectchoosecDao selectchoosecDao=new SelectchoosecDao();
        String[] tableColumTitle = new String[]{"班级名称", "课程名称", "平均成绩"};
       List<ClassScore> list =  selectchoosecDao.getAllcalssAVG(loginuser.getuName());
        if(list==null||list.size()==0){
            data=new Object[0][];
            JOptionPane.showMessageDialog(this.getContentPane(),"没有查到该数据");

        }else {
            JOptionPane.showMessageDialog(this.getContentPane(),"查到该数据");
            data = ListToArray.listToArrayWay(list);
            table1.setModel(new DefaultTableModel(
                    data,tableColumTitle

            ));
            scrollPane1.setViewportView(table1);



        }






    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        textField1 = new JTextField();
        label2 = new JLabel();
        textField2 = new JTextField();
        label3 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();
        textField3 = new JTextField();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        label4 = new JLabel();
        label5 = new JLabel();
        label1 = new JLabel();
        textField4 = new JTextField();
        menuBar1 = new JMenuBar();
        menu7 = new JMenu();
        menu9 = new JMenu();
        menu8 = new JMenu();
        button3 = new JButton();
        buttonBar = new JPanel();
        okButton = new JButton();
        cancelButton = new JButton();

        //======== this ========
        setTitle("\u5b66\u751f\u6210\u7ee9\u7cfb\u7edf");
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {

                //---- label2 ----
                label2.setText("\u5b66\u53f7");
                label2.setFont(new Font("\u5b8b\u4f53", Font.PLAIN, 18));

                //---- label3 ----
                label3.setText("\u6210\u7ee9");
                label3.setFont(new Font("\u5b8b\u4f53", Font.PLAIN, 18));

                //---- button1 ----
                button1.setText("\u67e5\u8be2");
                button1.setFont(new Font("\u5b8b\u4f53", Font.PLAIN, 16));
                button1.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        button1MouseClicked(e);
                    }
                });

                //---- button2 ----
                button2.setText("\u6210\u7ee9\u5f55\u5165");
                button2.setFont(new Font("\u5b8b\u4f53", Font.PLAIN, 16));
                button2.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        button2MouseClicked(e);
                    }
                });

                //======== scrollPane1 ========
                {

                    //---- table1 ----
                    table1.setModel(new DefaultTableModel(
                        new Object[][] {
                            {null, null, null, null, null, null},
                        },
                        new String[] {
                            "\u59d3\u540d", "\u5b66\u53f7", "\u6210\u7ee9", "\u5f55\u5165\u65f6\u95f4", "\u8bfe\u7a0b\u540d\u79f0", "\u5b66\u5206"
                        }
                    ));
                    scrollPane1.setViewportView(table1);
                }

                //---- label4 ----
                label4.setText("\u5b66\u751f\u6210\u7ee9\u7ef4\u62a4");
                label4.setFont(new Font("\u5b8b\u4f53", Font.PLAIN, 22));

                //---- label5 ----
                label5.setText("\u59d3\u540d");
                label5.setFont(new Font("\u5b8b\u4f53", Font.PLAIN, 18));

                //---- label1 ----
                label1.setText("\u8bfe\u7a0bID");
                label1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));

                //======== menuBar1 ========
                {

                    //======== menu7 ========
                    {
                        menu7.setText("\u7528\u6237");

                        //======== menu9 ========
                        {
                            menu9.setText("\u6ce8\u9500\u767b\u5f55");
                            menu9.addMouseListener(new MouseAdapter() {
                                @Override
                                public void mouseClicked(MouseEvent e) {
                                    menu9MouseClicked(e);
                                }
                            });
                        }
                        menu7.add(menu9);

                        //======== menu8 ========
                        {
                            menu8.setText("\u9000\u51fa\u7cfb\u7edf");
                            menu8.addMouseListener(new MouseAdapter() {
                                @Override
                                public void mouseClicked(MouseEvent e) {
                                    menu8MouseClicked(e);
                                }
                            });
                        }
                        menu7.add(menu8);
                    }
                    menuBar1.add(menu7);
                }

                //---- button3 ----
                button3.setText("\u6309\u73ed\u7ea7\u67e5\u8be2\u5e73\u5747\u5206");
                button3.setFont(new Font(Font.DIALOG, Font.BOLD, 18));
                button3.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        button3MouseClicked(e);
                    }
                });

                GroupLayout contentPanelLayout = new GroupLayout(contentPanel);
                contentPanel.setLayout(contentPanelLayout);
                contentPanelLayout.setHorizontalGroup(
                    contentPanelLayout.createParallelGroup()
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addGroup(contentPanelLayout.createParallelGroup()
                                .addComponent(label5, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label2))
                            .addGap(18, 18, 18)
                            .addGroup(contentPanelLayout.createParallelGroup()
                                .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField2, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE))
                            .addGap(36, 36, 36)
                            .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addGroup(contentPanelLayout.createSequentialGroup()
                                    .addComponent(label3)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(textField3, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(label1)
                                    .addGap(18, 18, 18)
                                    .addComponent(textField4, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(button2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addContainerGap())
                                .addGroup(contentPanelLayout.createSequentialGroup()
                                    .addComponent(button1)
                                    .addGap(60, 60, 60)
                                    .addComponent(button3, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
                                    .addGap(96, 96, 96))))
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(scrollPane1)
                            .addContainerGap())
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPanelLayout.createSequentialGroup()
                            .addGap(152, 152, 152)
                            .addComponent(label4, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(menuBar1, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE))
                );
                contentPanelLayout.setVerticalGroup(
                    contentPanelLayout.createParallelGroup()
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addComponent(label4, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                .addComponent(menuBar1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
                            .addGap(24, 24, 24)
                            .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label5)
                                .addComponent(button1)
                                .addComponent(button3))
                            .addGap(18, 18, 18)
                            .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label2)
                                .addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label3)
                                .addComponent(textField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label1)
                                .addComponent(textField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(button2))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
            }
            dialogPane.add(contentPanel, BorderLayout.CENTER);

            //======== buttonBar ========
            {
                buttonBar.setBorder(new EmptyBorder(12, 0, 0, 0));
                buttonBar.setLayout(new GridBagLayout());
                ((GridBagLayout)buttonBar.getLayout()).columnWidths = new int[] {0, 85, 80};
                ((GridBagLayout)buttonBar.getLayout()).columnWeights = new double[] {1.0, 0.0, 0.0};

                //---- okButton ----
                okButton.setText("\u8fd4\u56de\u767b\u5f55");
                buttonBar.add(okButton, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 5), 0, 0));

                //---- cancelButton ----
                cancelButton.setText("\u9000\u51fa");
                cancelButton.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        cancelButtonMouseClicked(e);
                    }
                });
                buttonBar.add(cancelButton, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 5), 0, 0));
            }
            dialogPane.add(buttonBar, BorderLayout.SOUTH);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
       this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setIconImage(new ImageIcon("F:\\scc.jpg").getImage());
        if(loginuser!=null)
         menu7.setText("用户"+loginuser.getuName());

    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JTextField textField1;
    private JLabel label2;
    private JTextField textField2;
    private JLabel label3;
    private JButton button1;
    private JButton button2;
    private JTextField textField3;
    private JScrollPane scrollPane1;
    private JTable table1;
    private JLabel label4;
    private JLabel label5;
    private JLabel label1;
    private JTextField textField4;
    private JMenuBar menuBar1;
    private JMenu menu7;
    private JMenu menu9;
    private JMenu menu8;
    private JButton button3;
    private JPanel buttonBar;
    private JButton okButton;
    private JButton cancelButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
    private  Object[][] data;
    private  User loginuser;
}
