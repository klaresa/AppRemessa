package br.com.remessa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import br.com.remessa.model.negocio.Responsavel;
import br.com.remessa.model.service.RemessaService;
import br.com.remessa.model.service.ResponsavelService;

@Controller
@SessionAttributes("user")
public class ResponsavelController {

	@Autowired
	private ResponsavelService service;
	
	@RequestMapping(value = "/responsavel", method = RequestMethod.GET)
	public String showDetalhe() {
		return "responsavel/detalhe";
	}
	
	@RequestMapping(value = "/responsaveis", method = RequestMethod.GET)
	public String obterLista(
				Model model
			) {		
		model.addAttribute("responsavelLista", service.obterLista());
		
		return "responsavel/lista";
	}
	
	@RequestMapping(value = "/responsavel", method = RequestMethod.POST)
	public String incluir(
				Model model,
				Responsavel responsavel
			) {
			
			service.incluir(responsavel);

			return this.obterLista(model);
		
	// ele ta fazendo isso
	//		model.addAttribute("usuariosLista", service.obterLista());
	//			return "responsavel/lista";
	}
	
	@RequestMapping(value = "/responsavel/excluir/{id}", method = RequestMethod.GET)
	public String exluir(Model model, 
			@PathVariable int id) {
		
		service.excluir(id);
		
		return this.obterLista(model);
	}
	
	public ResponsavelService getService() {
		return service;
	}
	public void setService(ResponsavelService service) {
		this.service = service;
	}
}
