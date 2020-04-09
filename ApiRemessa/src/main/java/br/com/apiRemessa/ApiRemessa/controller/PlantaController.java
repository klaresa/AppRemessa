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

import br.com.apiRemessa.ApiRemessa.model.negocio.Planta;
import br.com.apiRemessa.ApiRemessa.model.service.PlantaService;

@RestController
@RequestMapping("/api/planta")
public class PlantaController {

	@Autowired
	private PlantaService service;
	
	@RequestMapping
	public List<Planta> obterLista(){
		return service.obterLista();
	}
	
	@RequestMapping("{id}")
	public Optional<Planta> obterPorId(@PathVariable Integer id) {
		return service.obterPorId(id);
	}
	
	@PostMapping
	public void incluir(@RequestBody Planta planta) {
		service.incluir(planta);
	}
	
	@DeleteMapping("{id}")
	public void excluir(@PathVariable Integer id) {
		service.excluir(id);
	}

	public PlantaService getService() {
		return service;
	}
	public void setService(PlantaService service) {
		this.service = service;
	}
}