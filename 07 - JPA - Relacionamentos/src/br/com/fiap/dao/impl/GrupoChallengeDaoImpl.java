package br.com.fiap.dao.impl;

import br.com.fiap.dao.GrupoChallengeDao;
import br.com.fiap.dao.impl.*;
import br.com.fiap.exception.CommitException;
import br.com.fiap.exception.EntityNotFoundException;

import javax.persistence.EntityManager;

import br.com.fiap.*;
import br.com.fiap.bean.GrupoChallenge;

public class GrupoChallengeDaoImpl extends GenericDaoImp<GrupoChallenge, Integer> implements GrupoChallengeDao{

	public GrupoChallengeDaoImpl(EntityManager em) {
		super(em);
	}

}
