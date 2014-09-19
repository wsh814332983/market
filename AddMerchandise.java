package mian;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Vector;

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

public class AddMerchandise extends JDialog{
	JPanel panel1 = new JPanel();
    JLabel jLabel1 = new JLabel();
    JLabel jLabel2 = new JLabel();
    JLabel jLabel3 = new JLabel();
    JLabel jLabel4 = new JLabel();
    JLabel jLabel5 = new JLabel();
    JLabel jLabel6 = new JLabel();
    JLabel jLabel7 = new JLabel();
    JLabel jLabel8 = new JLabel();
    JLabel jLabel9 = new JLabel();
    JLabel jLabel10 = new JLabel();
    JTextField jTextField1 = new JTextField();
    JTextField jTextField2 = new JTextField();
    JTextField jTextField4 = new JTextField();
    JTextField jTextField5 = new JTextField();
    JTextField jTextField6 = new JTextField();
    JTextField jTextField7 = new JTextField();
    JTextField jTextField8 = new JTextField();
    JTextField jTextField9 = new JTextField();
    JTextField jTextField10 = new JTextField();
    JScrollPane jScrollPane1 = new JScrollPane();

    JTable jTable1 = new JTable();
    JTableHeader jTableHeader1 = jTable1.getTableHeader();

    Vector<String> colnames = new Vector<String>(); //±ÌÕ∑
    Vector<String> colnames1 = new Vector<String>(); //≤‚ ‘
    Vector<Vector<String>> colnames2 = new Vector<Vector<String>>(); //≤‚ ‘

    JButton jButton1 = new JButton();
    JButton jButton2 = new JButton();
    JButton jButton3 = new JButton();
    JButton jButton4 = new JButton();
    JComboBox<String> jComboBox1 = new JComboBox<String>();


