package br.com.remessa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import br.com.remessa.model.negocio.Planta;
import br.com.remessa.model.negocio.Remessa;
import br.com.remessa.model.negocio.Responsavel;
import br.com.remessa.model.negocio.Suculenta;
import br.com.remessa.model.service.RemessaService;

@Controller
@SessionAttributes("user")
public class RemessaController {

	@Autowired
	private RemessaService service;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showInit() {
		return this.showLogin();
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLogin() {
		return "login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String showHome(
				Model model,
				@RequestParam String login,
				@RequestParam String senha
			) {
		
		if(!service.isValid(login, senha)) {
			model.addAttribute("msg", "Credenciais inválidas!");
			
			return "login";
		}
		model.addAttribute("user", login);

		return "home";
	}
	
	@RequestMapping(value = "/remessa", method = RequestMethod.GET)
	public String showDetalhe() {
		return "remessa/detalhe";
	}
	
	@RequestMapping(value = "/remessas", method = RequestMethod.GET)
	public String obterLista(
				Model model
			) {		
		model.addAttribute("remessaLista", service.obterLista());
		
		return "remessa/lista";
	}
	
	@RequestMapping(value = "/remessa", method = RequestMethod.POST)
	public String incluir(
				Model model,
				Remessa remessa,
				Suculenta suculenta
			) {
			suculenta.setRemessa(remessa);
			remessa.adiciona(suculenta);
			service.incluir(remessa);
			return this.obterLista(model);
	}
	
}
