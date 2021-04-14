package br.com.fiap.bean;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class TesteContas {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		
//		ContaCorrente cc = new ContaCorrente();
//		List<Conta> listaContaCorrente = new ArrayList<>();
////	Calendar horaAtual = Calendar.getInstance();
		SimpleDateFormat fomatter = new SimpleDateFormat("dd/MM/aaaa hh:mm");
		DecimalFormat formatador = new DecimalFormat("0.00");
		List<Conta> listaContaCorrente = new ArrayList<>();
		// CONTA CORRENTE
		int i = 0;
		while (i < 1) {
			System.out.println("\nQual o tipo de conta quer abrir: [0] C-Poupança [1] C-Corrente ");
			int conta = scan.nextInt();
			if (conta == 1) {
			ContaCorrente cc = new ContaCorrente();
			i++;

			System.out.println("Conta: "+i);
			System.out.println("Digite sua agência: ");
			int agencia = scan.nextInt();
			cc.setAgencia(agencia);
			
			System.out.println("Digite o numero da conta: ");
			int numeroConta = scan.nextInt();
			cc.setNumero(numeroConta);
			cc.setDataAbertura(Calendar.getInstance());
			
			System.out.println("Digite o valor do depósito: ");
			double deposito = scan.nextDouble();
			cc.depositar(deposito);
			
			try {
			System.out.println("Digite o valor do saque: ");
			double retirada = scan.nextDouble();
			cc.retirar(retirada);
			}catch (RegraRetirada regra) {
				System.out.println(regra.getMessage());
			}finally {
			
			System.out.println("Digite o tipo da conta: [1] COMUM [2] PREMIUM [3] ESPECIAL ");
			int tipo = scan.nextInt();
			System.out.println(tipo);
			if(tipo == 1) {
				cc.setTipo(TipoConta.COMUM);
			}else if (tipo == 2) {
				cc.setTipo(TipoConta.PREMIUM);
			}else if (tipo == 3) {
				cc.setTipo(TipoConta.ESPECIAL);
			}else System.out.println("Tipo de conta inexistente");
			}
		
		
			System.out.println();
			
			listaContaCorrente.add(cc);
			
			} else {
				i++;
				ContaPoupanca cp = new ContaPoupanca();
				System.out.println("Digite sua agência: ");
				int agencia = scan.nextInt();
				cp.setAgencia(agencia);
				
				System.out.println("Digite o numero da conta: ");
				int numeroConta = scan.nextInt();
				cp.setNumero(numeroConta);
				cp.setDataAbertura(Calendar.getInstance());
				
				System.out.println("Digite o valor do depósito: ");
				double deposito = scan.nextDouble();
				cp.depositar(deposito);
				
				try {
				System.out.println("Digite o valor do saque: ");
				double retirada = scan.nextDouble();
				cp.retirar(retirada);
				}catch (RegraRetirada regra) {
					System.out.println(regra.getMessage());
				}finally {
					
				
				cp.calcularRetornoInvestimento();
				
				
				listaContaCorrente.add(cp);
			}
		}// fechando os dois if's
	} // fechando while
		
		for (Conta c : listaContaCorrente) {
			System.out.printf("Agência: "+c.getAgencia()+
						   "\nNumero: "+c.getNumero()+
						   "\nSaldo: %.2f ",c.getSaldo());
			System.out.println();
			System.out.println();
	}
}
	}
