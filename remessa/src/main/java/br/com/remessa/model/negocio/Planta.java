package br.com.remessa.model.negocio;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TPlanta")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Planta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	private String categoria;
	private String descricao;
	@ManyToOne
	@JoinColumn(name = "idRemessa")
	private Remessa remessa;
		
	public Planta() {
	}
	
	public Planta(String nome, String categoria, String descricao) {
		this();
	}
	
	public Planta(int id, String nome, String categoria, String descricao) {
		this();
		this.id = id;
		this.nome = nome;
		this.categoria = categoria;
		this.descricao = descricao;
	}
	
	public abstract String obterCabecalho();
	
	public void exibir() {
	} // obriga as classes filhas a criarem esse metodo.
	
	@Override
	public String toString() {
		return String.format("%d, %s - %s - %s", 
				this.getId(),
				this.getNome(), 
				this.getCategoria(), 
				this.getDescricao());
	}

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Remessa getRemessa() {
		return remessa;
	}
	public void setRemessa(Remessa remessa) {
		this.remessa = remessa;
	}
	
}
