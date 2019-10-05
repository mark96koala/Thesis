package jsonQl;

public class ListRipetitoreDiPartenza {

	 private String id;
	 private String idSlot;
	 private String uid;
	 private String name;
	 private boolean esclusodm;
	 private boolean esclusois;
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

	 public boolean getEsclusodm() {
	  return esclusodm;
	 }

	 public boolean getEsclusois() {
	  return esclusois;
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

	 public void setEsclusodm(boolean esclusodm) {
	  this.esclusodm = esclusodm;
	 }

	 public void setEsclusois(boolean esclusois) {
	  this.esclusois = esclusois;
	 }

	 public void setStato(String stato) {
	  this.stato = stato;
	 }
	 
	 
	 @Override
		public String toString(){
		 return getId() + ", "+getIdSlot()+", "+getUid() + ", "+getName()+", "+getEsclusodm()+", "+getEsclusois()+", "+getStato();
	 }
}
