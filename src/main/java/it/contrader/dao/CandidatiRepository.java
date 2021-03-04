package it.contrader.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.contrader.model.Candidati;

@Repository
@Transactional
public interface CandidatiRepository extends CrudRepository<Candidati, Long>{

	Candidati findByidCandidati(long idCandidati);
}
