package it.contrader.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.contrader.dto.StaffDTO;
import it.contrader.service.StaffService;


@Controller
@RequestMapping("/staff")
public class StaffController {

	@Autowired
	private StaffService service;

	
	@GetMapping("/getall")
	public String getAll(HttpServletRequest request) {
		setAll(request);
		return "staff";
	}

	@GetMapping("/delete")
	public String delete(HttpServletRequest request, @RequestParam("idStaff") Long idstaff) {
		service.delete(idstaff);
		setAll(request);
		return "staff";
	}

	@GetMapping("/preupdate")
	public String preUpdate(HttpServletRequest request, @RequestParam("idStaff") Long idstaff) {
		request.getSession().setAttribute("dto", service.read(idstaff));
		return "updatestaff";
	}

	@PostMapping("/update")
	public String update(HttpServletRequest request,@RequestParam("idStaff") Long idStaff, @RequestParam("nome") String nome,
			@RequestParam("cognome") String cognome, @RequestParam("email") String email,@RequestParam("posizione") String posizione,
			@RequestParam("numeroTelefono")int numeroTelefono,@RequestParam("dataAssunzione") String dataAssunzione,
			@RequestParam("sede") String sede,@RequestParam("oreSettimanali")int oreSettimanali,@RequestParam("codiceFiscale") String codiceFiscale) {

		StaffDTO dto = new StaffDTO();
		dto.setIdStaff(idStaff);
		dto.setNome(nome);
		dto.setCognome(cognome);
		dto.setEmail(email);
		dto.setPosizione(posizione);
		dto.setNumeroTelefono(numeroTelefono);
		dto.setDataAssunzione(dataAssunzione);
		dto.setSede(sede);
		dto.setOreSettimanali(oreSettimanali);
		dto.setCodiceFiscale(codiceFiscale);
	    service.update(dto);
		setAll(request);
		
		return "staff";

	}

	@PostMapping("/insert")
	public String insert(HttpServletRequest request,@RequestParam("idStaff") Long idStaff, @RequestParam("nome") String nome,
			@RequestParam("cognome") String cognome, @RequestParam("email") String email,@RequestParam("posizione") String posizione,
			@RequestParam("numeroTelefono")int numeroTelefono,@RequestParam("dataAssunzione") String dataAssunzione,
			@RequestParam("sede") String sede,@RequestParam("oreSettimanali")int oreSettimanali,@RequestParam("codiceFiscale") String codiceFiscale) {

		StaffDTO dto = new StaffDTO();
		dto.setIdStaff(idStaff);
		dto.setNome(nome);
		dto.setCognome(cognome);
		dto.setEmail(email);
		dto.setPosizione(posizione);
		dto.setNumeroTelefono(numeroTelefono);
		dto.setDataAssunzione(dataAssunzione);
		dto.setSede(sede);
		dto.setOreSettimanali(oreSettimanali);
		dto.setCodiceFiscale(codiceFiscale);
		service.update(dto);
		setAll(request);
		
		return "staff";

	}

	@GetMapping("/read")
	public String read(HttpServletRequest request, @RequestParam("idStaff") Long idstaff) {
		request.getSession().setAttribute("dto", service.read(idstaff));
		return "readstaff";
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
