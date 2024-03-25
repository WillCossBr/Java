package ex_leonidas;

/*bibliotecas*/
import java.util.Scanner;

public class Leonidas
{

	public static void main(String[] args)
	{
		System.out.println("Leônidas é constantemente questionado"
		+ "sobre  quantos soldados seus 300 espartanos irão enfrentar."
		+ " Ajude Leônidas fazendo um pequeno jogo de adivinhação em"
		+ "que o jogador deve dar um palpite. Caso seja abaixo ou acima"
		+ "do valor correto, imprima mensagens adequadas informando"
		+ "o fato. O valor correto é 10.000");
		
		/*variaveis*/
		int palpite;
		
		/*entrada*/
		System.out.println("Digite seu palpite: ");
		
		/*captura entradas*/
		try (Scanner teclado = new Scanner(System.in))
		{
		
			/*palpite recebe os dados do usuário*/
			palpite = teclado.nextInt();
		
			/*Laço de repetição while, mantem no loop caso erre*/
			while(palpite != 10000)
			{
				/*se menor que 10000 imprime uma msg*/
				if(palpite < 10000)
				{
					System.out.println("Um pouco mais...");
				}
				
				/*se maior que 10000 imprime outra msg*/
				else
				{
					System.out.println("Um pouco menos...");
				}
				
				/*digita o proximo palpite caso erre*/
				System.out.println("Digite seu próximo palpite: ");
				
				/*var recebe novos dados de entrada*/
				palpite = teclado.nextInt();			
			}
			
			/*mensagem caso o usuário acerte*/
			System.out.println("Está correto!");
			
		}
		
	}

}
