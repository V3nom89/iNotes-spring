package it.contrader.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import it.contrader.converter.StaffConverter;
import it.contrader.dao.StaffRepository;
import it.contrader.dto.StaffDTO;
import it.contrader.model.Staff;

@Service
public class StaffService extends AbstractService<Staff, StaffDTO> {

	@Autowired
	private StaffConverter converter;
	@Autowired
	private StaffRepository repository;


	public StaffDTO findByIdStaff(long id) {
		
		return converter.toDTO(repository.findById(id));
	}

	
}
