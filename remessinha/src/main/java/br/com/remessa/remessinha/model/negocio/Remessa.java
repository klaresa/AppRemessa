package br.com.remessa.remessinha.model.negocio;

public class Remessa {

	private int id;
	private boolean venda;
	private int quantidadePlantas;
	private float valorTotal;
	private int numeroParticipantes;
	
	private Responsavel responsavel;
	
//	private List<Planta> plantas;
	
	private int[] qtdPlantas;
	public static final String[] PLANTAS = {"SUCULENTA", "ORQUIDEA"};
	
	public Remessa() {
//		plantas = new ArrayList<Planta>();
	}
			
	public Remessa(boolean venda, int quantidadePlantas, float valorTotal, int numeroParticipantes) {			
		this();		
	}
	
	public Remessa(boolean venda, int quantidadePlantas, float valorTotal, int numeroParticipantes , String nome, int celular, String email) {			
		this(venda, quantidadePlantas, valorTotal, numeroParticipantes);		
		responsavel = new Responsavel(nome, celular, email);		
	}
	
	public Remessa(int id, boolean venda, int quantidadePlantas, float valorTotal, int numeroParticipantes) {
		this(venda, quantidadePlantas, valorTotal, numeroParticipantes);
		this.id = id;
	}


	public void associa(Responsavel responsavel ) {
		this.responsavel = responsavel;
	}

//	public void adiciona(Planta planta) {		
//		plantas.add(planta);
//	}
//
//	private void exibirPlantas(){
//		for (Planta item : this.plantas) {
//			this.contabiliza(item);
//			item.exibir();
//		}
//	}
	
	@Override
	public String toString() {
		return String.format("Remessa: %d - %.2f - %d - %s - %s - %d - %s", 				
				
				this.isVenda(),
				this.getQuantidadePlantas(), 
				this.getValorTotal(),
				this.getNumeroParticipantes(),
				responsavel.getNome(),
				responsavel.getCelular(),
				responsavel.getEmail()
			);
	}

//	private void contabiliza(Planta planta) {
//		if (planta instanceof Suculenta) {
//			this.qtdPlantas[0]++;
//		} else if (planta instanceof Orquidea) {
//			this.qtdPlantas[1]++;
//		}
//	}
	
	private void showContabiliza() {
		System.out.println("Contabiliza: ");
		
		for (int i = 0; i < qtdPlantas.length; i++) {
			System.out.println("-" + PLANTAS[i] + ": " + this.qtdPlantas[i]);
		}
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public boolean isVenda() {
		return venda;
	}
	public void setVenda(boolean venda) {
		this.venda = venda;
	}
	public int getQuantidadePlantas() {
		return quantidadePlantas;
	}
	public void setQuantidadePlantas(int quantidadePlantas) {
		this.quantidadePlantas = quantidadePlantas;
	}
	public float getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}
	public int getNumeroParticipantes() {
		return numeroParticipantes;
	}
	public void setNumeroParticipantes(int numeroParticipantes) {
		this.numeroParticipantes = numeroParticipantes;
	}
	public Responsavel getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(Responsavel responsavel) {
		this.responsavel = responsavel;
	}
//	public List<Planta> getPlantas() {
//		return plantas;
//	}
//	public void setPlantas(List<Planta> plantas) {
//		this.plantas = plantas;
//	}
	public int[] getQtdPlantas() {
		return qtdPlantas;
	}
	public void setQtdPlantas(int[] qtdPlantas) {
		this.qtdPlantas = qtdPlantas;
	}

}
