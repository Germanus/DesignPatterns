package my.ilya.proxy.datacreator;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AddressBookImpl implements AddressBook{
	
	private File file;
	private ArrayList<Address> addresses = new ArrayList<Address>();
	
	public AddressBookImpl(File newFile){
		file = newFile;
		open();
	}
	
	@SuppressWarnings("unchecked")
	public void open() {
		addresses = (ArrayList<Address>) FileLoader.loadData(file);
	}
	
	public void save(){
		FileLoader.storeData(file, addresses);
	}

	public ArrayList<Address> getAllAddresses(){
		return addresses;
	}

	public void add(Address address) {
		if(!addresses.contains(address)){
			addresses.add(address);
		}
	}

	public Address getAddress(String description) {
		Iterator<Address> addressIterator = addresses.iterator();
		while (addressIterator.hasNext()) {
			AddressImpl address = (AddressImpl) addressIterator.next();
			if(address.getDescription().equalsIgnoreCase(description)){
				return address;
			}
		}
		return null;
	}


	
	
	
	
	
	
}
