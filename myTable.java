package mian;
import java.util.Vector;

import javax.swing.JTable;


public class myTable {
	 public static JTable maketable(Vector obj, Vector<String> title) {
	        JTable table = new JTable();
	        table = new JTable(obj, title);
	        return table;
	    }
}
