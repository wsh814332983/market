package dataPart;
import java.sql.*;

public class sqlA {
    private Connection con;
	public  Connection getConection() throws SQLException{
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con=DriverManager.getConnection("jdbc:sqlserver://127.0.0.1:1433;databaseName=SuperMarket","test","060334103");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		return con;
	}
	public void closeConnection(){
		if(con!=null){
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
