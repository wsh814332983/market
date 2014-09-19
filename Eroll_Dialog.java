package mian;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import dataPart.DelData;
import dataPart.Insert_stock;
import dataPart.SelectTable;
import dataPart.UpdateData;
import dataPart.getTime;

public class Eroll_Dialog extends JDialog{
	JPanel panel1 = new JPanel();
    JTextField jTextField1 = new JTextField();
    JTextField jTextField2 = new JTextField();
    JTextField jTextField3 = new JTextField();
    JTextField jTextField5 = new JTextField();
    JLabel jLabel1 = new JLabel();
    JLabel jLabel2 = new JLabel();
    JLabel jLabel3 = new JLabel();
    JLabel jLabel4 = new JLabel();
    JLabel jLabel5 = new JLabel();
    JTextField jTextField7 = new JTextField();
    JTextField jTextField8 = new JTextField();
    JTextArea jTextArea1 = new JTextArea();
    JLabel jLabel6 = new JLabel();
    JLabel jLabel7 = new JLabel();
    JLabel jLabel8 = new JLabel();
    JTextField jTextField9 = new JTextField();
    JLabel jLabel9 = new JLabel();
    JLabel jLabel10 = new JLabel();
    JScrollPane jScrollPane1 = new JScrollPane();
    JButton jButton1 = new JButton();
    JButton jButton2 = new JButton();
    JComboBox<String> jComboBox1 = new JComboBox<String>();
    JButton jButton3 = new JButton();
    JButton jButton4 = new JButton();
    JButton jButton5 = new JButton();
    JPasswordField jPasswordField1 = new JPasswordField();
    public Eroll_Dialog(Frame owner, String title, boolean modal) {
        super(owner, title, modal);
        try {
            setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            jbInit();
            pack();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public Eroll_Dialog() {
        this(new Frame(), "ע���û�", false);
        this.setSize(500, 400);
        this.setLocation(300, 200);
    }

    private void jbInit() throws Exception {

        panel1.setLayout(null);
        jTextField1.setBounds(new Rectangle(109, 48, 132, 27));
        jTextField2.setBounds(new Rectangle(109, 88, 132, 27));
        jTextField3.setBounds(new Rectangle(109, 129, 132, 27));
        jTextField5.setEnabled(false);
        jTextField5.setText("90");
        jTextField5.setBounds(new Rectangle(309, 173, 105, 27));
        jLabel1.setText("��  ��");
        jLabel1.setBounds(new Rectangle(51, 53, 42, 15));
        jLabel2.setText("�ֿ���");
        jLabel2.setBounds(new Rectangle(51, 94, 42, 15));
        jLabel3.setText("֤����");
        jLabel3.setBounds(new Rectangle(51, 134, 42, 15));
        jLabel4.setText("��  ��");
        jLabel4.setBounds(new Rectangle(51, 173, 42, 15));
        jLabel5.setText("�ۿ���");
        jLabel5.setBounds(new Rectangle(254, 178, 42, 15));
        jTextField7.setEnabled(false);
        jTextField7.setText("1��");
        jTextField7.setBounds(new Rectangle(308, 87, 105, 27));
        jTextField8.setEnabled(false);
        jTextField8.setText("0");
        jTextField8.setBounds(new Rectangle(309, 128, 105, 27));
        jLabel6.setText("����");
        jLabel6.setBounds(new Rectangle(254, 53, 42, 15));
        jLabel7.setText("����");
        jLabel7.setBounds(new Rectangle(254, 93, 42, 15));
        jLabel8.setText("����");
        jLabel8.setBounds(new Rectangle(254, 133, 42, 15));
        jTextField9.setEnabled(false);
        jTextField9.setBounds(new Rectangle(109, 209, 132, 27));
        jTextField9.setText(getTime.GetTime());
        jLabel9.setText("��������");
        jLabel9.setBounds(new Rectangle(51, 214, 61, 15));
        jLabel10.setText("��ע");
        jLabel10.setBounds(new Rectangle(254, 213, 48, 15));
        jScrollPane1.setBounds(new Rectangle(308, 210, 105, 82));
        jButton1.setBounds(new Rectangle(75, 318, 83, 25));
        jButton1.setText("ע��");
        jButton1.addActionListener(new Eroll_Dialog_jButton1_actionAdapter(this));
        jButton2.setBounds(new Rectangle(275, 318, 83, 25));
        jButton2.setText("�˳�");
        jButton2.addActionListener(new Eroll_Dialog_jButton2_actionAdapter(this));
        panel1.setBackground(Color.white);
        jComboBox1.setBounds(new Rectangle(308, 48, 105, 27));
        Timer timer = new Timer();
        timer.schedule(new RemindTask(), 0, 1000); //�õ���ǰʱ��
        jComboBox1.addItem("��ͨ��Ա");
        jComboBox1.addItem("����Ա");
        jComboBox1.addItem("����Ա");
        jButton3.setBounds(new Rectangle(175, 318, 83, 25));
        jButton3.setText("�޸�");
        jButton3.addActionListener(new Eroll_Dialog_jButton3_actionAdapter(this));
        jButton4.setBounds(new Rectangle(75, 279, 83, 25));
        jButton4.setText("ɾ���û�");
        jButton4.addActionListener(new Eroll_Dialog_jButton4_actionAdapter(this));
        jButton5.setBounds(new Rectangle(175, 279, 83, 25));
        jButton5.setText("��ѯ");
        jButton5.addActionListener(new Eroll_Dialog_jButton5_actionAdapter(this));
        jPasswordField1.setBounds(new Rectangle(109, 169, 132, 27));
        panel1.add(jTextField3);
        panel1.add(jTextField2);
        panel1.add(jLabel1);
        panel1.add(jLabel2);
        panel1.add(jLabel3);
        panel1.add(jLabel4);
        panel1.add(jLabel7);
        panel1.add(jLabel8);
        panel1.add(jLabel10);
        panel1.add(jLabel6);
        panel1.add(jTextField7);
        panel1.add(jTextField8);
        panel1.add(jScrollPane1);
        panel1.add(jButton1);
        panel1.add(jComboBox1);
        panel1.add(jButton3);
        panel1.add(jButton2);
        panel1.add(jButton4);
        panel1.add(jButton5);
        panel1.add(jTextField5);
        panel1.add(jLabel5);
        panel1.add(jTextField9);
        panel1.add(jLabel9);
        panel1.add(jTextField1);
        panel1.add(jPasswordField1);
        jScrollPane1.getViewport().add(jTextArea1);
        this.getContentPane().add(panel1, java.awt.BorderLayout.CENTER);
    }
    class RemindTask extends TimerTask {
               public void run() {
                  jTextField9.setText(getTime.GetTime());
               }
   }
    public void jButton2_actionPerformed(ActionEvent e) {
        this.setVisible(false);
    }

    public void jButton4_actionPerformed(ActionEvent e) throws SQLException {
        int i=0;
       i= DelData.delCard(jTextField1.getText());
       if (i != 0) {
            JOptionPane.showMessageDialog(this, "ɾ���ɹ�", "��ʾ",
                                          JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "ɾ��ʧ��", "��ʾ",
                                          JOptionPane.INFORMATION_MESSAGE);
            return;
        }


    }

    public void jButton1_actionPerformed(ActionEvent e) throws SQLException {
        String cardId = jTextField1.getText(); //����
        String name = jTextField2.getText(); //�ֿ���
        String IDcard = jTextField3.getText(); //���֤
        
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<jPasswordField1.getPassword().length;i++){
        	sb.append(jPasswordField1.getPassword()[i]);
        }
        
        String password = sb.toString(); //����
        String CardDate = jTextField9.getText(); //��������
        String UserGrade = jComboBox1.getSelectedItem().toString(); //�û�����
        String term = jTextField7.getText(); //����
        String integral = jTextField8.getText(); //����
        String agio = jTextField5.getText(); //�ۿ�
        String remark = jTextArea1.getText();
        int i = Insert_stock.Insert_User(cardId, name, IDcard, password,
                                         CardDate,
                                         UserGrade, term, integral, agio,
                                         remark);
        if (i != 0) {
            JOptionPane.showMessageDialog(this, "�����ɹ�", "��ʾ",
                                          JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "����ʧ��", "��ʾ",
                                          JOptionPane.INFORMATION_MESSAGE);
            return;
        }

    }

    public void jButton5_actionPerformed(ActionEvent e) {
        String cardId = jTextField1.getText(); //����
        Vector<String> Select_vector ;
        Select_vector = SelectTable.Select_UserManager(cardId); //��ѯ�˿��Ƿ����
        if (Select_vector.size() == 0) {
            JOptionPane.showMessageDialog(this, "���Ų�����", "��ʾ",
                                          JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        jTextField1.setText(Select_vector.get(0).toString()); //����
        jTextField2.setText(Select_vector.get(1).toString()); //�ֿ���
        jTextField3.setText(Select_vector.get(2).toString()); //���֤
        jTextField9.setText(Select_vector.get(4).toString()); //��������
        if (Select_vector.get(5).toString().equals("��ͨ��Ա")) {
            jComboBox1.removeAllItems();
            jComboBox1.addItem("��ͨ��Ա");
            jComboBox1.addItem("����Ա");
            jComboBox1.addItem("����Ա");
        }
        if (Select_vector.get(5).toString().equals("����Ա")) {
            jComboBox1.removeAllItems();
            jComboBox1.addItem("����Ա");
            jComboBox1.addItem("��ͨ��Ա");
            jComboBox1.addItem("����Ա");
        }
        if (Select_vector.get(5).toString().equals("����Ա")) {
            jComboBox1.removeAllItems();
            jComboBox1.addItem("����Ա");
            jComboBox1.addItem("����Ա");
            jComboBox1.addItem("��ͨ��Ա");
        }
        jTextField7.setText(Select_vector.get(6).toString()); //����
        jTextField8.setText(Select_vector.get(7).toString()); //����
        jTextField5.setText(Select_vector.get(8).toString()); //�ۿ�
        jTextArea1.setText(Select_vector.get(9).toString()); //��ע

    }

    public void jButton3_actionPerformed(ActionEvent e) throws SQLException {
        String cardId = jTextField1.getText(); //����
        Vector<String> Select_vector;
        Select_vector = SelectTable.Select_UserManager(cardId); //��ѯ�˿��Ƿ����
        if (Select_vector.size() == 0) {
            JOptionPane.showMessageDialog(this, "���Ų�����", "��ʾ",
                                          JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        StringBuffer PassWord=new StringBuffer();
        for(int i=0;i<jPasswordField1.getPassword().length;i++){
        	PassWord.append(jPasswordField1.getPassword()[i]);
        }
        int i = UpdateData.UpdateCard(jTextField1.getText(),jTextField2.getText(),
                                      jTextField3.getText(),
                                      PassWord.toString(),
                                      jTextField9.getText(),
                                      jComboBox1.getSelectedItem().toString(),
                                      jTextField7.getText(),
                                      jTextField8.getText(),
                                      jTextField5.getText(), jTextArea1.getText()
                                      );
        if (i == 0) {
            JOptionPane.showMessageDialog(this, "���ϸ���ʧ��", "��ʾ",
                                          JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "���ϸ��³ɹ�", "��ʾ",
                                          JOptionPane.INFORMATION_MESSAGE);
        }
    }


    class Eroll_Dialog_jButton1_actionAdapter implements ActionListener {
        private Eroll_Dialog adaptee;
        Eroll_Dialog_jButton1_actionAdapter(Eroll_Dialog adaptee) {
            this.adaptee = adaptee;
        }

        public void actionPerformed(ActionEvent e) {
            try {
				adaptee.jButton1_actionPerformed(e);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        }
    }


    class Eroll_Dialog_jButton4_actionAdapter implements ActionListener {
        private Eroll_Dialog adaptee;
        Eroll_Dialog_jButton4_actionAdapter(Eroll_Dialog adaptee) {
            this.adaptee = adaptee;
        }

        public void actionPerformed(ActionEvent e) {
            try {
				adaptee.jButton4_actionPerformed(e);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        }
    }


    class Eroll_Dialog_jButton2_actionAdapter implements ActionListener {
        private Eroll_Dialog adaptee;
        Eroll_Dialog_jButton2_actionAdapter(Eroll_Dialog adaptee) {
            this.adaptee = adaptee;
        }

        public void actionPerformed(ActionEvent e) {
            adaptee.jButton2_actionPerformed(e);
        }
    }
}


class Eroll_Dialog_jButton3_actionAdapter implements ActionListener {
    private Eroll_Dialog adaptee;
    Eroll_Dialog_jButton3_actionAdapter(Eroll_Dialog adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        try {
			adaptee.jButton3_actionPerformed(e);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    }
}


class Eroll_Dialog_jButton5_actionAdapter implements ActionListener {
    private Eroll_Dialog adaptee;
    Eroll_Dialog_jButton5_actionAdapter(Eroll_Dialog adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton5_actionPerformed(e);
    }
}
