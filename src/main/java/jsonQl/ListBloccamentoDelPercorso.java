package jsonQl;

public class ListBloccamentoDelPercorso {

	 private String id;
	 private String idSlot;
	 private String uid;
	 private String name;
	 private boolean tlcdb;
	 private boolean acquisita_occupazione;
	 private boolean check_ossidato;
	 private boolean soccorso_tlcdb;
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

	 public boolean getTlcdb() {
	  return tlcdb;
	 }

	 public boolean getAcquisita_occupazione() {
	  return acquisita_occupazione;
	 }

	 public boolean getCheck_ossidato() {
	  return check_ossidato;
	 }

	 public boolean getSoccorso_tlcdb() {
	  return soccorso_tlcdb;
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

	 public void setTlcdb(boolean tlcdb) {
	  this.tlcdb = tlcdb;
	 }

	 public void setAcquisita_occupazione(boolean acquisita_occupazione) {
	  this.acquisita_occupazione = acquisita_occupazione;
	 }

	 public void setCheck_ossidato(boolean check_ossidato) {
	  this.check_ossidato = check_ossidato;
	 }

	 public void setSoccorso_tlcdb(boolean soccorso_tlcdb) {
	  this.soccorso_tlcdb = soccorso_tlcdb;
	 }

	 public void setStato(String stato) {
	  this.stato = stato;
	 }
	 
	 @Override
		public String toString(){
		 return getId() + ", "+getIdSlot()+", "+getUid() + ", "+getName()+", "+getTlcdb()+", "+getAcquisita_occupazione()+", "+getCheck_ossidato()
		 +", "+getSoccorso_tlcdb() + ", "+getStato();
	 }
}
