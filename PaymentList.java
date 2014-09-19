package mian;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.JTableHeader;

import dataPart.PayFor;
import dataPart.getTime;

public class PaymentList extends JDialog{
	JPanel panel1 = new JPanel();
    JLabel jLabel1 = new JLabel();
    JLabel jLabel2 = new JLabel();
    JLabel jLabel3 = new JLabel();
    JLabel jLabel4 = new JLabel();
    JLabel jLabel5 = new JLabel();
    JLabel jLabel6 = new JLabel();
    JLabel jLabel7 = new JLabel();
    JLabel jLabel8 = new JLabel();
    JTextField jTextField1 = new JTextField();
    JTextField jTextField2 = new JTextField();
    JTextField jTextField3 = new JTextField();
    JTextField jTextField4 = new JTextField();
    JTextField jTextField5 = new JTextField();
    JTextField jTextField6 = new JTextField();
    JTextField jTextField7 = new JTextField();
    JTextField jTextField8 = new JTextField();
    JScrollPane jScrollPane1 = new JScrollPane();
    JLabel jLabel9 = new JLabel();
    JButton jButton1 = new JButton();
    JButton jButton2 = new JButton();
    JButton jButton3 = new JButton();


    JTable jTable1 = new JTable();
    JTableHeader jTableHeader1 = jTable1.getTableHeader();

    Vector<String> colnames = new Vector<String>(); //��ͷ
    Vector<String> colnames1 = new Vector<String>();
    Vector<Vector<String>> colnames2 = new Vector<Vector<String>>();
    JButton jButton4 = new JButton();


