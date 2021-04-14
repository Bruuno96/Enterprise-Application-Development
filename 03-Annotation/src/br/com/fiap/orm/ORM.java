package br.com.fiap.orm;

import br.com.fiap.annotation.Coluna;
import br.com.fiap.annotation.Tabela;

public class ORM {

	
	public String gerarPesqusia(Object o) {
		Tabela anotacao = o.getClass().getAnnotation(Tabela.class);
		Coluna anotacao1 = o.getClass().getAnnotation(Coluna.class);
		return "SELECT " +anotacao1.nome() +" FROM "+anotacao.nome();
	}

}
