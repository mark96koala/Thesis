package jsonQl;

public class ListScudetto {

	 private String id;
	 private String idSlot;
	 private String uid;
	 private String name;
	 private boolean esclusodm;
	 private boolean esclusois;
	 private boolean comandato;
	 private String tsm;
	 private boolean incompatibilita_itinerario;
	 private String stato;
	 private String ricam;
	 private String inclusione_am;


	 // Getter Methods 

	 public String getId() {
	  return id;
	 }

	 public String getIdSlot() {
	  return idSlot;
	 }

	 public String getUid() {
	  return uid;
	 }

	 public String getName() {
	  return name;
	 }

	 public boolean getEsclusodm() {
	  return esclusodm;
	 }

	 public boolean getEsclusois() {
	  return esclusois;
	 }

	 public boolean getComandato() {
	  return comandato;
	 }

	 public String getTsm() {
	  return tsm;
	 }

	 public boolean getIncompatibilita_itinerario() {
	  return incompatibilita_itinerario;
	 }

	 public String getStato() {
	  return stato;
	 }

	 public String getRicam() {
	  return ricam;
	 }

	 public String getInclusione_am() {
	  return inclusione_am;
	 }

	 // Setter Methods 

	 public void setId(String id) {
	  this.id = id;
	 }

	 public void setIdSlot(String idSlot) {
	  this.idSlot = idSlot;
	 }

	 public void setUid(String uid) {
	  this.uid = uid;
	 }

	 public void setName(String name) {
	  this.name = name;
	 }

	 public void setEsclusodm(boolean esclusodm) {
	  this.esclusodm = esclusodm;
	 }

	 public void setEsclusois(boolean esclusois) {
	  this.esclusois = esclusois;
	 }

	 public void setComandato(boolean comandato) {
	  this.comandato = comandato;
	 }

	 public void setTsm(String tsm) {
	  this.tsm = tsm;
	 }

	 public void setIncompatibilita_itinerario(boolean incompatibilita_itinerario) {
	  this.incompatibilita_itinerario = incompatibilita_itinerario;
	 }

	 public void setStato(String stato) {
	  this.stato = stato;
	 }

	 public void setRicam(String ricam) {
	  this.ricam = ricam;
	 }

	 public void setInclusione_am(String inclusione_am) {
	  this.inclusione_am = inclusione_am;
	 }
	 
	 
	 @Override
		public String toString(){
		 return getId() + ", "+getIdSlot()+", "+getUid() + ", "+getName()+", "+getEsclusodm()+", "+getEsclusois()+", "+getComandato()
		 +", "+getTsm()+", "+getIncompatibilita_itinerario()+", "+getStato()+", "+getRicam()+", "+getInclusione_am();
	 }
}
