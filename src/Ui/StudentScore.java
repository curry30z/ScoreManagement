/*
 * Created by JFormDesigner on Tue Jan 03 11:13:20 CST 2023
 */

package Ui;

import Work.ListToArray;
import dao.SelectStudentScore;
import model.Studentselect;
import model.User;

import java.awt.*;
import java.awt.event.*;
import java.util.List;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.table.*;

/**
 * @author 冉毓
 */
public class StudentScore extends JFrame {
    public StudentScore(User user) {
        this.loginUser=user;


        initComponents();
    }

    public StudentScore() {
        initComponents();
    }

    private void menuItem2MouseClicked(MouseEvent e) {
        // TODO add your code here
        System.exit(1);
    }

    private void menuItem1MouseClicked(MouseEvent e) {
        // TODO add your code here

        this.dispose();
        Login login = new Login();

    }

    private void button1MouseClicked(MouseEvent e) {
        // TODO add your code here
        SelectStudentScore studentScore = new SelectStudentScore();
        List<Studentselect> list=studentScore.SelectALL(loginUser.getuName());
        if(list==null||list.size()==0){
            data=new Object[0][];
            JOptionPane.showMessageDialog(this.getContentPane(),"没有查到该数据");
        }
            else {
                System.out.println("找到数据");
                data = ListToArray.listToArrayWay(list);
            table1.setModel(new DefaultTableModel(
                   data,
                    new String[] {
                            "\u59d3\u540d", "\u6210\u7ee9", "\u8bfe\u7a0b", "\u6388\u8bfe\u6559\u5e08", "\u5b66\u5206",
                            "\u5f55\u5165\u65f6\u95f4"
                    }
            ));

            }

        }

        private void menu2MouseClicked(MouseEvent e) {
            // TODO add your code here
            this.dispose();
            Login login=new Login();

        }




    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        label1 = new JLabel();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        button1 = new JButton();
        scrollPane2 = new JScrollPane();
        menuBar1 = new JMenuBar();
        menu1 = new JMenu();
        menu2 = new JMenu();
        menu3 = new JMenu();

        //======== this ========
        setTitle("\u5b66\u751f\u6210\u7ee9\u7ba1\u7406\u7cfb\u7edf");
        Container contentPane = getContentPane();

        //---- label1 ----
        label1.setText("\u4e2a\u4eba\u6210\u7ee9\u67e5\u8be2");
        label1.setFont(new Font(Font.DIALOG, Font.BOLD, 24));

        //======== scrollPane1 ========
        {

            //---- table1 ----
            table1.setModel(new DefaultTableModel(
                new Object[][] {
                },
                new String[] {
                    "\u59d3\u540d", "\u6210\u7ee9", "\u8bfe\u7a0b", "\u6388\u8bfe\u6559\u5e08", "\u5b66\u5206", "\u5f55\u5165\u65f6\u95f4"
                }
            ));
            scrollPane1.setViewportView(table1);
        }

        //---- button1 ----
        button1.setText("\u6210\u7ee9\u67e5\u8be2");
        button1.setFont(new Font("Microsoft JhengHei", Font.BOLD | Font.ITALIC, 18));
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button1MouseClicked(e);
            }
        });

        //======== scrollPane2 ========
        {

            //======== menuBar1 ========
            {

                //======== menu1 ========
                {
                    menu1.setText("\u6b22\u8fce\u5b66\u751f");
                    menu1.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 18));
                    menu1.setBackground(new Color(0x3c9f8c));
                    menu1.setForeground(Color.red);

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
                        menu3.setText("\u9000\u51fa\u7cfb\u7edf");
                    }
                    menu1.add(menu3);
                }
                menuBar1.add(menu1);
            }
            scrollPane2.setViewportView(menuBar1);
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 490, GroupLayout.PREFERRED_SIZE)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGap(40, 40, 40)
                            .addComponent(label1, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
                            .addGap(33, 33, 33)
                            .addComponent(button1)))
                    .addContainerGap(7, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                            .addContainerGap(50, Short.MAX_VALUE)
                            .addComponent(button1)
                            .addGap(30, 30, 30))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGap(19, 19, 19)
                                    .addComponent(label1))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)))
                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 217, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setIconImage(new ImageIcon("F:\\scc.jpg").getImage());
        if (loginUser != null) {
            menu1.setText("欢迎学生"+loginUser.getuName());
        }
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JLabel label1;
    private JScrollPane scrollPane1;
    private JTable table1;
    private JButton button1;
    private JScrollPane scrollPane2;
    private JMenuBar menuBar1;
    private JMenu menu1;
    private JMenu menu2;
    private JMenu menu3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
    private User loginUser;
    private  Object[][] data;

}
