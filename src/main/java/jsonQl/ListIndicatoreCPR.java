package jsonQl;

public class ListIndicatoreCPR {
	
	 private String id;
	 private String idSlot;
	 private String uid;
	 private String name;
	 private String target;
	 private String stato;


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

	 public String getTarget() {
	  return target;
	 }

	 public String getStato() {
	  return stato;
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

	 public void setTarget(String target) {
	  this.target = target;
	 }

	 public void setStato(String stato) {
	  this.stato = stato;
	 }

	 
	 @Override
		public String toString(){
			return getId() + ", "+getIdSlot()+", "+getUid() + ", "+getName()+", "+getTarget()+", "+getStato();
	 }
}
