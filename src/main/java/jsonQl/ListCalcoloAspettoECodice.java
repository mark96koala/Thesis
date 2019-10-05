package jsonQl;

public class ListCalcoloAspettoECodice {

	 private String id;
	 private String idSlot;
	 private String uid;
	 private String name;
	 private String aspetto;
	 private boolean chiave_rl_piccola;
	 private String stato;


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

	 public String getAspetto() {
	  return aspetto;
	 }

	 public boolean getChiave_rl_piccola() {
	  return chiave_rl_piccola;
	 }

	 public String getStato() {
	  return stato;
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

	 public void setAspetto(String aspetto) {
	  this.aspetto = aspetto;
	 }

	 public void setChiave_rl_piccola(boolean chiave_rl_piccola) {
	  this.chiave_rl_piccola = chiave_rl_piccola;
	 }

	 public void setStato(String stato) {
	  this.stato = stato;
	 }
	 
	 @Override
		public String toString(){
		 return getId() + ", "+getIdSlot()+", "+getUid() + ", "+getName()+", "+getAspetto()+", "+getChiave_rl_piccola()
		 +", "+getStato();
	 }
}
