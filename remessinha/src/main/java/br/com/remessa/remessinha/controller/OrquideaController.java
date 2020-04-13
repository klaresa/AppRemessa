package br.com.remessa.remessinha.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.remessa.remessinha.model.negocio.Orquidea;
import br.com.remessa.remessinha.model.service.OrquideaService;

@Controller
public class OrquideaController {
	
	@Autowired
	private OrquideaService service;
	
	
	// lista todas os items
	@RequestMapping(value = "/orquideas", method = RequestMethod.GET)
	public String refreshLista(
			Model model
			) {
		
		model.addAttribute("orquideas", service.obterLista());
		return "orquidea/home";
	}
	
	// inclui uma item 
	@RequestMapping(value = "/orquidea", method = RequestMethod.POST)
	public String incluir(
				Model model,
				Orquidea orquidea
			) {
		
		service.incluir(orquidea);
		
		return this.refreshLista(model);
	}
	
	// exclui um item
	@RequestMapping(value = "/orquidea/{id}", method = RequestMethod.GET)
	public String excluir(
				Model model,
				@PathVariable Integer id
			) {
		
		service.excluir(id);
		
		return this.refreshLista(model);
	}
	
	
	
	public OrquideaService getService() {
		return service;
	}
	public void setService(OrquideaService service) {
		this.service = service;
	}	
}
