package br.com.remessa.remessinha.model.negocio;

public abstract class Planta {
	private Integer id;
	private String nome;
	private String categoria;
	private String descricao;
	private String tipo;
	
	public Planta() {
	}
	
	public Planta(Integer id, String nome, String categoria, String descricao) {
		this();
		this.id = id;
		this.nome = nome;
		this.categoria = categoria;
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return String.format("%d - %s - %s",
				this.getId(),
				this.getNome(),
				this.getCategoria(),
				this.getDescricao());				
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
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	

}
