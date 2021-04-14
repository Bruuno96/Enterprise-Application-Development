package br.com.fiap.testePersistencia;

import javax.persistence.EntityManager;

import br.com.fiap.bean.ProjetoChallenge;
import br.com.fiap.dao.GrupoChallengeDao;
import br.com.fiap.dao.ProjetoChallengeDao;
import br.com.fiap.dao.impl.GrupoChallengeDaoImpl;
import br.com.fiap.dao.impl.ProjetoChallengeDaoImpl;
import br.com.fiap.exception.EntityNotFoundException;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class PesquisaTeste {
	
	public static void main(String[] args) {
		
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		GrupoChallengeDao  gpdao = new GrupoChallengeDaoImpl(em);
		ProjetoChallengeDao dao = new ProjetoChallengeDaoImpl(em);
		
		
		try {
			ProjetoChallenge projeto1 = dao.read(1);
			System.out.println(projeto1.getNmProjeto());
			System.out.println(projeto1.getNomeGrupo().getNm_grupo());
		} catch (EntityNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		em.close();
		
		
	}
}
