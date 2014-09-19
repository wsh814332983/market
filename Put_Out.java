package mian;



import java.awt.Color;
import java.awt.Frame;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Timer;
import java.util.TimerTask;
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

import dataPart.Insert_stock;
import dataPart.SelectTable;
import dataPart.UpdateData;
import dataPart.getTime;

public class Put_Out extends JDialog{
	Timestamp ts = new Timestamp(System.currentTimeMillis());
    JPanel panel1 = new JPanel();
    JLabel jLabel1 = new JLabel();
    JComboBox<String> jComboBox1 = new JComboBox<String>();
    JLabel jLabel2 = new JLabel();
    JTextField jTextField1 = new JTextField();
    JLabel jLabel3 = new JLabel();
    JComboBox<String> jComboBox2 = new JComboBox<String>();
    JLabel jLabel4 = new JLabel();
    JLabel jLabel5 = new JLabel();
    JLabel jLabel6 = new JLabel();
    JTextField jTextField2 = new JTextField();
    JLabel jLabel7 = new JLabel();
    JTextField jTextField3 = new JTextField();
    JLabel jLabel8 = new JLabel();
    JTextField jTextField4 = new JTextField();
    JLabel jLabel9 = new JLabel();

    JTable jTable1 = new JTable();
    JTableHeader jTableHeader1 = jTable1.getTableHeader();

    Vector<String> colnames = new Vector<String>(); //��ͷ
    Vector<String> colnames1 = new Vector<String>();
    Vector<Vector<String>> colnames2 = new Vector<Vector<String>>();


    JScrollPane jScrollPane1 = new JScrollPane();
    JButton jButton1 = new JButton();
    JButton jButton2 = new JButton();
    JButton jButton3 = new JButton();
    JButton jButton4 = new JButton();
    JTextField jTextField6 = new JTextField();
    JTextField jTextField7 = new JTextField();
    JLabel jLabel10 = new JLabel();
    JLabel jLabel11 = new JLabel();
    JLabel jLabel12 = new JLabel();


