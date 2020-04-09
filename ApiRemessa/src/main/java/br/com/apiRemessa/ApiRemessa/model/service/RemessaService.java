package br.com.apiRemessa.ApiRemessa.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.apiRemessa.ApiRemessa.model.negocio.Remessa;
import br.com.apiRemessa.ApiRemessa.model.repository.IRemessaRepository;

@Service
public class RemessaService {

	@Autowired
	private IRemessaRepository repository;

	public List<Remessa> obterLista(){
		return (List<Remessa>)repository.findAll();
	}
	
	public Optional<Remessa> obterPorId(Integer id) {
		return repository.findById(id);
	}
	
	public void incluir(Remessa remessa) {
		repository.save(remessa);
	}
	
	public void excluir(Integer id) {
		repository.deleteById(id);
	}

	public IRemessaRepository getRepository() {
		return repository;
	}

	public void setRepository(IRemessaRepository repository) {
		this.repository = repository;
	}


}
