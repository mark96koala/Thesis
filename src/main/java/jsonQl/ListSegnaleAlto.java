package jsonQl;

public class ListSegnaleAlto {

	
	 private String id;
	 private String idSlot;
	 private String uid;
	 private String name;
	 private String txgenerico_stato;
	 private String tbo;
	 private String target;
	 private boolean manovrabilita;
	 private boolean manovrabilita_tx;
	 private boolean vincolo_esclusione_da_uscita;
	 private boolean vincolo_esclusione_da_tp;
	 private boolean esclusodm;
	 private boolean esclusois;
	 private boolean chiusoam;
	 private boolean chiusodm;
	 private String stato;
	 private String ricam;
	 private String inclusione_am;
	 private String inviocomando;
	 private String protezione_motore;
	 private String ricam_ch;
	 private String annullata_am_ch;


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

	 public String getTxgenerico_stato() {
	  return txgenerico_stato;
	 }

	 public String getTbo() {
	  return tbo;
	 }

	 public String getTarget() {
	  return target;
	 }

	 public boolean getManovrabilita() {
	  return manovrabilita;
	 }

	 public boolean getManovrabilita_tx() {
	  return manovrabilita_tx;
	 }

	 public boolean getVincolo_esclusione_da_uscita() {
	  return vincolo_esclusione_da_uscita;
	 }

	 public boolean getVincolo_esclusione_da_tp() {
	  return vincolo_esclusione_da_tp;
	 }

	 public boolean getEsclusodm() {
	  return esclusodm;
	 }

	 public boolean getEsclusois() {
	  return esclusois;
	 }

	 public boolean getChiusoam() {
	  return chiusoam;
	 }

	 public boolean getChiusodm() {
	  return chiusodm;
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

	 public String getInviocomando() {
	  return inviocomando;
	 }

	 public String getProtezione_motore() {
	  return protezione_motore;
	 }

	 public String getRicam_ch() {
	  return ricam_ch;
	 }

	 public String getAnnullata_am_ch() {
	  return annullata_am_ch;
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

	 public void setTxgenerico_stato(String txgenerico_stato) {
	  this.txgenerico_stato = txgenerico_stato;
	 }

	 public void setTbo(String tbo) {
	  this.tbo = tbo;
	 }

	 public void setTarget(String target) {
	  this.target = target;
	 }

	 public void setManovrabilita(boolean manovrabilita) {
	  this.manovrabilita = manovrabilita;
	 }

	 public void setManovrabilita_tx(boolean manovrabilita_tx) {
	  this.manovrabilita_tx = manovrabilita_tx;
	 }

	 public void setVincolo_esclusione_da_uscita(boolean vincolo_esclusione_da_uscita) {
	  this.vincolo_esclusione_da_uscita = vincolo_esclusione_da_uscita;
	 }

	 public void setVincolo_esclusione_da_tp(boolean vincolo_esclusione_da_tp) {
	  this.vincolo_esclusione_da_tp = vincolo_esclusione_da_tp;
	 }

	 public void setEsclusodm(boolean esclusodm) {
	  this.esclusodm = esclusodm;
	 }

	 public void setEsclusois(boolean esclusois) {
	  this.esclusois = esclusois;
	 }

	 public void setChiusoam(boolean chiusoam) {
	  this.chiusoam = chiusoam;
	 }

	 public void setChiusodm(boolean chiusodm) {
	  this.chiusodm = chiusodm;
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

	 public void setInviocomando(String inviocomando) {
	  this.inviocomando = inviocomando;
	 }

	 public void setProtezione_motore(String protezione_motore) {
	  this.protezione_motore = protezione_motore;
	 }

	 public void setRicam_ch(String ricam_ch) {
	  this.ricam_ch = ricam_ch;
	 }

	 public void setAnnullata_am_ch(String annullata_am_ch) {
	  this.annullata_am_ch = annullata_am_ch;
	 }
	 
	 @Override
		public String toString(){
			return getId() + ", "+getIdSlot()+", "+getUid() + ", "+getName()+", "+getTxgenerico_stato()+", "+getTbo()+", "+getTarget()
			+", "+getManovrabilita()+", "+getManovrabilita_tx()+", "+getVincolo_esclusione_da_uscita()+", "+getVincolo_esclusione_da_tp()+", "+getEsclusodm()+", "+getEsclusois()
			+", "+getChiusoam()+", "+getChiusodm()+", "+getStato()+", "+getRicam()+", "+getInclusione_am()+", "+getInviocomando()
			+", "+getProtezione_motore()+", "+getRicam_ch()+", "+getAnnullata_am_ch();
	 }
}
