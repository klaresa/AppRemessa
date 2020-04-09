package br.com.apiRemessa.ApiRemessa.model.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.apiRemessa.ApiRemessa.model.negocio.Planta;

public interface IPlantaRepository extends CrudRepository<Planta, Integer> {

}
