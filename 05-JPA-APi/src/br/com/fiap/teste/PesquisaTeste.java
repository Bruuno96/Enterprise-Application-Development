package br.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Venda;

public class PesquisaTeste {
	
	public static void main(String[] args) {
		
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
		
		EntityManager em = fabrica.createEntityManager();
		
		// Pesquisar pela PK no banco 
		Venda venda = em.find(Venda.class, 1);
		
		// Exibir os dados da venda		
//		venda.setVlVenda(900);
//		
//		em.getTransaction().begin();
//		em.getTransaction().commit();
		
		
		System.out.println(venda.toString());

		fabrica.close();
		em.close();
		
		
	}

}
