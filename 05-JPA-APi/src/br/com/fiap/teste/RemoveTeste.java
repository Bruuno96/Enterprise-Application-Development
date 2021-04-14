package br.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Venda;

public class RemoveTeste {
		
	public static void main(String[] args) {
		EntityManagerFactory f = Persistence.createEntityManagerFactory("oracle");
		
		EntityManager em = f.createEntityManager();
		
		Venda venda = em.find(Venda.class, 1);
		
		em.remove(venda);
		
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		
		
		f.close();
		em.close();
	}
	
}
