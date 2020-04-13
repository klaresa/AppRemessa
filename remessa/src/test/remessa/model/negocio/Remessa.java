package br.com.remessa.model.negocio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import auxiliar.Constante;
import negocio.Orquidea;
import negocio.Planta;
import negocio.Responsavel;
import negocio.Suculenta;

public class Remessa {

@Entity
@Table(name="TRemessa")
public class Remessa {
	@Id
	@GeneratedValue
	private int id;
	private boolean isParaVender;
	private int quantidadePlantas;
	private float valorTotal;
	private int numeroParticipantes;
	@OneToOne(
			fetch = FetchType.EAGER, 
			cascade = CascadeType.PERSIST)
	@JoinColumn(name="idResponsavel")
	private Responsavel responsavel;
	@OneToMany(
			mappedBy = "remessa",
			fetch = FetchType.EAGER, 
			cascade = CascadeType.PERSIST
			)
	private List<Planta> plantas;
	
	@Transient
	private int[] qtdPlantas;
	
	public Remessa() {
		plantas = new ArrayList<Planta>();
	}
//	public Remessa() {
//		this();
//		this.setNumeroParticipantes(1);
//		this.setQuantidadePlantas(1);
//		this.setParaVender(false);
//
//	}
	
	public Remessa(int quantidadePlantas, float valorTotal, int numeroParticipantes, boolean isParaVender) {
		this();
		this.setParaVender(isParaVender);
		this.setNumeroParticipantes(numeroParticipantes);
		this.setQuantidadePlantas(quantidadePlantas);
		this.setValorTotal(valorTotal);
	}

	public Remessa(int quantidadePlantas, float valorTotal, int numeroParticipantes, boolean isParaVender, String nome, int celular, String email) {			
		this(quantidadePlantas, valorTotal, numeroParticipantes, isParaVender);		
		responsavel = new Responsavel(nome, celular, email);		
	}
	
	private boolean validar() {
		return this.getPlantas().size() == Planta.obterQtdPlantas();
	}
	
	public void associa(Responsavel responsavel ) {
		this.responsavel = responsavel;
	}
	
	public void adiciona(Planta planta) {		
		plantas.add(planta);
	}

	private void exibirPlantas(){
		for (Planta item : this.plantas) {
			this.contabiliza(item);
			item.exibir();
		}
	}
	
	@Override
	public String toString() {
		return String.format("Remessa: %d - %.2f - %d - %s - %s - %d - %s", 				
				this.getQuantidadePlantas(), 
				this.getValorTotal(),
				this.getNumeroParticipantes(),
				this.isParaVender,
				responsavel.getNome(),
				responsavel.getCelular(),
				responsavel.getEmail()
			);
	}
	
	public void exibir() {
		System.out.println(this);	
		if(this.validar()) {
			qtdPlantas = new int[Constante.PLANTAS.length];			
			System.out.println("toString do objeto: " + this);
			this.exibirPlantas();
			responsavel.exibir();
			this.showContabiliza();
		} else {
			System.out.println("Invï¿½lido!");
		}
	}	

	private void contabiliza(Planta planta) {
		if (planta instanceof Suculenta) {
			this.qtdPlantas[0]++;
		} else if (planta instanceof Orquidea) {
			this.qtdPlantas[1]++;
		}
	}
	
	private void showContabiliza() {
		System.out.println("Contabiliza: ");
		
		for (int i = 0; i < qtdPlantas.length; i++) {
			System.out.println("-" + Constante.PLANTAS[i] + ": " + this.qtdPlantas[i]);
		}
	}

	public Responsavel getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(Responsavel responsavel) {
		this.responsavel = responsavel;
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
	public int getQuantidadePlantas() {
		return quantidadePlantas;
	}
	public void setQuantidadePlantas(int quantidadePlantas) {
		this.quantidadePlantas = quantidadePlantas;
	}
	public boolean isParaVender() {
		return isParaVender;
	}
	public void setParaVender(boolean isParaVender) {
		this.isParaVender = isParaVender;
	}	
	public List<Planta> getPlantas() {
		return plantas;
	}
	public void setPlantas(List<Planta> plantas) {
		this.plantas = plantas;
	}
	
}
