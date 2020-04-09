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

import br.com.apiRemessa.ApiRemessa.model.negocio.Orquidea;
import br.com.apiRemessa.ApiRemessa.model.service.OrquideaService;

@RestController
@RequestMapping("/api/orquidea")
public class OrquideaController {

	@Autowired
	private OrquideaService service;
	
	@RequestMapping
	public List<Orquidea> obterLista(){
		return service.obterLista();
	}
	
	@RequestMapping("{id}")
	public Optional<Orquidea> obterPorId(@PathVariable Integer id) {
		return service.obterPorId(id);
	}
	
	@PostMapping
	public void incluir(@RequestBody Orquidea orquidea) {
		service.incluir(orquidea);
	}
	
	@DeleteMapping("{id}")
	public void excluir(@PathVariable Integer id) {
		service.excluir(id);
	}

	public OrquideaService getService() {
		return service;
	}
	public void setService(OrquideaService service) {
		this.service = service;
	}
}