package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.dao.SalaDao;
import br.com.fiap.entity.Sala;

public class SalaDaoImp extends GenericDaoImp<Sala, Integer> implements SalaDao{

	public SalaDaoImp(EntityManager em) {
		super(em);
	}

}
