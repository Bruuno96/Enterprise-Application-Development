package br.com.fiap.bean;

public class RegraRetirada extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	public RegraRetirada(double valor) {
		super("Valor inválido, retirada maior que o saldo atual: ");
	}
}
