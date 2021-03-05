package it.contrader.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.contrader.model.IterSelettivo;

@Repository
@Transactional
public interface IterSelettivoRepository extends CrudRepository<IterSelettivo, Long> {

	IterSelettivo findById(long idIterSelettivo);
	//IterSelettivo findByIdCandidatoAndIdStaff(long idCandidato, long idStaff);
	//IterSelettivo findByDataTestScrittoAndDataTestOrale(String dataTestScritto, String dataTestOrale);

}
