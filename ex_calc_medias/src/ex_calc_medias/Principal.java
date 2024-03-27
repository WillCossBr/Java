package ex_calc_medias;

/*bibliotecas*/
import java.util.Scanner;

class Principal
{

	public static void main(String[] args)
	{
		
		System.out.println("Crie uma classe Nota,"
		+ "com três atributos reais chamados:\n"
		+ "nota1, nota2, nota3. E crie também dois"
		+ " métodos, cada um para calcular e retornar"
		+ " diferentes tipos de média. \nMédia Aritmética"
		+ " e Média ponderada.");
		System.out.println("************************************************");
		
		/*Cria o objeto*/
		Nota aluno1 = new Nota();
		
		/*Cria objeto Scanner*/
		Scanner teclado = new Scanner(System.in);
		
		/*Entradas*/
		
		/*nota1*/
		System.out.println("Digite sua nota1: ");
		
		aluno1.nota1 = teclado.nextInt();
		
		/*nota2*/
		System.out.println("Digite sua nota2: ");
		
		aluno1.nota2 = teclado.nextInt();
		
		/*nota3*/
		System.out.println("Digite sua nota3: ");
		
		aluno1.nota3 = teclado.nextInt();
		
		/*Chama os métodos que retornaram os resultados*/
		aluno1.media_aritmetica();
		aluno1.media_ponderada();

	}

}
