package jsonTo;

import java.util.Arrays;

public class ListDeviatoio {
	
	 private int id;
	 private int idSlot;
	 private int uid;
	 private String name;
	 private boolean leggeron;
	 private boolean leggeror;
	 private boolean telecomandon;
	 private boolean telecomandor;
	 private boolean confermaton;
	 private boolean confermator;
	 private boolean tbn;
	 private boolean tbr;
	 private boolean tcn;
	 private boolean tcr;
	 private boolean tbtcn;
	 private boolean tbtcr;
	 private boolean esclusioneis;
	 private boolean esclusionedm;
	 private boolean annullamento_esclusionedm;
	 private boolean annullamento_am_esclusioneis;
	 private boolean annullamento_dm_esclusioneis;
	 private boolean alimentazione;
	 private boolean disalimentazione;


	 public int getId() {
	  return id;
	 }

	 public int getIdSlot() {
	  return idSlot;
	 }

	 public int getUid() {
	  return uid;
	 }

	 public String getName() {
	  return name;
	 }

	 public boolean getLeggeron() {
	  return leggeron;
	 }

	 public boolean getLeggeror() {
	  return leggeror;
	 }

	 public boolean getTelecomandon() {
	  return telecomandon;
	 }

	 public boolean getTelecomandor() {
	  return telecomandor;
	 }

	 public boolean getConfermaton() {
	  return confermaton;
	 }

	 public boolean getConfermator() {
	  return confermator;
	 }

	 public boolean getTbn() {
	  return tbn;
	 }

	 public boolean getTbr() {
	  return tbr;
	 }

	 public boolean getTcn() {
	  return tcn;
	 }

	 public boolean getTcr() {
	  return tcr;
	 }

	 public boolean getTbtcn() {
	  return tbtcn;
	 }

	 public boolean getTbtcr() {
	  return tbtcr;
	 }

	 public boolean getEsclusioneis() {
	  return esclusioneis;
	 }

	 public boolean getEsclusionedm() {
	  return esclusionedm;
	 }

	 public boolean getAnnullamento_esclusionedm() {
	  return annullamento_esclusionedm;
	 }

	 public boolean getAnnullamento_am_esclusioneis() {
	  return annullamento_am_esclusioneis;
	 }

	 public boolean getAnnullamento_dm_esclusioneis() {
	  return annullamento_dm_esclusioneis;
	 }

	 public boolean getAlimentazione() {
	  return alimentazione;
	 }

	 public boolean getDisalimentazione() {
	  return disalimentazione;
	 }


	 public void setId(int id) {
	  this.id = id;
	 }

	 public void setIdSlot(int idSlot) {
	  this.idSlot = idSlot;
	 }

	 public void setUid(int uid) {
	  this.uid = uid;
	 }

	 public void setName(String name) {
	  this.name = name;
	 }

	 public void setLeggeron(boolean leggeron) {
	  this.leggeron = leggeron;
	 }

	 public void setLeggeror(boolean leggeror) {
	  this.leggeror = leggeror;
	 }

	 public void setTelecomandon(boolean telecomandon) {
	  this.telecomandon = telecomandon;
	 }

	 public void setTelecomandor(boolean telecomandor) {
	  this.telecomandor = telecomandor;
	 }

	 public void setConfermaton(boolean confermaton) {
	  this.confermaton = confermaton;
	 }

	 public void setConfermator(boolean confermator) {
	  this.confermator = confermator;
	 }

	 public void setTbn(boolean tbn) {
	  this.tbn = tbn;
	 }

	 public void setTbr(boolean tbr) {
	  this.tbr = tbr;
	 }

	 public void setTcn(boolean tcn) {
	  this.tcn = tcn;
	 }

	 public void setTcr(boolean tcr) {
	  this.tcr = tcr;
	 }

	 public void setTbtcn(boolean tbtcn) {
	  this.tbtcn = tbtcn;
	 }

	 public void setTbtcr(boolean tbtcr) {
	  this.tbtcr = tbtcr;
	 }

	 public void setEsclusioneis(boolean esclusioneis) {
	  this.esclusioneis = esclusioneis;
	 }

	 public void setEsclusionedm(boolean esclusionedm) {
	  this.esclusionedm = esclusionedm;
	 }

	 public void setAnnullamento_esclusionedm(boolean annullamento_esclusionedm) {
	  this.annullamento_esclusionedm = annullamento_esclusionedm;
	 }

	 public void setAnnullamento_am_esclusioneis(boolean annullamento_am_esclusioneis) {
	  this.annullamento_am_esclusioneis = annullamento_am_esclusioneis;
	 }

	 public void setAnnullamento_dm_esclusioneis(boolean annullamento_dm_esclusioneis) {
	  this.annullamento_dm_esclusioneis = annullamento_dm_esclusioneis;
	 }

	 public void setAlimentazione(boolean alimentazione) {
	  this.alimentazione = alimentazione;
	 }

	 public void setDisalimentazione(boolean disalimentazione) {
	  this.disalimentazione = disalimentazione;
	 }

	  @Override
		public String toString(){
		  return getId() + ", "+getIdSlot()+", "+getUid() + ", "+getName()+", "+getLeggeron() + ", "+getLeggeror()+", "+getTelecomandon()
			 + ", "+getTelecomandor()+", "+getConfermaton() + ", "+getConfermator()+ ", "+getTbn()+", "+getTbr() + ", "+getTcn()+", "
				  +getTcr() + ", "+getTbtcn()+ ", "+getTbtcr()+", "+getEsclusioneis() + ", "+getEsclusionedm()+", "+getAnnullamento_esclusionedm() + ", "
			 +getAnnullamento_am_esclusioneis()+ ", "+getAnnullamento_dm_esclusioneis()+", "+getAlimentazione() + ", "+getDisalimentazione();	  
	    }
}
