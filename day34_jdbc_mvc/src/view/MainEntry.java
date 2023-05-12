package view;

import java.sql.SQLException;

import controller.GiftController;
import dbConn.util.ConnectionHelper;

public class MainEntry {
	public static void main(String[] args) throws SQLException {
		GiftController.connect();
		GiftController.menu();
		
		
		
		
		
		
		
		
		
//		ConnectionHelper.getConnection("oracle");
//		ConnectionHelper.getConnection("oracle","kingsmile","oracle");
	}
}
