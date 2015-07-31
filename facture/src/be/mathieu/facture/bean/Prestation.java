package be.mathieu.facture.bean;

public class Prestation {

	private Long id;
	private String desctription;
	private Client client;
	private Client clientFinal;
	private String heureDebut;
	private String heureFin;
	private Integer duree; // en heure
	private Float tauxFacturation;
	private Boolean facturable;
	private String remarques;
	private Boolean travailTermine;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDesctription() {
		return desctription;
	}
	public void setDesctription(String desctription) {
		this.desctription = desctription;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Client getClientFinal() {
		return clientFinal;
	}
	public void setClientFinal(Client clientFinal) {
		this.clientFinal = clientFinal;
	}
	public String getHeureDebut() {
		return heureDebut;
	}
	public void setHeureDebut(String heureDebut) {
		this.heureDebut = heureDebut;
	}
	public String getHeureFin() {
		return heureFin;
	}
	public void setHeureFin(String heureFin) {
		this.heureFin = heureFin;
	}
	public Integer getDuree() {
		return duree;
	}
	public void setDuree(Integer duree) {
		this.duree = duree;
	}
	public Float getTauxFacturation() {
		return tauxFacturation;
	}
	public void setTauxFacturation(Float tauxFacturation) {
		this.tauxFacturation = tauxFacturation;
	}
	public Boolean getFacturable() {
		return facturable;
	}
	public void setFacturable(Boolean facturable) {
		this.facturable = facturable;
	}
	public String getRemarques() {
		return remarques;
	}
	public void setRemarques(String remarques) {
		this.remarques = remarques;
	}
	public Boolean getTravailTermine() {
		return travailTermine;
	}
	public void setTravailTermine(Boolean travailTermine) {
		this.travailTermine = travailTermine;
	}

}
