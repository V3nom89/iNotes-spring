package it.contrader.converter;

import org.springframework.stereotype.Component;
import it.contrader.dto.CandidatiDTO;
import it.contrader.model.Candidati;


@Component
public class CandidatiConverter extends AbstractConverter<Candidati, CandidatiDTO>{

	@Override
	public Candidati toEntity(CandidatiDTO candidatiDTO) {
		Candidati candidati = null;
		if (candidatiDTO != null) {
			candidati = new Candidati(candidatiDTO.getIdCandidati(),candidatiDTO.getIdStaff(), candidatiDTO.getNome(),candidatiDTO.getCognome(),candidatiDTO.getEmail(),candidatiDTO.getLuogoProvenienza(), candidatiDTO.getNumeroTelefono(),
					candidatiDTO.getTitoloStudio(), candidatiDTO.getTitoloLaurea(),candidatiDTO.getDataCandidatura(), candidatiDTO.getRangeCandidatura(), candidatiDTO.isColloquioConoscitivo(),
					candidatiDTO.getCandidatiTramite(),candidatiDTO.isIdoneita(),candidatiDTO.getCodiceFiscale(),candidatiDTO.getUserType());
			
		}
		return candidati;
	}
	@Override
	public CandidatiDTO toDTO(Candidati candidati) {
		CandidatiDTO candidatiDTO = null;
		if (candidati != null) {
		  candidatiDTO = new CandidatiDTO(candidati.getIdCandidati(), candidati.getIdStaff(), candidati.getNome(),candidati.getCognome(),candidati.getEmail(),candidati.getLuogoProvenienza(), candidati.getNumeroTelefono(),
				candidati.getTitoloStudio(), candidati.getTitoloLaurea(),candidati.getDataCandidatura(), candidati.getRangeCandidatura(), candidati.isColloquioConoscitivo(),
				candidati.getCandidatiTramite(),candidati.isIdoneita(),candidati.getCodiceFiscale(),candidati.getUserType());
		}
		return candidatiDTO;
	}

}
