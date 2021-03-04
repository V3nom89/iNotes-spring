package it.contrader.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.contrader.dto.CandidatiDTO;
import it.contrader.service.CandidatiService;

@Controller
@RequestMapping("/candidati")
public class CandidatiController {

	@Autowired
	private CandidatiService service;

	@GetMapping("/getall")
	public String getAll(HttpServletRequest request) {
		setAll(request);
		return "candidati";
	}

	@GetMapping("/delete")
	public String delete(HttpServletRequest request, @RequestParam("idCandidati") Long id) {
		service.delete(id);
		setAll(request);
		return "candidati";
	}

	@GetMapping("/preupdate")
	public String preUpdate(HttpServletRequest request, @RequestParam("idCandidati") Long id) {
		request.getSession().setAttribute("dto", service.read(id));
		return "updatecandidati";
	}

	@PostMapping("/update")
	public String update(HttpServletRequest request, @RequestParam("idCandidati") Long idCandidati, @RequestParam("idStaff") int idStaff, @RequestParam("nome") String nome, @RequestParam("cognome") String cognome,
			@RequestParam("email") String email, @RequestParam("luogoProvenienza") String luogoProvenienza, @RequestParam("numeroTelefono") int numeroTelefono, 
			@RequestParam("titoloStudio") String titoloStudio, @RequestParam("titoloLaurea") String titoloLaurea,@RequestParam("dataCandidatura") String dataCandidatura, @RequestParam("rangeCandidatura") String rangeCandidatura, 
			@RequestParam("colloquioConoscitivo") boolean colloquioConoscitivo, @RequestParam("candidatiTramite") String candidatiTramite, @RequestParam("idoneita") boolean idoneita, 
			@RequestParam("codiceFiscale") String codiceFiscale, @RequestParam("userType") String userType) {

		CandidatiDTO dto = new CandidatiDTO();
		dto.setIdCandidati(idCandidati);
		dto.setIdStaff(idStaff);
		dto.setNome(nome);
		dto.setCognome(cognome);
		dto.setEmail(email);
		dto.setLuogoProvenienza(luogoProvenienza);
		dto.setNumeroTelefono(numeroTelefono);
		dto.setTitoloStudio(titoloStudio);
		dto.setTitoloLaurea(titoloLaurea);
		dto.setDataCandidatura(dataCandidatura);
		dto.setRangeCandidatura(rangeCandidatura);
		dto.setColloquioConoscitivo(colloquioConoscitivo);
		dto.setCandidatiTramite(candidatiTramite);
		dto.setIdoneita(idoneita);
		dto.setCodiceFiscale(codiceFiscale);
		dto.setUserType(userType);
		service.update(dto);
		setAll(request);
		return "candidati";

	}

	
	@PostMapping("/insert")
	public String insert(HttpServletRequest request, @RequestParam("idStaff") int idStaff, @RequestParam("nome") String nome, @RequestParam("cognome") String cognome,
			@RequestParam("email") String email, @RequestParam("luogoProvenienza") String luogoProvenienza, @RequestParam("numeroTelefono") int numeroTelefono, 
			@RequestParam("titoloStudio") String titoloStudio, @RequestParam("titoloLaurea") String titoloLaurea,@RequestParam("dataCandidatura") String dataCandidatura, @RequestParam("rangeCandidatura") String rangeCandidatura, 
			@RequestParam("colloquioConoscitivo") boolean colloquioConoscitivo, @RequestParam("candidatiTramite") String candidatiTramite, @RequestParam("idoneita") boolean idoneita, 
			@RequestParam("codiceFiscale") String codiceFiscale, @RequestParam("userType") String userType) {
		CandidatiDTO dto = new CandidatiDTO();
		dto.setIdStaff(idStaff);
		dto.setNome(nome);
		dto.setCognome(cognome);
		dto.setEmail(email);
		dto.setLuogoProvenienza(luogoProvenienza);
		dto.setNumeroTelefono(numeroTelefono);
		dto.setTitoloStudio(titoloStudio);
		dto.setTitoloLaurea(titoloLaurea);
		dto.setDataCandidatura(dataCandidatura);
		dto.setRangeCandidatura(rangeCandidatura);
		dto.setColloquioConoscitivo(colloquioConoscitivo);
		dto.setCandidatiTramite(candidatiTramite);
		dto.setIdoneita(idoneita);
		dto.setCodiceFiscale(codiceFiscale);
		dto.setUserType(userType);
		service.insert(dto);
		setAll(request);
		return "candidati";
	}

	@GetMapping("/read")
	public String read(HttpServletRequest request, @RequestParam("idCandidati") Long id) {
		request.getSession().setAttribute("dto", service.read(id));
		return "readcandidati";
	}

	@GetMapping("/logout")
	public String logout(HttpServletRequest request) {
		request.getSession().invalidate();
		return "index";
	}

	private void setAll(HttpServletRequest request) {
		request.getSession().setAttribute("list", service.getAll());
	}
}


