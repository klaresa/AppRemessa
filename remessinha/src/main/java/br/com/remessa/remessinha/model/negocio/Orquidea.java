package br.com.remessa.remessinha.model.negocio;

public class Orquidea extends Planta {

	private String ambiente;
	private boolean epifita;
	
	public Orquidea() {
		this.setTipo("Suculenta");
	}
	
	public Orquidea(String ambiente, boolean epifita) {
		this();
		this.ambiente = ambiente;
		this.epifita = epifita;
	}

	@Override
	public String toString() {
		return String.format("%s - %s - %s",
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
