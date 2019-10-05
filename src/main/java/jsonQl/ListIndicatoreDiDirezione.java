package jsonQl;

public class ListIndicatoreDiDirezione {
	
	private String id;
	 private String idSlot;
	 private String uid;
	 private String name;
	 private boolean esclusodm;
	 private boolean esclusois;
	 private int numero_da_accendere;
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

	 public int getNumero_da_accendere() {
	  return numero_da_accendere;
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

	 public void setNumero_da_accendere(int numero_da_accendere) {
	  this.numero_da_accendere = numero_da_accendere;
	 }

	 public void setStato(String stato) {
	  this.stato = stato;
	 }
	 
	 
	 @Override
		public String toString(){
			return getId() + ", "+getIdSlot()+", "+getUid() + ", "+getName()+", "+getEsclusodm()+", "+getEsclusois()+", "+getNumero_da_accendere()
			+", "+getStato();
	 }

}
