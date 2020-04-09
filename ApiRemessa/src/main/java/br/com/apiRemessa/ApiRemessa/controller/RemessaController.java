package br.com.apiRemessa.ApiRemessa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.apiRemessa.ApiRemessa.model.negocio.Remessa;
import br.com.apiRemessa.ApiRemessa.model.service.RemessaService;

@RestController
@RequestMapping("/api/remessa")
public class RemessaController {

	@Autowired
	private RemessaService service;
	
	@RequestMapping
	public List<Remessa> obterLista(){
		return service.obterLista();
	}
	
	@RequestMapping("{id}")
	public Optional<Remessa> obterPorId(@PathVariable Integer id) {
		return service.obterPorId(id);
	}
	
	@PostMapping
	public void incluir(@RequestBody Remessa remessa) {
		service.incluir(remessa);
	}
	
	@DeleteMapping("{id}")
	public void excluir(@PathVariable Integer id) {
		service.excluir(id);
	}

	public RemessaService getService() {
		return service;
	}
	public void setService(RemessaService service) {
		this.service = service;
	}
}