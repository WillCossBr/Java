package cond_if;

/*blibliotecas*/
import java.util.Scanner;

public class If
{
	public static void main(String[] args)
	{
		/*variável*/
		int idade;
		
		/*Captura dados do teclado*/
		try (Scanner teclado = new Scanner(System.in))
		{
			/*Mostra mensagem*/
			System.out.println("Digite sua idade: ");
			
			/*passa os dados de entrada para a variavel*/
			idade = teclado.nextInt();
			
			/*Condicional if:*/
			if(idade < 10)
			{
				System.out.println("Você é uma criança");
			}
			
			else if(idade < 18)
			{
				System.out.println("Você é um adolescente");
			}
			
			else
			{
				System.out.println("Você é um adulto");
			}
					
		}
		
	}
}
