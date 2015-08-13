package my.ilya.mediator.printer;

import java.util.Date;

public class Printer {

	public static void showMessage(Machine user, String message) {
		System.out.println(new Date().toString() + " [" + user.getName()+"] : " + message);
	}
	
}
