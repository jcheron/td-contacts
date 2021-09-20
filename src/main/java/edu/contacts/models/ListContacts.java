package edu.contacts.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListContacts {
	private String nom;
	private Map<String, Contact> contacts;

	public ListContacts(String nom) {
		this.nom = nom;
		contacts = new HashMap<String, Contact>();
	}

	/**
	 * Ajoute un contact dans la map contacts, l'email du contact sert de clé
	 * 
	 * @param contact
	 * @return boolean
	 */
	public boolean add(Contact contact) {
		if (!contacts.containsKey(contact.getEmail())) {
			contacts.put(contact.getEmail(), contact);
			return true;
		}
		return false;
	}

	public boolean delete(String email) {
		return contacts.remove(email) != null;
	}

	public boolean delete(Contact contact) {
		return delete(contact.getEmail());
	}

	/**
	 * Retourne le contact correspondant à l'email
	 * 
	 * @param email
	 * @return
	 */
	public Contact get(String email) {
		return contacts.get(email);
	}

	/**
	 * Retourne la liste des contacts d'une certaine classe
	 * 
	 * @param clazz
	 * @return
	 */
	public List<Contact> getAll(Class<? extends Contact> clazz) {
		List<Contact> result = new ArrayList<Contact>();
		contacts.forEach((email, contact) -> {
			if (contact.getClass().equals(clazz)) {
				result.add(contact);
			}
		});
		return result;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Map<String, Contact> getContacts() {
		return contacts;
	}
}
