package ex_banco;

public class Conta
{
	String correntista;
	int saldo;
	int limiteSaque;
	
	
	public void sacar(int valor)
	{	
		int x = valor;
		saldo = saldo - x;
		System.out.println("Saldo atual de: " + saldo);
	}
	
	public void depositar(int valor)
	{
		int y = valor;
		saldo = saldo + y;
		System.out.println("Saldo atual de: " + saldo);
	}
	
	public void info(String nome, int saldo)
	{
		String z = nome;
		int w = saldo;
		System.out.println("Nome da conta: " + z);
		System.out.println("Saldo da conta: " + w);
	}
	
}
