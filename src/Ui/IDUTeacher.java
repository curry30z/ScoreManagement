/*
 * Created by JFormDesigner on Wed Jan 04 10:15:47 CST 2023
 */

package Ui;

import java.awt.event.*;

import dao.IDUteacher;
import dao.UserDao;
import model.Teacher;
import model.User;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author 冉毓
 */
public class IDUTeacher extends JFrame {


    public IDUTeacher(User user) {
        this.loginUser=user;
        initComponents();
    }
    public IDUTeacher() {
        initComponents();
    }

    private void menuItem2MouseClicked(MouseEvent e) {
        // TODO add your code here
        System.exit(1);
    }

    private void menu4MouseClicked(MouseEvent e) {
        // TODO add your code here
        System.exit(1);
    }

    private void menu3MouseClicked(MouseEvent e) {
        // TODO add your code here
        this.dispose();
        Admin admin=new Admin(loginUser);
    }

    private void menu2MouseClicked(MouseEvent e) {
        // TODO add your code here
        this.dispose();
        Login login=new Login();
    }

    private void button1MouseClicked(MouseEvent e) {
        // TODO add your code here
        try {
            long tId = Long.parseLong(textField1.getText().trim());
            String tName = textField2.getText().trim();
            IDUteacher iduTeacher = new IDUteacher();
            int uid = (int) iduTeacher.selectteacheruid(tId, tName);

            UserDao userDao = new UserDao();
            userDao.delete(uid);
            iduTeacher.deleteTeacher(tId, tName);

            if (iduTeacher.selectteacheruid(tId, tName) == 0 & userDao.select(uid) == null) {
                JOptionPane.showMessageDialog(this.getContentPane(), "删除成功成功");


            } else {
                JOptionPane.showMessageDialog(this.getContentPane(), "删除失败成功");
            }
        }catch (NumberFormatException a){
            JOptionPane.showMessageDialog(this.getContentPane(),"数据输入有误");
            a.printStackTrace();

        }





    }

    private void button2MouseClicked(MouseEvent e) {
        // TODO add your code here
        try {

        String tName = textField2.getText().trim();
        String phone = textField3.getText();
        String sex = textField4.getText().trim();
        String department = textField5.getText();
        String pas = textField6.getText();
        User user =new User(tName,pas,2,1);
        UserDao userDao=new UserDao();
        userDao.insert(user);
        if(userDao.selectUid(tName,pas)==0){
            JOptionPane.showMessageDialog(this.getContentPane(),"增添失败");

        }else {
            Teacher teacher=new Teacher(tName,phone,sex,userDao.selectUid(tName,pas),department);
            IDUteacher idUteacher=new IDUteacher();
            idUteacher.insertTeacher(teacher);
            if(idUteacher.selectTeacheruidByName(tName)==0){

                JOptionPane.showMessageDialog(this.getContentPane(),"增添失败");
            }else {
                JOptionPane.showMessageDialog(this.getContentPane(),"增添成功");

            }
        }
        }catch (NumberFormatException a){
            JOptionPane.showMessageDialog(this.getContentPane(),"数据输入有误");
            a.printStackTrace();

        }


        }

