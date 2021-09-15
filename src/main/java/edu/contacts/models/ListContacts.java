package edu.contacts.models;

import java.util.List;
import java.util.Map;

public class ListContacts {
	private String nom;
	private Map<String, Contact> contacts;

	public ListContacts(String nom) {

	}

	/**
	 * Ajoute un contact dans la map contacts, l'email du contact sert de clé
	 * 
	 * @param contact
	 */
	public void add(Contact contact) {

	}

	public boolean delete(String email) {

	}

	public boolean delete(Contact contact) {

	}

	/**
	 * Retourne le contact correspondant à l'email
	 * 
	 * @param email
	 * @return
	 */
	public Contact get(String email) {

	}

	/**
	 * Retourne la liste des contacts d'une certaine classe
	 * 
	 * @param clazz
	 * @return
	 */
	public List<Contact> getAll(Class<Contact> clazz) {

	}

}
