package jsonTo;

public class ListRTE {

	private int id;
	 private int idSlot;
	 private int uid;
	 private String name;
	 private boolean attivazione_rte;


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

	 public boolean getAttivazione_rte() {
	  return attivazione_rte;
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

	 public void setAttivazione_rte(boolean attivazione_rte) {
	  this.attivazione_rte = attivazione_rte;
	 }
	 
	 @Override
		public String toString(){
			StringBuilder sb = new StringBuilder();

		}
}
