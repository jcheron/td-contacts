package edu.contacts.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.contacts.models.Contact;
import edu.contacts.models.ContactPro;
import edu.contacts.models.ListContacts;

class TestListContacts {
	private ListContacts contacts;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		contacts = new ListContacts("Amis");
	}

	@Test
	void testAdd() {
		assertEquals(0, contacts.getContacts().size());
		assertTrue(contacts.add(new Contact("Bob", "bob@email.com")));
		assertEquals(1, contacts.getContacts().size());
		assertFalse(contacts.add(new Contact("Elton", "bob@email.com")));
		assertEquals(1, contacts.getContacts().size());
	}

	@Test
	void testDeleteString() {
		fail("Not yet implemented");
	}

	@Test
	void testDeleteContact() {
		fail("Not yet implemented");
	}

	@Test
	void testGetAll() {
		assertEquals(0, contacts.getAll(Contact.class).size());
		assertEquals(0, contacts.getAll(ContactPro.class).size());
		contacts.add(new Contact("Bob", "bob@email.com"));
		assertEquals(1, contacts.getAll(Contact.class).size());
	}

}
