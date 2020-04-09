package br.com.apiRemessa.ApiRemessa.model.repository;

import org.springframework.data.repository.CrudRepository;
import br.com.apiRemessa.ApiRemessa.model.negocio.Remessa;

public interface IRemessaRepository extends CrudRepository<Remessa, Integer> {

}
