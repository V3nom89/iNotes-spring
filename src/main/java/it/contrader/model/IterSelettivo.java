package it.contrader.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class IterSelettivo {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idIterSelettivo;

	@Column
	
	private long idCandidato;
	private long idStaff;
	private int punteggioTotaleScritto;
	private int punteggioLogica;
	private int punteggioPhp;
	private int punteggioJava;
	private int punteggioHTML;
	private int punteggioInglese;
	private String dataTestScritto;
	private String dataTestOrale;
	private int valutazioneOrale;

}
