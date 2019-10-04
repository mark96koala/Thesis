package jsonTo;

public class ListSegnaleAlto {
	
	 private int id;
	 private int idSlot;
	 private int uid;
	 private String name;
	 private boolean chiusuradm;
	 private boolean annullamento_chiusuradm;
	 private boolean annullamento_dm_ch;
	 private boolean annullamento_am_ch;
	 private boolean txgenerico_cmd;
	 private boolean esclusioneis;
	 private boolean esclusionedm;
	 private boolean annullamento_esclusionedm;
	 private boolean annullamento_am_esclusioneis;
	 private boolean annullamento_dm_esclusioneis;

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

	 public boolean getChiusuradm() {
	  return chiusuradm;
	 }

	 public boolean getAnnullamento_chiusuradm() {
	  return annullamento_chiusuradm;
	 }

	 public boolean getAnnullamento_dm_ch() {
	  return annullamento_dm_ch;
	 }

	 public boolean getAnnullamento_am_ch() {
	  return annullamento_am_ch;
	 }

	 public boolean getTxgenerico_cmd() {
	  return txgenerico_cmd;
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

	 public void setChiusuradm(boolean chiusuradm) {
	  this.chiusuradm = chiusuradm;
	 }

	 public void setAnnullamento_chiusuradm(boolean annullamento_chiusuradm) {
	  this.annullamento_chiusuradm = annullamento_chiusuradm;
	 }

	 public void setAnnullamento_dm_ch(boolean annullamento_dm_ch) {
	  this.annullamento_dm_ch = annullamento_dm_ch;
	 }

	 public void setAnnullamento_am_ch(boolean annullamento_am_ch) {
	  this.annullamento_am_ch = annullamento_am_ch;
	 }

	 public void setTxgenerico_cmd(boolean txgenerico_cmd) {
	  this.txgenerico_cmd = txgenerico_cmd;
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

	  @Override
		public String toString(){
		  return getId() + ", "+getIdSlot()+", "+getUid() + ", "+getName()+", "+getChiusuradm() + ", "+getAnnullamento_chiusuradm()
		  +", "+getAnnullamento_dm_ch()+ ", "+getAnnullamento_am_ch()+", "+getTxgenerico_cmd() + ", "+getEsclusioneis()+ ", "+getEsclusionedm()
		  +", "+getAnnullamento_esclusionedm()+ ", "+getAnnullamento_am_esclusioneis()+", "+getAnnullamento_dm_esclusioneis();	
	    	
	    }

}
