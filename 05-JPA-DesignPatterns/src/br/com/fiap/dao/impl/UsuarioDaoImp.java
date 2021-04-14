package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.dao.UsuarioDao;
import br.com.fiap.entity.Usuario;

public class UsuarioDaoImp extends GenericDaoImp<Usuario, Integer> implements UsuarioDao {

	public UsuarioDaoImp(EntityManager em) {
		super(em);
		}
		
	
}
