package mian;
import java.sql.SQLException;
import java.util.*;
import java.util.Timer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.JTableHeader;

import dataPart.Insert_stock;
import dataPart.SelectTable;
import dataPart.UpdateData;
import dataPart.getTime;
//----------------------------------------------------------------
//jTextField1-----------------No. of goods;
//jTextField2-----------------Num of goods;
//jTextField3-----------------price for one;
//jTextField4-----------------discount price;
//jTextField5-----------------received money;
//jTextField6-----------------vip card;
//column ---------------------table title;
//colnames4--------------------table infor;
//------------------------------------------------------------------


public class frontView extends JDialog {
	public static void main(String[] args){
		frontView fron=new frontView();
		fron.setVisible(true);
	}
	JPanel panel1 = new JPanel();
    JScrollPane jScrollPane1 = new JScrollPane();
    JTextField jTextField1 = new JTextField();
    JLabel jLabel1 = new JLabel();
    JTextField jTextField2 = new JTextField();
    JTextField jTextField3 = new JTextField();
    JLabel jLabel2 = new JLabel();
    JLabel jLabel3 = new JLabel();
    JLabel jLabel4 = new JLabel();
    JLabel jLabel5 = new JLabel();
    JLabel jLabel6 = new JLabel();
    JLabel jLabel7 = new JLabel();
    JLabel jLabel8 = new JLabel();
    JLabel jLabel9 = new JLabel();
    TitledBorder titledBorder1 = new TitledBorder("");

    JTable jTable1 = new JTable();
    JTableHeader jTableHeader1 = jTable1.getTableHeader();

