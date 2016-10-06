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
	/*
	 * INJECTION Spring d'un bean Service dans le controleur. Le bean Service
	 * est configuré dans service.xml
	 */
	private ClientService clientService;

	@Autowired	
	public void setClientService(ClientService clientService) {
		this.clientService = clientService;
	}

	@RequestMapping("/clients")
	public void clients(Model model) {
		List<Client> listeClients = clientService.lireToutClient();
		model.addAttribute("clients", listeClients);
	}

	
}
