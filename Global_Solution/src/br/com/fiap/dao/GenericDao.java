package br.com.fiap.dao;

import java.util.List; 

import javax.persistence.EntityNotFoundException;

import br.com.fiap.entity.Hotel;
import br.com.fiap.entity.Usuario;

public interface GenericDao<E,K> {
	
	void create(E entidade);

	E read(K id)throws EntityNotFoundException;
	
	void update(E entidade); 
			
	void commit();

	void remove(K id) throws EntityNotFoundException;
	
	List<E> listar();

	 	
	}
