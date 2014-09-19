package mian;

import java.awt.Frame;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Rectangle;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class Settle_Dialog extends JDialog {
	/**
	 * 
	 */

	JPanel panel1 = new JPanel();
    JTextField jTextField1 = new JTextField();
    JTextField jTextField2 = new JTextField();
    JTextField jTextField3 = new JTextField();
    JLabel jLabel1 = new JLabel();
    JLabel jLabel2 = new JLabel();
    JLabel jLabel3 = new JLabel();
    public Settle_Dialog(Frame owner, String title, boolean modal) {
        super(owner, title, modal);
        try {
            setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            jbInit();
            pack();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public Settle_Dialog() {
        this(new Frame(), "Settle_Dialog", false);
    }

    private void jbInit() throws Exception {
        panel1.setLayout(null);
        jTextField1.setFont(new java.awt.Font("����", Font.PLAIN, 30));
        jTextField1.setBounds(new Rectangle(213, 44, 130, 42));
        jTextField2.setFont(new java.awt.Font("����", Font.PLAIN, 30));
        jTextField2.setBounds(new Rectangle(213, 108, 130, 42));
        jTextField3.setFont(new java.awt.Font("����", Font.PLAIN, 30));
        jTextField3.setBounds(new Rectangle(213, 171, 130, 42));
        jLabel1.setFont(new java.awt.Font("����", Font.PLAIN, 30));
        jLabel1.setText("total");
        jLabel1.setBounds(new Rectangle(41, 45, 130, 42));
        jLabel2.setFont(new java.awt.Font("����", Font.PLAIN, 30));
        jLabel2.setText("Receive");
        jLabel2.setBounds(new Rectangle(41, 108, 130, 42));
        jLabel3.setFont(new java.awt.Font("����", Font.PLAIN, 30));
        jLabel3.setText("change fund");
        jLabel3.setBounds(new Rectangle(41, 171, 130, 42));
        panel1.setBackground(Color.white);
        getContentPane().add(panel1);
        panel1.add(jLabel1);
        panel1.add(jLabel2);
        panel1.add(jLabel3);
        panel1.add(jTextField2);
        panel1.add(jTextField3);
        panel1.add(jTextField1);
    }
}
