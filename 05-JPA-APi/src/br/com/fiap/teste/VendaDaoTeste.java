package br.com.fiap.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.dao.VendaDao;
import br.com.fiap.entity.TipoCliente;
import br.com.fiap.entity.Venda;
import br.com.fiap.exception.CommitException;
import br.com.fiap.exception.VendaNotFoundException;

public class VendaDaoTeste {

	public static void main(String[] args) throws VendaNotFoundException, CommitException {
		
		// Instanciar uma fabrica de entity manager
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
	
		// instancia do entity manager
		EntityManager em = fabrica.createEntityManager();
		
		VendaDao dao = new VendaDao(em);
		Venda venda = new Venda(400, "Bruno", new GregorianCalendar(2021, Calendar.MARCH, 22, 10, 30), "Núbia", TipoCliente.PF);
		
//		try {
//			dao.create(venda);
//			dao.commit();
//			System.out.println("Venda registrada");
//		} catch (CommitException e){
//			System.out.println(e);
//		}
		
//		try {
//			dao.read(2);
//			System.out.println(venda);
//		}catch(VendaNotFoundException e) {
//			e.printStackTrace();
//		}
		
//		venda =  new Venda(1,560, "Bruno", new GregorianCalendar(2021, Calendar.MARCH, 22, 10, 30), "NÃºbia", TipoCliente.PJ);
//		try {
//			dao.update(venda);
//			dao.commit();
//			System.out.println("VENDA ATUALIZADA");
//			System.out.println(venda);
//		}catch(CommitException c) {
//			c.getMessage();
//		}
		
		try {
			dao.delete(25);
			dao.commit();
		} catch (VendaNotFoundException e) {
			e.getMessage();
		}
		
		em.close();
		fabrica.close();
		
		
		
		
		
		
//		Venda venda1 = new Venda(2, 5600, "Bruno", new GregorianCalendar(2021, Calendar.MARCH, 22, 10, 30), "Núbia",
//				TipoCliente.PJ);
//		dao.update(venda1);
		
			
		//dao.delete(1);
		
		em.close();
		fabrica.close();
		
		
		
		
	}

}