    public PaymentList(Frame owner, String title, boolean modal) {
        super(owner, title, modal);
        try {
            setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            jbInit();
            pack();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public PaymentList() {
        this(new Frame(), "PaymentList", false);
        this.setSize(800, 500);
    }

    private void jbInit() throws Exception {
        panel1.setLayout(null);
        jLabel1.setText("���ţ�");
        jLabel1.setBounds(new Rectangle(12, 64, 52, 18));
        jLabel2.setText("���ʽ��");
        jLabel2.setBounds(new Rectangle(12, 229, 64, 18));
        jLabel3.setText("���ң�");
        jLabel3.setBounds(new Rectangle(12, 144, 52, 18));
        jLabel4.setText("֧Ʊ�ţ�");
        jLabel4.setBounds(new Rectangle(12, 269, 52, 18));
        jLabel5.setText("���ڣ�");
        jLabel5.setBounds(new Rectangle(12, 309, 41, 18));
        jLabel6.setText("�����ˣ�");
        jLabel6.setBounds(new Rectangle(12, 349, 52, 18));
        jLabel7.setText("�Ƶ��ˣ�");
        jLabel7.setBounds(new Rectangle(12, 389, 52, 18));
        jLabel8.setText("�����̣�");
        jLabel8.setBounds(new Rectangle(12, 104, 52, 18));
        jTextField1.setBounds(new Rectangle(51, 64, 149, 20));
        jTextField2.setBounds(new Rectangle(60, 104, 140, 20));
        jTextField3.setBounds(new Rectangle(52, 144, 149, 20));
        jTextField4.setBounds(new Rectangle(72, 229, 129, 20));
        jTextField5.setBounds(new Rectangle(63, 268, 138, 20));
        jTextField6.setEnabled(false);
        jTextField6.setBounds(new Rectangle(53, 307, 148, 20));
        Timer timer = new Timer();
        timer.schedule(new RemindTask(), 0, 1000); //�õ���ǰʱ��

        jTextField7.setBounds(new Rectangle(65, 348, 136, 20));
        jTextField8.setBounds(new Rectangle(63, 388, 138, 20));
        jScrollPane1.setBounds(new Rectangle(230, 17, 549, 354));
        jLabel9.setFont(new java.awt.Font("����", Font.BOLD | Font.ITALIC, 30));
        jLabel9.setForeground(Color.red);
        jLabel9.setText("���");
        jLabel9.setBounds(new Rectangle(43, 5, 146, 52));
        jButton1.setBounds(new Rectangle(379, 376, 80, 35));
        jButton1.setText("��   ��");
        jButton1.addActionListener(new PaymentList_jButton1_actionAdapter(this));
        jButton2.setBounds(new Rectangle(500, 376, 80, 35));
        jButton2.setText("ɾ   ��");
        jButton2.addActionListener(new PaymentList_jButton2_actionAdapter(this));
        jButton3.setBounds(new Rectangle(620, 376, 80, 35));
        jButton3.setText("��   ��");
        jButton3.addActionListener(new PaymentList_jButton3_actionAdapter(this));
        jButton4.setBounds(new Rectangle(259, 376, 80, 35));
        jButton4.setText("ȷ��");
        jButton4.addActionListener(new PaymentList_jButton4_actionAdapter(this));
        jLabel10.setText("�����");
        jLabel10.setBounds(new Rectangle(12, 192, 61, 18));
        jTextField9.setBounds(new Rectangle(72, 185, 129, 21));
        this.getContentPane().setBackground(Color.white);
        panel1.setBackground(Color.white);
        getContentPane().add(panel1);
        panel1.add(jLabel8);
        panel1.add(jTextField3);
        panel1.add(jLabel3);
        panel1.add(jTextField2);
        panel1.add(jTextField1);
        panel1.add(jLabel1);
        panel1.add(jLabel9);
        panel1.add(jScrollPane1);
        panel1.add(jTextField4);
        panel1.add(jLabel7);
        panel1.add(jTextField8);
        panel1.add(jTextField7);
        panel1.add(jLabel6);
        panel1.add(jLabel5);
        panel1.add(jTextField6);
        panel1.add(jTextField5);
        panel1.add(jLabel4);
        panel1.add(jLabel2); //        colnames.add("��������");
        panel1.add(jLabel10); //        colnames.add("������");
        panel1.add(jTextField9); //        colnames.add("����");
        panel1.add(jButton2);
        panel1.add(jButton4);
        panel1.add(jButton1);
        panel1.add(jButton3);
    }

    Vector<Vector<String>> colnames4 = new Vector<Vector<String>>();
    JLabel jLabel10 = new JLabel();
    JTextField jTextField9 = new JTextField();
    class RemindTask extends TimerTask {
       public void run() {
          jTextField6.setText(getTime.GetTime());
       }
   }

    public void jButton4_actionPerformed(ActionEvent e) {
        colnames.removeAllElements();

        Vector<String> colnames3 = new Vector<String>();
        colnames.add("��������");
        colnames.add("������");
        colnames.add("����");
        colnames.add("���ʽ");
        colnames.add("������");
        colnames.add("֧Ʊ��");
        colnames.add("����");
        colnames.add("������");
        colnames.add("�Ƶ���");


        String aa = jTextField1.getText();
        colnames3.add(aa);

        colnames3.add(jTextField2.getText());
        colnames3.add(jTextField3.getText());
        colnames3.add(jTextField9.getText());
        colnames3.add(jTextField4.getText());
        colnames3.add(jTextField5.getText());
        colnames3.add(jTextField6.getText());
        colnames3.add(jTextField7.getText());
        colnames3.add(jTextField8.getText());

        colnames4.add(colnames3);
        jTable1 = myTable.maketable(colnames4, colnames); //��ʾ����
        jScrollPane1.getViewport().add(jTable1); //�ѱ�װ������
    }

    public void jButton1_actionPerformed(ActionEvent e) throws SQLException {

        int i=0;
     while(i<colnames4.size()){
         Vector<String> idd;
         idd=colnames4.get(i);
         Integer dd=new Integer(idd.get(0).toString());

         PayFor.save(dd.intValue(),
        		 idd.get(1).toString(),
        		 idd.get(2).toString(),
        		 idd.get(3).toString(),
        		 idd.get(4).toString(),
        		 idd.get(5).toString(),
        		 idd.get(6).toString(),
        		 idd.get(7).toString(),
        		 idd.get(8).toString());
         i++;

     }
    }

    public void jButton3_actionPerformed(ActionEvent actionEvent) {
        this.setVisible(false);
    }

    public void jButton2_actionPerformed(ActionEvent actionEvent) {
        int row = jTable1.getSelectedRow();
                colnames4.remove(row);
                jTable1 = myTable.maketable(colnames4, colnames); //��ʾ����
        jScrollPane1.getViewport().add(jTable1); //�ѱ�װ������
    }
}


class PaymentList_jButton2_actionAdapter implements ActionListener {
    private PaymentList adaptee;
    PaymentList_jButton2_actionAdapter(PaymentList adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent actionEvent) {
        adaptee.jButton2_actionPerformed(actionEvent);
    }
}


class PaymentList_jButton3_actionAdapter implements ActionListener {
    private PaymentList adaptee;
    PaymentList_jButton3_actionAdapter(PaymentList adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent actionEvent) {
        adaptee.jButton3_actionPerformed(actionEvent);
    }
}


class PaymentList_jButton1_actionAdapter implements ActionListener {
    private PaymentList adaptee;
    PaymentList_jButton1_actionAdapter(PaymentList adaptee) {
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


class PaymentList_jButton4_actionAdapter implements ActionListener {
    private PaymentList adaptee;
    PaymentList_jButton4_actionAdapter(PaymentList adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton4_actionPerformed(e);
    }
}
