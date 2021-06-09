	package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;   
import java.lang.reflect.*;
import br.com.fiap.dao.GenericDao;
import br.com.fiap.entity.Hotel;
import br.com.fiap.entity.Usuario;


public abstract class  GenericDaoImp<E,K> implements GenericDao<E,K>{
	
	protected EntityManager em;
	
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
	public E read(K id)  {
		E entidade = em.find(clazz, id);
		if (entidade == null ) {
		}
		return entidade;
		
	}

	@Override
	public void update(E entidade) {
		em.merge(entidade);
	}

	@Override
	public void remove(K id) {
		E entidade = read(id);
		em.remove(entidade);
	}

	@Override
	public void commit() {
		try {
			em.getTransaction().begin();
			em.getTransaction().commit();
		}catch (Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
		}
	}
	
		
}