        private void button3MouseClicked(MouseEvent e) {
            // TODO add your code here
            int tid= Integer.parseInt(textField1.getText().trim());
            String tName = textField2.getText().trim();
            String phone = textField3.getText();
            String sex = textField4.getText().trim();
            String department = textField5.getText();
            String pas = textField6.getText();
            IDUteacher idUteacher=new IDUteacher();
            UserDao userDao=new UserDao();
                    if(textField1.getText().length()==0&textField2.getText().length()==0l&textField3.getText().length()==0
                            &textField4.getText().length()==0
                            &textField5.getText().length()==0
                            &textField6.getText().length()==0){
                        JOptionPane.showMessageDialog(this.getContentPane(), "输入缺少数据重新输入");



                    }else {
                        if (idUteacher.selectTeacheruidBytid(tid) == 0) {
                            JOptionPane.showMessageDialog(this.getContentPane(), "无此用户重新输入教师id");

                        } else {
                            Teacher teacher = new Teacher(tid, tName, phone, sex, userDao.selectUid(tName, pas), department);
                            idUteacher.updateTeacher(teacher);
                            User user = new User((int) idUteacher.selectTeacheruidBytid(tid), tName, pas);
                            userDao.update(user);
                            JOptionPane.showMessageDialog(this.getContentPane(), "修改成功成功");


                        }
                    }





        }











    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        label1 = new JLabel();
        label2 = new JLabel();
        textField1 = new JTextField();
        label3 = new JLabel();
        textField2 = new JTextField();
        label4 = new JLabel();
        textField3 = new JTextField();
        label5 = new JLabel();
        textField4 = new JTextField();
        label6 = new JLabel();
        textField5 = new JTextField();
        label7 = new JLabel();
        button1 = new JButton();
        label8 = new JLabel();
        button2 = new JButton();
        label9 = new JLabel();
        button3 = new JButton();
        label10 = new JLabel();
        textField6 = new JTextField();
        scrollPane1 = new JScrollPane();
        menuBar1 = new JMenuBar();
        menu1 = new JMenu();
        menu2 = new JMenu();
        menu3 = new JMenu();
        menu4 = new JMenu();

        //======== this ========
        setTitle("\u5b66\u751f\u6210\u7ee9\u7ba1\u7406\u7cfb\u7edf");
        Container contentPane = getContentPane();

