package br.com.remessa.model.repository;

import org.springframework.data.repository.CrudRepository;
import br.com.remessa.model.negocio.Remessa;

public interface IRemessaRepository extends CrudRepository<Remessa, Integer>{

}
