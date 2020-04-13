package br.com.remessa.model.negocio;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "TSuculenta")
@PrimaryKeyJoinColumn(name = "idPlanta")
public class Suculenta extends Planta {

	private String raridade;
	private boolean matriz;
	
	public Suculenta() {
	}
	
	public Suculenta(String nome, String categoria, String descricao, String raridade, boolean matriz) {
	super(nome, categoria, raridade);
	this.raridade = raridade;
	this.matriz = matriz;
	}
	
//	public Suculenta(int id, String nome, String categoria, String descricao, String raridade, boolean matriz) {
//	this(nome, categoria, raridade, raridade, matriz);
//	this.id = id;
//	}
	
	@Override
	public String obterCabecalho() {
		return Suculenta.class.getSimpleName();
	}
	
	public void exibir() {
		System.out.printf("%s - %s - %s - %s - %s\n",
				this.getNome(),
				this.getCategoria(),
				this.getDescricao(),
				this.getRaridade(),
				this.isMatriz() ? "matriz" : "muda");
	}
	
	@Override
	public String toString() {
		return String.format("%s - %s - %s",
				super.toString(),
				this.getRaridade(), 
				this.isMatriz() ? "matriz" : "muda");				
	}


	public String getRaridade() {
		return raridade;
	}
	public void setRaridade(String raridade) {
		this.raridade = raridade;
	}
	public boolean isMatriz() {
		return matriz;
	}
	public void setMatriz(boolean matriz) {
		this.matriz = matriz;
	}

	
}