package it.contrader.service;

import org.springframework.beans.factory.annotation.Autowired;

import it.contrader.converter.CandidatiConverter;
import it.contrader.dao.CandidatiRepository;
import it.contrader.dto.CandidatiDTO;
import org.springframework.stereotype.Service;

import it.contrader.model.Candidati;

@Service
public class CandidatiService extends AbstractService<Candidati, CandidatiDTO> {
	
	@Autowired
	private CandidatiConverter converter;
	@Autowired
	private CandidatiRepository repository;

	public CandidatiDTO findByidCandidati(long id) {
		return converter.toDTO(repository.findByidCandidati(id));
	}
}
