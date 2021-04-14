package br.com.fiap.tds.view;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.dao.UsuarioDao;
import br.com.fiap.dao.impl.UsuarioDaoImp;
import br.com.fiap.entity.Tipo;
import br.com.fiap.entity.Usuario;
import br.com.fiap.exception.CommitException;
import br.com.fiap.exception.EntityNotFoundException;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class UsuarioDaoTeste {

	public static void main(String[] args) throws EntityNotFoundException, CommitException {
		
//		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
//		
//		EntityManager em = fabrica.createEntityManager();
		
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		
		UsuarioDao dao = new UsuarioDaoImp(em);
		
		
		Usuario usuario = new Usuario("Bruno", Tipo.PJ);
			
//		// CRIAR
//		try{
//			dao.create(usuario);
//			dao.commit();
//		} catch(CommitException e){
//			e.getMessage();
//		}
		
		// BUSCAR
		try {
			dao.read(3);
			System.out.println("BANANA");
			System.out.println("Usuario: "+usuario.getNome()+
								"\n Tipo: "+usuario.getTipo());	
		}catch(EntityNotFoundException e) {
			System.out.println("erro");
			
//		}
//		
//		// ATUALIZAR
//		try {
//			usuario = new Usuario(1, "Bruno", Tipo.PF);
//			dao.update(usuario);
//			dao.commit();
//		}catch(CommitException e) {
//			System.out.println(e.getMessage());
//		}
//		
//		// REMOVER
//		try{
//			dao.remove(1);
//			dao.commit();
//			System.out.println("REMOVIDO");
//		}catch(CommitException | EntityNotFoundException e ) {
//			e.getMessage();
//		}
//	}
		}}

}
