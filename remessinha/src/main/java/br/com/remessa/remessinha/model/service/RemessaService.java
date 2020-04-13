package br.com.remessa.remessinha.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.remessa.remessinha.model.negocio.Remessa;

@Service
public class RemessaService {
	
	@Autowired
	private RestTemplate rest;
	
	public List<Remessa> obterLista(){
		return (List<Remessa>)rest.getForObject("http://localhost:8080/api/remessa", List.class);
	}
	
	public void incluir(Remessa remessa) {
		rest.postForEntity("http://localhost:8080/api/remessa", remessa, String.class);		
	}

	public void excluir(Integer id) {
		rest.delete("http://localhost:8080/api/emprestimo/{id}", id);		
	}

	
	public RestTemplate getRest() {
		return rest;
	}
	public void setRest(RestTemplate rest) {
		this.rest = rest;
	}
}
