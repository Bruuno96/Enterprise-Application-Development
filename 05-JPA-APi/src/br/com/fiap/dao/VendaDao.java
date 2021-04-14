package br.com.fiap.dao;

import javax.persistence.EntityManager; 


import br.com.fiap.dao.imp.VendaImp;
import br.com.fiap.entity.Venda;
import br.com.fiap.exception.CommitException;
import br.com.fiap.exception.VendaNotFoundException;


public class VendaDao implements VendaImp{
	
	private EntityManager em;

	public VendaDao(EntityManager em) {
		this.em = em;
	}
	@Override
	public void create(Venda venda) {
		em.persist(venda);
	}

	@Override
	public Venda read(int id) throws VendaNotFoundException {
		Venda venda = em.find(Venda.class, id);
		if (venda == null ) {
			throw new VendaNotFoundException();
		}
		return venda;
	}

	@Override
	public void update(Venda venda) {
		em.merge(venda);
	
	}

	@Override
	public void delete(int id) throws VendaNotFoundException {
		Venda venda = read(id);
		em.remove(venda);
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