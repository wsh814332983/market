package dataPart;

import java.sql.*;

public class Insert_stock {
	public Insert_stock() {
    }

    private static final String insert1 = "insert stock(MerchandiseNumber,MerchandiseName,department,number,unitprice,overallmoney,data,paymentdate) values(?,?,?,?,?,?,?,?)";
    private static final String insert2 = "insert Merchandise(MerchandiseNumber,TreatyCode, SortNumber,MerchandiseName, RetailPrice,MerchandiseSpec, Units,PurchasePrice, CheckTerm, Remark) values(?,?,?,?,?,?,?,?,?,?)";
    private static final String insert3 = "insert UserManage(cardId,UserName,IDcard,password,CardDate,UserGrade,term,integral,agio,remark) values(?,?,?,?,?,?,?,?,?,?)";
    private static final String insert4 = "insert sale (ProductID,SaleDate,Number,Price,Discount,VIP_ID,ProductName) values(?,?,?,?,?,?,?)";
                                                       
    private static final String insert5 = "insert EnterStock(MerNumber,Number,PurchasePrice,PutData,StoreHouse_ID,dealWithHuman,downName,inout) values(?,?,?,?,?,?,?,?)";
    private static final String insert6 = "insert BackSale(Product_ID,ProductName,Number,Price,JtDate,SuperMarket,NextBack,reason) values(?,?,?,?,?,?,?,?)";
    public static int Insert_stock1(String MerchandiseNumber,
                                   String MerchandiseName,
                                   String department,
                                   String number, String unitprice,
                                   String overallmoney, String date,
                                   String paymentdate) throws SQLException {
        int stock = 0;
        Connection conn = null;
        PreparedStatement pmst = null;
        sqlA sqls=new sqlA();
        conn = sqls.getConection();

        try {
            pmst = conn.prepareStatement(insert1);
            pmst.setString(1, MerchandiseNumber);
            pmst.setString(2, MerchandiseName);
            pmst.setString(3, department);
            pmst.setString(4, number);
            pmst.setString(5, unitprice);
            pmst.setString(6, overallmoney);
            pmst.setString(7, date);
            pmst.setString(8, paymentdate);
            stock = pmst.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
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
        return stock;
    }

    public static int Insert_merchandise(String MerchandiseNumber,
    		String TreatyCode, 
    		String SortNumber,
    		String MerchandiseName,
    		double RetailPrice,
    		String MerchandiseSpec,
    		String  Units,
    		double PurchasePrice, 
    		double CheckTerm,
    		String  Remark) throws SQLException {
        int stock = 0;
        Connection conn = null;
        PreparedStatement pmst = null;
        sqlA sqls=new sqlA();
        conn =sqls.getConection();

        try {
            pmst = conn.prepareStatement(insert2);
            pmst.setString(1, MerchandiseNumber);
            pmst.setString(2, TreatyCode);
            pmst.setString(3, SortNumber);
            pmst.setString(4, MerchandiseName);
            pmst.setDouble(5, RetailPrice);
            pmst.setString(6, MerchandiseSpec);
            pmst.setString(7, Units);
            pmst.setDouble(8, PurchasePrice);
            pmst.setDouble(9, CheckTerm);
            pmst.setString(10, Remark);

            stock = pmst.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
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
        return stock;
    }

    public static int Insert_User(String cardId, String name, String IDcard,
                                  String password, String CardDate,
                                  String UserGrade, String term,
                                  String integral, String agio, String remark) throws SQLException {
        int insert_User=0;
        Connection conn=null;
        PreparedStatement pmst =null;
        sqlA sqls=new sqlA();
        conn=sqls.getConection();
        try {
            pmst = conn.prepareStatement(insert3);
            pmst.setString(1,cardId);
            pmst.setString(2,name);
            pmst.setString(3,IDcard);
            pmst.setString(4,password);
            pmst.setString(5,CardDate);
            pmst.setString(6,UserGrade);
            pmst.setString(7,term);
            pmst.setString(8,integral);
            pmst.setString(9,agio);
            pmst.setString(10,remark);
            insert_User=pmst.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally {
            try {
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


        return insert_User;

    }
    public static int Insert_Sale(String Product_ID,
    		String SaleDate,
    		int Number,
    		double Price,
    		String Discount,
    		String VIP_ID,
    		String ProductName) throws SQLException {
           int insert_Sale=0;
           Connection conn=null;
           PreparedStatement pmst =null;
           sqlA sqls=new sqlA();
           conn=sqls.getConection();
           try {
               pmst = conn.prepareStatement(insert4);
               pmst.setString(1,Product_ID);
               pmst.setString(2,SaleDate);
               pmst.setInt(3,Number);
               pmst.setDouble(4,Price);
               pmst.setString(5,Discount);
               pmst.setString(6,VIP_ID);
               pmst.setString(7,ProductName);
               insert_Sale=pmst.executeUpdate();
           } catch (SQLException ex) {
               ex.printStackTrace();
           }finally {
               try {
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
           return insert_Sale;

    }
    public static int Insert_EnterStock(
    		String MerNumber,
    		int Number,
    		double PurchasePrice,
    		String PutData,String StoreHouse_ID,
    		String dealWithHuman,
    		String downName,
    		String inout) throws SQLException {
           int insert_EnterStock=0;
           Connection conn=null;
           PreparedStatement pmst =null;
           sqlA sqls=new sqlA();
           conn=sqls.getConection();
           try {
               pmst = conn.prepareStatement(insert5);
               pmst.setString(1,MerNumber);
               pmst.setDouble(2,Number);
               pmst.setDouble(3,PurchasePrice);
               pmst.setString(4,PutData);
               pmst.setString(5,StoreHouse_ID);
               pmst.setString(6,dealWithHuman);
               pmst.setString(7,downName);
               pmst.setString(8,inout);
               insert_EnterStock=pmst.executeUpdate();
           } catch (SQLException ex) {
               ex.printStackTrace();
           }finally {
               try {
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
           return insert_EnterStock;

    }

    public static int Insert_NextBackStock(
    		String Product_ID,
    		String ProductName,
    		double Number,
    		double Price,
    		String JtDate,
    		String SuperMarket,
    		String NextBack,
    		String reason) throws SQLException {
           int insert_NextBackStock=0;
           Connection conn=null;
           PreparedStatement pmst =null;
           sqlA sqls=new sqlA();
           conn=sqls.getConection();
           try {
               pmst = conn.prepareStatement(insert6);
               pmst.setString(1,Product_ID);
               pmst.setString(2,ProductName);
               pmst.setDouble(3,Number);
               pmst.setDouble(4,Price);
               pmst.setString(5,JtDate);
               pmst.setString(6,SuperMarket);
               pmst.setString(7,NextBack);
               pmst.setString(8,reason);
               insert_NextBackStock=pmst.executeUpdate();
           } catch (SQLException ex) {
               ex.printStackTrace();
           }finally {
               try {
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
           return insert_NextBackStock;

    }


}
