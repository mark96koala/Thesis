package jsonQl;

public class ListBloccamentoUscita {

	 private String id;
	 private String idSlot;
	 private String uid;
	 private String name;
	 private String uscita;
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

	 public String getUscita() {
	  return uscita;
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

	 public void setUscita(String uscita) {
	  this.uscita = uscita;
	 }

	 public void setStato(String stato) {
	  this.stato = stato;
	 }
	 
	 @Override
		public String toString(){
		 return getId() + ", "+getIdSlot()+", "+getUid() + ", "+getName()+", "+getUscita()+", "+getStato();
	 }
}
