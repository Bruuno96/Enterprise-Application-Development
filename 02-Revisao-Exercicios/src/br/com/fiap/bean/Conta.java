package br.com.fiap.bean;

import java.util.Calendar;

public abstract class Conta {
	
	protected int agencia;
	protected int numero;
	protected Calendar dataAbertura;
	protected double saldo;
	
	public Conta() {
	}
	
	public Conta(int agencia, int numero, Calendar dataAbertura, double saldo) {
		this.setAgencia(agencia);
		this.setNumero(numero);
		this.setDataAbertura(dataAbertura);
		this.saldo = saldo;	
	}
	
	
	public void depositar(double valor) {
		this.saldo += saldo;
	}
	
	public void retirar(double valor) {
		if (valor > this.saldo) {
			throw new RegraRetirada(valor);
		}else
			this.saldo -= valor;
		
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Calendar getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Calendar dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	
	public double getSaldo() {
		return saldo;
	}
}
