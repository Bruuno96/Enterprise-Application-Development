package br.com.fiap.tds.view;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.fiap.dao.GenericDao;
import br.com.fiap.dao.impl.*;
import br.com.fiap.entity.Evento;
import br.com.fiap.entity.TipoEvento;
import br.com.fiap.exception.CommitException;
import br.com.fiap.exception.EntityNotFoundException;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class EventoDaoTeste {
	
	public static void main(String[] args) {
		
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		
		// Obter a instancia DAO generico para o Evento 
		// As chaves significam que ta instanciando a filha da interface que nao pode ser instanciada.
		GenericDao<Evento, Integer> dao = new GenericDaoImp<Evento, Integer>(em){};
		
	Evento evento = new Evento("Next", Calendar.getInstance(), 30, TipoEvento.PRIVADO, false);
	
//	
//	// CRIAR UM EVENTO
//	try {
//		dao.create(evento);
//		dao.commit();
//	}catch(CommitException e) {
//		System.out.println(e.getMessage());
//	}
//	
	// ATUALIZAR
//
//	try {
//		evento = new Evento(1,"STARTUPONE", Calendar.getInstance(), 30, TipoEvento.PRIVADO, true);
//		dao.update(evento);
//		dao.commit();
//	}catch(CommitException e) {
//		e.getMessage();
//	}
	// BUSCAR
	
	try {
		dao.read(1);
		System.out.println("Nome do Evento:"+evento.getNomeEvento()+
				   		   "\n Data do Evento: "+evento.getDataEvento()+
				   		   "\n Preço: "+evento.getPrecoIngresso()+
				   		   "\n Tipo do Evento: "+evento.getTipoEvento()+
				   		   "\n Status Beneficente: "+evento.isStBenificente());
	} catch (EntityNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	// REMOVER
	}

}
