package leitura;

/*importa biblioteca*/
import java.util.Scanner;

public class Leitura
{
	
	public static void main(String[] args)
	{
		
		/*Captura dados do teclado*/
		try (Scanner teclado = new Scanner(System.in))
		{
			/*Mosntra mensagem*/
			System.out.println("Digite sua idade:");
			
			/*Cria variável e atribui as entradas do teclado*/
			int idade = teclado.nextInt();
			
			/* Mostra o dado ja capturado*/
			System.out.printf("Sua idade é: %d anos", idade);
		}
	}
	
}
