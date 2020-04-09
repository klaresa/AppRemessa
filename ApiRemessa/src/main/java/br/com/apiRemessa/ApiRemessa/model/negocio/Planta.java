package br.com.apiRemessa.ApiRemessa.model.negocio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@Entity
@Table(name = "TPlanta")
@Inheritance(strategy = InheritanceType.JOINED)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "tipo")
@JsonSubTypes({
    @JsonSubTypes.Type(value=Suculenta.class, name = "Suculenta"),
    @JsonSubTypes.Type(value=Orquidea.class, name = "Orquidea")
})
public abstract class Planta {
	@Id
	@GeneratedValue
	private Integer id;
	@Column(name = "nome")
	private String nome;
	@Column(name = "categoria")
	private String categoria;
	@Column(name = "descricao")
	private String descricao;
	@ManyToOne
	@JoinColumn(name = "idRemessa")
	@JsonBackReference
	private Remessa remessa;
	
	
	public Planta() {
	}
	
	public Planta(String nome, String categoria, String descricao) {
		this();
	}
		
	public Planta(Integer id, String nome, String categoria, String descricao) {
		this(nome, categoria, descricao);
		this.id = id;
	}
	

	@Override
	public String toString() {
		return String.format("%s - %s - %s", this.getNome(), this.getCategoria(), this.getDescricao());
	}

	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Remessa getRemessa() {
		return remessa;
	}
	public void setRemessa(Remessa remessa) {
		this.remessa = remessa;
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
}
