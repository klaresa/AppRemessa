package br.com.remessa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import br.com.remessa.model.service.ResponsavelService;

@Controller
@SessionAttributes("responsavel")
public class ResponsavelController {

	@Autowired
	private ResponsavelService service;
	
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
	
	@RequestMapping(value = "/usuario", method = RequestMethod.GET)
	public String showDetalhe() {
		return "usuario/detalhe";
	}
	
	
	@RequestMapping(value = "/usuarios", method = RequestMethod.GET)
	public String obterLista(
				Model model
			) {		
		model.addAttribute("usuariosLista", service.obterLista());
		
		return "usuario/lista";
	}

	@RequestMapping(value = "/usuario", method = RequestMethod.POST)
	public String incluir(
//			Model model,
//			Usuario usuario,
//			Contato contato
			) {
		
//		usuario.setContato(contato);
//		service.incluir(usuario);
//
//		return this.obterLista(model);
		
	// ele ta fazendo isso
	//		model.addAttribute("usuariosLista", service.obterLista());
			return "usuario/lista";
	}
	
	@RequestMapping(value = "/usuario/excluir/{id}", method = RequestMethod.GET)
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
