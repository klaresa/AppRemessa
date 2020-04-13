package br.com.remessa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import br.com.remessa.model.negocio.Orquidea;
import br.com.remessa.model.negocio.Suculenta;
import br.com.remessa.model.service.PlantaService;

@Controller
@SessionAttributes("user")
public class PlantaController {

	@Autowired
	private PlantaService service;
	
	@RequestMapping(value = "/planta", method = RequestMethod.GET)
	public String showDetalhe() {
		return "planta/detalhe";
	}
	
	@RequestMapping(value = "/plantas", method = RequestMethod.GET)
	public String obterLista(
				Model model
			) {		
		model.addAttribute("plantaLista", service.obterLista());
		
		return "planta/lista";
	}
	
	@RequestMapping(value = "/orquidea", method = RequestMethod.POST)
	public String incluir(
				Model model,
				Orquidea orquidea

			) {

			service.incluir(orquidea);
			return this.obterLista(model);
	}
	
	@RequestMapping(value = "/suculenta", method = RequestMethod.POST)
	public String incluir(
				Model model,
				Suculenta suculenta

			) {
					
		service.incluir(suculenta);
		return this.obterLista(model);
	}
	
}
