package jsonQl;

public class ListItinerario {

	 private String id;
	 private String idSlot;
	 private String uid;
	 private String name;
	 private String stato;
	 private boolean abilitazione_check_stato_ossi;


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

	 public String getStato() {
	  return stato;
	 }

	 public boolean getAbilitazione_check_stato_ossi() {
	  return abilitazione_check_stato_ossi;
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

	 public void setStato(String stato) {
	  this.stato = stato;
	 }

	 public void setAbilitazione_check_stato_ossi(boolean abilitazione_check_stato_ossi) {
	  this.abilitazione_check_stato_ossi = abilitazione_check_stato_ossi;
	 }
	 
	 
	 @Override
		public String toString(){
			return getId() + ", "+getIdSlot()+", "+getUid() + ", "+getName()+", "+getStato()+", "+getAbilitazione_check_stato_ossi();
	 }
}
