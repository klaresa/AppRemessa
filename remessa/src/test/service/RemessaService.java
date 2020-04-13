package br.com.remessa.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.remessa.model.negocio.Remessa;
import br.com.remessa.model.repository.IRemessaRepository;

	@Service
	public class RemessaService {
		
		@Autowired
		private IRemessaRepository repository;

		public boolean isValid(String login, String senha) {
			return "admin".equalsIgnoreCase(login) && "admin".equalsIgnoreCase(senha);
		}
		
		public List<Remessa> obterLista(){
			return (List<Remessa>)repository.findAll();
		}

		public void incluir(Remessa remessa) {
			repository.save(remessa);
		}
		
		public void excluir(int id) {
			repository.deleteById(id);
		}

		public IRemessaRepository getRepository() {
			return repository;
		}
		public void setRepository(IRemessaRepository repository) {
			this.repository = repository;
		}
}
