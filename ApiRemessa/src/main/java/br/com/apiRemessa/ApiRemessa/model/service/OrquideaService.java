package br.com.apiRemessa.ApiRemessa.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.apiRemessa.ApiRemessa.model.negocio.Orquidea;
import br.com.apiRemessa.ApiRemessa.model.repository.IOrquideaRepository;

@Service
public class OrquideaService {

	@Autowired
	private IOrquideaRepository repository;

	public List<Orquidea> obterLista(){
		return (List<Orquidea>)repository.findAll();
	}
	
	public Optional<Orquidea> obterPorId(Integer id) {
		return repository.findById(id);
	}
	
	public void incluir(Orquidea orquidea) {
		repository.save(orquidea);
	}
	
	public void excluir(Integer id) {
		repository.deleteById(id);
	}

	public IOrquideaRepository getRepository() {
		return repository;
	}
	public void setRepository(IOrquideaRepository repository) {
		this.repository = repository;
	}
}
