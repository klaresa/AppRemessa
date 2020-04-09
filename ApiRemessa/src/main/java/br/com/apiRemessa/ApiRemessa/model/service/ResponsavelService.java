package br.com.apiRemessa.ApiRemessa.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.apiRemessa.ApiRemessa.model.negocio.Responsavel;
import br.com.apiRemessa.ApiRemessa.model.repository.IResponsavelRepository;

@Service
public class ResponsavelService {

	@Autowired
	private IResponsavelRepository repository;

	public List<Responsavel> obterLista(){
		return (List<Responsavel>)repository.findAll();
	}
	
	public Optional<Responsavel> obterPorId(Integer id) {
		return repository.findById(id);
	}
	
	public void incluir(Responsavel responsavel) {
		repository.save(responsavel);
	}
	
	public void excluir(Integer id) {
		repository.deleteById(id);
	}

	public IResponsavelRepository getRepository() {
		return repository;
	}
	public void setRepository(IResponsavelRepository repository) {
		this.repository = repository;
	}
}
