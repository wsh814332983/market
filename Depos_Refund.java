package mian;



import java.awt.Color;
import java.awt.Font;
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
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.JTableHeader;

import dataPart.Insert_stock;
import dataPart.SelectTable;
import dataPart.getTime;

public class Depos_Refund extends JDialog {
	Timestamp ts = new Timestamp(System.currentTimeMillis());
    JPanel panel1 = new JPanel();
    JLabel jLabel1 = new JLabel();
    JComboBox<String> jComboBox1 = new JComboBox<String>();
    JLabel jLabel2 = new JLabel();
    JTextField jTextField1 = new JTextField();
    JLabel jLabel3 = new JLabel();
    JComboBox<String> jComboBox2 = new JComboBox<String>();
    JLabel jLabel4 = new JLabel();
    JLabel jLabel6 = new JLabel();
    JTextField jTextField2 = new JTextField();
    JLabel jLabel7 = new JLabel();
    JTextField jTextField3 = new JTextField();
    JLabel jLabel8 = new JLabel();
    JTextField jTextField4 = new JTextField();
    JLabel jLabel9 = new JLabel();

    JTable jTable1 = new JTable();
    JTableHeader jTableHeader1 = jTable1.getTableHeader();

    Vector<String> colnames = new Vector<String>(); 
    Vector<String> colnames1 = new Vector<String>();
    Vector<Vector<String>> colnames2 = new Vector<Vector<String>>();


    JScrollPane jScrollPane1 = new JScrollPane();
    JButton jButton1 = new JButton();
    JButton jButton2 = new JButton();
    JButton jButton3 = new JButton();
    JButton jButton4 = new JButton();
    JButton jButton5 = new JButton();
    JLabel jLabel5 = new JLabel();
    JScrollPane jScrollPane2 = new JScrollPane();
    JTextArea jTextArea1 = new JTextArea();


