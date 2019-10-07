package it.univaq.disim.lucene.test;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import it.univaq.disim.lucene.index.WriteIndexQlJson;
import it.univaq.disim.lucene.index.WriteIndexSimulatoreFromJson;
import it.univaq.disim.lucene.index.WriteIndexSimulatoreToJson;
import it.univaq.disim.lucene.index.WriteIndexToJson;
import it.univaq.disim.lucene.utility.ObjectMapperJson;
import jsonTo.*;
import jsonTo.ListCircuitoDiBinario;
import jsonTo.ListDeviatoio;
import jsonTo.ListInstradamento;
import jsonTo.ListItinerario;
import jsonTo.ListRTE;
import jsonTo.ListRegimeDiStazione;
import jsonTo.ListSegnaleAlto;
import jsonSimulatoreTo.*;
import jsonSimulatoreFrom.*;
import jsonQl.*;
import jsonQl.ListSegnaleBasso;

public class ComunicationJsonSimulator {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {

		int i=0;

		while(i<50){
			
			//Output folder
			String indexPath = "indexedFiles";

			ObjectMapper objectMapper = new ObjectMapper();

			objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);

			StringWriter stringEmp1 = new StringWriter();
			To to1 = createToObject();
			to1.setNumero_ciclo(i);
			objectMapper.writeValue(stringEmp1, to1);   //stringemp = Json di To1  
			System.out.println("To Json "+i+" is\n"+stringEmp1);
			File file1 = new File("inputFiles/To"+i+".json");
			objectMapper.writeValue(file1, to1);  // Ho il file JSON
			byte[] jsonData1 = Files.readAllBytes(Paths.get(file1.getPath())); //read json file data to String
			To to11 = ObjectMapperJson.deserializeToJson(jsonData1);
			WriteIndexToJson.StartWriteIndex(indexPath,file1.toPath(),to11);

			StringWriter stringEmp2 = new StringWriter();
			Ql ql1 = createQlObject();
			ql1.setNumero_ciclo(i);
			objectMapper.writeValue(stringEmp2, ql1);    
			System.out.println("Ql Json "+i+" is\n"+stringEmp2);
			File file2 = new File("inputFiles/Ql"+i+".json");
			objectMapper.writeValue(file2, ql1);  // Ho il file JSON
			byte[] jsonData2 = Files.readAllBytes(Paths.get(file2.getPath())); //read json file data to String
			Ql ql11 = ObjectMapperJson.deserializeQlJson(jsonData2);
			WriteIndexQlJson.StartWriteIndex(indexPath,file2.toPath(),ql11);

			StringWriter stringEmp3 = new StringWriter();
			SimulatoreTo SimTo = createSimulatoreToObject();
			SimTo.setNumero_ciclo(i);
			objectMapper.writeValue(stringEmp3, SimTo);    
			System.out.println("SimTo Json "+i+" is\n"+stringEmp3);
			File file3 = new File("inputFiles/SimulatoreTo"+i+".json");
			objectMapper.writeValue(file3, SimTo);  // Ho il file JSON
			byte[] jsonData3 = Files.readAllBytes(Paths.get(file3.getPath())); //read json file data to String
			SimulatoreTo SimTo1 = ObjectMapperJson.deserializeSimulatoreToJson(jsonData3);
			WriteIndexSimulatoreToJson.StartWriteIndex(indexPath,file3.toPath(),SimTo1);

			StringWriter stringEmp4 = new StringWriter();
			SimulatoreFrom SimFrom = createSimulatoreFromObject();
			SimFrom.setNumero_ciclo(i);
			objectMapper.writeValue(stringEmp4, SimFrom);    
			System.out.println("SimFrom Json is\n"+stringEmp4);
			File file4 = new File("inputFiles/SimulatoreFrom"+i+".json");
			objectMapper.writeValue(file4, SimFrom);  // Ho il file JSON
			byte[] jsonData4 = Files.readAllBytes(Paths.get(file4.getPath())); //read json file data to String
			SimulatoreFrom SimFrom1 = ObjectMapperJson.deserializeSimulatoreFromJson(jsonData4);
			WriteIndexSimulatoreFromJson.StartWriteIndex(indexPath,file4.toPath(),SimFrom1);


