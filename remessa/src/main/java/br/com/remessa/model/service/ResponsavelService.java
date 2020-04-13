package br.com.remessa.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.remessa.model.negocio.Responsavel;
import br.com.remessa.model.repository.IRemessaRepository;
import br.com.remessa.model.repository.IResponsavelRepository;

@Service
public class ResponsavelService {
	
	@Autowired
	private IResponsavelRepository repository;

	public boolean isValid(String login, String senha) {
		return "admin".equalsIgnoreCase(login) && "admin".equalsIgnoreCase(senha);
	}
	
	public List<Responsavel> obterLista(){
		return (List<Responsavel>)repository.findAll();
	}

	public void incluir(Responsavel responsavel) {
		repository.save(responsavel);
	}
	
	public void excluir(int id) {
		repository.deleteById(id);
	}

	public IResponsavelRepository getRepository() {
		return repository;
	}
	public void setRepository(IResponsavelRepository repository) {
		this.repository = repository;
	}
}
