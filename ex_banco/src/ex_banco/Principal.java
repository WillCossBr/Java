package ex_banco;

import java.util.Scanner;

public class Principal
{

	public static void main(String[] args)
	{
		
		/*variavel*/
		int opcao;
		int saque;
		int deposito;
		
		/*instancia o objeto conta1*/
		Conta conta1 = new Conta();
		
		/*conta*/
		conta1.correntista = "Ana Beatriz";
		conta1.saldo = 5000;
		conta1.limiteSaque = 1000;
		
		/*Menu*/
		System.out.println("1 - Sacar");
		System.out.println("2 - Depositar");
		System.out.println("3 - Informações");
		
		try (Scanner teclado = new Scanner(System.in))
		{
		
			System.out.println("Digite o número da opção desejada: ");
			opcao = teclado.nextInt();
		
			switch(opcao)
			{
			case 1:
			System.out.println("Sacar!");
			System.out.println("Digite o valor do saque: ");
			saque = teclado.nextInt();
			conta1.sacar(saque);
			break;
			
			case 2:
			System.out.println("Depositar!");
			System.out.println("Digite o valor do depósito: ");
			deposito = teclado.nextInt();
			conta1.depositar(deposito);
			break;
			
			case 3:
			conta1.info(conta1.correntista, conta1.saldo);
			break;
			
			default:
			System.out.println("Opção Inválida! Recomeçe a operação!");
			}
		}
	}
}
