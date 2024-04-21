package StateDesign;

import java.util.Scanner;

public class StatePatternMain {
	static Controller controller;
	static String con;
	
	public static void main(String args[]) {
		controller = new Controller();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the where connection is needed: \n 1.management \n 2.sales \n 3.Accounting");
		con=s.next();
		// the following trigger should be made by the user
		if (con.equalsIgnoreCase("management")) {
			controller.setManagementConnection();
		}
		if (con.equalsIgnoreCase("sales")) {
			controller.setSalesConnection();
		}
		if (con.equalsIgnoreCase("accounting")) {
			controller.setAccountingConnection();
		}
		controller.open();
		controller.log();
		controller.close();
		controller.update();

	}
}
