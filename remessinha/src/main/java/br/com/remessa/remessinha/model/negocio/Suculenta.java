package br.com.remessa.remessinha.model.negocio;

public class Suculenta extends Planta {

	private String raridade;
	private boolean matriz;
	
	public Suculenta() {
		this.setTipo("Suculenta");
	}
	
	public Suculenta(String raridade, boolean matriz) {
		this();
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
