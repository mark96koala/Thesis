package jsonSimulatoreFrom;

public class ListRipetitoreDiPartenza {

	private String id;
	private String idSlot;
	private String uid;
	private String name;
	private String lettura;
	

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

	 public String getLettura() {
	  return lettura;
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

	 public void setLettura(String lettura) {
	  this.lettura = lettura;
	 }
	 
	 @Override
		public String toString(){
			return getId() + ", "+getIdSlot()+", "+getUid() + ", "+getName()+", "+getLettura();
	 }
}
