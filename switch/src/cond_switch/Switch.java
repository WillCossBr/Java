package cond_switch;

/*bibliotecas*/
import java.util.Scanner;

public class Switch
{

	public static void main(String[] args)
	{
		
		/*Programa demostra o uso do switch case, por meio de uso
		 * de um cardápio, dependendo da opção do cliente o programa
		 * mostra determinado resultado.*/
		
		/*variáveis*/
		int opcao;
		
		/*objeto teclado para capturar dados de entrada*/
		try (Scanner teclado = new Scanner(System.in))
		{
			
			/*Mostra uma mensagem*/
			System.out.println("Sabores de Sorvetes");
			System.out.println("1 - Chocolate");
			System.out.println("2 - Morango");
			System.out.println("3 - Baunilha");
			System.out.println();
			System.out.println("Digite sua opção: ");
			
			/*passa os dados de entrada para a variável opcao*/
			opcao = teclado.nextInt();
			
			switch(opcao)
			{
			case 1:
				System.out.println("O sabor escolhido foi de chocolate");
				break;
				
			case 2:
				System.out.println("O sabor escolhido foi de morango");
				break;
				
			case 3:
				System.out.println("O sabor escolhido foi de Baunilha");
				break;
				
			default:
				System.out.println("Opção inválida, recomeçe o programa!");
			}
			
		}
		
	}

}
