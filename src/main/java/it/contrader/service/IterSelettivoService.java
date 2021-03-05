package it.contrader.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import it.contrader.converter.IterSelettivoConverter;
import it.contrader.dao.IterSelettivoRepository;
import it.contrader.dto.IterSelettivoDTO;
import it.contrader.model.IterSelettivo;

@Service
public class IterSelettivoService extends AbstractService<IterSelettivo, IterSelettivoDTO> {

	@Autowired
	private IterSelettivoConverter converter;
	@Autowired
	private IterSelettivoRepository repository;

	public IterSelettivoDTO findByIdIterSelettivo(long idIterSelettivo) {
		return converter.toDTO(repository.findById(idIterSelettivo));
	}

}
