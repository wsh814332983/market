package dataPart;


import java.util.Vector;
import java.sql.*;

public class selectEarning {
	public static String SQLFind1 = "select ProductID,ProductName,Number,Price,SaleDate,Number*Price from Sale where ProductID=?";
    public static String SQLFind2 =
            "select ProductID,ProductName,Number,Price,SaleDate,Number*Price from Sale";
    public static Vector<Vector<String>> findAll(String ProductID) throws SQLException {

        Vector<Vector<String>> ve1 = new Vector<Vector<String>>();
        sqlA sqls=new sqlA();
        
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        con = sqls.getConection();
        try {
            if (ProductID.length() == 0) {
                ps = con.prepareStatement(SQLFind2);
            }

            else {
                ps = con.prepareStatement(SQLFind1);
                ps.setString(1,ProductID);
            }
            rs = ps.executeQuery();
            while (rs.next()) {
                Vector<String> ve = new Vector<String>();
                ve.add(rs.getString(1));
                ve.add(rs.getString(2));
                ve.add(rs.getString(3));
                ve.add(rs.getString(4));
                ve.add(rs.getString(5));
                Double money=new Double(rs.getString(6));
                double money1=((int)(money*100))/100.0;//将金额处理成只含两位小数
                Double money2=new Double(money1);
                ve.add(money2.toString());
                ve1.add(ve);
            }
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (con != null) {
                con.close();
            }

        } catch (SQLException ex) {
        }
        return ve1;
    }

    public static boolean charbj(String n1, String n2) {
        boolean b1 = false;
        int i = 0;
        while (i < n1.length() - 1) {
            i++;
            if (n1.charAt(i) == n2.charAt(i)) {
                b1 = true;
                continue;
            }
            if (n1.charAt(i) > n2.charAt(i)) {
                b1 = true;
                break;
            }
            if (n1.charAt(i) < n2.charAt(i)) {
                b1 = false;
                break;
            }
        }
        return b1;
    }

}
