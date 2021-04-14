package br.com.fiap.bean;
import java.util.Calendar;

public class ContaCorrente extends Conta {
	
	
	private TipoConta tipo;
	

	public ContaCorrente() {
	}
	
	public ContaCorrente(int agencia, int numero, Calendar dataAbertura, double saldo, TipoConta tipo) {
		super(agencia, numero, dataAbertura, saldo);
		this.setTipo(tipo);
	}
	
	@Override
	public void depositar(double valor) {
		this.saldo += valor;
	}

	@Override
	public void retirar(double valor) {
		if (this.saldo < valor && tipo.equals(tipo.COMUM)) {
			throw new RegraRetirada(valor);
		}else this.saldo -= valor;
	}
	public TipoConta getTipo() {
		return tipo;
	}

	public void setTipo(TipoConta tipo) {
		this.tipo = tipo;
	}
	
	}// classe

