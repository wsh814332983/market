package dataPart;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DelData {
	public DelData() {
    }

    private static final String delData1 =
            "delete from UserManage where cardId=?";
    public static int delCard(String cardId) throws SQLException {
        int i = 0;
        Connection conn = null;
        PreparedStatement pmst = null;
        ResultSet rs = null;
        sqlA sqls=new sqlA();
        conn = sqls.getConection();

        try {
            pmst = conn.prepareStatement(delData1);
            pmst.setString(1, cardId);
            i = pmst.executeUpdate();
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

        return i;
    }
}
