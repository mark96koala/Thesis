package jsonQl;

public class ListRegimeDiStazione {
	
	 private String id;
	 private String idSlot;
	 private String uid;
	 private String name;
	 private boolean stazione_porta;
	 private boolean ricevuto_tlcom_j;
	 private String stato;
	 private String di_transizionesp;
	 private String di_transizionej;


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

	 public boolean getStazione_porta() {
	  return stazione_porta;
	 }

	 public boolean getRicevuto_tlcom_j() {
	  return ricevuto_tlcom_j;
	 }

	 public String getStato() {
	  return stato;
	 }

	 public String getDi_transizionesp() {
	  return di_transizionesp;
	 }

	 public String getDi_transizionej() {
	  return di_transizionej;
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

	 public void setStazione_porta(boolean stazione_porta) {
	  this.stazione_porta = stazione_porta;
	 }

	 public void setRicevuto_tlcom_j(boolean ricevuto_tlcom_j) {
	  this.ricevuto_tlcom_j = ricevuto_tlcom_j;
	 }

	 public void setStato(String stato) {
	  this.stato = stato;
	 }

	 public void setDi_transizionesp(String di_transizionesp) {
	  this.di_transizionesp = di_transizionesp;
	 }

	 public void setDi_transizionej(String di_transizionej) {
	  this.di_transizionej = di_transizionej;
	 }
	 
	 @Override
		public String toString(){
			return getId() + ", "+getIdSlot()+", "+getUid() + ", "+getName()+", "+getStazione_porta()+", "+getRicevuto_tlcom_j()
			+", "+getStato()+", "+getDi_transizionesp()+", "+getDi_transizionej();
	 }

}
