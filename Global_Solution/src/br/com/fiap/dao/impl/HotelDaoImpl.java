package br.com.fiap.dao.impl;

import java.util.List; 

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.fiap.dao.HotelDao;
import br.com.fiap.entity.Hotel;

public class HotelDaoImpl extends GenericDaoImp<Hotel, Integer> implements HotelDao{

	public HotelDaoImpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public  Hotel buscarPorNome(String nomeHotel) {
		TypedQuery<Hotel> query = em.createQuery("from Hotel h where h.nome like :nomeHotel", Hotel.class);
		query.setParameter("nomeHotel", "%" + nomeHotel + "%");
		return query.getSingleResult();
	}

	@Override
	public List<Hotel> listar() {
		// TODO Auto-generated method stub
		return null;
	}
}
