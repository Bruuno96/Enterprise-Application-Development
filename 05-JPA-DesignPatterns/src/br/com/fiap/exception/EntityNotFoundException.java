package br.com.fiap.exception;

public class EntityNotFoundException extends Exception {

	public EntityNotFoundException() {
		super("Entidade nao encontrada");
	}
	
	public EntityNotFoundException(String msg) {
		super(msg);
	}
}
