package br.com.apiRemessa.ApiRemessa.model.negocio;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

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
