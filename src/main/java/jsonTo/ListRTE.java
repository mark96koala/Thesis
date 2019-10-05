package jsonTo;

public class ListRTE {

	private String id;
	 private String idSlot;
	 private String uid;
	 private String name;
	 private boolean attivazione_rte;


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

	 public boolean getAttivazione_rte() {
	  return attivazione_rte;
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

	 public void setAttivazione_rte(boolean attivazione_rte) {
	  this.attivazione_rte = attivazione_rte;
	 }
	 
	 @Override
		public String toString(){
		 return getId() + ", "+getIdSlot()+", "+getUid() + ", "+getName()+", "+getAttivazione_rte();
		}
}
