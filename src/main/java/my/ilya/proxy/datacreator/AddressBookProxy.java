package my.ilya.proxy.datacreator;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

public class AddressBookProxy implements AddressBook {

	private File file;

	private AddressBookImpl addressBook;

	private ArrayList<Address> localAddresses = new ArrayList<Address>();

	public AddressBookProxy(String filename) {
		file = new File(filename);
	}

	public void open() {
		addressBook = new AddressBookImpl(file);
		Iterator<Address> addressIterator = localAddresses.iterator();
		while (addressIterator.hasNext()) {
			addressBook.add((Address) addressIterator.next());
		}
	}

	public void save() {
		if (addressBook != null) {
			addressBook.save();
		} else if (!localAddresses.isEmpty()) {
			open();
			addressBook.save();
		}
	}

	public Address getAddress(String description) {
		if (!localAddresses.isEmpty()) {
			Iterator<Address> addressIterator = localAddresses.iterator();
			while (addressIterator.hasNext()) {
				AddressImpl address = (AddressImpl) addressIterator.next();
				if (address.getDescription().equalsIgnoreCase(description)) {
					return address;
				}
			}
		}

		if (addressBook == null) {
			open();
		}

		return addressBook.getAddress(description);
	}

	public void add(Address address) {
		if (addressBook != null) {
			addressBook.add(address);
		} else if (!localAddresses.contains(address)) {
			localAddresses.add(address);
		}
	}

	public ArrayList<Address> getAllAddresses() {
		if (addressBook == null) {
			open();
		}
		return addressBook.getAllAddresses();
	}

}