    Vector<String> colnames = new Vector<String>(); //table title
//    Vector<String> colnames1 = new Vector<String>(); //test;
//    Vector<Vector<String>> colnames2 = new Vector<Vector<String>>(); //test;
    Vector<Vector<String>> colnames4 = new Vector<Vector<String>>();
    JTextField jTextField5 = new JTextField(); //received money;
    JButton jButton1 = new JButton();
    JButton jButton2 = new JButton();
    JButton jButton3 = new JButton();
    JTextField jTextField6 = new JTextField();
    JLabel jLabel10 = new JLabel();
    JLabel jLabel11 = new JLabel();
    JLabel jLabel12 = new JLabel();
    JTextField jTextField4 = new JTextField();
    public frontView(Frame owner, String title, boolean modal) {
        super(owner, title, modal);
        try {
            setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            jbInit();
            pack();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public frontView() {
        this(new Frame(), "前台收银程序", false);
        this.setSize(800, 600);
        this.setLocation(50, 50);

    }

    private void jbInit() throws Exception {
        panel1.setLayout(null);
        jTextField3.setEnabled(false);
        jTextField5.setFont(new java.awt.Font("宋体", Font.PLAIN, 30));
        jTextField5.setText("0");
        jTextField5.setBounds(new Rectangle(335, 520, 125, 40));

        jTextField5.addKeyListener(new frontView_jTextField5_keyAdapter(this));
        jButton1.setBounds(new Rectangle(436, 489, 96, 25));
        jButton1.setText("delete");
        jButton1.addActionListener(new frontView_jButton1_actionAdapter(this));

        jButton2.setBounds(new Rectangle(685, 489, 96, 25));
        jButton2.setText("cancel");
        jButton2.addActionListener(new frontView_jButton2_actionAdapter(this));
        jTextField2.addKeyListener(new frontView_jTextField2_keyAdapter(this));//goods
        jButton3.setBounds(new Rectangle(560, 489, 96, 25));
        jButton3.setToolTipText("");
        jButton3.setText("to admin");
        jButton3.addActionListener(new frontView_jButton3_actionAdapter(this));
        jTextField6.setFont(new java.awt.Font("宋体", Font.PLAIN, 20));
        jTextField6.setBounds(new Rectangle(91, 489, 152, 21));
        jTextField6.addFocusListener(new
                                     frontView_jTextField6_focusAdapter(this));
        jLabel10.setText("vip");
        jLabel10.setBounds(new Rectangle(30, 488, 48, 15));
        jLabel6.setText("0");
        jLabel8.setText("0");
        jTextField1.setFont(new java.awt.Font("宋体", Font.PLAIN, 20));
        jTextField1.addFocusListener(new
                                     frontView_jTextField1_focusAdapter(this));
        jTextField2.setFont(new java.awt.Font("宋体", Font.PLAIN, 20));
        jTextField2.setText("1");
        jLabel11.setBorder(BorderFactory.createEtchedBorder());
        jLabel11.setDebugGraphicsOptions(0);
        jLabel11.setBounds(new Rectangle(621, 460, 159, 21));
        jLabel12.setText("current time");
        jLabel12.setBounds(new Rectangle(560, 463, 48, 15));
        jTextField4.setEnabled(false);
        jTextField4.setText("100");
        jTextField4.setBounds(new Rectangle(436, 456, 96, 21));
        this.getContentPane().add(panel1, java.awt.BorderLayout.CENTER);
        jTextField1.setBounds(new Rectangle(91, 460, 152, 21));
        jLabel1.setText("Mer No.");
        jLabel1.setBounds(new Rectangle(30, 463, 60, 15));
        jTextField2.setBounds(new Rectangle(302, 460, 72, 21));
        jTextField3.setBounds(new Rectangle(302, 489, 72, 21));
        jLabel2.setText("Num");
        jLabel2.setBounds(new Rectangle(267, 463, 42, 15));
        jLabel3.setText("Pri.");
        jLabel3.setBounds(new Rectangle(267, 489, 42, 15));
        jLabel4.setText("Dis.");
        jLabel4.setBounds(new Rectangle(399, 460, 42, 15));
        jLabel5.setFont(new java.awt.Font("宋体", Font.PLAIN, 30));
        jLabel5.setText("Tot.");
        jLabel5.setBounds(new Rectangle(26, 517, 88, 40));
        jLabel6.setBackground(Color.white);
        jLabel6.setFont(new java.awt.Font("宋体", Font.PLAIN, 30));
        jLabel6.setBorder(BorderFactory.createEtchedBorder());
        jLabel6.setBounds(new Rectangle(110, 517, 125, 40));
        jLabel7.setFont(new java.awt.Font("宋体", Font.PLAIN, 30));
        jLabel7.setText("Cha");
        jLabel7.setBounds(new Rectangle(473, 519, 88, 40));
        jLabel8.setFont(new java.awt.Font("宋体", Font.PLAIN, 30));
        jLabel8.setBorder(BorderFactory.createEtchedBorder());
        jLabel8.setBounds(new Rectangle(550, 520, 125, 40));
        jLabel9.setFont(new java.awt.Font("宋体", Font.PLAIN, 30));
        jLabel9.setText("Rec.");
        jLabel9.setBounds(new Rectangle(251, 516, 88, 40));
        Timer timer = new Timer();
        timer.schedule(new RemindTask(), 0, 1000); //得到当前时间
        jLabel11.setText(getTime.GetTime());
        panel1.add(jScrollPane1);
        jScrollPane1.getViewport().add(jTable1);
        panel1.add(jLabel5);
        panel1.add(jLabel6);
        panel1.add(jLabel9);
        panel1.add(jTextField5);
        panel1.add(jLabel7);
        panel1.add(jLabel8);
        panel1.add(jTextField2);
        panel1.add(jLabel1);
        panel1.add(jTextField1);
        panel1.add(jLabel2);
        panel1.add(jTextField6);
        panel1.add(jLabel10);
        panel1.add(jTextField3);
        panel1.add(jLabel3);
        panel1.add(jLabel4);
        panel1.add(jButton1);
        panel1.add(jButton3);
        panel1.add(jButton2);
        panel1.add(jLabel11);
        panel1.add(jLabel12);
        panel1.add(jTextField4);
        this.getContentPane().add(jTableHeader1, java.awt.BorderLayout.NORTH);
        colnames.add("No.");
        colnames.add("Name");
        colnames.add("Scale");
        colnames.add("Unit");
        colnames.add("Num");
        colnames.add("Price");
        colnames.add("Discount");
        colnames.add("Tot.price");

       // colnames2.add(colnames1);
        jTable1 = myTable.maketable(colnames4, colnames); //显示内容
        jScrollPane1.getViewport().add(jTable1); //把表装入容器
        jScrollPane1.setBounds(new Rectangle(24, 28, 746, 419));
        panel1.setBackground(Color.white);
    }

    class RemindTask extends TimerTask {
        public void run() {
            jLabel11.setText(getTime.GetTime());
        }
    }


    public void jButton2_actionPerformed(ActionEvent e) {
    	System.out.print("cancel deal");
        jTextField6.setEditable(true);
        jTextField6.setText("");
        colnames4.removeAllElements();
        jTable1 = myTable.maketable(colnames4, colnames); 
        jScrollPane1.getViewport().add(jTable1); 
    }

    public void jTextField5_keyReleased(KeyEvent e) throws SQLException {
    	
    	//Pay!!!
        int t = (int) e.getKeyChar();
        if (t == 10) { 
            try {
                Double gather = new Double(jTextField5.getText());
                double gathering = ((int) (gather * 100)) / 100.0;
                Double account = new Double(jLabel6.getText());
                double givechange = ((int) ((gathering - account) * 100)) /
                                    100.0;
                if (givechange < 0) {
                    JOptionPane.showMessageDialog(this, "not enough money!!", "error",
                                                  JOptionPane.ERROR_MESSAGE);
                    return;
                }
                Double givechange1 = new Double(givechange);

                jLabel8.setText(givechange1.toString());
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "error", "error",
                                              JOptionPane.ERROR_MESSAGE);
                return;
            }
            Settle_Dialog sett = new Settle_Dialog();
            sett.setSize(400, 300);
            sett.setLocation(300, 250);
            sett.setVisible(true); 
            sett.jTextField1.setText(jLabel6.getText());
            sett.jTextField2.setText(jTextField5.getText());
            sett.jTextField3.setText(jLabel8.getText());
            jTextField6.setEditable(true); 
            jTextField6.setText("");
            
            int num1 = 0;
            while (num1 < colnames4.size()) { 
                Vector<String> ls = new Vector<String>();
                ls = (Vector<String>) colnames4.get(num1);
                ls.get(0).toString();
                jLabel11.getText();
                Integer number = new Integer(ls.get(4).toString()); 
                Double Price = new Double(ls.get(5).toString());
              ls.get(6).toString();//dis
              jTextField6.getText();//vip
              ls.get(1).toString();//name
                UpdateData.out_StockPile(number, ls.get(0).toString());
                Insert_stock.Insert_Sale(ls.get(0).toString(),
                                         jLabel11.getText(), number,
                                         Price, ls.get(6).toString(),
                                         jTextField6.getText(),
                                         ls.get(1).toString());
                num1++;
            }
            jTextField1.setText("");
            jTextField2.setText("1");
            colnames4.removeAllElements();
            jTable1 = myTable.maketable(colnames4, colnames); 
            jScrollPane1.getViewport().add(jTable1); 

        }

    }


    public void jTextField2_keyReleased(KeyEvent e) throws SQLException {

        if (jTextField1.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "product can't empty", "error",
                                          JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (jTextField2.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "can't empty", "error",
                                          JOptionPane.ERROR_MESSAGE);
            return;
        }
        colnames.removeAllElements();
        colnames.add("No.");
        colnames.add("Name");
        colnames.add("Scale");
        colnames.add("Unit");
        colnames.add("Num");
        colnames.add("Price");
        colnames.add("Discount");
        colnames.add("Tot.price");

        int t = (int) e.getKeyChar();
        if (t == 10) {
            Vector<Vector<String>> colnames2 = new Vector<Vector<String>>();
            Vector<String> colnames3 = new Vector<String>();
            Vector<String> colnames5 = new Vector<String>();
            // Vector User =new Vector();
            colnames2 = SelectTable.Select_sort2(jTextField1.getText()); 
            colnames3 = (Vector<String>) colnames2.get(0);
            if (jTextField6.getText().length() == 0) {
            }
            jTextField3.setText(colnames3.get(4).toString());
            if (colnames3.size() == 0) {
                JOptionPane.showMessageDialog(this, "no found", "error",
                                              JOptionPane.ERROR_MESSAGE);
                return;
            }

            colnames5.add(colnames3.get(0)); 
            colnames5.add(colnames3.get(3)); 
            colnames5.add(colnames3.get(5)); 
            colnames5.add(colnames3.get(6)); 
            colnames5.add(jTextField2.getText()); 
            colnames5.add(colnames3.get(4));
            colnames5.add(jTextField4.getText()); 

            try {
                Integer number1 = new Integer(jTextField2.getText());
                Double number2 = new Double(jTextField3.getText());
                Double number3 = new Double(jTextField4.getText());
                double money = ((int) (number1 * number2 * number3)) / 100.0;
                Double Money = new Double(money);
                colnames5.add(Money.toString()); 
                colnames4.add(colnames5);
                 jTable1 = myTable.maketable(colnames4, colnames);
                jScrollPane1.getViewport().add(jTable1); 
                int num = 0;
                double Payment = 0;
                while (num < colnames4.size()) {
                    Vector<String> allMoney;
                    allMoney = (Vector<String>) colnames4.get(num);
                    Double allMoney1 = new Double(allMoney.get(7).toString());
                    Payment += allMoney1;
                    num++;
                }
                Double PaymentAll = new Double(Payment);
                jLabel6.setText(PaymentAll.toString());

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "num error", "error",
                                              JOptionPane.ERROR_MESSAGE);
            }

        }

    }

