/*
 * Created by JFormDesigner on Wed Jan 04 10:00:26 CST 2023
 */

package Ui;

import javax.swing.event.*;
import model.User;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author 冉毓
 */
public class Admin extends JFrame {



    public Admin(User user) {
        this.loginUser=user;
        initComponents();
    }
    public Admin() {
        initComponents();
    }

    private void menuItem6MouseClicked(MouseEvent e) {
        // TODO add your code here

        this.dispose();
        Login login = new Login();
    }

    private void menuItem5MouseClicked(MouseEvent e) {
        // TODO add your code here
        System.exit(1);
    }

    private void button1MouseClicked(MouseEvent e) {
        // TODO add your code here
        this.dispose();
        IDUTeacher iduTeacher=new IDUTeacher();


    }

    private void menuItem6MenuDragMouseDragged(MenuDragMouseEvent e) {
        // TODO add your code here
        this.dispose();
        Login login = new Login();
    }

    private void menuItem5MenuDragMouseDragged(MenuDragMouseEvent e) {
        // TODO add your code here
        System.exit(1);

    }

    private void menu2KeyPressed(KeyEvent e) {
        // TODO add your code here

    }

    private void menu2MouseClicked(MouseEvent e) {
        // TODO add your code here
        this.dispose();
        Login login=new Login();
    }

    private void menu3MouseClicked(MouseEvent e) {
        // TODO add your code here
        System.exit(1);
    }

    private void button2MouseClicked(MouseEvent e) {
        // TODO add your code here

        this.dispose();
        IDUStudent iduStudent=new IDUStudent();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        menuBar1 = new JMenuBar();
        menu1 = new JMenu();
        menu2 = new JMenu();
        menu3 = new JMenu();
        label1 = new JLabel();
        label2 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();

        //======== this ========
        setTitle("\u5b66\u751f\u6210\u7ee9\u7ba1\u7406\u7cfb\u7edf");
        Container contentPane = getContentPane();

        //======== menuBar1 ========
        {

            //======== menu1 ========
            {
                menu1.setText("\u7528\u6237");
                menu1.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 16));
                menu1.setForeground(new Color(0xcc00cc));

                //======== menu2 ========
                {
                    menu2.setText("\u6ce8\u9500\u767b\u5f55");
                    menu2.addKeyListener(new KeyAdapter() {
                        @Override
                        public void keyPressed(KeyEvent e) {
                            menu2KeyPressed(e);
                        }
                    });
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
                    menu3.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            menu3MouseClicked(e);
                        }
                    });
                }
                menu1.add(menu3);
            }
            menuBar1.add(menu1);
        }
        setJMenuBar(menuBar1);

        //---- label1 ----
        label1.setText("\u9009\u62e9\u529f\u80fd\u83dc\u5355");
        label1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
        label1.setForeground(Color.magenta);

        //---- label2 ----
        label2.setText("\u6b22\u8fce\u7ba1\u7406\u5458");
        label2.setFont(new Font("\u5b8b\u4f53", Font.BOLD | Font.ITALIC, 16));
        label2.setForeground(Color.blue);

        //---- button1 ----
        button1.setText("\u6559\u5e08\u7ba1\u7406");
        button1.setFont(new Font("\u5b8b\u4f53", Font.PLAIN, 16));
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button1MouseClicked(e);
            }
        });

        //---- button2 ----
        button2.setText("\u5b66\u751f\u7ba1\u7406");
        button2.setFont(new Font("\u5b8b\u4f53", Font.PLAIN, 16));
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button2MouseClicked(e);
            }
        });

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(33, 33, 33)
                            .addComponent(label2))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(127, 127, 127)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(label1, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(button2, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                    .addComponent(button1, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)))))
                    .addContainerGap(134, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(11, 11, 11)
                    .addComponent(label2)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addComponent(button1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(button2, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(115, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setIconImage(new ImageIcon("F:\\scc.jpg").getImage());
        if (loginUser != null) {
            label1.setText("欢迎管理员"+loginUser.getuName());
        }
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JMenuBar menuBar1;
    private JMenu menu1;
    private JMenu menu2;
    private JMenu menu3;
    private JLabel label1;
    private JLabel label2;
    private JButton button1;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
    private User loginUser;
}