			i++;

		}

	}

	public static To createToObject() {

		ObjectMapper mapper = new ObjectMapper();

		mapper.configure(SerializationFeature.INDENT_OUTPUT, true);

		To to1 = new To();
		to1.setNumero_ciclo(1);
		to1.setTag("terminale");
		to1.setIdStazione("3");
		to1.setIdCda("4");

		ListCircuitoDiBinario circuito = new ListCircuitoDiBinario();
		circuito.setId("4");
		circuito.setIdSlot("8");
		circuito.setUid("5");
		circuito.setName("Giacomo");
		circuito.setEsclusioneis(false);
		circuito.setEsclusionedm(false);
		circuito.setAnnullamento_esclusionedm(false);
		circuito.setAnnullamento_am_esclusioneis(false);
		circuito.setAnnullamento_dm_esclusioneis(true);
		circuito.setTlcdb(false);
		to1.setListCircuitoDiBinario(circuito);

		ListDeviatoio deviatoio = new ListDeviatoio();
		deviatoio.setId("45");
		deviatoio.setIdSlot("47");
		deviatoio.setUid("67");
		deviatoio.setName("Rts");
		deviatoio.setLeggeron(false);
		deviatoio.setLeggeror(true);
		deviatoio.setTelecomandon(true);
		deviatoio.setTelecomandor(false);
		deviatoio.setConfermaton(false);
		deviatoio.setConfermator(true);
		deviatoio.setTbn(false);
		deviatoio.setTbr(true);
		deviatoio.setTcn(false);
		deviatoio.setTcr(true);
		deviatoio.setTbtcn(false);
		deviatoio.setTbtcr(false);
		deviatoio.setEsclusioneis(false);
		deviatoio.setEsclusionedm(true);
		deviatoio.setAnnullamento_esclusionedm(false);
		deviatoio.setAnnullamento_am_esclusioneis(true);
		deviatoio.setAnnullamento_dm_esclusioneis(false);
		deviatoio.setAlimentazione(false);
		deviatoio.setDisalimentazione(true);
		to1.setListDeviatoio(deviatoio);

		ListSegnaleAlto segnalealto = new ListSegnaleAlto();
		segnalealto.setId("26");
		segnalealto.setIdSlot("24");
		segnalealto.setUid("89");
		segnalealto.setName("Rop");
		segnalealto.setChiusuradm(false);
		segnalealto.setAnnullamento_chiusuradm(true);
		segnalealto.setAnnullamento_dm_ch(true);
		segnalealto.setAnnullamento_am_ch(false);
		segnalealto.setTxgenerico_cmd(false);
		segnalealto.setEsclusioneis(false);
		segnalealto.setEsclusionedm(false);
		segnalealto.setAnnullamento_esclusionedm(false);
		segnalealto.setAnnullamento_am_esclusioneis(false);
		segnalealto.setAnnullamento_dm_esclusioneis(true);
		to1.setListSegnaleAlto(segnalealto);

		ListItinerario itinerario = new ListItinerario();
		itinerario.setId("25");
		itinerario.setIdSlot("68");
		itinerario.setUid("25");
		itinerario.setName("Ghs");
		itinerario.setAttivazione_da_to(false);
		itinerario.setDisattivazione_da_to(true);
		itinerario.setAttivazione_da_dco(false);
		itinerario.setDisattivazione_da_dco(true);
		to1.setListItinerario(itinerario);

		ListInstradamento instradamento = new ListInstradamento();
		instradamento.setId("4");
		instradamento.setIdSlot("4");
		instradamento.setUid("4");
		instradamento.setName("Ghs");
		instradamento.setAttivazione_da_to(false);
		instradamento.setDisattivazione_da_to(true);
		instradamento.setAttivazione_da_dco(false);
		instradamento.setDisattivazione_da_dco(true);
		to1.setListInstradamento(instradamento);

		ListRTE rte = new ListRTE();
		rte.setId("11");
		rte.setIdSlot("8");
		rte.setUid("14");
		rte.setName("lju");
		rte.setAttivazione_rte(false);
		to1.setListRTE(rte);

		ListRegimeDiStazione regime = new ListRegimeDiStazione();
		regime.setId("11");
		regime.setIdSlot("8");
		regime.setUid("14");
		regime.setName("lju");
		regime.setEdco_verso_j(false);
		regime.setEdco_verso_sp(true);
		regime.setEdco(true);
		to1.setListRegimeDiStazione(regime);

		return to1;
	}

	public static Ql createQlObject() {

		ObjectMapper mapper = new ObjectMapper();

		mapper.configure(SerializationFeature.INDENT_OUTPUT, true);

		Ql ql1 = new Ql();
		ql1.setNumero_ciclo(0);
		ql1.setTag("quadroluminoso");
		ql1.setIdStazione("3");
		ql1.setIdCda("4");

		jsonQl.ListCircuitoDiBinario circuito = new jsonQl.ListCircuitoDiBinario();
		circuito.setId("4");
		circuito.setIdSlot("8");
		circuito.setUid("5");
		circuito.setName("Sire");
		circuito.setCodificattiva(false);
		circuito.setConcodifica(true);
		circuito.setCodicevelocita(80);
		circuito.setBloccato_uscita(false);
		circuito.setBloccato_laterale(true);
		circuito.setVincolo_esclusione_da_uscita(false);
		circuito.setVincolo_esclusione_da_laterale(false);
		circuito.setInteressato_da_convergenza(false);
		circuito.setEsclusodm(true);
		circuito.setEsclusois(false);
		circuito.setOssidato("1");
		circuito.setMemoria_ossidato(false);
		circuito.setDirezione_codifica("sinistra");
		circuito.setStato("idle");
		circuito.setRicam("attivo");
		circuito.setInclusione_am("attivo");			
		ql1.setListCircuitoDiBinario(circuito);

		jsonQl.ListDeviatoio deviatoio = new jsonQl.ListDeviatoio();
		deviatoio.setId("46");
		deviatoio.setIdSlot("58");
		deviatoio.setUid("80");
		deviatoio.setName("drt");
		deviatoio.setStatologico("normale");
		deviatoio.setSoccorsotb(true);
		deviatoio.setAzionamento_automatico(true);
		deviatoio.setEsclusois(false);
		deviatoio.setEsclusodm(true);
		deviatoio.setAlimentato(true);
		deviatoio.setInibizione_contromanovra(true);
		deviatoio.setStato("idle");
		deviatoio.setRicam("attivo");
		deviatoio.setInclusione_am("attivo");
		deviatoio.setComando_laterale("disattivo");
		deviatoio.setProtezione_motore("attivo");
		ql1.setListDeviatoio(deviatoio);

		jsonQl.ListElettromagnete elettromagn = new jsonQl.ListElettromagnete();
		elettromagn.setId("11");
		elettromagn.setIdSlot("8");
		elettromagn.setUid("14");
		elettromagn.setName("lju");
		elettromagn.setEsclusois(false);
		elettromagn.setEsclusodm(true);
		elettromagn.setRichiestobasso(true);
		elettromagn.setStato("idle");
		ql1.setListElettromagnete(elettromagn);

		jsonQl.ListSegnaleAlto segnalealto = new jsonQl.ListSegnaleAlto();
		segnalealto.setId("26");
		segnalealto.setIdSlot("24");
		segnalealto.setUid("89");
		segnalealto.setName("Rop");
		segnalealto.setTxgenerico_stato("abilitato");
		segnalealto.setTbo("abilitato");
		segnalealto.setTarget("rosso");
		segnalealto.setManovrabilita(true);
		segnalealto.setManovrabilita_tx(false);
		segnalealto.setVincolo_esclusione_da_uscita(true);
		segnalealto.setVincolo_esclusione_da_tp(false);
		segnalealto.setEsclusodm(true);
		segnalealto.setEsclusois(false);
		segnalealto.setChiusoam(true);
		segnalealto.setChiusodm(false);
		segnalealto.setStato("concordanza");
		segnalealto.setRicam("attivo");
		segnalealto.setInclusione_am("attivo");
		segnalealto.setInviocomando("disattivo");
		segnalealto.setProtezione_motore("attivo");
		segnalealto.setRicam_ch("attivo");
		segnalealto.setAnnullata_am_ch("attivo");
		ql1.setListSegnaleAlto(segnalealto);

		jsonQl.ListFrecciaEvidenziatrice frecciaevid = new jsonQl.ListFrecciaEvidenziatrice();
		frecciaevid.setId("27");
		frecciaevid.setIdSlot("18");
		frecciaevid.setUid("6");
		frecciaevid.setName("Ghs");
		frecciaevid.setEsclusois(true);
		frecciaevid.setEsclusodm(false);
		frecciaevid.setStato("idle");
		ql1.setListFrecciaEvidenziatrice(frecciaevid);

		jsonQl.ListIndicatoreCPR indicatore = new jsonQl.ListIndicatoreCPR();
		indicatore.setId("25");
		indicatore.setIdSlot("68");
		indicatore.setUid("25");
		indicatore.setName("Ghs");
		indicatore.setTarget("spento");
		indicatore.setStato("idle");
		ql1.setListIndicatoreCPR(indicatore);

		jsonQl.ListIndicatoreDiDirezione indicatoredir = new jsonQl.ListIndicatoreDiDirezione();
		indicatoredir.setId("25");
		indicatoredir.setIdSlot("68");
		indicatoredir.setUid("25");
		indicatoredir.setName("tgf");
		indicatoredir.setEsclusois(true);
		indicatoredir.setEsclusodm(false);
		indicatoredir.setNumero_da_accendere(0);
		indicatoredir.setStato("idle");
		ql1.setListIndicatoreDiDirezione(indicatoredir);

		jsonQl.ListAvvioAvanzamento avvioav = new jsonQl.ListAvvioAvanzamento();
		avvioav.setId("25");
		avvioav.setIdSlot("68");
		avvioav.setUid("25");
		avvioav.setName("weg");
		avvioav.setEsclusois(true);
		avvioav.setEsclusodm(false);
		avvioav.setStato("idle");
		ql1.setListAvvioAvanzamento(avvioav);

		jsonQl.ListRipetitoreDiPartenza ripetit = new jsonQl.ListRipetitoreDiPartenza();
		ripetit.setId("25");
		ripetit.setIdSlot("68");
		ripetit.setUid("25");
		ripetit.setName("fdh");
		ripetit.setEsclusois(true);
		ripetit.setEsclusodm(false);
		ripetit.setStato("idle");
		ql1.setListRipetitoreDiPartenza(ripetit);

		jsonQl.ListSegnaleBasso segnalebasso = new ListSegnaleBasso();
		segnalebasso.setId("26");
		segnalebasso.setIdSlot("24");
		segnalebasso.setUid("89");
		segnalebasso.setName("rty");
		segnalebasso.setManovrabilita(true);
		segnalebasso.setManovrabilita_tx(false);
		segnalebasso.setLampeggiamento(true);
		segnalebasso.setEsclusodm(true);
		segnalebasso.setEsclusois(false);
		segnalebasso.setTlap("disabilitato");
		segnalebasso.setAp_istra(true);
		segnalebasso.setR_istra(false);
		segnalebasso.setStato("idle");
		segnalebasso.setRicam("attivo");
		segnalebasso.setInclusione_am("attivo");
		ql1.setListSegnaleBasso(segnalebasso);

		jsonQl.ListScudetto scudetto = new ListScudetto();
		scudetto.setId("26");
		scudetto.setIdSlot("24");
		scudetto.setUid("89");
		scudetto.setName("yee");
		scudetto.setEsclusodm(true);
		scudetto.setEsclusois(false);
		scudetto.setComandato(true);
		scudetto.setTsm("abilitato");
		scudetto.setIncompatibilita_itinerario(false);
		scudetto.setStato("idle");
		scudetto.setRicam("attivo");
		scudetto.setInclusione_am("attivo");
		ql1.setListScudetto(scudetto);

		jsonQl.ListAreaLaterale arealat = new ListAreaLaterale();
		arealat.setId("16");
		arealat.setIdSlot("25");
		arealat.setUid("75");
		arealat.setName("fdg");
		arealat.setTcl_attivato(false);
		arealat.setStato("occupato_secco");
		ql1.setListAreaLaterale(arealat);

		jsonQl.ListBloccamentoUscita blocuscita = new ListBloccamentoUscita();
		blocuscita.setId("16");
		blocuscita.setIdSlot("25");
		blocuscita.setUid("75");
		blocuscita.setName("fdg");
		blocuscita.setUscita("attivo");
		blocuscita.setStato("idle");
		ql1.setListBloccamentoUscita(blocuscita);

		jsonQl.ListBloccamentoDelPercorso blocpercorso = new ListBloccamentoDelPercorso();
		blocpercorso.setId("16");
		blocpercorso.setIdSlot("25");
		blocpercorso.setUid("75");
		blocpercorso.setName("fdg");
		blocpercorso.setTlcdb(false);
		blocpercorso.setAcquisita_occupazione(false);
		blocpercorso.setCheck_ossidato(false);
		blocpercorso.setSoccorso_tlcdb(false);
		blocpercorso.setStato("idle");
		ql1.setListBloccamentoDelPercorso(blocpercorso);

		jsonQl.ListCalcoloAspettoECodice calcolo = new ListCalcoloAspettoECodice();
		calcolo.setId("16");
		calcolo.setIdSlot("25");
		calcolo.setUid("75");
		calcolo.setName("fdg");
		calcolo.setAspetto("ctcortissimo");
		calcolo.setChiave_rl_piccola(false);
		calcolo.setStato("idle");
		ql1.setListCalcoloAspettoECodice(calcolo);

		jsonQl.ListItinerario itinerario = new jsonQl.ListItinerario();
		itinerario.setId("25");
		itinerario.setIdSlot("68");
		itinerario.setUid("25");
		itinerario.setName("Ghs");
		itinerario.setStato("idle");
		itinerario.setAbilitazione_check_stato_ossi(false);
		ql1.setListItinerario(itinerario);

		jsonQl.ListInstradamento instradamento = new jsonQl.ListInstradamento();
		instradamento.setId("25");
		instradamento.setIdSlot("68");
		instradamento.setUid("25");
		instradamento.setName("Ghs");
		instradamento.setTransitato("attesa");
		instradamento.setLiberazione_rigida(false);
		instradamento.setStato("idle");
		ql1.setListInstradamento(instradamento);

		jsonQl.ListRTE rte = new jsonQl.ListRTE();
		rte.setId("11");
		rte.setIdSlot("8");
		rte.setUid("14");
		rte.setName("lju");
		rte.setStato("idle");
		ql1.setListRTE(rte);

		jsonQl.ListRegimeDiStazione regime = new jsonQl.ListRegimeDiStazione();
		regime.setId("11");
		regime.setIdSlot("8");
		regime.setUid("14");
		regime.setName("lju");
		regime.setStazione_porta(false);
		regime.setRicevuto_tlcom_j(false);
		regime.setStato("edco");
		regime.setDi_transizionesp("attivo");
		regime.setDi_transizionej("attivo");
		ql1.setListRegimeDiStazione(regime);

		jsonQl.ListCodificaItinerario codifica = new ListCodificaItinerario();
		codifica.setId("11");
		codifica.setIdSlot("8");
		codifica.setUid("14");
		codifica.setName("lju");
		codifica.setStato("idle");
		ql1.setListCodificaItinerario(codifica);

		jsonQl.ListSoccorsoTxTcl soccorso = new ListSoccorsoTxTcl();
		soccorso.setId("11");
		soccorso.setIdSlot("8");
		soccorso.setUid("14");
		soccorso.setName("lju");
		soccorso.setStato("idle");
		ql1.setListSoccorsoTxTcl(soccorso);

		jsonQl.ListTracciatoPermanente tracciato = new ListTracciatoPermanente();
		tracciato.setId("11");
		tracciato.setIdSlot("8");
		tracciato.setUid("14");
		tracciato.setName("lju");
		tracciato.setStato("idle");
		ql1.setListTracciatoPermanente(tracciato);

		jsonQl.ListAnnuncioTreno annuncio = new ListAnnuncioTreno();
		annuncio.setId("11");
		annuncio.setIdSlot("8");
		annuncio.setUid("14");
		annuncio.setName("lju");
		annuncio.setStato("idle");
		ql1.setListAnnuncioTreno(annuncio);

		return ql1;
	}

	public static SimulatoreTo createSimulatoreToObject() {

		ObjectMapper mapper = new ObjectMapper();

		mapper.configure(SerializationFeature.INDENT_OUTPUT, true);

		SimulatoreTo SimTo = new SimulatoreTo();
		SimTo.setNumero_ciclo(0);
		SimTo.setTag("terminale");
		SimTo.setIdStazione("3");
		SimTo.setIdCda("4");

		jsonSimulatoreTo.ListCircuitoDiBinario circuito = new jsonSimulatoreTo.ListCircuitoDiBinario();
		circuito.setId("11");
		circuito.setIdSlot("8");
		circuito.setUid("14");
		circuito.setName("lju");
		circuito.setScrittura("75");
		SimTo.setListCircuitoDiBinario(circuito);

		jsonSimulatoreTo.ListDeviatoio deviatoio = new jsonSimulatoreTo.ListDeviatoio();
		deviatoio.setId("11");
		deviatoio.setIdSlot("8");
		deviatoio.setUid("14");
		deviatoio.setName("lju");
		deviatoio.setScrittura("normale");
		SimTo.setListDeviatoio(deviatoio);

		jsonSimulatoreTo.ListElettromagnete elettrom = new jsonSimulatoreTo.ListElettromagnete();
		elettrom.setId("11");
		elettrom.setIdSlot("8");
		elettrom.setUid("14");
		elettrom.setName("lju");
		elettrom.setScrittura("eccitato");
		SimTo.setListElettromagnete(elettrom);

		jsonSimulatoreTo.ListSegnaleAlto segnalealto = new jsonSimulatoreTo.ListSegnaleAlto();
		segnalealto.setId("11");
		segnalealto.setIdSlot("8");
		segnalealto.setUid("14");
		segnalealto.setName("lju");
		segnalealto.setScrittura("rosso");
		SimTo.setListSegnaleAlto(segnalealto);

		jsonSimulatoreTo.ListFrecciaEvidenziatrice frecevid = new jsonSimulatoreTo.ListFrecciaEvidenziatrice();
		frecevid.setId("11");
		frecevid.setIdSlot("8");
		frecevid.setUid("14");
		frecevid.setName("lju");
		frecevid.setScrittura("accesa");
		SimTo.setListFrecciaEvidenziatrice(frecevid);

		jsonSimulatoreTo.ListIndicatoreCPR indiccpr = new jsonSimulatoreTo.ListIndicatoreCPR();
		indiccpr.setId("11");
		indiccpr.setIdSlot("8");
		indiccpr.setUid("14");
		indiccpr.setName("lju");
		indiccpr.setScrittura("spento");
		SimTo.setListIndicatoreCPR(indiccpr);

		jsonSimulatoreTo.ListIndicatoreDiDirezione indicdir = new jsonSimulatoreTo.ListIndicatoreDiDirezione();
		indicdir.setId("11");
		indicdir.setIdSlot("8");
		indicdir.setUid("14");
		indicdir.setName("lju");
		indicdir.setScrittura("0");
		SimTo.setListIndicatoreDiDirezione(indicdir);

		jsonSimulatoreTo.ListAvvioAvanzamento avvio = new jsonSimulatoreTo.ListAvvioAvanzamento();
		avvio.setId("11");
		avvio.setIdSlot("8");
		avvio.setUid("14");
		avvio.setName("lju");
		avvio.setScrittura("acceso");
		SimTo.setListAvvioAvanzamento(avvio);

		jsonSimulatoreTo.ListRipetitoreDiPartenza ripet = new jsonSimulatoreTo.ListRipetitoreDiPartenza();
		ripet.setId("11");
		ripet.setIdSlot("8");
		ripet.setUid("14");
		ripet.setName("lju");
		ripet.setScrittura("acceso");
		SimTo.setListRipetitoreDiPartenza(ripet);

		jsonSimulatoreTo.ListSegnaleBasso segnalebas = new jsonSimulatoreTo.ListSegnaleBasso();
		segnalebas.setId("11");
		segnalebas.setIdSlot("8");
		segnalebas.setUid("14");
		segnalebas.setName("lju");
		segnalebas.setScrittura("vl_fissa");
		SimTo.setListSegnaleBasso(segnalebas);

		return SimTo;

	}


	public static SimulatoreFrom createSimulatoreFromObject() {

		ObjectMapper mapper = new ObjectMapper();

		mapper.configure(SerializationFeature.INDENT_OUTPUT, true);

		SimulatoreFrom SimFrom = new SimulatoreFrom();
		SimFrom.setNumero_ciclo(0);
		SimFrom.setTag("terminale");
		SimFrom.setIdStazione("3");
		SimFrom.setIdCda("4");

		jsonSimulatoreFrom.ListCircuitoDiBinario circuito = new jsonSimulatoreFrom.ListCircuitoDiBinario();
		circuito.setId("11");
		circuito.setIdSlot("8");
		circuito.setUid("14");
		circuito.setName("lju");
		circuito.setCodifica("true");
		SimFrom.setListCircuitoDiBinario(circuito);

		jsonSimulatoreFrom.ListDeviatoio deviatoio = new jsonSimulatoreFrom.ListDeviatoio();
		deviatoio.setId("11");
		deviatoio.setIdSlot("8");
		deviatoio.setUid("14");
		deviatoio.setName("lju");
		deviatoio.setControllo_posizione("normale");
		SimFrom.setListDeviatoio(deviatoio);

		jsonSimulatoreFrom.ListElettromagnete elettrom = new jsonSimulatoreFrom.ListElettromagnete();
		elettrom.setId("11");
		elettrom.setIdSlot("8");
		elettrom.setUid("14");
		elettrom.setName("lju");
		elettrom.setLettura("eccitato");
		SimFrom.setListElettromagnete(elettrom);

		jsonSimulatoreFrom.ListSegnaleAlto segnalealto = new jsonSimulatoreFrom.ListSegnaleAlto();
		segnalealto.setId("11");
		segnalealto.setIdSlot("8");
		segnalealto.setUid("14");
		segnalealto.setName("lju");
		segnalealto.setLettura("rosso");
		SimFrom.setListSegnaleAlto(segnalealto);

		jsonSimulatoreFrom.ListFrecciaEvidenziatrice frecevid = new jsonSimulatoreFrom.ListFrecciaEvidenziatrice();
		frecevid.setId("11");
		frecevid.setIdSlot("8");
		frecevid.setUid("14");
		frecevid.setName("lju");
		frecevid.setLettura("accesa");
		SimFrom.setListFrecciaEvidenziatrice(frecevid);


		jsonSimulatoreFrom.ListAvvioAvanzamento avvio = new jsonSimulatoreFrom.ListAvvioAvanzamento();
		avvio.setId("11");
		avvio.setIdSlot("8");
		avvio.setUid("14");
		avvio.setName("lju");
		avvio.setLettura("acceso");
		SimFrom.setListAvvioAvanzamento(avvio);

		jsonSimulatoreFrom.ListRipetitoreDiPartenza ripet = new jsonSimulatoreFrom.ListRipetitoreDiPartenza();
		ripet.setId("11");
		ripet.setIdSlot("8");
		ripet.setUid("14");
		ripet.setName("lju");
		ripet.setLettura("acceso");
		SimFrom.setListRipetitoreDiPartenza(ripet);

		jsonSimulatoreFrom.ListSegnaleBasso segnalebas = new jsonSimulatoreFrom.ListSegnaleBasso();
		segnalebas.setId("11");
		segnalebas.setIdSlot("8");
		segnalebas.setUid("14");
		segnalebas.setName("lju");
		segnalebas.setLettura("vl_fissa");
		SimFrom.setListSegnaleBasso(segnalebas);

		return SimFrom;

	}

}
