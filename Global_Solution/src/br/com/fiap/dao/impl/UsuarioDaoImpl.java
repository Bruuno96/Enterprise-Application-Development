package br.com.fiap.dao.impl;

import java.util.List; 

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.fiap.dao.UsuarioDao;
import br.com.fiap.entity.Usuario;


public class UsuarioDaoImpl extends GenericDaoImp<Usuario, Integer> implements UsuarioDao{

	public UsuarioDaoImpl(EntityManager em) {
		super(em);
	}

	@Override
	public List<Usuario> listar() {
		TypedQuery<Usuario> query = em.createQuery("from Usuario", Usuario.class);
		return query.getResultList();
	}

}
	