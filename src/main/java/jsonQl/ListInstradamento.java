package jsonQl;

public class ListInstradamento {

	 private String id;
	 private String idSlot;
	 private String uid;
	 private String name;
	 private String transitato;
	 private boolean liberazione_rigida;
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

	 public String getTransitato() {
	  return transitato;
	 }

	 public boolean getLiberazione_rigida() {
	  return liberazione_rigida;
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

	 public void setTransitato(String transitato) {
	  this.transitato = transitato;
	 }

	 public void setLiberazione_rigida(boolean liberazione_rigida) {
	  this.liberazione_rigida = liberazione_rigida;
	 }

	 public void setStato(String stato) {
	  this.stato = stato;
	 }
	 
	 @Override
		public String toString(){
			return getId() + ", "+getIdSlot()+", "+getUid() + ", "+getName()+", "+getTransitato()+", "+getLiberazione_rigida()+", "+getStato();
	 }
}
