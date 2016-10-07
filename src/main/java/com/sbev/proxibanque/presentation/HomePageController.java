package com.sbev.proxibanque.presentation;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.sbev.proxibanque.domaine.Client;
import com.sbev.proxibanque.service.ClientService;

@Controller
public class HomePageController {
	
	
	private ClientService clientService;
	private ConseillerService conseillerService;
	private GerantService gerantService; 
	private VirmementService virementService; 

	
	
	// setters
	@Autowired
	public void setConseillerService(ConseillerService conseillerService) {
		this.conseillerService = conseillerService;
	}

	@Autowired	
	public void setClientService(ClientService clientService) {
		this.clientService = clientService;
	}

	@RequestMapping("/clients")
	protected ModelAndView listeClients(HttpServletRequest request, HttpServletResponse response) throws Exception {
	
		List<Client> listeClients = clientService.lireToutClient();
		return new ModelAndView("clients", "clients", listeClients);
	}
	
	@RequestMapping("/conseillers")
	protected ModelAndView listeConseillers(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		List<Conseiller> listeConseillers = conseillerService.lireToutConseillers(); 
		return new ModelAndView("conseillers", "conseillers", listeConseillers);
	}
	//implémenter la méthode
	@RequestMapping("/nouveauclient")
	
		

	//implémenter la méthode
	@RequestMapping("/transactions")
	protected ModelAndView listeVirements(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		List<Virement> listeVirements = gerantService.lireRapportTransaction();
		return new ModelAndView("transactions", "transactions", listeVirements); 
	}
	
		
	//implémenter la méthode
	@RequestMapping("/virement")
	protected ModelAndView listeVirements1(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		List<Virement> listeVirements1 = virementService.lireVirement(); 
		return new ModelAndView("virement", "virement", listeVirement1); 
	}

		
		
	//implémenter la méthode
	@RequestMapping("/login")
	
		
	
	
}
