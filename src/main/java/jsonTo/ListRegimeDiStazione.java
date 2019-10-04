package jsonTo;

public class ListRegimeDiStazione {
	
	 private int id;
	 private int idSlot;
	 private int uid;
	 private String name;
	 private boolean edco_verso_j;
	 private boolean edco_verso_sp;
	 private boolean edco;


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

	 public boolean getEdco_verso_j() {
	  return edco_verso_j;
	 }

	 public boolean getEdco_verso_sp() {
	  return edco_verso_sp;
	 }

	 public boolean getEdco() {
	  return edco;
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

	 public void setEdco_verso_j(boolean edco_verso_j) {
	  this.edco_verso_j = edco_verso_j;
	 }

	 public void setEdco_verso_sp(boolean edco_verso_sp) {
	  this.edco_verso_sp = edco_verso_sp;
	 }

	 public void setEdco(boolean edco) {
	  this.edco = edco;
	 }

	 @Override
		public String toString(){
			return getId() + ", "+getIdSlot()+", "+getUid() + ", "+getName()+", "+getEdco_verso_j()+", "+getEdco_verso_sp()+", "
					+getEdco();
		}
}
