package br.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Venda;

public class RefreshTeste {
		public static void main(String[] args) {
			
			EntityManagerFactory f = Persistence.createEntityManagerFactory("oracle");
			EntityManager em = f.createEntityManager();
			
			Venda venda = em.find(Venda.class,1);
			
			venda.setNomeCliente("Robisvaldo");
			venda.setVlVenda(7500);
			
			
			System.out.println(venda.toString());
			
			em.refresh(venda);
			
			System.out.println(venda.toString());	
			
			f.close();
			em.close();
		}
}
