package it.contrader.converter;

import org.springframework.stereotype.Component;

import it.contrader.dto.IterSelettivoDTO;

import it.contrader.model.IterSelettivo;

@Component
public class IterSelettivoConverter extends AbstractConverter<IterSelettivo, IterSelettivoDTO> {

	@Override
	public IterSelettivo toEntity(IterSelettivoDTO iterSelettivoDTO) {
		IterSelettivo iterSelettivo = null;
		if (iterSelettivoDTO != null) {
			iterSelettivo = new IterSelettivo(iterSelettivoDTO.getIdIterSelettivo(), iterSelettivoDTO.getIdCandidato(), iterSelettivoDTO.getIdStaff(), iterSelettivoDTO.getPunteggioTotaleScritto(), iterSelettivoDTO.getPunteggioLogica(), iterSelettivoDTO.getPunteggioPhp(), iterSelettivoDTO.getPunteggioJava(), iterSelettivoDTO.getPunteggioHTML(), iterSelettivoDTO.getPunteggioInglese(), iterSelettivoDTO.getDataTestScritto(), iterSelettivoDTO.getDataTestOrale(), iterSelettivoDTO.getValutazioneOrale());
		}
		return iterSelettivo;
	}

	@Override
	public IterSelettivoDTO toDTO(IterSelettivo iterSelettivo) {
		IterSelettivoDTO iterSelettivoDTO = null;
		if (iterSelettivo != null) {
			iterSelettivoDTO = new IterSelettivoDTO(iterSelettivo.getIdIterSelettivo(), iterSelettivo.getIdCandidato(), iterSelettivo.getIdStaff(), iterSelettivo.getPunteggioTotaleScritto(), iterSelettivo.getPunteggioLogica(), iterSelettivo.getPunteggioPhp(), iterSelettivo.getPunteggioJava(), iterSelettivo.getPunteggioHTML(), iterSelettivo.getPunteggioInglese(), iterSelettivo.getDataTestScritto(), iterSelettivo.getDataTestOrale(), iterSelettivo.getValutazioneOrale());

		}
		return iterSelettivoDTO;
	}
}