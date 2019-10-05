package jsonQl;

public class ListCircuitoDiBinario {
	
	 private String id;
	 private String idSlot;
	 private String uid;
	 private String name;
	 private boolean codificattiva;
	 private boolean concodifica;
	 private int codicevelocita;
	 private boolean bloccato_uscita;
	 private boolean bloccato_laterale;
	 private boolean vincolo_esclusione_da_uscita;
	 private boolean vincolo_esclusione_da_laterale;
	 private boolean interessato_da_convergenza;
	 private boolean esclusodm;
	 private boolean esclusois;
	 private String ossidato;
	 private boolean memoria_ossidato;
	 private String direzione_codifica;
	 private String stato;
	 private String ricam;
	 private String inclusione_am;

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

	 public boolean getCodificattiva() {
	  return codificattiva;
	 }

	 public boolean getConcodifica() {
	  return concodifica;
	 }

	 public int getCodicevelocita() {
	  return codicevelocita;
	 }

	 public boolean getBloccato_uscita() {
	  return bloccato_uscita;
	 }

	 public boolean getBloccato_laterale() {
	  return bloccato_laterale;
	 }

	 public boolean getVincolo_esclusione_da_uscita() {
	  return vincolo_esclusione_da_uscita;
	 }

	 public boolean getVincolo_esclusione_da_laterale() {
	  return vincolo_esclusione_da_laterale;
	 }

	 public boolean getInteressato_da_convergenza() {
	  return interessato_da_convergenza;
	 }

	 public boolean getEsclusodm() {
	  return esclusodm;
	 }

	 public boolean getEsclusois() {
	  return esclusois;
	 }

	 public String getOssidato() {
	  return ossidato;
	 }

	 public boolean getMemoria_ossidato() {
	  return memoria_ossidato;
	 }

	 public String getDirezione_codifica() {
	  return direzione_codifica;
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

	 public void setCodificattiva(boolean codificattiva) {
	  this.codificattiva = codificattiva;
	 }

	 public void setConcodifica(boolean concodifica) {
	  this.concodifica = concodifica;
	 }

	 public void setCodicevelocita(int codicevelocita) {
	  this.codicevelocita = codicevelocita;
	 }

	 public void setBloccato_uscita(boolean bloccato_uscita) {
	  this.bloccato_uscita = bloccato_uscita;
	 }

	 public void setBloccato_laterale(boolean bloccato_laterale) {
	  this.bloccato_laterale = bloccato_laterale;
	 }

	 public void setVincolo_esclusione_da_uscita(boolean vincolo_esclusione_da_uscita) {
	  this.vincolo_esclusione_da_uscita = vincolo_esclusione_da_uscita;
	 }

	 public void setVincolo_esclusione_da_laterale(boolean vincolo_esclusione_da_laterale) {
	  this.vincolo_esclusione_da_laterale = vincolo_esclusione_da_laterale;
	 }

	 public void setInteressato_da_convergenza(boolean interessato_da_convergenza) {
	  this.interessato_da_convergenza = interessato_da_convergenza;
	 }

	 public void setEsclusodm(boolean esclusodm) {
	  this.esclusodm = esclusodm;
	 }

	 public void setEsclusois(boolean esclusois) {
	  this.esclusois = esclusois;
	 }

	 public void setOssidato(String ossidato) {
	  this.ossidato = ossidato;
	 }

	 public void setMemoria_ossidato(boolean memoria_ossidato) {
	  this.memoria_ossidato = memoria_ossidato;
	 }

	 public void setDirezione_codifica(String direzione_codifica) {
	  this.direzione_codifica = direzione_codifica;
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
		 return getId() + ", "+getIdSlot()+", "+getUid()+ ", "+getName()+", "+getCodificattiva()+", "+getConcodifica()+", "+getCodicevelocita()
		 +", "+getBloccato_uscita()+ ", "+getBloccato_laterale()+ ", "+getVincolo_esclusione_da_uscita()+", "+getVincolo_esclusione_da_laterale()+", "
				 +getInteressato_da_convergenza()+", "+getEsclusodm() +", "+getEsclusois() + ", "+getOssidato()+ ", "+getMemoria_ossidato()+ ", "+getDirezione_codifica()+", "+getStato()+", "
						 +getRicam()+", "+getInclusione_am();
	 }

}
