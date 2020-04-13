package br.com.remessa.remessinha.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.remessa.remessinha.model.negocio.Suculenta;
import br.com.remessa.remessinha.model.service.SuculentaService;

@Controller
public class SuculentaController {
	
	@Autowired
	private SuculentaService service;
	
//	@RequestMapping(value = "/", method = RequestMethod.GET)
//	public String showHome() {
//		return "home";
//	}
	
	// lista todas os items
	@RequestMapping(value = "/suculentas", method = RequestMethod.GET)
	public String refreshLista(
			Model model
			) {
		
		model.addAttribute("suculentas", service.obterLista());
		return "suculenta/home";
	}
	
	// inclui uma item 
	@RequestMapping(value = "/suculenta", method = RequestMethod.POST)
	public String incluir(
				Model model,
				Suculenta suculenta
			) {
		
		service.incluir(suculenta);
		
		return this.refreshLista(model);
	}
	
	// exclui um item
	@RequestMapping(value = "/suculenta/{id}", method = RequestMethod.GET)
	public String excluir(
				Model model,
				@PathVariable Integer id
			) {
		
		service.excluir(id);
		
		return this.refreshLista(model);
	}
	
	
	
	public SuculentaService getService() {
		return service;
	}
	public void setService(SuculentaService service) {
		this.service = service;
	}	
}
