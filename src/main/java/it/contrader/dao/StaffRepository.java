package it.contrader.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.contrader.model.Staff;

@Repository
@Transactional
public interface StaffRepository extends CrudRepository<Staff, Long>{
	
	Staff findById(long id);

}