    public AddMerchandise(Frame owner, String title, boolean modal) {
        super(owner, title, modal);
        try {
            setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            jbInit();
            pack();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public AddMerchandise() {
        this(new Frame(), "AddMerchandise", false);
        this.setSize(900, 480);
    }

    private void jbInit() throws Exception {
        panel1.setLayout(null);
        jLabel1.setText("Mer.Code:");
        jLabel1.setBounds(new Rectangle(15, 10, 85, 26));
        jLabel2.setText("Bar Code:");
        jLabel2.setBounds(new Rectangle(15, 50, 85, 26));
        jLabel3.setText("Type:");
        jLabel3.setBounds(new Rectangle(15, 90, 85, 26));
        jLabel4.setText("Name:");
        jLabel4.setBounds(new Rectangle(15, 130, 85, 26));
        jLabel5.setText("Price:");
        jLabel5.setBounds(new Rectangle(15, 170, 85, 26));
        jLabel6.setText("Scale:");
        jLabel6.setBounds(new Rectangle(15, 210, 85, 26));
        jLabel7.setText("Unit:");
        jLabel7.setBounds(new Rectangle(15, 250, 85, 26));
        jLabel8.setText("Cost:");
        jLabel8.setBounds(new Rectangle(15, 290, 85, 26));
        jLabel9.setText("QGP:");
        jLabel9.setBounds(new Rectangle(15, 330, 85, 26));
        jLabel10.setText("Info:");
        jLabel10.setBounds(new Rectangle(15, 370, 85, 26));
        jComboBox1.addItem("Seafood");
        jComboBox1.addItem("Food");
        jComboBox1.addItem("Vegetable");
        jComboBox1.addItem("Appliance");
        jComboBox1.addItem("Daily Use");
        jComboBox1.addItem("Gift");
        jTextField1.setBounds(new Rectangle(91, 10, 125, 24));
        jTextField2.setBounds(new Rectangle(91, 50, 125, 24));
        jTextField4.setBounds(new Rectangle(91, 130, 125, 24));
        jTextField5.setBounds(new Rectangle(91, 170, 125, 24));
        jTextField6.setBounds(new Rectangle(91, 210, 125, 24));
        jTextField7.setBounds(new Rectangle(91, 250, 125, 24));
        jTextField8.setBounds(new Rectangle(91, 290, 125, 24));
        jTextField9.setBounds(new Rectangle(91, 330, 125, 24));
        jTextField10.setBounds(new Rectangle(91, 370, 125, 24));
        jScrollPane1.setBounds(new Rectangle(228, 10, 658, 383));
        
        //jScrollPane1.setBackground(Color.red);
        jButton1.setBounds(new Rectangle(53, 418, 127, 27));
        jButton1.setText("ADD");
        jButton1.addActionListener(new AddMerchandise_jButton1_actionAdapter(this));
        jButton2.setBounds(new Rectangle(274, 418, 127, 27));
        jButton2.setText("Reset");
        jButton2.addActionListener(new AddMerchandise_jButton2_actionAdapter(this));
        jButton3.setBounds(new Rectangle(496, 418, 127, 27));
        jButton3.setText("Delete");
        jButton3.addActionListener(new AddMerchandise_jButton3_actionAdapter(this));
        jButton4.setBounds(new Rectangle(717, 418, 127, 27));
        jButton4.setText("Save");
        jButton4.addActionListener(new AddMerchandise_jButton4_actionAdapter(this));
        panel1.setBackground(Color.white);
        jComboBox1.setBounds(new Rectangle(91, 90, 125, 24));
        getContentPane().add(panel1);
        panel1.add(jLabel1);
        panel1.add(jLabel2);
        panel1.add(jLabel3);
        panel1.add(jLabel4);
        panel1.add(jLabel5);
        panel1.add(jLabel6);
        panel1.add(jLabel7);
        panel1.add(jLabel8);
        panel1.add(jLabel9);
        panel1.add(jLabel10);
        panel1.add(jTextField5);
        panel1.add(jTextField1);
        panel1.add(jTextField2);
        panel1.add(jTextField4);
        panel1.add(jTextField6);
        panel1.add(jTextField7);
        panel1.add(jTextField8);
        panel1.add(jTextField9);
        panel1.add(jTextField10);
        panel1.add(jScrollPane1);
        panel1.add(jButton4);
        panel1.add(jButton3);
        panel1.add(jButton2);
        panel1.add(jButton1);
        panel1.add(jComboBox1);
        jScrollPane1.getViewport().add(jTable1);
        colnames.add("Mer.Code:");
        colnames.add("Bar Code:");
        colnames.add("Type");
        colnames.add("Name:");
        colnames.add("Price:");
        colnames.add("Scale:");
        colnames.add("Unit:");
        colnames.add("Cost:");
        colnames.add("QGP:");
        colnames.add("Info:");
        colnames2.add(colnames1);
        jTable1 = myTable.maketable(colnames2, colnames);
        jScrollPane1.getViewport().add(jTable1);
    }

    Vector<Vector<String>> addAllData = new Vector<Vector<String>>();
    public void jButton1_actionPerformed(ActionEvent e) {
        if ((jTextField1.getText().length() == 0) ||
            (jTextField2.getText().length() == 0) ||
            (jTextField4.getText().length() == 0) ||
            (jTextField5.getText().length() == 0) ||
            (jTextField6.getText().length() == 0) ||
            (jTextField7.getText().length() == 0) ||
            (jTextField8.getText().length() == 0) ||
            (jTextField9.getText().length() == 0)) {
            JOptionPane.showMessageDialog(this, "Lack of important data", "mention",
                                          JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            Double dj = new Double(jTextField5.getText());
            Double jhj = new Double(jTextField5.getText());
            Double bzq = new Double(jTextField5.getText());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Illegal", "mention",
                                          JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        Vector<String> addData = new Vector<String>();
        addData.add(jTextField1.getText());
        addData.add(jTextField2.getText());
        if (jComboBox1.getSelectedItem().equals("Seafood")) {
            addData.add("SX1001");
        }
        if (jComboBox1.getSelectedItem().equals("Food")) {
            addData.add("SP1002");
        }
        if (jComboBox1.getSelectedItem().equals("Vegetable")) {
            addData.add("SG1003");
        }
        if (jComboBox1.getSelectedItem().equals("Daily Use")) {
            addData.add("RY1005");
        }
        if (jComboBox1.getSelectedItem().equals("Gift")) {
            addData.add("LP1006");
        }
        if (jComboBox1.getSelectedItem().equals("Appliance")) {
            addData.add("DQ1004");
        }
        addData.add(jTextField4.getText());
        addData.add(jTextField5.getText());
        addData.add(jTextField6.getText());
        addData.add(jTextField7.getText());
        addData.add(jTextField8.getText());
        addData.add(jTextField9.getText());
        addData.add(jTextField10.getText());
        addAllData.add(addData);
        jTable1 = myTable.maketable(addAllData, colnames); 
        jScrollPane1.getViewport().add(jTable1);
    }

    public void jButton2_actionPerformed(ActionEvent e) {
        addAllData.removeAllElements();
        jTable1 = myTable.maketable(addAllData, colnames); 
        jScrollPane1.getViewport().add(jTable1);
    }

    public void jButton3_actionPerformed(ActionEvent e) {
        int row = jTable1.getSelectedRow();
        addAllData.remove(row);
        jTable1 = myTable.maketable(addAllData, colnames);
        jScrollPane1.getViewport().add(jTable1);
    }

    public void jButton4_actionPerformed(ActionEvent e) throws SQLException {
        Vector<String> addDate1 = new Vector<String>();
        int i = 0;
        int number=0;
        while (i < addAllData.size()) {
            addDate1 =  addAllData.get(i);
            Double number1=new Double(addDate1.get(4).toString());
            Double number2=new Double(addDate1.get(7).toString());
            Double number3=new Double(addDate1.get(8).toString());
                 number=Insert_stock.Insert_merchandise(addDate1.get(0).toString(),
                    addDate1.get(1).toString(), addDate1.get(2).toString(),
                    addDate1.get(3).toString(), number1,
                    addDate1.get(5).toString(), addDate1.get(6).toString(),
                    number2, number3,
                    addDate1.get(9).toString());
                 i++;
                 String str="ith input is failure";
                 if(number==0){
                     JOptionPane.showMessageDialog(this, str, "mention",
                                          JOptionPane.INFORMATION_MESSAGE);
                     return;
                 }
                 if(i == addAllData.size()){
                     JOptionPane.showMessageDialog(this, "Success", "mention",
                                          JOptionPane.INFORMATION_MESSAGE);
                 }

        }
    }
}


class AddMerchandise_jButton4_actionAdapter implements ActionListener {
    private AddMerchandise adaptee;
    AddMerchandise_jButton4_actionAdapter(AddMerchandise adaptee) {
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


class AddMerchandise_jButton3_actionAdapter implements ActionListener {
    private AddMerchandise adaptee;
    AddMerchandise_jButton3_actionAdapter(AddMerchandise adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton3_actionPerformed(e);
    }
}


class AddMerchandise_jButton2_actionAdapter implements ActionListener {
    private AddMerchandise adaptee;
    AddMerchandise_jButton2_actionAdapter(AddMerchandise adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton2_actionPerformed(e);
    }
}


class AddMerchandise_jButton1_actionAdapter implements ActionListener {
    private AddMerchandise adaptee;
    AddMerchandise_jButton1_actionAdapter(AddMerchandise adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton1_actionPerformed(e);
    }
}
