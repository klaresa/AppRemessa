package br.com.remessa.remessinha.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.remessa.remessinha.model.negocio.Remessa;
import br.com.remessa.remessinha.model.service.PlantaService;
import br.com.remessa.remessinha.model.service.RemessaService;
import br.com.remessa.remessinha.model.service.ResponsavelService;

@Controller
public class RemessaController {
	
	@Autowired
	private RemessaService service;
	
	@Autowired
	private PlantaService serviceP;
	
	@Autowired
	private ResponsavelService serviceR;
	
//	@RequestMapping(value = "/", method = RequestMethod.GET)
//	public String showHome() {
//		return "home";
//	}
	
	@RequestMapping(value = "/remessas", method = RequestMethod.GET)
	public String listaRemessa(
			Model model
			) {
		
		model.addAttribute("rems", service.obterLista());
		model.addAttribute("plantas", serviceP.obterLista());
		model.addAttribute("responsaveis", serviceR.obterLista());

		return "home";
	}

	// inclui uma item 
	@RequestMapping(value = "/remessa", method = RequestMethod.POST)
	public String incluir(
				Model model,
				Remessa remessa
			) {
		
		service.incluir(remessa);
		
		return this.listaRemessa(model);
	}
	
	// exclui um item
	@RequestMapping(value = "/remessa/{id}", method = RequestMethod.GET)
	public String excluir(
				Model model,
				@PathVariable Integer id
			) {
		
		service.excluir(id);
		
		return this.listaRemessa(model);
	}
	
	public RemessaService getService() {
		return service;
	}
	public void setService(RemessaService service) {
		this.service = service;
	}	
}
