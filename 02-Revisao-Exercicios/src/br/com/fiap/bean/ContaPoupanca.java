package br.com.fiap.bean;

import java.util.Calendar;

public class ContaPoupanca extends Conta implements ContaInvestimento{

	private float taxa = (float) 5.3;
	private final float rendimento = (float) 2.5;
	
	
	public ContaPoupanca() {	
	}
	
	public ContaPoupanca(int agencia, int numero, Calendar dataAbertura, double saldo, float taxa) {
		super(agencia, numero, dataAbertura, saldo);
		this.taxa = taxa;
		
	}	
	
	
	@Override
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	@Override
	public void retirar(double valor) {
		if (this.saldo < valor) {
			throw new RegraRetirada(valor);
		}else this.saldo -= (valor + taxa);
	}
	

	@Override
	public void calcularRetornoInvestimento() {
		System.out.printf("Valor calculo do retorno investido: %.2f ",this.saldo += saldo/100*this.rendimento);
	}

	public float getTaxa() {
		return taxa;
	}



	public void setTaxa(float taxa) {
		this.taxa = taxa;
	}



	public float getRendimento() {
		return rendimento;
	}




	



	
}
