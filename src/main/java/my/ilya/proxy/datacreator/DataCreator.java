package my.ilya.proxy.datacreator;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class DataCreator {

	private static final String DEFAULT_FILE = "data.ser";

	public static void main(String[] args) {
		String fileName;
		if (args.length == 1) {
			fileName = args[0];
		} else {
			fileName = DEFAULT_FILE;
		}
		serialize(fileName);
	}

	public static void serialize(String fileName) {
		try {
			serializeToFile(createData(), fileName);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void serializeToFile(Object data, String fileName) throws IOException{
		ObjectOutputStream serOut = new ObjectOutputStream(new FileOutputStream(fileName));
		serOut.writeObject(data);
		serOut.close();
	}

	private static Object createData() {
		ArrayList<Address> items = new ArrayList<Address>();
		items.add(new AddressImpl("Home address", "1418 Appian Way", "Pleasantville", "NH", "27415"));
		items.add(new AddressImpl("Resort", "711 Casino Ave.", "Atlantic City", "NJ", "91720"));
		items.add(new AddressImpl("Vacation spot", "90 Ka'ahanau Cir.", "Haleiwa", "HI", "41720"));
		return items;		
	}

}
