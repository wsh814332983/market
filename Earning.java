package dataPart;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.JTableHeader;

import mian.myTable;
public class Earning extends JDialog{
	JPanel panel1 = new JPanel();
    JLabel jLabel1 = new JLabel();
    JLabel jLabel2 = new JLabel();
    JComboBox<String> jComboBox1 = new JComboBox<String>();
    JLabel jLabel3 = new JLabel();
    JComboBox<String> jComboBox2 = new JComboBox<String>();
    JLabel jLabel4 = new JLabel();
    JComboBox<String> jComboBox3 = new JComboBox<String>();
    JLabel jLabel5 = new JLabel();
    JLabel jLabel6 = new JLabel();
    JComboBox<String> jComboBox4 = new JComboBox<String>();
    JComboBox<String> jComboBox5 = new JComboBox<String>();
    JLabel jLabel7 = new JLabel();
    JLabel jLabel8 = new JLabel();
    JComboBox<String> jComboBox6 = new JComboBox<String>();
    JLabel jLabel9 = new JLabel();
    JLabel jLabel10 = new JLabel();
    JButton jButton1 = new JButton();
    JButton jButton2 = new JButton();
    JLabel jLabel11 = new JLabel();
    JLabel jLabel12 = new JLabel();
    JLabel jLabel13 = new JLabel();
    JLabel jLabel14 = new JLabel();


    JTable jTable1 = new JTable();
    JTableHeader jTableHeader1 = jTable1.getTableHeader();

    Vector<String> colnames;//��ͷ
    Vector<String> colnames1=new Vector<String>();
    Vector<Vector<String>> colnames2=new Vector<Vector<String>>();




