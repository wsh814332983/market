package mian;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.TitledBorder;
public class About extends JDialog{
	 JPanel panel1 = new JPanel();
	    JLabel jLabel1 = new JLabel();
	    TitledBorder titledBorder1 = new TitledBorder("");
	    JLabel jLabel3 = new JLabel();
	    JLabel jLabel4 = new JLabel();
	    JLabel jLabel7 = new JLabel();
	    JLabel jLabel8 = new JLabel();
	    JLabel jLabel2 = new JLabel();
	    public About(Frame owner, String title, boolean modal) {
	        super(owner, title, modal);
	        try {
	            setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	            jbInit();
	            pack();
	        } catch (Exception exception) {
	            exception.printStackTrace();
	        }
	    }

	    public About() {
	        this(new Frame(), "about", false);
	        this.setSize(500, 420);
	        this.setLocation(300, 200);
	       
	    }

	    private void jbInit() throws Exception {
	        panel1.setLayout(null);
	        panel1.setBackground(Color.white);
	        jLabel1.setFont(new java.awt.Font("隶书", Font.PLAIN, 30));
	        jLabel1.setBorder(titledBorder1);
	        jLabel1.setText("about software");
	        jLabel1.setBounds(new Rectangle(73, 34, 346, 53));
	        jLabel3.setFont(new java.awt.Font("隶书", Font.PLAIN, 30));
	        jLabel3.setText("Tianxiang Zhang");
	        jLabel3.setBounds(new Rectangle(156, 140, 201, 36));
	        jLabel4.setFont(new java.awt.Font("隶书", Font.PLAIN, 30));
	        jLabel4.setText("  ");
	        jLabel4.setBounds(new Rectangle(90, 185, 388, 36));
	        jLabel7.setFont(new java.awt.Font("隶书", Font.PLAIN, 30));
	        jLabel7.setText("TELE:   ");
	        jLabel7.setBounds(new Rectangle(27, 263, 462, 36));
	        jLabel8.setFont(new java.awt.Font("隶书", Font.PLAIN, 30));
	        jLabel8.setText("E-mail:wsh814332983@gamil.com");
	        jLabel8.setBounds(new Rectangle(27, 302, 462, 36));
	        jLabel2.setFont(new java.awt.Font("隶书", Font.PLAIN, 30));
	        jLabel2.setText("hhhh");
	        jLabel2.setBounds(new Rectangle(156, 224, 388, 36));
	        getContentPane().add(panel1);
	        panel1.add(jLabel1);
	        panel1.add(jLabel3);
	        panel1.add(jLabel4);
	        panel1.add(jLabel2);
	        panel1.add(jLabel7);
	        panel1.add(jLabel8);
	    }
			
}
