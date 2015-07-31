package be.mathieu.facture.bean;

public class Client {
	private Long id;
	private String denomination;
	private String tva;
	private String adresse;
	private String tel;
	private String email;
	private Float tauxFacturation;
	private String contact;
	private Client clientParent;
	public Client getClientParent() {
		return clientParent;
	}
	public void setClientParent(Client clientParent) {
		this.clientParent = clientParent;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDenomination() {
		return denomination;
	}
	public void setDenomination(String denomination) {
		this.denomination = denomination;
	}
	public String getTva() {
		return tva;
	}
	public void setTva(String tva) {
		this.tva = tva;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Float getTauxFacturation() {
		return tauxFacturation;
	}
	public void setTauxFacturation(Float tauxFacturation) {
		this.tauxFacturation = tauxFacturation;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	
}
