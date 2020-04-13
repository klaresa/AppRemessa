package br.com.remessa.testes;

import br.com.remessa.model.negocio.Planta;
import br.com.remessa.model.negocio.Remessa;
import br.com.remessa.model.negocio.Responsavel;
import br.com.remessa.model.negocio.Suculenta;

public class RemessaTeste {
	public static void main(String[] args) {
		
		Responsavel res = new Responsavel();
		Remessa r = new Remessa();
		
		res.setNome("ana");
		res.setCelular(2121);
		res.setEmail("ana@ana.com");
		
		Planta pl = new Suculenta();
		pl.setNome("grupo 1");
		pl.setDescricao("tres echeverias");
		pl.setCategoria("echeveria");
		pl.setRemessa(r);
		
//		r.adiciona(pl);
//		r.setNumeroParticipantes(1);
//		r.setParaVender(false);
//		r.setQuantidadePlantas(3);
//		r.setValorTotal(300);
		
		r.associa(res);
		
		System.out.println(r);
		
	}
}