    JScrollPane jScrollPane1 = new JScrollPane();
    JLabel jLabel15 = new JLabel();
    JLabel jLabel16 = new JLabel();
    JTextField jTextField1 = new JTextField();
    JLabel jLabel17 = new JLabel();
    public Earning(Frame owner, String title, boolean modal) {
        super(owner, title, modal);
        try {
            setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            jbInit();
            pack();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public Earning() {
        this(new Frame(), "Earning", false);
        this.setSize(600,620);
    }

    private void jbInit() throws Exception {
        panel1.setLayout(null);
        jLabel1.setFont(new java.awt.Font("����", Font.BOLD | Font.ITALIC, 25));
        jLabel1.setForeground(Color.red);
        jLabel1.setText("��Ʒ����ͳ��");
        jLabel1.setBounds(new Rectangle(19, 40, 158, 35));
        jLabel2.setFont(new java.awt.Font("����", Font.BOLD, 12));
        jLabel2.setText("��ʼ���ڣ�");
        jLabel2.setBounds(new Rectangle(189, 31, 66, 20));
        jComboBox1.setBounds(new Rectangle(254, 31, 55, 20));
        jLabel3.setText("��");
        jLabel3.setBounds(new Rectangle(315, 31, 26, 20));
        jComboBox2.setBounds(new Rectangle(336, 31, 54, 20));
        jLabel4.setText("��");
        jLabel4.setBounds(new Rectangle(396, 31, 21, 20));
        jComboBox3.setBounds(new Rectangle(419, 31, 56, 20));
        jLabel5.setText("��");
        jLabel5.setBounds(new Rectangle(485, 31, 33, 20));
        jLabel6.setFont(new java.awt.Font("����", Font.BOLD, 12));
        jLabel6.setText("�������ڣ�");
        jLabel6.setBounds(new Rectangle(189, 62, 67, 20));
        jComboBox4.setBounds(new Rectangle(255, 62, 54, 20));
        jComboBox5.setBounds(new Rectangle(336, 61, 54, 20));
        jLabel7.setText("��");
        jLabel7.setBounds(new Rectangle(315, 62, 26, 20));
        jLabel8.setText("��");
        jLabel8.setBounds(new Rectangle(399, 62, 21, 20));
        jComboBox6.setBounds(new Rectangle(419, 62, 56, 20));
        jLabel9.setText("��");
        jLabel9.setBounds(new Rectangle(487, 62, 33, 20));
        jLabel10.setBackground(Color.lightGray);
        jLabel10.setBorder(BorderFactory.createEtchedBorder());
        jLabel10.setDebugGraphicsOptions(0);
        jLabel10.setDisplayedMnemonic('0');
        jLabel10.setBounds(new Rectangle(12, 6, 573, 121));
        jButton1.setBounds(new Rectangle(510, 27, 63, 24));
        jButton1.setText("����");
        jButton1.addActionListener(new Earning_jButton1_actionAdapter(this));
        jButton2.setBounds(new Rectangle(510, 59, 63, 24));
        jButton2.setText("�ر�");
        jLabel11.setFont(new java.awt.Font("����", Font.BOLD, 20));
        jLabel11.setText("��Ʒ�ۺ�ͳ��");
        jLabel11.setBounds(new Rectangle(233, 126, 134, 31));
        jLabel12.setBorder(BorderFactory.createEtchedBorder());
        jLabel12.setBounds(new Rectangle(110, 162, 146, 24));
        jLabel13.setText("-----");
        jLabel13.setBounds(new Rectangle(262, 166, 41, 16));
        jLabel14.setBorder(BorderFactory.createEtchedBorder());
        jLabel14.setBounds(new Rectangle(300, 162, 146, 24));
        jScrollPane1.setBounds(new Rectangle(14, 203, 568, 308));
        jLabel15.setFont(new java.awt.Font("����", Font.BOLD, 30));
        jLabel15.setForeground(Color.red);
        jLabel15.setText("����ܼƣ�");
        jLabel15.setBounds(new Rectangle(36, 531, 176, 47));
        jLabel16.setFont(new java.awt.Font("����", Font.BOLD, 30));
        jLabel16.setBorder(BorderFactory.createEtchedBorder());
        jLabel16.setBounds(new Rectangle(215, 531, 183, 46));
        jTextField1.setBounds(new Rectangle(332, 98, 108, 21));
        jLabel17.setFont(new java.awt.Font("����", Font.BOLD, 12));
        jLabel17.setText("��Ʒ��ţ�");
        jLabel17.setBounds(new Rectangle(266, 98, 67, 20));
        panel1.setBackground(Color.pink);
        getContentPane().add(panel1);
        panel1.add(jLabel1);
        panel1.add(jLabel2);
        panel1.add(jComboBox1);
        panel1.add(jLabel3);
        panel1.add(jComboBox2);
        panel1.add(jLabel4);
        panel1.add(jComboBox3);
        panel1.add(jLabel5);
        panel1.add(jLabel9);
        panel1.add(jComboBox6);
        panel1.add(jLabel8);
        panel1.add(jComboBox5);
        panel1.add(jLabel7);
        panel1.add(jComboBox4);
        panel1.add(jLabel6);
        panel1.add(jButton1);
        panel1.add(jButton2);
        panel1.add(jLabel11);
        panel1.add(jLabel12);
        panel1.add(jLabel13);
        panel1.add(jLabel14);
        panel1.add(jScrollPane1);
        panel1.add(jLabel15);
        panel1.add(jLabel16);
        panel1.add(jLabel10);
        panel1.add(jTextField1);
        panel1.add(jLabel17);
        jComboBox1.addItem("2000");
        jComboBox1.addItem("2001");
        jComboBox1.addItem("2002");
        jComboBox1.addItem("2003");
        jComboBox1.addItem("2004");
        jComboBox1.addItem("2005");
        jComboBox1.addItem("2006");
        jComboBox1.addItem("2007");
        jComboBox2.addItem("01");
        jComboBox2.addItem("02");
        jComboBox2.addItem("03");
        jComboBox2.addItem("04");
        jComboBox2.addItem("05");
        jComboBox2.addItem("06");
        jComboBox2.addItem("07");
        jComboBox2.addItem("08");
        jComboBox2.addItem("09");
        jComboBox2.addItem("10");
        jComboBox2.addItem("11");
        jComboBox2.addItem("12");
        jComboBox3.addItem("01");
        jComboBox3.addItem("02");
        jComboBox3.addItem("03");
        jComboBox3.addItem("04");
        jComboBox3.addItem("05");
        jComboBox3.addItem("06");
        jComboBox3.addItem("07");
        jComboBox3.addItem("08");
        jComboBox3.addItem("09");
        jComboBox3.addItem("10");
        jComboBox3.addItem("11");
        jComboBox3.addItem("12");
        jComboBox3.addItem("13");
        jComboBox3.addItem("14");
        jComboBox3.addItem("15");
        jComboBox3.addItem("16");
        jComboBox3.addItem("17");
        jComboBox3.addItem("18");
        jComboBox3.addItem("19");
        jComboBox3.addItem("20");
        jComboBox3.addItem("21");
        jComboBox3.addItem("22");
        jComboBox3.addItem("23");
        jComboBox3.addItem("24");
        jComboBox3.addItem("25");
        jComboBox3.addItem("26");
        jComboBox3.addItem("27");
        jComboBox3.addItem("28");
        jComboBox3.addItem("29");
        jComboBox3.addItem("30");
        jComboBox3.addItem("31");
        jComboBox4.addItem("2000");
        jComboBox4.addItem("2001");
        jComboBox4.addItem("2002");
        jComboBox4.addItem("2003");
        jComboBox4.addItem("2004");
        jComboBox4.addItem("2005");
        jComboBox4.addItem("2006");
        jComboBox4.addItem("2007");
        jComboBox5.addItem("01");
        jComboBox5.addItem("02");
        jComboBox5.addItem("03");
        jComboBox5.addItem("04");
        jComboBox5.addItem("05");
        jComboBox5.addItem("06");
        jComboBox5.addItem("07");
        jComboBox5.addItem("08");
        jComboBox5.addItem("09");
        jComboBox5.addItem("10");
        jComboBox5.addItem("11");
        jComboBox5.addItem("12");
        jComboBox6.addItem("01");
        jComboBox6.addItem("02");
        jComboBox6.addItem("03");
        jComboBox6.addItem("04");
        jComboBox6.addItem("05");
        jComboBox6.addItem("06");
        jComboBox6.addItem("07");
        jComboBox6.addItem("08");
        jComboBox6.addItem("09");
        jComboBox6.addItem("10");
        jComboBox6.addItem("11");
        jComboBox6.addItem("12");
        jComboBox6.addItem("13");
        jComboBox6.addItem("14");
        jComboBox6.addItem("15");
        jComboBox6.addItem("16");
        jComboBox6.addItem("17");
        jComboBox6.addItem("18");
        jComboBox6.addItem("19");
        jComboBox6.addItem("20");
        jComboBox6.addItem("21");
        jComboBox6.addItem("22");
        jComboBox6.addItem("23");
        jComboBox6.addItem("24");
        jComboBox6.addItem("25");
        jComboBox6.addItem("26");
        jComboBox6.addItem("27");
        jComboBox6.addItem("28");
        jComboBox6.addItem("29");
        jComboBox6.addItem("30");
        jComboBox6.addItem("31");
        colnames.add("��Ʒ����");
        colnames.add("��Ʒ����");
        colnames.add("��������");
        colnames.add("���۽��");
        colnames.add("��������");
        colnames.add("���С��");

        colnames2.add(colnames1);
        jTable1 = myTable.maketable(colnames2, colnames); //��ʾ����
        jScrollPane1.getViewport().add(jTable1);//�ѱ�װ������
    }

    public void jButton1_actionPerformed(ActionEvent e) throws SQLException {
        String str1=jComboBox1.getSelectedItem().toString()+"-"+jComboBox2.getSelectedItem().toString()+"-"+jComboBox3.getSelectedItem().toString();
        String str2=jComboBox4.getSelectedItem().toString()+"-"+jComboBox5.getSelectedItem().toString()+"-"+jComboBox6.getSelectedItem().toString();
        Vector<Vector<String>> vector;//�������ղ�ѯ���
        Vector<Vector<String>> vector2=new Vector<Vector<String>>();
       vector= selectEarning.findAll(jTextField1.getText());//���շ��صĽ��
       if(vector.size()==0){
           JOptionPane.showMessageDialog(this, "û����Ʒ��������Ϣ", "��ʾ",
                                               JOptionPane.ERROR_MESSAGE);
           return;
       }
       double allMoney=0;//���ڼ����ܽ��
       int i=0;
       while(i<vector.size()){
           Vector<String> vector1=new Vector<String>();
           vector1=vector.get(i);
           System.out.println(vector1.get(4).toString().substring(0,10));
           System.out.println(str1);
          System.out.println(selectEarning.charbj(vector1.get(4).toString().substring(0,10),str1));
          System.out.println(selectEarning.charbj(str2,vector1.get(4).toString().substring(0,10)));
          if(selectEarning.charbj(vector1.get(4).toString().substring(0,10),str1) && selectEarning.charbj(str2, vector1.get(4).toString())){
              Vector<String> vector3=new Vector<String>();
              int j=0;
             while(j<6){
                 vector3.add(vector1.get(j).toString());
                 j++;
                  }
                Double money=new Double(vector1.get(5).toString());
                allMoney+=money;
             vector2.add(vector3);
              }
          i++;
       }
       if(vector2.size()==0){
          JOptionPane.showMessageDialog(this, "û����Ʒ��������Ϣ", "��ʾ",
                                              JOptionPane.ERROR_MESSAGE);
          return;
      }

       jLabel12.setText(str1);
       jLabel14.setText(str2);
       Double allMon =new Double(allMoney);
       jLabel16.setText(allMon.toString());
        jTable1 = myTable.maketable(vector2, colnames); //��ʾ����
        jScrollPane1.getViewport().add(jTable1);//�ѱ�װ������
    }
}


class Earning_jButton1_actionAdapter implements ActionListener {
    private Earning adaptee;
    Earning_jButton1_actionAdapter(Earning adaptee) {
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
