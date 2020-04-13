package br.com.remessa.remessinha.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.remessa.remessinha.model.negocio.Responsavel;

@Service
public class ResponsavelService {
	
	@Autowired
	private RestTemplate rest;
	
	public List<Responsavel> obterLista(){
		return (List<Responsavel>)rest.getForObject("http://localhost:8080/api/responsavel", List.class);
	}

	public void excluir(Integer id) {
		rest.delete("http://localhost:8080/api/responsavel/{id}", id);		
	}
	
	public void incluir(Responsavel responsavel) {
		rest.postForEntity("http://localhost:8080/api/responsavel", responsavel, String.class);		
	}
	
	public RestTemplate getRest() {
		return rest;
	}
	public void setRest(RestTemplate rest) {
		this.rest = rest;
	}
}
