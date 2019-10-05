package jsonTo;

import java.util.Arrays;

public class ListCircuitoDiBinario {

	private String id;
	private String idSlot;
	private String uid;
	private String name;
	private boolean esclusioneis;
	private boolean esclusionedm;
	private boolean annullamento_esclusionedm;
	private boolean annullamento_am_esclusioneis;
	private boolean annullamento_dm_esclusioneis;

	
	private boolean tlcdb;

	public String getUid ()
	{
		return uid;
	}

	public void setUid (String uid)
	{
		this.uid = uid;
	}

	public boolean getEsclusionedm ()
	{
		return esclusionedm;
	}

	public void setEsclusionedm (boolean esclusionedm)
	{
		this.esclusionedm = esclusionedm;
	}

	public boolean getAnnullamento_esclusionedm ()
	{
		return annullamento_esclusionedm;
	}

	public void setAnnullamento_esclusionedm (boolean annullamento_esclusionedm)
	{
		this.annullamento_esclusionedm = annullamento_esclusionedm;
	}

	public boolean getEsclusioneis ()
	{
		return esclusioneis;
	}

	public void setEsclusioneis (boolean esclusioneis)
	{
		this.esclusioneis = esclusioneis;
	}

	public boolean getAnnullamento_dm_esclusioneis ()
	{
		return annullamento_dm_esclusioneis;
	}

	public void setAnnullamento_dm_esclusioneis (boolean annullamento_dm_esclusioneis)
	{
		this.annullamento_dm_esclusioneis = annullamento_dm_esclusioneis;
	}

	public String getName ()
	{
		return name;
	}

	public void setName (String name)
	{
		this.name = name;
	}

	public boolean getAnnullamento_am_esclusioneis ()
	{
		return annullamento_am_esclusioneis;
	}

	public void setAnnullamento_am_esclusioneis (boolean annullamento_am_esclusioneis)
	{
		this.annullamento_am_esclusioneis = annullamento_am_esclusioneis;
	}

	public String getId ()
	{
		return id;
	}

	public void setId (String id)
	{
		this.id = id;
	}

	public String getIdSlot ()
	{
		return idSlot;
	}

	public void setIdSlot (String idSlot)
	{
		this.idSlot = idSlot;
	}

	public boolean getTlcdb ()
	{
		return tlcdb;
	}

	public void setTlcdb (boolean tlcdb)
	{
		this.tlcdb = tlcdb;
	}
	 
	@Override
	public String toString(){
		return getId() + ", "+getIdSlot()+", "+getUid() + ", "+getName()+", "+getEsclusioneis() + ", "+getEsclusionedm()+", "+getAnnullamento_esclusionedm()
		 + ", "+getAnnullamento_am_esclusioneis()+", "+getAnnullamento_dm_esclusioneis() + ", "+getTlcdb();	    	
	    }


}
