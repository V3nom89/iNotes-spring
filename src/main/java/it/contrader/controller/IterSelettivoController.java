package it.contrader.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import it.contrader.dto.UserDTO;
import it.contrader.dao.UserRepository;
import it.contrader.dto.IterSelettivoDTO;
import it.contrader.service.IterSelettivoService;
import it.contrader.service.UserService;
import it.contrader.model.User.Usertype;


@Controller
@RequestMapping("/iterSelettivo")
public class IterSelettivoController {

	@Autowired
	private IterSelettivoService service;

	/**@PostMapping("/login")
	public String login(HttpServletRequest request, @RequestParam(value = "username", required = true) String username,
			@RequestParam(value = "password", required = true) String password) {

		UserDTO userDTO = service.findByUsernameAndPassword(username, password);
		request.getSession().setAttribute("user", userDTO);

		switch (userDTO.getUsertype()) {

		case ADMIN:
			return "homeadmin";

		case USER:
			return "index";

		default:
			return "index";
		}
	}
	*/

	@GetMapping("/getall")
	public String getAll(HttpServletRequest request) {
		setAll(request);
		return "iterSelettivo"; // attenzione che qui c'era users, non user, potrebbe creare problemi
	}

	@GetMapping("/delete")
	public String delete(HttpServletRequest request, @RequestParam("idIterSelettivo") long idIterSelettivo) {
		service.delete(idIterSelettivo);
		setAll(request);
		return "iterSelettivo";
	}

	@GetMapping("/preupdate")
	public String preUpdate(HttpServletRequest request, @RequestParam("idIterSelettivo") long idIterSelettivo) {
		request.getSession().setAttribute("dto", service.read(idIterSelettivo));
		return "updateiterSelettivo"; // attenzione updateiterSelettivo qui con i minuscolo
	}

	@PostMapping("/update")
	public String update(HttpServletRequest request, @RequestParam("idIterSelettivo") long idIterSelettivo, @RequestParam("idCandidato") long idCandidato, @RequestParam("idStaff") long idStaff, @RequestParam("punteggioTotaleScritto") int punteggioTotaleScritto, @RequestParam("punteggioLogica") int punteggioLogica, @RequestParam("punteggioPhp") int punteggioPhp, @RequestParam("punteggioJava") int punteggioJava, @RequestParam("punteggioHTML") int punteggioHTML, @RequestParam("punteggioInglese") int punteggioInglese, @RequestParam("dataTestScritto") String dataTestScritto, @RequestParam("dataTestOrale") String dataTestOrale, @RequestParam("valutazioneOrale") int valutazioneOrale) {

		IterSelettivoDTO dto = new IterSelettivoDTO();
		dto.setIdIterSelettivo(idIterSelettivo);
		dto.setIdCandidato(idCandidato);
		dto.setIdStaff(idStaff);
		dto.setPunteggioTotaleScritto(punteggioTotaleScritto);
		dto.setPunteggioLogica(punteggioLogica);
		dto.setPunteggioPhp(punteggioPhp);
		dto.setPunteggioJava(punteggioJava);
		dto.setPunteggioHTML(punteggioHTML);
		dto.setPunteggioInglese(punteggioInglese);
		dto.setDataTestScritto(dataTestScritto);
		dto.setDataTestOrale(dataTestOrale);
		dto.setValutazioneOrale(valutazioneOrale);
		service.update(dto);
		setAll(request);
		return "iterSelettivo"; // attenzione qui era users

	}

	@PostMapping("/insert")
	public String insert(HttpServletRequest request, @RequestParam("idCandidato") long idCandidato, @RequestParam("idStaff") long idStaff, @RequestParam("punteggioTotaleScritto") int punteggioTotaleScritto, @RequestParam("punteggioLogica") int punteggioLogica, @RequestParam("punteggioPhp") int punteggioPhp, @RequestParam("punteggioJava") int punteggioJava, @RequestParam("punteggioHTML") int punteggioHTML, @RequestParam("punteggioInglese") int punteggioInglese, @RequestParam("dataTestScritto") String dataTestScritto, @RequestParam("dataTestOrale") String dataTestOrale, @RequestParam("valutazioneOrale") int valutazioneOrale) {
	// attenzione nei parametri manca idIterSelettivo
		IterSelettivoDTO dto = new IterSelettivoDTO();
		dto.setIdCandidato(idCandidato);
		dto.setIdStaff(idStaff);
		dto.setPunteggioTotaleScritto(punteggioTotaleScritto);
		dto.setPunteggioLogica(punteggioLogica);
		dto.setPunteggioPhp(punteggioPhp);
		dto.setPunteggioJava(punteggioJava);
		dto.setPunteggioHTML(punteggioHTML);
		dto.setPunteggioInglese(punteggioInglese);
		dto.setDataTestScritto(dataTestScritto);
		dto.setDataTestOrale(dataTestOrale);
		dto.setValutazioneOrale(valutazioneOrale);
		service.insert(dto);
		setAll(request);
		return "iterSelettivo";
	}

	@GetMapping("/read")
	public String read(HttpServletRequest request, @RequestParam("idIterSelettivo") long idIterSelettivo) {
		request.getSession().setAttribute("dto", service.read(idIterSelettivo));
		return "readiterSelettivo"; //attenzione anche qui readiterSelettivo con i minuscola
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
