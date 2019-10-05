package jsonQl;

public class ListElettromagnete {

	
	 private String id;
	 private String idSlot;
	 private String uid;
	 private String name;
	 private boolean esclusois;
	 private boolean esclusodm;
	 private boolean richiestobasso;
	 private String stato;


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

	 public boolean getEsclusois() {
	  return esclusois;
	 }

	 public boolean getEsclusodm() {
	  return esclusodm;
	 }

	 public boolean getRichiestobasso() {
	  return richiestobasso;
	 }

	 public String getStato() {
	  return stato;
	 }
 

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

	 public void setEsclusois(boolean esclusois) {
	  this.esclusois = esclusois;
	 }

	 public void setEsclusodm(boolean esclusodm) {
	  this.esclusodm = esclusodm;
	 }

	 public void setRichiestobasso(boolean richiestobasso) {
	  this.richiestobasso = richiestobasso;
	 }

	 public void setStato(String stato) {
	  this.stato = stato;
	 }
	 
	 @Override
		public String toString(){
			return getId() + ", "+getIdSlot()+", "+getUid() + ", "+getName()+", "+getEsclusois()+", "+getEsclusodm()+", "+getRichiestobasso()
			+", "+getStato();
	 }
}
