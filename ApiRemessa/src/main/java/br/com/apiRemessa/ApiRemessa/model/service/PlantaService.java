package br.com.apiRemessa.ApiRemessa.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.apiRemessa.ApiRemessa.model.negocio.Planta;
import br.com.apiRemessa.ApiRemessa.model.repository.IPlantaRepository;

@Service
public class PlantaService {

	@Autowired
	private IPlantaRepository repository;

	public List<Planta> obterLista(){
		return (List<Planta>)repository.findAll();
	}
	
	public Optional<Planta> obterPorId(Integer id) {
		return repository.findById(id);
	}
	
	public void incluir(Planta planta) {
		repository.save(planta);
	}
	
	public void excluir(Integer id) {
		repository.deleteById(id);
	}

	public IPlantaRepository getRepository() {
		return repository;
	}
	public void setRepository(IPlantaRepository repository) {
		this.repository = repository;
	}
}
