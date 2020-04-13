package br.com.remessa.remessinha.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.remessa.remessinha.model.negocio.Suculenta;

@Service
public class SuculentaService {
	
	@Autowired
	private RestTemplate rest;
	
	public List<Suculenta> obterLista(){
		return (List<Suculenta>)rest.getForObject("http://localhost:8080/api/suculenta", List.class);
	}

	public void excluir(Integer id) {
		rest.delete("http://localhost:8080/api/suculenta/{id}", id);		
	}
	
	public void incluir(Suculenta suculenta) {
		rest.postForEntity("http://localhost:8080/api/suculenta", suculenta, String.class);		
	}
	
	public RestTemplate getRest() {
		return rest;
	}
	public void setRest(RestTemplate rest) {
		this.rest = rest;
	}
}
