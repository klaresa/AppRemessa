package br.com.apiRemessa.ApiRemessa.model.negocio;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "TOrquidea")
@PrimaryKeyJoinColumn(name = "idPlanta")
public class Orquidea extends Planta{
	
	private String ambiente;
	private boolean epifita;

	public Orquidea(){
		
	}
	
	public String toString() {
		return String.format("%s %s %s", 
				super.toString(),
				this.getAmbiente(), 
				this.isEpifita() ? "epifita" : "nao epifita");				
	}


	public String getAmbiente() {
		return ambiente;
	}
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	public boolean isEpifita() {
		return epifita;
	}
	public void setEpifita(boolean epifita) {
		this.epifita = epifita;
	}
}