        //---- label1 ----
        label1.setText("\u6559\u5e08\u4fe1\u606f\u7ba1\u7406");
        label1.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 24));
        label1.setForeground(Color.red);

        //---- label2 ----
        label2.setText("\u6559\u5e08\u5de5\u53f7");
        label2.setFont(new Font("\u5b8b\u4f53", Font.PLAIN, 16));

        //---- label3 ----
        label3.setText("\u6559\u5e08\u59d3\u540d");
        label3.setFont(new Font("\u5b8b\u4f53", Font.PLAIN, 16));

        //---- label4 ----
        label4.setText("\u7535\u8bdd");
        label4.setFont(new Font("\u5b8b\u4f53", Font.PLAIN, 16));

        //---- label5 ----
        label5.setText("\u6027\u522b");
        label5.setFont(new Font("\u5b8b\u4f53", Font.ITALIC, 16));

        //---- label6 ----
        label6.setText("\u90e8\u95e8");
        label6.setFont(new Font("\u5b8b\u4f53", Font.PLAIN, 16));

        //---- label7 ----
        label7.setText("\u8f93\u5165\u6559\u5e08\u5de5\u53f7\u548c\u6559\u5e08\u59d3\u540d\u5220\u9664\u6559\u5e08\u4fe1\u606f");
        label7.setFont(new Font("\u5b8b\u4f53", Font.PLAIN, 18));
        label7.setForeground(Color.red);

        //---- button1 ----
        button1.setText("\u5220\u9664\u4fe1\u606f");
        button1.setFont(new Font("\u5b8b\u4f53", Font.PLAIN, 16));
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button1MouseClicked(e);
            }
        });

        //---- label8 ----
        label8.setText("\u8f93\u5165\u6559\u5e08\u59d3\u540d\u7535\u8bdd\u6027\u522b\u90e8\u95e8\u589e\u6dfb\u6559\u5e08\u4fe1\u606f");
        label8.setFont(new Font("\u5b8b\u4f53", Font.PLAIN, 16));
        label8.setForeground(Color.magenta);

        //---- button2 ----
        button2.setText("\u589e\u6dfb\u6559\u5e08\u4fe1\u606f");
        button2.setFont(new Font("\u5b8b\u4f53", Font.PLAIN, 16));
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button2MouseClicked(e);
            }
        });

        //---- label9 ----
        label9.setText("\u8f93\u5165\u6559\u5e08\u5de5\u53f7\u4fee\u6539\u5176\u4ed6\u4fe1\u606f");
        label9.setFont(new Font("\u5b8b\u4f53", Font.PLAIN, 18));
        label9.setForeground(Color.gray);

        //---- button3 ----
        button3.setText("\u4fee\u6539\u6559\u5e08\u4fe1\u606f");
        button3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button3MouseClicked(e);
            }
        });

        //---- label10 ----
        label10.setText("\u7528\u6237\u5bc6\u7801");
        label10.setFont(new Font("\u5b8b\u4f53", Font.PLAIN, 16));

        //======== scrollPane1 ========
        {

            //======== menuBar1 ========
            {

                //======== menu1 ========
                {
                    menu1.setText("\u83dc\u5355");
                    menu1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));

                    //======== menu2 ========
                    {
                        menu2.setText("\u6ce8\u9500\u767b\u5f55");
                        menu2.addMouseListener(new MouseAdapter() {
                            @Override
                            public void mouseClicked(MouseEvent e) {
                                menu2MouseClicked(e);
                            }
                        });
                    }
                    menu1.add(menu2);

                    //======== menu3 ========
                    {
                        menu3.setText("\u8fd4\u56de\u4e3b\u83dc\u5355");
                        menu3.addMouseListener(new MouseAdapter() {
                            @Override
                            public void mouseClicked(MouseEvent e) {
                                menu3MouseClicked(e);
                            }
                        });
                    }
                    menu1.add(menu3);

                    //======== menu4 ========
                    {
                        menu4.setText("\u9000\u51fa\u7cfb\u7edf");
                        menu4.addMouseListener(new MouseAdapter() {
                            @Override
                            public void mouseClicked(MouseEvent e) {
                                menu4MouseClicked(e);
                            }
                        });
                    }
                    menu1.add(menu4);
                }
                menuBar1.add(menu1);
            }
            scrollPane1.setViewportView(menuBar1);
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addComponent(label1))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGroup(contentPaneLayout.createParallelGroup()
                                        .addComponent(label2, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                            .addGap(12, 12, 12)
                                            .addComponent(label4, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(contentPaneLayout.createParallelGroup()
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                            .addComponent(textField3, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(label5, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                            .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(label3)))
                                    .addGroup(contentPaneLayout.createParallelGroup()
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(textField2, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
                                            .addGap(47, 47, 47)
                                            .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addGap(68, 68, 68))
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(textField4, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(label8)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(button2))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(label7)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(button1)
                                    .addGap(32, 32, 32))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(label9)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(button3)
                                    .addGap(24, 24, 24))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(label6, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(textField5, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(label10)
                                    .addGap(38, 38, 38)
                                    .addComponent(textField6, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE)))))
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addComponent(label1)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label2, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3)
                            .addComponent(textField2, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(textField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label4)
                        .addComponent(label5, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
                        .addComponent(textField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label6, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                        .addComponent(textField5)
                        .addComponent(label10)
                        .addComponent(textField6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(85, 85, 85)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label7)
                        .addComponent(button1))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label8)
                        .addComponent(button2))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label9)
                        .addComponent(button3))
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setIconImage(new ImageIcon("F:\\scc.jpg").getImage());
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JLabel label1;
    private JLabel label2;
    private JTextField textField1;
    private JLabel label3;
    private JTextField textField2;
    private JLabel label4;
    private JTextField textField3;
    private JLabel label5;
    private JTextField textField4;
    private JLabel label6;
    private JTextField textField5;
    private JLabel label7;
    private JButton button1;
    private JLabel label8;
    private JButton button2;
    private JLabel label9;
    private JButton button3;
    private JLabel label10;
    private JTextField textField6;
    private JScrollPane scrollPane1;
    private JMenuBar menuBar1;
    private JMenu menu1;
    private JMenu menu2;
    private JMenu menu3;
    private JMenu menu4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

    private User loginUser;
}
