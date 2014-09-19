package dataPart;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PayFor {
	private static final String SQL_SAVE = "INSERT INTO PaymentList(OddNumber,Victualer,Coin,PaymentValues,PaymentFashion,ChequeNumber,Dates,DealWithMan,MakeLiseMan) VALUES(?, ?, ?,?, ?, ?, ?, ?,?);";
	public static boolean save(
			int oddNumber,
			String victualer,
			String coin,
			String PaymentValues,
			String paymentFashion,
			String chequeNumber,
			String dates,
			String dealWithMan,
			String makeLiseMan){
	            boolean issuccess=false;
	            Connection conn=null;
	            PreparedStatement pstmt=null;
	            sqlA sqls=new sqlA();
	            
	            try {
					conn=sqls.getConection();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	            try {
	                pstmt = conn.prepareStatement(SQL_SAVE);
	                pstmt.setInt(1,oddNumber);
	                pstmt.setString(2,victualer);
	                pstmt.setString(3,coin);
	                pstmt.setString(4,PaymentValues);
	                pstmt.setString(5,paymentFashion);
	                pstmt.setString(6,chequeNumber);
	                pstmt.setString(7,dates);
	                pstmt.setString(8,dealWithMan);
	                pstmt.setString(9,makeLiseMan);
	                int result=pstmt.executeUpdate();
	                if(result!=0){
	                    issuccess=true;
	                }
	              } catch (Exception ex) {
	                ex.printStackTrace();
	            }finally{
	                try {
	                    if(pstmt!=null){
	                        pstmt.close();
	                    }
	                    if(conn!=null){
	                        conn.close();
	                    }
	                } catch (Exception ex) {

	                }
	            }
	        return issuccess;

	    }
}
