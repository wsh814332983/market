package dataPart;
import java.sql.*;
import java.util.Vector;

public class SelectTable {
	private static final String select1 =
            "select * from Merchandise where SortNumber=?";
    private static final String select2 =
            "select * from Merchandise where MerchandiseNumber=?";
    private static final String select3 =
            "select * from Merchandise where MerchandiseName=?";
    private static final String select4 =
            "select * from Merchandise where TreatyCode=?";
    private static final String select5 =
            "select * from UserManage where CardId=? ";
    private static final String select6 =
            "select * from UserManage where UserName=? and Password=? and UserGrade=?";
    private static final String select7 =
            "select * from BackSale where NextBack=?";
    private static final String select8 =
            "select * from BackSale where Product_ID=? and NextBack=?";
    private static final String select9 =
            "select number from StockPile where MerchandiseNumber=?";
    private static final String select10 =
            "select * from StockPile where MerchandiseNumber=?";
    private static final String select11 =
            "select * from StockPile";
    
    
   
    
    public SelectTable() {
    }

    public static Vector<String> tablehead() {
        Vector<String> dqname = new Vector<String>();
        dqname.add("��Ʒ����");
        dqname.add("������");
        dqname.add("�����");
        dqname.add("��Ʒ����");
        dqname.add("���ۼ�(Ԫ)");
        dqname.add("��Ʒ���");
        dqname.add("������λ");
        dqname.add("������");
        dqname.add("��ע");
        return dqname;
    }

    public static Vector<Vector<String>> Select_sort1(String number) throws SQLException { //��Ʒ����ѯ
        Connection conn = null;
        PreparedStatement pmst = null;
        ResultSet rs = null;
        Vector<Vector<String>> vector2 = new Vector<Vector<String>>();
        sqlA sqlcom=new sqlA();
        conn = sqlcom.getConection();

        try {
            pmst = conn.prepareStatement(select1);
            pmst.setString(1, number);
            rs = pmst.executeQuery();
            while (rs.next()) {
                Vector<String> vector1 = new Vector<String>();
                vector1.add(rs.getString(2));
                vector1.add(rs.getString(3));
                vector1.add(rs.getString(4));
                vector1.add(rs.getString(5));
                vector1.add(rs.getString(6));
                vector1.add(rs.getString(7));
                vector1.add(rs.getString(8));
                vector1.add(rs.getString(9));
                vector1.add(rs.getString(11));
                vector2.add(vector1);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pmst != null) {
                    pmst.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception ex1) {
                ex1.printStackTrace();
            }

        }
        return vector2;
    }

    public static Vector<Vector<String>> Select_sort2(String number) throws SQLException { //����Ʒ��Ų�ѯ
        Connection conn = null;
        PreparedStatement pmst = null;
        ResultSet rs = null;
        sqlA sqlcom=new sqlA();
        Vector<Vector<String>> vector2 = new Vector<Vector<String>>();
        conn = sqlcom.getConection();

        try {
            pmst = conn.prepareStatement(select2);
            pmst.setString(1, number);
            rs = pmst.executeQuery();
            while (rs.next()) {
                Vector<String> vector1 = new Vector<String>();
                vector1.add(rs.getString(2));
                vector1.add(rs.getString(3));
                vector1.add(rs.getString(4));
                vector1.add(rs.getString(5));
                vector1.add(rs.getString(6));
                vector1.add(rs.getString(7));
                vector1.add(rs.getString(8));
                vector1.add(rs.getString(9));
                vector1.add(rs.getString(11));
                vector2.add(vector1);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pmst != null) {
                    pmst.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception ex1) {
                ex1.printStackTrace();
            }

        }
        return vector2;
    }

