package br.com.fiap.testePersistencia;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;

import br.com.fiap.bean.GrupoChallenge;
import br.com.fiap.bean.ProjetoChallenge;
import br.com.fiap.dao.GrupoChallengeDao;
import br.com.fiap.dao.ProjetoChallengeDao;
import br.com.fiap.dao.impl.GrupoChallengeDaoImpl;
import br.com.fiap.dao.impl.ProjetoChallengeDaoImpl;
import br.com.fiap.exception.CommitException;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class CadastroTeste2 {
	
	public static void main(String[] args) throws CommitException {
		
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		GrupoChallengeDao  gpdao = new GrupoChallengeDaoImpl(em);
		ProjetoChallengeDao projeto = new ProjetoChallengeDaoImpl(em);
		
		// Criar grupo
		GrupoChallenge gp = new GrupoChallenge("SAL&PIMENTA");
		
		// Criar projeto
		ProjetoChallenge projeto1 = new ProjetoChallenge("OneID", "UX", new GregorianCalendar(2021, Calendar.JUNE, 20), 9.5, gp);
		
		// Cadastrar grupo
		
		// Cadastrar projeto
		
	// CRIAR UM EVENTO
		try {
			gpdao.create(gp);
			//projeto.create(projeto1);
			//projeto.commit();
			gpdao.commit();
			em.close();
		}catch(CommitException e) {
			System.out.println(e.getMessage());
		}
		
		

	}

}
