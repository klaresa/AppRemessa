package br.com.remessa.remessinha.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.remessa.remessinha.model.negocio.Orquidea;

@Service
public class OrquideaService {
	
	@Autowired
	private RestTemplate rest;
	
	public List<Orquidea> obterLista(){
		return (List<Orquidea>)rest.getForObject("http://localhost:8080/api/orquidea", List.class);
	}

	public void excluir(Integer id) {
		rest.delete("http://localhost:8080/api/orquidea/{id}", id);		
	}
	
	public void incluir(Orquidea orquidea) {
		rest.postForEntity("http://localhost:8080/api/orquidea", orquidea, String.class);		
	}
	
	public RestTemplate getRest() {
		return rest;
	}
	public void setRest(RestTemplate rest) {
		this.rest = rest;
	}
}