    public static Vector<Vector<String>> Select_sort3(String number) throws SQLException { //����Ʒ���Ʋ�ѯ
        Connection conn = null;
        PreparedStatement pmst = null;
        ResultSet rs = null;
        Vector<Vector<String>> vector2 = new Vector<Vector<String>>();
        sqlA sqlcom=new sqlA();
        conn = sqlcom.getConection();

        try {
            pmst = conn.prepareStatement(select3);
            pmst.setString(1, number);
            rs = pmst.executeQuery();
            while (rs.next()) {
                Vector<String> vector1 = new Vector<String>();
                vector1.add(rs.getString(2));
                vector1.add(rs.getString(3));
                vector1.add(rs.getString(4));
                vector1.add(rs.getString(5));
                vector1.add(rs.getString(6));
                vector1.add(rs.getString(7));
                vector1.add(rs.getString(8));
                vector1.add(rs.getString(9));
                vector1.add(rs.getString(11));
                vector2.add(vector1);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pmst != null) {
                    pmst.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception ex1) {
                ex1.printStackTrace();
            }

        }
        return vector2;
    }

    public static Vector<Vector<String>> Select_sort4(String number) throws SQLException { //����Ʒ�������ѯ
        Connection conn = null;
        PreparedStatement pmst = null;
        ResultSet rs = null;
        Vector<Vector<String>> vector2 = new Vector<Vector<String>>();
        sqlA sqlcom=new sqlA();
        conn = sqlcom.getConection();

        try {
            pmst = conn.prepareStatement(select4);
            pmst.setString(1, number);
            rs = pmst.executeQuery();
            while (rs.next()) {
                Vector<String> vector1 = new Vector<String>();
                vector1.add(rs.getString(2));
                vector1.add(rs.getString(3));
                vector1.add(rs.getString(4));
                vector1.add(rs.getString(5));
                vector1.add(rs.getString(6));
                vector1.add(rs.getString(7));
                vector1.add(rs.getString(8));
                vector1.add(rs.getString(9));
                vector1.add(rs.getString(11));
                vector2.add(vector1);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pmst != null) {
                    pmst.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception ex1) {
                ex1.printStackTrace();
            }

        }
        return vector2;
    }