    public Depos_Refund(Frame owner, String title, boolean modal) {
        super(owner, title, modal);
        try {
            setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            jbInit();
            pack();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public Depos_Refund() {
        this(new Frame(), "Depos_Refund", false);
        this.setSize(600, 500);
    }

    private void jbInit() throws Exception {
        panel1.setLayout(null);
        this.getContentPane().setLayout(null);
        jLabel4.setBorder(BorderFactory.createEtchedBorder());
        jLabel4.setBounds(new Rectangle(29, 7, 536, 36));
        jLabel6.setText("Mer.No.:");
        jLabel6.setBounds(new Rectangle(45, 50, 68, 21));
        jTextField2.setBounds(new Rectangle(112, 50, 127, 21));
        jTextField2.addFocusListener(new Depos_Refund_jTextField2_focusAdapter(this));
        jLabel7.setText("Number:");
        jLabel7.setBounds(new Rectangle(263, 50, 38, 21));
        jTextField3.setBounds(new Rectangle(297, 50, 68, 21));
        jLabel8.setText("Cost:");
        jLabel8.setBounds(new Rectangle(394, 50, 68, 21));
        jTextField4.setBounds(new Rectangle(457, 50, 68, 21));
        jLabel9.setBorder(BorderFactory.createEtchedBorder());
        jLabel9.setBounds(new Rectangle(29, 42, 536, 41));
        jScrollPane1.setBounds(new Rectangle(29, 82, 536, 270));
        jButton1.setBounds(new Rectangle(72, 436, 81, 30));
        jButton1.setSelectedIcon(null);
        jButton1.setText("sure:");
        jButton1.addActionListener(new Depos_Refund_jButton1_actionAdapter(this));
        jButton2.setBounds(new Rectangle(173, 436, 81, 30));
        jButton2.setText("delete:");
        jButton2.addActionListener(new Depos_Refund_jButton2_actionAdapter(this));
        jButton3.setBounds(new Rectangle(274, 436, 81, 30));
        jButton3.setText("cancel:");
        jButton3.addActionListener(new Depos_Refund_jButton3_actionAdapter(this));
        jButton4.setBounds(new Rectangle(375, 436, 81, 30));
        jButton4.setText("Save:");
        jButton4.addActionListener(new Depos_Refund_jButton4_actionAdapter(this));
        panel1.setBackground(Color.white);
        this.getContentPane().setBackground(Color.white);
        this.setForeground(Color.white);
        jButton5.setBounds(new Rectangle(476, 436, 81, 30));
        jButton5.setToolTipText("");
        jButton5.setText("search:");
        jButton5.addActionListener(new Depos_Refund_jButton5_actionAdapter(this));
        jLabel5.setFont(new java.awt.Font("ËÎÌו", Font.PLAIN, 30));
        jLabel5.setText("Info:");
        jLabel5.setBounds(new Rectangle(47, 366, 96, 45));
        jScrollPane2.setBounds(new Rectangle(120, 352, 444, 70));
        this.getContentPane().add(panel1, null);
        jComboBox2.setBounds(new Rectangle(433, 14, 94, 20));
        jLabel3.setText("Maker:");
        jLabel3.setBounds(new Rectangle(380, 14, 84, 20));
        jTextField1.setBounds(new Rectangle(225, 14, 131, 20));
        jLabel2.setText("Time:");
        jLabel2.setBounds(new Rectangle(187, 14, 84, 20));
        jComboBox1.setBounds(new Rectangle(79, 14, 84, 20));
        Timer timer = new Timer();
        timer.schedule(new RemindTask(), 0, 1000);
        this.getContentPane().add(jComboBox2);
        this.getContentPane().add(jTextField1);
        this.getContentPane().add(jComboBox1);
        this.getContentPane().add(jLabel1);
        this.getContentPane().add(jLabel2);
        this.getContentPane().add(jLabel3);
        this.getContentPane().add(jLabel4);
        this.getContentPane().add(jButton5);
        this.getContentPane().add(jButton1);
        this.getContentPane().add(jButton2);
        this.getContentPane().add(jButton3);
        this.getContentPane().add(jButton4);
        this.getContentPane().add(jTextField2);
        this.getContentPane().add(jLabel9);
        this.getContentPane().add(jLabel6);
        this.getContentPane().add(jLabel7);
        this.getContentPane().add(jTextField3);
        this.getContentPane().add(jLabel8);
        this.getContentPane().add(jTextField4);
        this.getContentPane().add(jScrollPane1);
        this.getContentPane().add(jScrollPane2);
        this.getContentPane().add(jLabel5);
        jScrollPane2.getViewport().add(jTextArea1);
        jScrollPane1.getViewport().add(jTable1);
        jLabel1.setText("Type:");
        jLabel1.setBounds(new Rectangle(43, 14, 84, 20));
        panel1.setBounds(new Rectangle(0, 399, 1, 1));
        jComboBox1.addItem("Stock");
        jComboBox1.addItem("Refund");
        jComboBox2.addItem("Tianxiang");
        jComboBox2.addItem("tianxiagn");
        jComboBox2.addItem("zhang");
        jTextField1.setText(ts.toString().substring(0, 19));
        colnames.add("Mer.No:");
        colnames.add("Name:");
        colnames.add("Num:");
        colnames.add("Cost");
        colnames.add("Date:");
        colnames.add("Total:");

        colnames1.add("");
        colnames1.add("");
        colnames1.add("");
        colnames1.add("");
        colnames1.add("");
        colnames2.add(colnames1);
        jTable1 = myTable.maketable(colnames2, colnames); 
    }

    Vector<Vector<String>> vector1 = new Vector<Vector<String>>();
    public void jButton1_actionPerformed(ActionEvent e) throws SQLException {
        Vector<Vector<String>> select1 = SelectTable.Select_sort2(jTextField2.getText());
        if (select1.size() == 0) {
            JOptionPane.showMessageDialog(this, "No exist", "error!",
                                          JOptionPane.ERROR_MESSAGE);
            return;
        }
        Vector<String> select2 =select1.get(0);
        Vector<String> vector = new Vector<String>();
        double allMoney = 0;
        vector.add(jTextField2.getText());
        vector.add(select2.get(3).toString());
        vector.add(jTextField3.getText());
        vector.add(jTextField4.getText());
        vector.add(jTextField1.getText());

        try {
            Double num = new Double(jTextField3.getText());
            Double money = new Double(jTextField4.getText());
            allMoney = (int) (num * money * 100) / 100.0;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Input error", "error!",
                                          JOptionPane.ERROR_MESSAGE);
            return;
        }
        Double dd = new Double(allMoney);
        vector.add(dd.toString());
        vector1.add(vector);
        jTable1 = myTable.maketable(vector1, colnames); 
        jScrollPane1.getViewport().add(jTable1); 
    }

    public void jButton2_actionPerformed(ActionEvent e) {
        int row = jTable1.getSelectedRow();
        vector1.remove(row);
        jTable1 = myTable.maketable(vector1, colnames); 
        jScrollPane1.getViewport().add(jTable1); 
    }

    public void jButton3_actionPerformed(ActionEvent e) {
        vector1.removeAllElements();
        jTable1 = myTable.maketable(vector1, colnames); 
        jScrollPane1.getViewport().add(jTable1); 
    }

    public void insertData(String NextBack) throws SQLException {

        int insertnumber = 0;
        while (insertnumber < vector1.size()) {
            Vector<String> insertVector ;
            insertVector =  vector1.get(insertnumber);
            String str1 = insertVector.get(0).toString(); 
            String str2 = insertVector.get(1).toString(); 
            String str3 = insertVector.get(2).toString(); 
            Double num1 = new Double(str3); 
            String str4 = insertVector.get(3).toString(); 
            Double num2 = new Double(str4); 
            String str5 = insertVector.get(4).toString(); 
            String str6 = jComboBox2.getSelectedItem().toString();
            String str7 = NextBack;
            String str8 = jTextArea1.getText();
            int i = Insert_stock.Insert_NextBackStock(str1, str2, num1, num2,
                    str5, str6, str7, str8);
            if (i == 0) {
                insertnumber++;
                String str = "iTh input is failure";
                JOptionPane.showMessageDialog(this, str, "error",
                                              JOptionPane.ERROR_MESSAGE);
                return;

            }
            insertnumber++;
            if (insertnumber == vector1.size()) {
                JOptionPane.showMessageDialog(this, "done", "mention",
                                              JOptionPane.INFORMATION_MESSAGE);
            }
        }

    }

    public void jButton4_actionPerformed(ActionEvent e) throws SQLException {
        if (jComboBox1.getSelectedItem().equals("Stock:")) {
            insertData("1");
        }
        if (jComboBox1.getSelectedItem().equals("refund:")) {
            insertData("0");
        }

    }

    public void jTextField2_focusLost(FocusEvent e) throws SQLException {
        if (jTextField1.getText().length() != 0) {
            Vector<Vector<String>> select1 = SelectTable.Select_sort2(jTextField2.getText());
            Vector<String> select2;
            if (select1.size() == 0) {
                JOptionPane.showMessageDialog(this, "not exist", "error",
                                              JOptionPane.ERROR_MESSAGE);
                return;
            } else {
                select2 = select1.get(0);
                Double pice=new Double(select2.get(4).toString());
                double pice1=((int)(pice*100))/100.0;
                 Double pice2=new Double(pice1);
                jTextField4.setText(pice2.toString()); 
            }
        }
    }

    public void jButton5_actionPerformed(ActionEvent e) {
        if (jComboBox1.getSelectedItem().equals("Stock:")) {
            Vector<Vector<String>> selectData;
            selectData = SelectTable.Select_inoutSale(jTextField2.getText(),
                    "1");
            int i = 0;
            vector1.removeAllElements();
            while (i < selectData.size()) {
                Vector<String> select1 = new Vector<String>();
                Vector<String> selectData1 = new Vector<String>();
                select1 = selectData.get(i);

                selectData1.add(select1.get(0).toString());
                selectData1.add(select1.get(1).toString());
                selectData1.add(select1.get(2).toString());
                selectData1.add(select1.get(3).toString());
                selectData1.add(select1.get(4).toString());
                Double num1 = new Double(selectData1.get(2).toString());
                Double num2 = new Double(selectData1.get(3).toString());
                double num3 = ((int) (num2 * num1 * 100)) / 100.0;
                Double num4 = new Double(num3);
                selectData1.add(num4.toString());
                i++;
                vector1.add(selectData1);
            }

            jTable1 = myTable.maketable(vector1, colnames); 
            jScrollPane1.getViewport().add(jTable1); 
        }
        if (jComboBox1.getSelectedItem().equals("Refund:")) {
            Vector<Vector<String>> selectData;
            selectData = SelectTable.Select_inoutSale(jTextField2.getText(),
                    "0");
            int i = 0;
            vector1.removeAllElements();
            while (i < selectData.size()) {
                Vector<String> select1 ;
                Vector<String> selectData1 = new Vector<String>();
                select1 = selectData.get(i);
                selectData1.add(select1.get(0).toString());
                selectData1.add(select1.get(1).toString());
                selectData1.add(select1.get(2).toString());
                selectData1.add(select1.get(3).toString());
                selectData1.add(select1.get(4).toString());
                Double num1 = new Double(selectData1.get(2).toString());
                Double num2 = new Double(selectData1.get(3).toString());
                double num3 = ((int) (num2 * num1 * 100)) / 100.0;
                Double num4 = new Double(num3);
                selectData1.add(num4.toString());
                i++;
                vector1.add(selectData1);
            }

            jTable1 = myTable.maketable(vector1, colnames); 
            jScrollPane1.getViewport().add(jTable1); 

        }

    }

    class RemindTask extends TimerTask {
        public void run() {
            jTextField1.setText(getTime.GetTime());
        }
    }

}


class Depos_Refund_jButton5_actionAdapter implements ActionListener {
    private Depos_Refund adaptee;
    Depos_Refund_jButton5_actionAdapter(Depos_Refund adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton5_actionPerformed(e);
    }
}


class Depos_Refund_jTextField2_focusAdapter extends FocusAdapter {
    private Depos_Refund adaptee;
    Depos_Refund_jTextField2_focusAdapter(Depos_Refund adaptee) {
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


class Depos_Refund_jButton4_actionAdapter implements ActionListener {
    private Depos_Refund adaptee;
    Depos_Refund_jButton4_actionAdapter(Depos_Refund adaptee) {
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


class Depos_Refund_jButton3_actionAdapter implements ActionListener {
    private Depos_Refund adaptee;
    Depos_Refund_jButton3_actionAdapter(Depos_Refund adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton3_actionPerformed(e);
    }
}


class Depos_Refund_jButton2_actionAdapter implements ActionListener {
    private Depos_Refund adaptee;
    Depos_Refund_jButton2_actionAdapter(Depos_Refund adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton2_actionPerformed(e);
    }
}


class Depos_Refund_jButton1_actionAdapter implements ActionListener {
    private Depos_Refund adaptee;
    Depos_Refund_jButton1_actionAdapter(Depos_Refund adaptee) {
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
