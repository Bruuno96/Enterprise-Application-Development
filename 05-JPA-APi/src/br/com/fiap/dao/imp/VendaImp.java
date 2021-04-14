package br.com.fiap.dao.imp;

import br.com.fiap.entity.Venda; 
import br.com.fiap.exception.CommitException;
import br.com.fiap.exception.VendaNotFoundException;

public interface VendaImp {
		
		
		void create(Venda venda);
		
		Venda read(int id) throws VendaNotFoundException;
		
		void update(Venda venda);
		
		void delete(int id) throws VendaNotFoundException;
		
		void commit()throws CommitException;

}
