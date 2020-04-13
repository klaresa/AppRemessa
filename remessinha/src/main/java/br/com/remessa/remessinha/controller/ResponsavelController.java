package br.com.remessa.remessinha.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.remessa.remessinha.model.negocio.Responsavel;
import br.com.remessa.remessinha.model.service.ResponsavelService;

@Controller
public class ResponsavelController {
	
	@Autowired
	private ResponsavelService service;
	
	// lista todas os items
	@RequestMapping(value = "/responsaveis", method = RequestMethod.GET)
	public String refreshLista(
			Model model
			) {
		
		model.addAttribute("responsaveis", service.obterLista());
		return "responsavel/home";
	}
	
	// inclui uma item 
	@RequestMapping(value = "/responsavel", method = RequestMethod.POST)
	public String incluir(
				Model model,
				Responsavel responsavel
			) {
		
		service.incluir(responsavel);
		
		return this.refreshLista(model);
	}
	
	// exclui um item
	@RequestMapping(value = "/responsavel/{id}", method = RequestMethod.GET)
	public String excluir(
				Model model,
				@PathVariable Integer id
			) {
		
		service.excluir(id);
		
		return this.refreshLista(model);
	}
	
	
	
	public ResponsavelService getService() {
		return service;
	}
	public void setService(ResponsavelService service) {
		this.service = service;
	}	
}
