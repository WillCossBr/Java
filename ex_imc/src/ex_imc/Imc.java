package ex_imc;

/*bibliotecas*/
import java.util.Scanner;

public class Imc
{

	public static void main(String[] args)
	{
		
		/*variaveis*/
		float peso;
		float altura;
		float imc;
		
		System.out.println("Crie um programa que calcule o IMC");
		System.out.println("IMC = Índice de Massa Comporal\n");
		
		/*objeto que captura dados de entrada*/
		try (Scanner teclado = new Scanner(System.in))
		{
			
			/*ENTRADAS*/
			
			/*mostra mensagem*/
			System.out.println("Digite seu peso(Kg): ");
			
			/*passa os dados de entrada para variavel peso*/
			peso = teclado.nextFloat();
			
			/*mostra mensagem*/
			System.out.println("Digite sua altura(m): ");
			
			/*passa os dados de entrada para variavel altura*/
			altura = teclado.nextFloat();
			
			/*PROCESSAMENTOS*/
			
			/*cálculo do imc*/
			/*Math.pow = função de potência*/
			imc = (float) (peso / Math.pow(altura, 2));
			
			/*SAIDAS*/
			System.out.printf("Seu IMC é: %.2f", imc);
			
		}
	}
}
