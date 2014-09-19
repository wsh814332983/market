package mian;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import dataPart.SelectTable;

import java.util.*;

public class login extends JDialog{
	/**
	 * 
	 */
	
	frontView form;
    JPanel panel1 = new JPanel();
    JTextField jTextField1 = new JTextField();
    JLabel jLabel1 = new JLabel();
    JLabel jLabel2 = new JLabel();
    JLabel jLabel3 = new JLabel();
    JButton jButton1 = new JButton();
    JButton jButton2 = new JButton();
    JPasswordField jPasswordField1 = new JPasswordField();
    public login(Frame owner, String title, boolean modal) {
        super(owner, title, modal);
        try {
            setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            jbInit();
            pack();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public login() {
        this(new Frame(), "login", false);
        this.setSize(400, 300);
        this.setLocation(300, 200);

    }

    public login(frontView form) {
        this(new Frame(), "login", false);
        this.setSize(400, 300);
        this.setLocation(300, 200);
        this.form = form;
    }


    private void jbInit() throws Exception {
        panel1.setLayout(null);
        this.getContentPane().setBackground(Color.white);
        panel1.setBackground(Color.white);
        jTextField1.setBounds(new Rectangle(158, 87, 101, 25));
        jLabel1.setText("UserName");
        jLabel1.setBounds(new Rectangle(78, 87, 49, 25));
        jLabel2.setText("Password");
        jLabel2.setBounds(new Rectangle(76, 124, 49, 25));
        jLabel3.setFont(new java.awt.Font("ËÎÌו", Font.PLAIN, 20));
        jLabel3.setText("adminLoading");
        jLabel3.setBounds(new Rectangle(145, 30, 113, 27));
        jButton1.setBounds(new Rectangle(75, 206, 83, 25));
        jButton1.setText("login");
        jButton1.addActionListener(new login_jButton1_actionAdapter(this));
        jButton2.setBounds(new Rectangle(210, 206, 83, 25));
        jButton2.setText("cancel");
        jButton2.addActionListener(new login_jButton2_actionAdapter(this));
        jPasswordField1.setBounds(new Rectangle(158, 125, 101, 25));
        getContentPane().add(panel1);
        panel1.add(jLabel3);
        panel1.add(jLabel1);
        panel1.add(jTextField1);
        panel1.add(jLabel2);
        panel1.add(jButton1);
        panel1.add(jButton2);
        panel1.add(jPasswordField1);
    }

    public void jButton1_actionPerformed(ActionEvent e) {
        Vector user = new Vector();
        String name = jTextField1.getText();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<jPasswordField1.getPassword().length;i++){
        	sb.append(jPasswordField1.getPassword()[i]);
        }
        String password = sb.toString();
        user = SelectTable.Select_User(name, password);
        if (user.size() != 0) {
            this.setVisible(false);
            mainView mainFrame = new mainView();
            mainFrame.setVisible(true);
            mainFrame.setLocation(50, 50);
            form.setVisible(false);
        }

        else {
            JOptionPane.showMessageDialog(this, "userName or Password error!", "Error",
                                          JOptionPane.ERROR_MESSAGE);
            return;
        }
    }

    public void jButton2_actionPerformed(ActionEvent e) {
        this.setVisible(false);
    }


}


class login_jButton2_actionAdapter implements ActionListener {
    private login adaptee;
    login_jButton2_actionAdapter(login adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton2_actionPerformed(e);
    }
}


class login_jButton1_actionAdapter implements ActionListener {
    private login adaptee;
    login_jButton1_actionAdapter(login adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton1_actionPerformed(e);
    }
}
