/*
 * Created by JFormDesigner on Thu Dec 29 11:43:04 CST 2022
 */

package Ui;

import dao.UserDao;
import model.User;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @author 冉毓
 */
public class Login extends JFrame {
    public static void main(String[] args) {
        Login login = new Login();


    }
    public Login() {
        initComponents();
    }

    private void okButtonAncestorAdded(AncestorEvent e) {
        // TODO add your code here
    }

    private void cancelButtonAncestorAdded(AncestorEvent e) {
        // TODO add your code here
    }

    private void cancelButtonAncestorRemoved(AncestorEvent e) {
        // TODO add your code here
    }

    private void okButtonMouseClicked(MouseEvent e) {

        String username = userid.getText();
        String password = new String(userpassword.getPassword());
        System.out.println(username+"\t"+password);
        UserDao userDao=new UserDao();
      User user=  userDao.selectPasswd(username);
      System.out.println(user);
      if(user!= null  && user.getPassword().equals(password)){
          JOptionPane.showMessageDialog(this.getContentPane(),"登录成功");
          if(user.getClazz()==2){
                this.dispose();//隐藏当前窗口
              ScoreManage scoreManage = new ScoreManage(user);



          }else if(user.getClazz()==1) {
              this.dispose();
              StudentScore studentScore = new StudentScore( user);

          }else {
              this.dispose();
              Admin admin=new Admin(user);

          }

      }else{
          JOptionPane.showMessageDialog(this.getContentPane(),"登录账号或密码错误");

          userid.setText("");
          userpassword.setText("");
      }
        // TODO add your code here
    }

    private void cancelButtonMouseClicked(MouseEvent e) {
        // TODO add your code here
        System.exit(1);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        label1 = new JLabel();
        userid = new JTextField();
        label2 = new JLabel();
        userpassword = new JPasswordField();
        label3 = new JLabel();
        buttonBar = new JPanel();
        okButton = new JButton();
        cancelButton = new JButton();
        editorPane1 = new JEditorPane();

        //======== this ========
        setTitle("\u5b66\u751f\u6210\u7ee9\u7ba1\u7406\u7cfb\u7edf");
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setBackground(new Color(0x9999ff));
            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {
                contentPanel.setBackground(new Color(0x9999ff));

                //---- label1 ----
                label1.setText("\u8d26\u53f7");
                label1.setFont(new Font("Microsoft YaHei UI", Font.BOLD | Font.ITALIC, 18));

                //---- label2 ----
                label2.setText("\u5bc6\u7801");
                label2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));

                //---- label3 ----
                label3.setText("\u767b\u5f55\u7cfb\u7edf");
                label3.setFont(new Font("\u534e\u6587\u4e2d\u5b8b", Font.BOLD, 20));

                GroupLayout contentPanelLayout = new GroupLayout(contentPanel);
                contentPanel.setLayout(contentPanelLayout);
                contentPanelLayout.setHorizontalGroup(
                    contentPanelLayout.createParallelGroup()
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addGroup(contentPanelLayout.createParallelGroup()
                                .addGroup(contentPanelLayout.createSequentialGroup()
                                    .addGap(29, 29, 29)
                                    .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(label2, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(contentPanelLayout.createParallelGroup()
                                        .addComponent(userpassword, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(userid, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE)))
                                .addGroup(contentPanelLayout.createSequentialGroup()
                                    .addGap(131, 131, 131)
                                    .addComponent(label3, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)))
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                contentPanelLayout.setVerticalGroup(
                    contentPanelLayout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPanelLayout.createSequentialGroup()
                            .addComponent(label3, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addComponent(userid))
                            .addGap(31, 31, 31)
                            .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label2, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                                .addComponent(userpassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addContainerGap())
                );
            }
            dialogPane.add(contentPanel, BorderLayout.WEST);

            //======== buttonBar ========
            {
                buttonBar.setBorder(new EmptyBorder(12, 0, 0, 0));
                buttonBar.setBackground(new Color(0xccccff));
                buttonBar.setLayout(new GridBagLayout());
                ((GridBagLayout)buttonBar.getLayout()).columnWidths = new int[] {0, 85, 80};
                ((GridBagLayout)buttonBar.getLayout()).columnWeights = new double[] {1.0, 0.0, 0.0};

                //---- okButton ----
                okButton.setText("\u767b\u5f55");
                okButton.addAncestorListener(new AncestorListener() {
                    @Override
                    public void ancestorAdded(AncestorEvent e) {
                        okButtonAncestorAdded(e);
                    }
                    @Override
                    public void ancestorMoved(AncestorEvent e) {}
                    @Override
                    public void ancestorRemoved(AncestorEvent e) {}
                });
                okButton.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        okButtonMouseClicked(e);
                    }
                });
                buttonBar.add(okButton, new GridBagConstraints(0, 1, 1, 2, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 5), 0, 0));

                //---- cancelButton ----
                cancelButton.setText("\u9000\u51fa");
                cancelButton.addAncestorListener(new AncestorListener() {
                    @Override
                    public void ancestorAdded(AncestorEvent e) {
                        cancelButtonAncestorAdded(e);
                    }
                    @Override
                    public void ancestorMoved(AncestorEvent e) {}
                    @Override
                    public void ancestorRemoved(AncestorEvent e) {
                        cancelButtonAncestorRemoved(e);
                    }
                });
                cancelButton.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        cancelButtonMouseClicked(e);
                    }
                });
                buttonBar.add(cancelButton, new GridBagConstraints(1, 1, 2, 2, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 0), 0, 0));
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
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JLabel label1;
    private JTextField userid;
    private JLabel label2;
    private JPasswordField userpassword;
    private JLabel label3;
    private JPanel buttonBar;
    private JButton okButton;
    private JButton cancelButton;
    private JEditorPane editorPane1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
