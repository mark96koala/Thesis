package jsonSimulatoreFrom;

public class SimulatoreFrom {

	private int numero_ciclo;
	private String tag;
 	private String idStazione;
    private String idCda;
    private ListCircuitoDiBinario listCircuitoDiBinario;
    private ListDeviatoio listDeviatoio;
    private ListElettromagnete listElettromagnete;
    private ListSegnaleAlto listSegnaleAlto;
    private ListFrecciaEvidenziatrice listFrecciaEvidenziatrice;
    private ListAvvioAvanzamento listAvvioAvanzamento;
    private ListRipetitoreDiPartenza listRipetitoreDiPartenza;
  	private ListSegnaleBasso listSegnaleBasso;

    
  	 public int getNumero_ciclo ()
     {
         return numero_ciclo;
     }
     
     public void setNumero_ciclo (int numero_ciclo)
     {
         this.numero_ciclo = numero_ciclo;
     }
     
    public ListCircuitoDiBinario getListCircuitoDiBinario ()
    {
        return listCircuitoDiBinario;
    }

    public void setListCircuitoDiBinario (ListCircuitoDiBinario listCircuitoDiBinario)
    {
        this.listCircuitoDiBinario = listCircuitoDiBinario;
    }

    public ListElettromagnete getListElettromagnete ()
    {
        return listElettromagnete;
    }

    public void setListElettromagnete (ListElettromagnete listElettromagnete)
    {
        this.listElettromagnete = listElettromagnete;
    }

    public ListAvvioAvanzamento getListAvvioAvanzamento ()
    {
        return listAvvioAvanzamento;
    }

    public void setListAvvioAvanzamento (ListAvvioAvanzamento listAvvioAvanzamento)
    {
        this.listAvvioAvanzamento = listAvvioAvanzamento;
    }

    public ListSegnaleBasso getListSegnaleBasso ()
    {
        return listSegnaleBasso;
    }

    public void setListSegnaleBasso (ListSegnaleBasso listSegnaleBasso)
    {
        this.listSegnaleBasso = listSegnaleBasso;
    }

    public ListRipetitoreDiPartenza getListRipetitoreDiPartenza ()
    {
        return listRipetitoreDiPartenza;
    }

    public void setListRipetitoreDiPartenza (ListRipetitoreDiPartenza listRipetitoreDiPartenza)
    {
        this.listRipetitoreDiPartenza = listRipetitoreDiPartenza;
    }

    public ListSegnaleAlto getListSegnaleAlto ()
    {
        return listSegnaleAlto;
    }

    public void setListSegnaleAlto (ListSegnaleAlto listSegnaleAlto)
    {
        this.listSegnaleAlto = listSegnaleAlto;
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

    public ListFrecciaEvidenziatrice getListFrecciaEvidenziatrice ()
    {
        return listFrecciaEvidenziatrice;
    }

    public void setListFrecciaEvidenziatrice (ListFrecciaEvidenziatrice listFrecciaEvidenziatrice)
    {
        this.listFrecciaEvidenziatrice = listFrecciaEvidenziatrice;
    }

    public ListDeviatoio getListDeviatoio ()
    {
        return listDeviatoio;
    }

    public void setListDeviatoio (ListDeviatoio listDeviatoio)
    {
        this.listDeviatoio = listDeviatoio;
    }

    public String getTag ()
    {
        return tag;
    }

    public void setTag (String tag)
    {
        this.tag = tag;
    }

    
    @Override
	public String toString(){
    	StringBuilder sb = new StringBuilder();
		sb.append("***** SimulatoreFrom.json Details *****\n");
		sb.append("tag="+getTag()+"\n");
		sb.append("idStazione="+getIdStazione()+"\n");
		sb.append("idCda="+getIdCda()+"\n");
		sb.append("ListCircuitoDiBinario="+getListCircuitoDiBinario()+"\n");
		sb.append("ListDeviatoio="+getListDeviatoio()+"\n");
		sb.append("ListElettromagnete="+getListElettromagnete()+"\n");
		sb.append("ListSegnaleAlto="+getListSegnaleAlto()+"\n");
		sb.append("ListFrecciaEvidenziatrice="+getListFrecciaEvidenziatrice()+"\n");
		sb.append("ListAvvioAvanzamento="+getListAvvioAvanzamento()+"\n");
		sb.append("ListRipetitoreDiPartenza="+getListRipetitoreDiPartenza()+"\n");
		sb.append("ListSegnaleBasso="+getListSegnaleBasso()+"\n");

		
		return sb.toString();
    }
}
