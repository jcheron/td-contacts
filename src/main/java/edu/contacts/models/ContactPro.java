package edu.contacts.models;

public class ContactPro extends Contact {
	private String telPro;
	private String emailPro;
	private Entreprise entreprise;

	public ContactPro(String nom, String email, String telPro, String emailPro, Entreprise entreprise) {
		super(nom, email);
		this.telPro = telPro;
		this.emailPro = emailPro;
		this.entreprise = entreprise;
	}

	@Override
	public String toString() {
		return "ContactPro [" + super.toString() + ", telPro=" + telPro + ", emailPro=" + emailPro + ", entreprise="
				+ entreprise + "]";
	}

}
