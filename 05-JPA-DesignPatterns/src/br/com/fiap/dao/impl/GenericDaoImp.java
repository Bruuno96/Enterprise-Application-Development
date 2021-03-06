package br.com.fiap.dao.impl;

import javax.persistence.EntityManager; 
import java.lang.reflect.*;
import br.com.fiap.dao.GenericDao;
import br.com.fiap.exception.CommitException;
import br.com.fiap.exception.EntityNotFoundException;

public abstract class  GenericDaoImp<E,K> implements GenericDao<E,K>{
	
	private EntityManager em;
	
	private Class<E> clazz;

	@SuppressWarnings("all")
	public GenericDaoImp(EntityManager em) {
		this.em = em;
		this.clazz = (Class<E>) ((ParameterizedType)
				 			getClass().getGenericSuperclass()).getActualTypeArguments()[0];
		}
	@Override
	public void create(E entidade) {
		em.persist(entidade);
		
	}

	@Override
	public E read(K id) throws EntityNotFoundException {
		E entidade = em.find(clazz, id);
		if (entidade == null ) {
			 throw new EntityNotFoundException();
		}
		return entidade;
		
	}

	@Override
	public void update(E entidade) {
		em.merge(entidade);
	}

	@Override
	public void remove(K id) throws EntityNotFoundException {
		E entidade = read(id);
		em.remove(entidade);
	}

	@Override
	public void commit() throws CommitException {
		try {
			em.getTransaction().begin();
			em.getTransaction().commit();
		}catch (Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
			throw new CommitException("Erro ao dar commit");
		}
	}
	
		
}
