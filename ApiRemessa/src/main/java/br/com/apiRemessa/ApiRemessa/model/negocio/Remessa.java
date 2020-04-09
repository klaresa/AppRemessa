package br.com.apiRemessa.ApiRemessa.model.negocio;

import java.lang.annotation.Target;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "TRemessa")
public class Remessa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
		
	@Column(name = "venda")
	private boolean venda;
	
	@Column(name = "quantidadePlantas")
	private int quantidadePlantas;
	
	@Column(name = "valorTotal")
	private float valorTotal;
	
	@Column(name = "numeroParticipantes")
	private int numeroParticipantes;
	
	@OneToOne(
			fetch = FetchType.EAGER,
			cascade = CascadeType.ALL,
			orphanRemoval = true
			)
	@JoinColumn(name = "idResponsavel")
	private Responsavel responsavel;
	
	@OneToMany(
			mappedBy = "remessa",
			fetch = FetchType.EAGER,
			cascade = CascadeType.ALL,
			orphanRemoval = true
			)
	@JsonManagedReference
	private List<Planta> plantas;
	
	
	public Remessa() {
	}
	
	
	public Remessa(Integer id, boolean venda, int quantidadePlantas, float valorTotal, int numeroParticipantes) {
		this();
		this.id = id;
		this.venda = venda;
		this.quantidadePlantas = quantidadePlantas;
		this.valorTotal = valorTotal;
		this.numeroParticipantes = numeroParticipantes;
	}
	
	
	@Override
	public String toString() {
		return String.format("%d - %s", this.getId());
	}
	
	
	public void associa(Responsavel responsavel ) {
		this.responsavel = responsavel;
	}
	
	public void adiciona(Planta planta) {		
		plantas.add(planta);
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
	public List<Planta> getPlantas() {
		return plantas;
	}
	public void setPlantas(List<Planta> plantas) {
		this.plantas = plantas;
	}
	
}
