package jsonQl;

public class ListDeviatoio {
	
	 private String id;
	 private String idSlot;
	 private String uid;
	 private String name;
	 private String statologico;
	 private boolean soccorsotb;
	 private boolean azionamento_automatico;
	 private boolean esclusois;
	 private boolean esclusodm;
	 private boolean alimentato;
	 private boolean inibizione_contromanovra;
	 private String stato;
	 private String ricam;
	 private String inclusione_am;
	 private String comando_laterale;
	 private String protezione_motore;


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

	 public String getStatologico() {
	  return statologico;
	 }

	 public boolean getSoccorsotb() {
	  return soccorsotb;
	 }

	 public boolean getAzionamento_automatico() {
	  return azionamento_automatico;
	 }

	 public boolean getEsclusois() {
	  return esclusois;
	 }

	 public boolean getEsclusodm() {
	  return esclusodm;
	 }

	 public boolean getAlimentato() {
	  return alimentato;
	 }

	 public boolean getInibizione_contromanovra() {
	  return inibizione_contromanovra;
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

	 public String getComando_laterale() {
	  return comando_laterale;
	 }

	 public String getProtezione_motore() {
	  return protezione_motore;
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

	 public void setStatologico(String statologico) {
	  this.statologico = statologico;
	 }

	 public void setSoccorsotb(boolean soccorsotb) {
	  this.soccorsotb = soccorsotb;
	 }

	 public void setAzionamento_automatico(boolean azionamento_automatico) {
	  this.azionamento_automatico = azionamento_automatico;
	 }

	 public void setEsclusois(boolean esclusois) {
	  this.esclusois = esclusois;
	 }

	 public void setEsclusodm(boolean esclusodm) {
	  this.esclusodm = esclusodm;
	 }

	 public void setAlimentato(boolean alimentato) {
	  this.alimentato = alimentato;
	 }

	 public void setInibizione_contromanovra(boolean inibizione_contromanovra) {
	  this.inibizione_contromanovra = inibizione_contromanovra;
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

	 public void setComando_laterale(String comando_laterale) {
	  this.comando_laterale = comando_laterale;
	 }

	 public void setProtezione_motore(String protezione_motore) {
	  this.protezione_motore = protezione_motore;
	 }

	 @Override
		public String toString(){
			return getId() + ", "+getIdSlot()+", "+getUid() + ", "+getName()+", "+getStatologico()+", "+getSoccorsotb()+", "+getAzionamento_automatico()
			+", "+getEsclusois()+", "+getEsclusodm()+", "+getAlimentato()+", "+getInibizione_contromanovra()+", "+getStato()+", "+getRicam()+", "+getInclusione_am()
			+", "+getComando_laterale()+", "+getProtezione_motore();
	 }
}
