package br.com.remessa.model.negocio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TResponsavel")
public class Responsavel {
	@Id
	@GeneratedValue
	private int id;
	private String nome;
	private int celular;
	private String email;
	
	public Responsavel() {
	}
	
	public Responsavel(String nome, int celular, String email) {
		this();
		this.setNome(nome);
		this.setCelular(celular);
		this.setEmail(email);
	}
	
	public Responsavel(int id, String nome, int celular, String email) {
		this(nome, celular, email);
		this.setId(id);
	}
		

	@Override
	public String toString() {
		return String.format("Responsavel: %d - %s - %d - %s\n",
					this.getId(),
					this.nome, 
					this.celular,
					this.email					
				);
	}
	
	public void exibir() {
		System.out.println(this);
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}	
	
}
