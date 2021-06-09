package br.com.fiap.dao;

import br.com.fiap.entity.Hotel;

public interface HotelDao extends GenericDao<Hotel, Integer> {
		
	public Hotel buscarPorNome(String nome);
}
