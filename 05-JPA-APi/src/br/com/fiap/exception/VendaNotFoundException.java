package br.com.fiap.exception;

public class VendaNotFoundException extends Exception {
		
	public VendaNotFoundException() {
		super("Venda nao encontrada");
	}
	
	public VendaNotFoundException(String msg) {
		super(msg);
	}
}
