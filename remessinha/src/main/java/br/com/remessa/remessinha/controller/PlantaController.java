package br.com.remessa.remessinha.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.remessa.remessinha.model.negocio.Planta;
import br.com.remessa.remessinha.model.service.PlantaService;

@Controller
public class PlantaController {
	
	@Autowired
	private PlantaService service;
	
	// lista todas os items
	@RequestMapping(value = "/plantas", method = RequestMethod.GET)
	public String refreshLista(
			Model model
			) {
		
		model.addAttribute("plantas", service.obterLista());
		return "home";
	}
	
	// inclui uma item 
	@RequestMapping(value = "/planta", method = RequestMethod.POST)
	public String incluir(
				Model model,
				Planta planta
			) {
		
		service.incluir(planta);
		
		return this.refreshLista(model);
	}
	
	// exclui um item
	@RequestMapping(value = "/planta/{id}", method = RequestMethod.GET)
	public String excluir(
				Model model,
				@PathVariable Integer id
			) {
		
		service.excluir(id);
		
		return this.refreshLista(model);
	}
	
	
	
	public PlantaService getService() {
		return service;
	}
	public void setService(PlantaService service) {
		this.service = service;
	}	
}
