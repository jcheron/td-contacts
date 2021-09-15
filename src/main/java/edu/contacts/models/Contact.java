package edu.contacts.models;

public class Contact {
	private String nom;
	private String email;
	protected String fixe;
	private String mobile;

	public Contact(String nom, String email) {
		this.nom = nom;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Contact [nom=" + nom + ", email=" + email + ", fixe=" + fixe + ", mobile=" + mobile + "]";
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFixe() {
		return fixe;
	}

	public void setFixe(String fixe) {
		this.fixe = fixe;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}