    public void jButton1_actionPerformed(ActionEvent e) {
    	//delete product
    	int row[]=jTable1.getSelectedRows();
        //int row = jTable1.getSelectedRow();
    	for(int i=row.length-1;i>=0;i--){
    		colnames4.remove(row[i]);
    	}
        jTable1 = myTable.maketable(colnames4, colnames); 
        jScrollPane1.getViewport().add(jTable1); 
        int num = 0;
        double Payment = 0;
        while (num < colnames4.size()) {
            Vector<String> allMoney;
            allMoney = (Vector<String>) colnames4.get(num);
            Double allMoney1 = new Double(allMoney.get(7).toString());
            Payment += allMoney1;
            num++;
        }
        Double PaymentAll = new Double(Payment);
        jLabel6.setText(PaymentAll.toString());

    }

    public void jButton3_actionPerformed(ActionEvent e) {
    	//to next station
        login admi = new login(this);
        admi.setVisible(true);  
        admi.setLocation(200, 200);
    }

    public void jTextField1_focusLost(FocusEvent e) throws SQLException {
    	//find 
        if (jTextField1.getText().length() != 0) {
            Vector<Vector<String>> select1 = SelectTable.Select_sort2(jTextField1.getText());
            System.out.print(select1.size());
            Vector<String> select2 = new Vector<String>();
            if (select1.size() == 0) {
                JOptionPane.showMessageDialog(this, "no such Mer.", "error",
                                              JOptionPane.ERROR_MESSAGE);
                return;
            } else {
                select2 =  select1.get(0);
                jTextField3.setText(select2.get(4).toString()); //单价
            }
        }
    }

