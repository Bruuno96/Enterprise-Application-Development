package br.com.fiap.dao;

import br.com.fiap.exception.CommitException;
import br.com.fiap.exception.EntityNotFoundException;

public interface GenericDao<E,K> {
	
	void create(E entidade);

	E read(K id)throws EntityNotFoundException;
	
	void update(E entidade); 
			
	void commit() throws CommitException;

	void remove(K id) throws EntityNotFoundException;
	}
