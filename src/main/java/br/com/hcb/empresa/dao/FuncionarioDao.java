package br.com.hcb.empresa.dao;

import java.util.List;

import org.apache.log4j.Logger;

import br.com.hcb.empresa.modelo.Funcionario;

public class FuncionarioDao {
	
	DAO<Funcionario> dao;
	
	/**
	 * Logger para auditoria da classe FuncionarioDao
	 * @author hbarbosa 
	 */
	Logger logger = Logger.getLogger(FuncionarioDao.class);

	public void adiciona(Funcionario entity) {
		dao.adiciona(entity);
	}

	public void remove(Funcionario entity) {
		dao.remove(entity);
	}

	public Funcionario buscaPorId(Long id) {
		return dao.buscaPorId(id);
	}

	public List<Funcionario> buscaTodos() {
		return dao.buscaTodos();
	}
	
}