package br.com.hcb.empresa.dao;

import java.util.List;

import br.com.hcb.empresa.modelo.Gasto;


public class GastoDAO{
	
	DAO<Gasto> dao;

	public void adiciona(Gasto entity) {
		dao.adiciona(entity);
	}

	public void remove(Gasto entity) {
		dao.remove(entity);
	}

	public Gasto buscaPorId(Long id) {
		return dao.buscaPorId(id);
	}

	public List<Gasto> buscaTodos() {
		return dao.buscaTodos();
	}
	
	

}