package br.com.apiRemessa.ApiRemessa.model.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.apiRemessa.ApiRemessa.model.negocio.Responsavel;

public interface IResponsavelRepository extends CrudRepository<Responsavel, Integer> {

}
