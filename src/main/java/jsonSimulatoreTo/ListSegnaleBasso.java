package jsonSimulatoreTo;

public class ListSegnaleBasso {

	private String id;
	private String idSlot;
	private String uid;
	private String name;
	private String scrittura;
	

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

	 public String getScrittura() {
	  return scrittura;
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

	 public void setScrittura(String scrittura) {
	  this.scrittura = scrittura;
	 }
	 
	 @Override
		public String toString(){
			return getId() + ", "+getIdSlot()+", "+getUid() + ", "+getName()+", "+getScrittura();
	 }
}
