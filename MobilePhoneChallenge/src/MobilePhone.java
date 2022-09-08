import java.util.ArrayList;

public class MobilePhone {
	
	private static Contact contact;
	private static ArrayList<Contact> contactList = new ArrayList<Contact>();
	
	public void storeContact(Contact contact) {
		int position = findContact(contact);
		if(position < 0) {
			contactList.add(contact);
		}
	}
	
	public void modifyContact(Contact currentContact, Contact newContact) {
		int position = findContact(currentContact);
		if(position >= 0) {
			modifyContact(position, newContact);
		}
	}
	
	private void modifyContact(int position, Contact newContact) {
		contactList.set(position, newContact);
	}
	
	public void removeContact(Contact contact) {
		int position = findContact(contact);
		if(position >= 0) {
			removeContact(position);
		}
	}
	
	private void removeContact(int position) {
		contactList.remove(position);
	}
	
	private int findContact(Contact contact) {
		return contactList.indexOf(contact);
	}
	
}
