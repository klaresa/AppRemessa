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

import br.com.apiRemessa.ApiRemessa.model.negocio.Responsavel;
import br.com.apiRemessa.ApiRemessa.model.service.ResponsavelService;

@RestController
@RequestMapping("/api/responsavel")
public class ResponsavelController {

	@Autowired
	private ResponsavelService service;
	
	@RequestMapping
	public List<Responsavel> obterLista(){
		return service.obterLista();
	}
	
	@RequestMapping("{id}")
	public Optional<Responsavel> obterPorId(@PathVariable Integer id) {
		return service.obterPorId(id);
	}
	
	@PostMapping
	public void incluir(@RequestBody Responsavel responsavel) {
		service.incluir(responsavel);
	}
	
	@DeleteMapping("{id}")
	public void excluir(@PathVariable Integer id) {
		service.excluir(id);
	}

	public ResponsavelService getService() {
		return service;
	}
	public void setService(ResponsavelService service) {
		this.service = service;
	}
}