    public Put_Out(Frame owner, String title, boolean modal) {
        super(owner, title, modal);
        try {
            setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            jbInit();
            pack();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public Put_Out() {
        this(new Frame(), "JoinAndExceed", false);
        this.setSize(665, 480);
    }

    private void jbInit() throws Exception {
        panel1.setLayout(null);
        this.getContentPane().setLayout(null);
        jLabel4.setBorder(BorderFactory.createEtchedBorder());
        jLabel4.setBounds(new Rectangle(31, 7, 603, 36));
        jLabel5.setText("����¼��");
        jLabel5.setBounds(new Rectangle(29, 54, 102, 26));
        jLabel6.setText("��Ʒ��ţ�");
        jLabel6.setBounds(new Rectangle(64, 89, 68, 21));
        jTextField2.setBounds(new Rectangle(131, 89, 130, 21));
        jTextField2.addFocusListener(new Put_Out_Depot_jTextField2_focusAdapter(this));
        jLabel7.setText("��  ����");
        jLabel7.setBounds(new Rectangle(293, 89, 54, 21));
        jTextField3.setBounds(new Rectangle(343, 89, 72, 21));
        jLabel8.setText("�������ۣ�");
        jLabel8.setBounds(new Rectangle(440, 89, 68, 21));
        jTextField4.setBounds(new Rectangle(503, 89, 84, 21));
        jLabel9.setBorder(BorderFactory.createEtchedBorder());
        jLabel9.setBounds(new Rectangle(31, 82, 603, 58));
        jScrollPane1.setBounds(new Rectangle(29, 150, 603, 248));
        jButton1.setBounds(new Rectangle(74, 409, 111, 30));
        jButton1.setSelectedIcon(null);
        jButton1.setText("ȷ   ��");
        jButton1.addActionListener(new Put_Out_Depot_jButton1_actionAdapter(this));

        jButton2.setBounds(new Rectangle(206, 409, 111, 30));
        jButton2.setText("ɾ  ��");
        jButton2.addActionListener(new Put_Out_Depot_jButton2_actionAdapter(this));
        jButton3.setBounds(new Rectangle(342, 409, 111, 30));
        jButton3.setText("��   ��");
        jButton3.addActionListener(new Put_Out_Depot_jButton3_actionAdapter(this));
        jButton4.setBounds(new Rectangle(477, 409, 111, 30));
        jButton4.setText("�ύ");
        jButton4.addActionListener(new Put_Out_Depot_jButton4_actionAdapter(this));
        this.getContentPane().setBackground(Color.white);
        jTextField6.setEnabled(false);
        jTextField6.setBounds(new Rectangle(343, 114, 72, 21));
        jTextField7.setBounds(new Rectangle(503, 114, 83, 21));
        jLabel10.setText("�� �� �ţ�");
        jLabel10.setBounds(new Rectangle(64, 114, 68, 15));
        jLabel11.setText("�ܽ�");
        jLabel11.setBounds(new Rectangle(293, 114, 48, 15));
        jLabel12.setText("�� �� �ˣ�");
        jLabel12.setBounds(new Rectangle(440, 114, 60, 15));
        Timer timer = new Timer();
        timer.schedule(new RemindTask(), 0, 1000); //�õ���ǰʱ��
        jComboBox3.setBounds(new Rectangle(131, 114, 130, 21));
        this.getContentPane().add(panel1, null);
        jComboBox2.setBounds(new Rectangle(488, 14, 94, 20));
        jLabel3.setText("�Ƶ��ˣ�");
        jLabel3.setBounds(new Rectangle(426, 15, 59, 20));
        jTextField1.setBounds(new Rectangle(280, 14, 131, 20));
        jLabel2.setText("ʱ�䣺");
        jLabel2.setBounds(new Rectangle(242, 14, 84, 20));
        jComboBox1.setBounds(new Rectangle(134, 14, 84, 20));
        this.getContentPane().add(jLabel5);
        this.getContentPane().add(jScrollPane1);
        this.getContentPane().add(jTextField2);
        this.getContentPane().add(jLabel12);
        this.getContentPane().add(jLabel8);
        this.getContentPane().add(jTextField6);
        this.getContentPane().add(jTextField3);
        this.getContentPane().add(jLabel7);
        this.getContentPane().add(jLabel6);
        this.getContentPane().add(jTextField4);
        this.getContentPane().add(jLabel11);
        this.getContentPane().add(jTextField7);
        this.getContentPane().add(jLabel10);
        this.getContentPane().add(jComboBox1);
        this.getContentPane().add(jComboBox2);
        this.getContentPane().add(jLabel3);
        this.getContentPane().add(jTextField1);
        this.getContentPane().add(jLabel2);
        this.getContentPane().add(jLabel1);
        this.getContentPane().add(jLabel4);
        this.getContentPane().add(jButton2);
        this.getContentPane().add(jButton1);
        this.getContentPane().add(jButton3);
        this.getContentPane().add(jButton4);
        this.getContentPane().add(jComboBox3);
        this.getContentPane().add(jLabel9);
        jLabel1.setText("���");
        jLabel1.setBounds(new Rectangle(98, 14, 84, 20));
        panel1.setBounds(new Rectangle(0, 399, 1, 1));
        jComboBox1.addItem("���");
        jComboBox1.addItem("����");
        jComboBox2.addItem("����ΰ");
        jComboBox2.addItem("̷����");
        jComboBox2.addItem("����");

        jComboBox3.addItem("CK0001");
        jComboBox3.addItem("CK0002");
        jComboBox3.addItem("CK0003");
        jTextField1.setText(ts.toString().substring(0, 19));
        colnames.add("���");
        colnames.add("����");
        colnames.add("������");
        colnames.add("�ܽ��");
        colnames.add("����");
        colnames.add("�ֿ��");
        colnames.add("������");
        colnames.add("���");
        colnames2.add(colnames1);
        jTable1 = myTable.maketable(colnames2, colnames); //��ʾ����
        jScrollPane1.getViewport().add(jTable1); //�ѱ�װ������
    }

    class RemindTask extends TimerTask {
        public void run() {
            jTextField1.setText(getTime.GetTime());
        }
    }


    public void InOut_Enter(String inout) throws SQLException {
        Vector<Vector<String>> select1;
        select1 = SelectTable.Select_sort2(jTextField2.getText());
        if (select1.size() == 0) {
            JOptionPane.showMessageDialog(this, "��Ʒ������", "����",
                                          JOptionPane.ERROR_MESSAGE);
            return;
        }
        //��������
        Vector<String> insertData;

        int i = 0;
        while (i < vector1.size()) {
            insertData = vector1.get(i);
            Integer num1 = new Integer(insertData.get(1).toString());
            Double num2 = new Double(insertData.get(2).toString());
            if(inout.equals("1")){
                UpdateData.in_StockPile(num1,insertData.get(0).toString());
            }
            if(inout.equals("0")){
                 UpdateData.out_StockPile(num1,insertData.get(0).toString());
             }

            int j = Insert_stock.Insert_EnterStock(insertData.get(0).toString(),
                    num1, num2, insertData.get(4).toString(),
                    insertData.get(5).toString(), insertData.get(6).toString(),
                    insertData.get(7).toString(), inout);
            if (j == 0) {
                i++;
                String str = "��" + i + "����¼����д��ʧ��";
                JOptionPane.showMessageDialog(this, str, "����",
                                              JOptionPane.ERROR_MESSAGE);
                return;
            }
            i++;
            if (i == vector1.size()) {
                JOptionPane.showMessageDialog(this, "����¼��ɹ�", "��ʾ",
                                              JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
    public void jButton4_actionPerformed(ActionEvent e) throws SQLException {
        if (jComboBox1.getSelectedItem().toString().equals("���")) {
            InOut_Enter("1");
        }
        if (jComboBox1.getSelectedItem().toString().equals("����")) {
            InOut_Enter("0");
        }
    }

    Vector<Vector<String>> vector1 = new Vector<Vector<String>>();
    JComboBox<String> jComboBox3 = new JComboBox<String>();
    public void jButton1_actionPerformed(ActionEvent e) {
        Vector<String> vector = new Vector<String>();
        double allMoney = 0;
        vector.add(jTextField2.getText());
        vector.add(jTextField3.getText());
        vector.add(jTextField4.getText());
        try {
            Double num = new Double(jTextField3.getText());
            Double money = new Double(jTextField4.getText());
            allMoney = (int) (num * money * 100) / 100.0;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "�������������", "����",
                                          JOptionPane.ERROR_MESSAGE);
            return;
        }
        Double dd = new Double(allMoney);
        jTextField6.setText(dd.toString());
        vector.add(dd.toString());
        vector.add(jTextField1.getText());
        vector.add(jComboBox3.getSelectedItem().toString());
        vector.add(jTextField7.getText());
        vector.add(jComboBox2.getSelectedItem().toString());
        vector1.add(vector);
        jTable1 = myTable.maketable(vector1, colnames); //��ʾ����
        jScrollPane1.getViewport().add(jTable1); //�ѱ�װ������
    }

    public void jButton2_actionPerformed(ActionEvent e) {
        int row = jTable1.getSelectedRow();
        vector1.remove(row);
        jTable1 = myTable.maketable(vector1, colnames); //��ʾ����
        jScrollPane1.getViewport().add(jTable1); //�ѱ�װ������
    }

    public void jButton3_actionPerformed(ActionEvent e) {
        vector1.removeAllElements();
        jTable1 = myTable.maketable(vector1, colnames); //��ʾ����
        jScrollPane1.getViewport().add(jTable1); //�ѱ�װ������
    }

    public void jTextField2_focusLost(FocusEvent e) throws SQLException {
        if (jTextField1.getText().length() != 0) {
             Vector<Vector<String>> select1 = SelectTable.Select_sort2(jTextField2.getText());
             Vector<String> select2;
             if (select1.size() == 0) {
                 JOptionPane.showMessageDialog(this, "��Ʒ������", "����",
                                               JOptionPane.ERROR_MESSAGE);
                 return;
             } else {
                 select2 = select1.get(0);
                 Double pice=new Double(select2.get(4).toString());
                 double pice1=((int)(pice*100))/100.0;
                  Double pice2=new Double(pice1);
                 jTextField4.setText(pice2.toString()); //����
             }
         }

    }


}


class Put_Out_Depot_jTextField2_focusAdapter extends FocusAdapter {
    private Put_Out adaptee;
    Put_Out_Depot_jTextField2_focusAdapter(Put_Out adaptee) {
        this.adaptee = adaptee;
    }

    public void focusLost(FocusEvent e) {
        try {
			adaptee.jTextField2_focusLost(e);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    }
}


class Put_Out_Depot_jButton3_actionAdapter implements ActionListener {
    private Put_Out adaptee;
    Put_Out_Depot_jButton3_actionAdapter(Put_Out adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton3_actionPerformed(e);
    }
}


class Put_Out_Depot_jButton2_actionAdapter implements ActionListener {
    private Put_Out adaptee;
    Put_Out_Depot_jButton2_actionAdapter(Put_Out adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton2_actionPerformed(e);
    }
}


class Put_Out_Depot_jButton1_actionAdapter implements ActionListener {
    private Put_Out adaptee;
    Put_Out_Depot_jButton1_actionAdapter(Put_Out adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton1_actionPerformed(e);
    }
}


class Put_Out_Depot_jButton4_actionAdapter implements ActionListener {
    private Put_Out adaptee;
    Put_Out_Depot_jButton4_actionAdapter(Put_Out adaptee) {
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
