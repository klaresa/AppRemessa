package br.com.remessa.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.remessa.model.negocio.Planta;
import br.com.remessa.model.repository.IPlantaRepository;

@Service
public class PlantaService {
	
	@Autowired
	private IPlantaRepository repository;
	
	public List<Planta> obterLista(){
		return (List<Planta>)repository.findAll();
	}

	public void incluir(Planta planta) {
		repository.save(planta);
	}
	
	public void excluir(int id) {
		repository.deleteById(id);
	}

	public IPlantaRepository getRepository() {
		return repository;
	}
	public void setRepository(IPlantaRepository repository) {
		this.repository = repository;
	}
}
