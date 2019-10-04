package jsonTo;

public class ListInstradamento {
		 private int id;
		 private int idSlot;
		 private int uid;
		 private String name;
		 private boolean attivazione_da_to;
		 private boolean disattivazione_da_to;
		 private boolean attivazione_da_dco;
		 private boolean disattivazione_da_dco;


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

		 public boolean getAttivazione_da_to() {
		  return attivazione_da_to;
		 }

		 public boolean getDisattivazione_da_to() {
		  return disattivazione_da_to;
		 }

		 public boolean getAttivazione_da_dco() {
		  return attivazione_da_dco;
		 }

		 public boolean getDisattivazione_da_dco() {
		  return disattivazione_da_dco;
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

		 public void setAttivazione_da_to(boolean attivazione_da_to) {
		  this.attivazione_da_to = attivazione_da_to;
		 }

		 public void setDisattivazione_da_to(boolean disattivazione_da_to) {
		  this.disattivazione_da_to = disattivazione_da_to;
		 }

		 public void setAttivazione_da_dco(boolean attivazione_da_dco) {
		  this.attivazione_da_dco = attivazione_da_dco;
		 }

		 public void setDisattivazione_da_dco(boolean disattivazione_da_dco) {
		  this.disattivazione_da_dco = disattivazione_da_dco;
		 }
		 
		 @Override
			public String toString(){
				return getId() + ", "+getIdSlot()+", "+getUid() + ", "+getName()+", "+getAttivazione_da_to() + ", "+getDisattivazione_da_to()
				 +", "+getAttivazione_da_dco() + ", "+getDisattivazione_da_dco();

			}
	}