    public static Vector<String> Select_User(String name, String password) {
        Vector<String> vcUser = new Vector<String>();
        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement pmst = null;
        try {
        	 sqlA sqlcom=new sqlA();
            conn = sqlcom.getConection();
            pmst = conn.prepareStatement(select6);
            pmst.setString(1, name);
            pmst.setString(2, password);
            pmst.setString(3, "����Ա");
            rs = pmst.executeQuery();
            rs.next();
            vcUser.add(rs.getString(1));
            vcUser.add(rs.getString(2));
            vcUser.add(rs.getString(3));
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pmst != null) {
                    pmst.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception ex1) {
                ex1.printStackTrace();
            }

        }
        return vcUser;
    }

    public static Vector<String> Select_UserManager(String CardId) { //��ѯ����Ϣ
        Vector<String> vcUser = new Vector<String>();
        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement pmst = null;
        try {
        	 sqlA sqlcom=new sqlA();
            conn = sqlcom.getConection();
            pmst = conn.prepareStatement(select5);
            pmst.setString(1, CardId);
            rs = pmst.executeQuery();
            rs.next();
            vcUser.add(rs.getString(1));
            vcUser.add(rs.getString(2));
            vcUser.add(rs.getString(3));
            vcUser.add(rs.getString(4));
            vcUser.add(rs.getString(5));
            vcUser.add(rs.getString(6));
            vcUser.add(rs.getString(7));
            vcUser.add(rs.getString(8));
            vcUser.add(rs.getString(9));
            vcUser.add(rs.getString(10));

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pmst != null) {
                    pmst.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception ex1) {
                ex1.printStackTrace();
            }

        }
        return vcUser;
    }

    public static Vector<Vector<String>> Select_inoutSale(String Product_ID, String NextBack) { //��ѯ���˻���Ϣ
        Vector<String> vector1 = new Vector<String>();
        Vector<Vector<String>> vector2 = new Vector<Vector<String>>();
        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement pmst = null;
        try {
        	 sqlA sqlcom=new sqlA();
            conn = sqlcom.getConection();
            if (Product_ID.length() == 0) {
                pmst = conn.prepareStatement(select7);
                pmst.setString(1, NextBack);
            } else {
                pmst = conn.prepareStatement(select8);
                pmst.setString(1, Product_ID);
                pmst.setString(2, NextBack);
            }
            rs = pmst.executeQuery();
            rs.next();
            vector1.add(rs.getString(2));
            vector1.add(rs.getString(3));
            vector1.add(rs.getString(4));
            vector1.add(rs.getString(5));
            vector1.add(rs.getString(6));
            vector1.add(rs.getString(7));
            vector1.add(rs.getString(8));
            vector1.add(rs.getString(9));
            vector2.add(vector1);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pmst != null) {
                    pmst.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception ex1) {
                ex1.printStackTrace();
            }

        }
        return vector2;
    }

    public static int Select_StockPile(String Product_ID) { //��ѯ��Ʒ�������
        int number1 = 0;
        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement pmst = null;
        try {
        	 sqlA sqlcom=new sqlA();
            conn = sqlcom.getConection();
            pmst = conn.prepareStatement(select9);
            pmst.setString(1, Product_ID);
            rs = pmst.executeQuery();
            rs.next();
            String num = rs.getString(1);
            Integer number = new Integer(num);
            number1 = number;
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pmst != null) {
                    pmst.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception ex1) {
                ex1.printStackTrace();
            }

        }
        return number1;
    }

    public static Vector<Vector<String>> Select_repertory(String Product_ID) { //������Ʒ�����ѯ���
        Vector<Vector<String>> vector2 = new Vector<Vector<String>>(); //��vector1װ���γ�һ������
        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement pmst = null;
        try {
        	 sqlA sqlcom=new sqlA();
            conn = sqlcom.getConection();
            pmst = conn.prepareStatement(select10);
            pmst.setString(1, Product_ID);
            rs = pmst.executeQuery();
            while (rs.next()) {
                Vector<String> vector1 = new Vector<String>(); //��¼��ѯ������
                Vector<Vector<String>> vector3 = new Vector<Vector<String>>(); //���ղ�ѯ������Ʒ��Ϣ��һ������
                Vector<String> vector4 = new Vector<String>(); //����vector3����Ʒ������
                vector1.add(rs.getString(1));
                vector1.add(rs.getString(2));
                vector3 = Select_sort2(rs.getString(2)); //������Ʒ��Ų�ѯ��Ʒ��Ϣ
                vector4 = (Vector<String>) vector3.get(0);
                vector1.add(vector4.get(3).toString());
                vector1.add(rs.getString(3));
                vector2.add(vector1);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pmst != null) {
                    pmst.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception ex1) {
                ex1.printStackTrace();
            }

        }
        return vector2;
    }
    public static Vector<Vector<String>> Select_All_repertory() { //��ѯ���п��
           Vector<Vector<String>> vector2 = new Vector<Vector<String>>(); //��vector1װ���γ�һ������
           Connection conn = null;
           ResultSet rs = null;
           PreparedStatement pmst = null;
           try {
        	   sqlA sqlcom=new sqlA();
               conn = sqlcom.getConection();
               pmst = conn.prepareStatement(select11);
               rs = pmst.executeQuery();
               while (rs.next()) {
                   Vector<String> vector1 = new Vector<String>(); //��¼��ѯ������
                   Vector<Vector<String>> vector3 = new Vector<Vector<String>>(); //���ղ�ѯ������Ʒ��Ϣ��һ������
                   Vector<String> vector4 = new Vector<String>(); //����vector3����Ʒ������
                   vector1.add(rs.getString(1));
                   vector1.add(rs.getString(2));
                   vector3 = Select_sort2(rs.getString(2)); //������Ʒ��Ų�ѯ��Ʒ��Ϣ
                   vector4 = (Vector<String>) vector3.get(0);
                   vector1.add(vector4.get(3).toString());
                   vector1.add(rs.getString(3));
                   vector2.add(vector1);
               }
           } catch (Exception ex) {
               ex.printStackTrace();
           } finally {
               try {
                   if (rs != null) {
                       rs.close();
                   }
                   if (pmst != null) {
                       pmst.close();
                   }
                   if (conn != null) {
                       conn.close();
                   }
               } catch (Exception ex1) {
                   ex1.printStackTrace();
               }

           }
           return vector2;
    }

}
