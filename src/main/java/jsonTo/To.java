package jsonTo;

public class To {

	private int numero_ciclo;
	private String tag;
	private String idStazione;
	private String idCda;
	private ListCircuitoDiBinario listCircuitoDiBinario;
	private ListDeviatoio listDeviatoio;
	private ListSegnaleAlto listSegnaleAlto;
    private ListItinerario listItinerario;
    private ListInstradamento listInstradamento;
    private ListRTE listRTE;
    private ListRegimeDiStazione listRegimeDiStazione;

    
    public int getNumero_ciclo ()
    {
        return numero_ciclo;
    }
    
    public void setNumero_ciclo (int numero_ciclo)
    {
        this.numero_ciclo = numero_ciclo;
    }
    
    public String getTag ()
    {
        return tag;
    }
    
    public void setTag (String tag)
    {
        this.tag = tag;
    }
    
    public String getIdStazione ()
    {
        return idStazione;
    }

    public void setIdStazione (String idStazione)
    {
        this.idStazione = idStazione;
    }
    
    public String getIdCda ()
    {
        return idCda;
    }

    public void setIdCda (String idCda)
    {
        this.idCda = idCda;
    }
    
    public ListCircuitoDiBinario getListCircuitoDiBinario ()
    {
        return listCircuitoDiBinario;
    }

    public void setListCircuitoDiBinario (ListCircuitoDiBinario listCircuitoDiBinario)
    {
        this.listCircuitoDiBinario = listCircuitoDiBinario;
    }

    public ListInstradamento getListInstradamento ()
    {
        return listInstradamento;
    }

    public void setListInstradamento (ListInstradamento listInstradamento)
    {
        this.listInstradamento = listInstradamento;
    }
    public ListDeviatoio getListDeviatoio ()
    {
        return listDeviatoio;
    }

    public void setListDeviatoio (ListDeviatoio listDeviatoio)
    {
        this.listDeviatoio = listDeviatoio;
    }

    public ListItinerario getListItinerario ()
    {
        return listItinerario;
    }

    public void setListItinerario (ListItinerario listItinerario)
    {
        this.listItinerario = listItinerario;
    }

    public ListRegimeDiStazione getListRegimeDiStazione ()
    {
        return listRegimeDiStazione;
    }

    public void setListRegimeDiStazione (ListRegimeDiStazione listRegimeDiStazione)
    {
        this.listRegimeDiStazione = listRegimeDiStazione;
    }

    public ListSegnaleAlto getListSegnaleAlto ()
    {
        return listSegnaleAlto;
    }

    public void setListSegnaleAlto (ListSegnaleAlto listSegnaleAlto)
    {
        this.listSegnaleAlto = listSegnaleAlto;
    }
    
    public ListRTE getListRTE ()
    {
        return listRTE;
    }

    public void setListRTE (ListRTE listRTE)
    {
        this.listRTE = listRTE;
    }

    @Override
	public String toString(){
    	StringBuilder sb = new StringBuilder();
		sb.append("***** To.json Details *****\n");
		sb.append("tag="+getTag()+"\n");
		sb.append("idStazione="+getIdStazione()+"\n");
		sb.append("idCda="+getIdCda()+"\n");
		sb.append("ListCircuitoDiBinario="+getListCircuitoDiBinario()+"\n");
		sb.append("ListDeviatoio="+getListDeviatoio()+"\n");
		sb.append("ListSegnaleAlto="+getListSegnaleAlto()+"\n");
		sb.append("ListItinerario="+getListItinerario()+"\n");
		sb.append("ListInstradamento="+getListInstradamento()+"\n");
		sb.append("ListRTE="+getListRTE()+"\n");
		sb.append("ListRegimeDiStazione="+getListRegimeDiStazione()+"\n");

		
		return sb.toString();
    }
}


