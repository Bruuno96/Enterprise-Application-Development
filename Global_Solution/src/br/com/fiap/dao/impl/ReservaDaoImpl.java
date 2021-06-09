package br.com.fiap.dao.impl;

import java.util.List; 

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.fiap.dao.ReservaDao;
import br.com.fiap.entity.Hotel;
import br.com.fiap.entity.Reserva;
import br.com.fiap.entity.Usuario;

public class ReservaDaoImpl extends GenericDaoImp<Reserva, Integer> implements ReservaDao{

	public ReservaDaoImpl(EntityManager em) {
		super(em);
		}
	Usuario u = new Usuario();
	Hotel h = new Hotel();
	
	@Override
	public List<Reserva> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void create(Reserva entidade) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Reserva> listarReservas() {
		return em.createNativeQuery("SELECT * FROM tb_gs_reserva reserva INNER JOIN tb_gs_usuario usuario ON (reserva.id_reserva = usuario.id_usuario)", Reserva.class)
				.getResultList();
	}
	
	
	
}
