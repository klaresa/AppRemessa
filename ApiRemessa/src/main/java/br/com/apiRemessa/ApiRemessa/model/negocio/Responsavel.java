package br.com.apiRemessa.ApiRemessa.model.negocio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TResponsavel")
public class Responsavel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private int celular;
	private String email;
	
	public Responsavel() {
	}
	
	public Responsavel(Integer id, String nome, int celular, String email) {
		this();
		this.id = id;
		this.nome = nome;
		this.celular = celular;
		this.email = email;
	}

	@Override
	public String toString() {
		return String.format("Responsavel: %s - %s - %d - %s",
					this.getId(),
					this.getNome(), 
					this.getCelular(),
					this.getEmail()					
				);
	}
	

	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCelular() {
		return celular;
	}
	public void setCelular(int celular) {
		this.celular = celular;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}	
}