    public void jTextField6_focusLost(FocusEvent e) {
        Vector<String> User = new Vector<String>();
        if (jTextField6.getText().length() == 0) {
        } else {
            User = SelectTable.Select_UserManager(jTextField6.
                    getText());
            if (User.size() == 0) {
                JOptionPane.showMessageDialog(this, "invalid card", "error",
                                              JOptionPane.ERROR_MESSAGE);
                return;
            } else {
                String str = User.get(8).toString();
                jTextField4.setText(str);
                jTextField6.setEditable(false);
            }
        }

    }

}


class frontView_jButton3_actionAdapter implements ActionListener {
    private frontView adaptee;
    frontView_jButton3_actionAdapter(frontView adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton3_actionPerformed(e);
    }
}


class frontView_jTextField5_keyAdapter extends KeyAdapter {
    private frontView adaptee;
    frontView_jTextField5_keyAdapter(frontView adaptee) {
        this.adaptee = adaptee;
    }

    public void keyReleased(KeyEvent e) {
        try {
			adaptee.jTextField5_keyReleased(e);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    }
}


class frontView_jTextField2_keyAdapter extends KeyAdapter {
    private frontView adaptee;
    frontView_jTextField2_keyAdapter(frontView adaptee) {
        this.adaptee = adaptee;
    }

    public void keyReleased(KeyEvent e) {
        try {
			adaptee.jTextField2_keyReleased(e);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    }
}


class frontView_jTextField6_focusAdapter extends FocusAdapter {
    private frontView adaptee;
    frontView_jTextField6_focusAdapter(frontView adaptee) {
        this.adaptee = adaptee;
    }

    public void focusLost(FocusEvent e) {
        adaptee.jTextField6_focusLost(e);
    }
}


class frontView_jTextField1_focusAdapter extends FocusAdapter {
    private frontView adaptee;
    frontView_jTextField1_focusAdapter(frontView adaptee) {
        this.adaptee = adaptee;
    }

    public void focusLost(FocusEvent e) {
        try {
			adaptee.jTextField1_focusLost(e);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    }
}


class frontView_jButton2_actionAdapter implements ActionListener {
    private frontView adaptee;
    frontView_jButton2_actionAdapter(frontView adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton2_actionPerformed(e);
    }
}


class frontView_jButton1_actionAdapter implements ActionListener {
    private frontView adaptee;
    frontView_jButton1_actionAdapter(frontView adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton1_actionPerformed(e);
    }
}

