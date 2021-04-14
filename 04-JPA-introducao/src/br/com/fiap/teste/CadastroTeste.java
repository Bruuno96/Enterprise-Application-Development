package br.com.fiap.teste;

import java.util.Calendar; 
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CadastroTeste {

	public static void main(String[] args) {

		// Instanciar uma fabrica de entity manager
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
	
		// instancia do entity manager
		EntityManager em = fabrica.createEntityManager();
		
		Venda venda = new Venda(100, "Bruno", new GregorianCalendar(2021, Calendar.MARCH, 22, 10, 30, "Núbia", Tipoliente.);
		
		
		em.close();
		fabrica.close();
	
	}

}
