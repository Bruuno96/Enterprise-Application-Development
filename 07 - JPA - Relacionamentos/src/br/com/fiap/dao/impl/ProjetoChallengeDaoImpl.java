package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.bean.ProjetoChallenge;
import br.com.fiap.dao.GenericDao;
import br.com.fiap.dao.ProjetoChallengeDao;
import br.com.fiap.exception.CommitException;
import br.com.fiap.exception.EntityNotFoundException;

public class ProjetoChallengeDaoImpl extends GenericDaoImp<ProjetoChallenge, Integer> implements ProjetoChallengeDao{

	public ProjetoChallengeDaoImpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}
	
	


}
