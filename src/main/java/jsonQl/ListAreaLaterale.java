package jsonQl;

public class ListAreaLaterale {

	 private String id;
	 private String idSlot;
	 private String uid;
	 private String name;
	 private boolean tcl_attivato;
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

	 public boolean getTcl_attivato() {
	  return tcl_attivato;
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

	 public void setTcl_attivato(boolean tcl_attivato) {
	  this.tcl_attivato = tcl_attivato;
	 }

	 public void setStato(String stato) {
	  this.stato = stato;
	 }
	 
	 @Override
		public String toString(){
			return getId() + ", "+getIdSlot()+", "+getUid() + ", "+getName()+", "+getTcl_attivato()+", "+getStato();
	 }
}
