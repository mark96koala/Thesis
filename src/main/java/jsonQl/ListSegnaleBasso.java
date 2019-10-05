package jsonQl;

public class ListSegnaleBasso {

	 private String id;
	 private String idSlot;
	 private String uid;
	 private String name;
	 private boolean manovrabilita;
	 private boolean manovrabilita_tx;
	 private boolean lampeggiamento;
	 private boolean esclusodm;
	 private boolean esclusois;
	 private String tlap;
	 private boolean ap_istra;
	 private boolean r_istra;
	 private String stato;
	 private String ricam;
	 private String inclusione_am;


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

	 public boolean getManovrabilita() {
	  return manovrabilita;
	 }

	 public boolean getManovrabilita_tx() {
	  return manovrabilita_tx;
	 }

	 public boolean getLampeggiamento() {
	  return lampeggiamento;
	 }

	 public boolean getEsclusodm() {
	  return esclusodm;
	 }

	 public boolean getEsclusois() {
	  return esclusois;
	 }

	 public String getTlap() {
	  return tlap;
	 }

	 public boolean getAp_istra() {
	  return ap_istra;
	 }

	 public boolean getR_istra() {
	  return r_istra;
	 }

	 public String getStato() {
	  return stato;
	 }

	 public String getRicam() {
	  return ricam;
	 }

	 public String getInclusione_am() {
	  return inclusione_am;
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

	 public void setManovrabilita(boolean manovrabilita) {
	  this.manovrabilita = manovrabilita;
	 }

	 public void setManovrabilita_tx(boolean manovrabilita_tx) {
	  this.manovrabilita_tx = manovrabilita_tx;
	 }

	 public void setLampeggiamento(boolean lampeggiamento) {
	  this.lampeggiamento = lampeggiamento;
	 }

	 public void setEsclusodm(boolean esclusodm) {
	  this.esclusodm = esclusodm;
	 }

	 public void setEsclusois(boolean esclusois) {
	  this.esclusois = esclusois;
	 }

	 public void setTlap(String tlap) {
	  this.tlap = tlap;
	 }

	 public void setAp_istra(boolean ap_istra) {
	  this.ap_istra = ap_istra;
	 }

	 public void setR_istra(boolean r_istra) {
	  this.r_istra = r_istra;
	 }

	 public void setStato(String stato) {
	  this.stato = stato;
	 }

	 public void setRicam(String ricam) {
	  this.ricam = ricam;
	 }

	 public void setInclusione_am(String inclusione_am) {
	  this.inclusione_am = inclusione_am;
	 }
	 
	 
	 @Override
		public String toString(){
			return getId() + ", "+getIdSlot()+", "+getUid() + ", "+getName()+", "+getManovrabilita()+", "+getManovrabilita_tx()+", "+getLampeggiamento()
			+", "+getEsclusodm()+", "+getEsclusois()+", "+getTlap()+", "+getAp_istra()+", "+getR_istra()
			+", "+getStato()+", "+getRicam()+", "+getInclusione_am();
	 }
}
