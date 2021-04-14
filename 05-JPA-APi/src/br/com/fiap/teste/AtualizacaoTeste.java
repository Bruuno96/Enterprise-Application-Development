package br.com.fiap.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.TipoCliente;
import br.com.fiap.entity.Venda;

public class AtualizacaoTeste {
	public static void main(String[] args) {
		
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
		
		EntityManager em = fabrica.createEntityManager();
			
		// Instanciar um objeto venda  com um id existente  no banco (Estado: detached)
		Venda venda = new Venda(1,560, "Bruno", new GregorianCalendar(2021, Calendar.MARCH, 22, 10, 30), "Núbia", TipoCliente.PJ );

		// Atualizar venda , merge retorna uma copia do objeto com outro endereço de memoria.
		em.merge(venda);
		
		//Commit
		em.getTransaction().begin();
		em.getTransaction().commit();
		// Fechar
		em.close();
		fabrica.close();
	}
	

}
