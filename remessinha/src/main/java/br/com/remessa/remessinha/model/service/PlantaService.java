package br.com.remessa.remessinha.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.remessa.remessinha.model.negocio.Planta;

@Service
public class PlantaService {
	
	@Autowired
	private RestTemplate rest;
	
	public List<Planta> obterLista(){
		return (List<Planta>)rest.getForObject("http://localhost:8080/api/planta", List.class);
	}

	public void excluir(Integer id) {
		rest.delete("http://localhost:8080/api/planta/{id}", id);		
	}
	
	public void incluir(Planta planta) {
		rest.postForEntity("http://localhost:8080/api/planta", planta, String.class);		
	}
	
	public RestTemplate getRest() {
		return rest;
	}
	public void setRest(RestTemplate rest) {
		this.rest = rest;
	}
}
