package jsonSimulatoreTo;

public class ListRipetitoreDiPartenza {

	private int id;
	private int idSlot;
	private int uid;
	private String name;
	private String scrittura;
	

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

	 public String getScrittura() {
	  return scrittura;
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

	 public void setScrittura(String scrittura) {
	  this.scrittura = scrittura;
	 }
	 
	 @Override
		public String toString(){
			return getId() + ", "+getIdSlot()+", "+getUid() + ", "+getName()+", "+getScrittura();
	 }
}
