package br.com.fiap.singleton;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/*
 * Genrencia a unica instancia da fabrica dentro do sistema
 * 
 * */
public class EntityManagerFactorySingleton {

	// 1 - Atributo estatico que armazena uma unica instancia 
	private static EntityManagerFactory fabrica;
	
	// STATIC permite poder manipular sem instanciar a classe 
	// 2 - Método estatico que retorna a unica instancia
	public static EntityManagerFactory  getInstance() {
		if (fabrica == null) {
			fabrica = Persistence.createEntityManagerFactory("oracle");
		}
		return fabrica;
	}
	
	// 3 - Construtor privado (Não pode ter instancia) -> new EntityManagerFactorySingleton(); 
	private EntityManagerFactorySingleton () {}
	
		
}
	