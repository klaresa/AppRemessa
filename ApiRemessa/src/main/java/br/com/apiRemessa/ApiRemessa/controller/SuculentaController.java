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

import br.com.apiRemessa.ApiRemessa.model.negocio.Suculenta;
import br.com.apiRemessa.ApiRemessa.model.service.SuculentaService;

@RestController
@RequestMapping("/api/suculenta")
public class SuculentaController {

	@Autowired
	private SuculentaService service;
	
	@RequestMapping
	public List<Suculenta> obterLista(){
		return service.obterLista();
	}
	
	@RequestMapping("{id}")
	public Optional<Suculenta> obterPorId(@PathVariable Integer id) {
		return service.obterPorId(id);
	}
	
	@PostMapping
	public void incluir(@RequestBody Suculenta suculenta) {
		service.incluir(suculenta);
	}
	
	@DeleteMapping("{id}")
	public void excluir(@PathVariable Integer id) {
		service.excluir(id);
	}

	public SuculentaService getService() {
		return service;
	}
	public void setService(SuculentaService service) {
		this.service = service;
	}
}