package it.contrader.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import it.contrader.model.Staff;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Staff {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idStaff;
	
	@Column(unique = true)
	 
	private String nome;
	private String cognome;
	private String email;
	private String posizione;
	private int numeroTelefono;
	private String dataAssunzione;
	private String sede;
	private int oreSettimanali;
	private String codiceFiscale;
	
	
	
}
