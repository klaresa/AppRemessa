package br.com.apiRemessa.ApiRemessa.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.apiRemessa.ApiRemessa.model.negocio.Suculenta;
import br.com.apiRemessa.ApiRemessa.model.repository.ISuculentaRepository;

@Service
public class SuculentaService {

	@Autowired
	private ISuculentaRepository repository;

	public List<Suculenta> obterLista(){
		return (List<Suculenta>)repository.findAll();
	}
	
	public Optional<Suculenta> obterPorId(Integer id) {
		return repository.findById(id);
	}
	
	public void incluir(Suculenta suculenta) {
		repository.save(suculenta);
	}
	
	public void excluir(Integer id) {
		repository.deleteById(id);
	}

	public ISuculentaRepository getRepository() {
		return repository;
	}
	public void setRepository(ISuculentaRepository repository) {
		this.repository = repository;
	}
}
