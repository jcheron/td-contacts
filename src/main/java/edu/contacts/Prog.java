package edu.contacts;

import edu.contacts.models.Contact;
import edu.contacts.models.ContactPro;

public class Prog {
	public static void main(String[] args) {
		Contact c1 = new Contact("Bob", "bob@email.com");
		System.out.println(c1);
		Contact c2 = new ContactPro("Will", "will@email.com", "00.00.00", "will@pro.com", null);
		System.out.println(c2);
	}
}
