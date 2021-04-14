package br.com.fiap.main;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import br.com.fiap.annotation.Coluna;
import br.com.fiap.bean.Aluno;
import br.com.fiap.bean.Cliente;
import br.com.fiap.orm.ORM;

public class Teste {

	public static void main(String[] args) {

		// instanciar cliente
		Cliente cliente = new Cliente();
		
		//API Reflection -> recuperar a estrutura da classe
		System.out.println(cliente.getClass().getName());
		
		// Recuperar os métodos da classe cliente
		Method[] metodos = cliente.getClass().getDeclaredMethods();
//	
//		System.out.println();
//		System.out.println("Métodos: ");
		
//		for(int i = 1; i < metodos.length;i++) {
//			System.out.println(metodos[i].getName());
//		}
//		
//		System.out.println();
//		System.out.println("Atributos:");
//		//Recuperar os atributos
//		Field[] attr = cliente.getClass().getDeclaredFields();
//		for (Field f : attr) {
//			System.out.println(f.getName());
//			// Recuperar anotações
//			Coluna a = f.getAnnotation(Coluna.class);
//			System.out.println("Nome: "+a.nome());
//			System.out.println("Tamanho: "+a.tamanho());
//			System.out.println("Unico: "+a.unico());
		
		Aluno aluno = new Aluno();
		aluno.setNome("Bruno");
		aluno.setRm(86066);
		ORM orm = new ORM();
		System.out.println(orm.gerarPesqusia(aluno));
	}
		
}

