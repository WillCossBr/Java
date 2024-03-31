package calculadora;

import java.util.Scanner;

public class Principal
{

	public static void main(String[] args)
	{
		int menu;
		float num1;
		float num2;
		
		try (Scanner teclado = new Scanner(System.in))
		{
		
			System.out.println("CALCULADORA:             ");
			System.out.println("1 - SOMA                 ");
			System.out.println("2 - SUBTRAÇÃO            ");
			System.out.println("3 - MULTIPLICAÇÃO        ");
			System.out.println("4 - DIVISÃO              ");
			System.out.println("DIGITE A OPÇÃO DESEJADA: ");
		
			menu = teclado.nextInt();
		
			switch(menu)
			{
			case 1:
				System.out.println("Digite um número: ");
				num1 = teclado.nextFloat();
				System.out.println("Digite um número: ");
				num2 = teclado.nextFloat();
				Calculadora.soma(num1, num2);
			break;
			
			case 2:
				System.out.println("Digite um número: ");
				num1 = teclado.nextFloat();
				System.out.println("Digite um número: ");
				num2 = teclado.nextFloat();
				Calculadora.subtracao(num1, num2);
			break;
			
			case 3:
				System.out.println("Digite um número: ");
				num1 = teclado.nextFloat();
				System.out.println("Digite um número: ");
				num2 = teclado.nextFloat();
				Calculadora.multiplicacao(num1, num2);
			break;
			
			case 4:
				System.out.println("Digite um número: ");
				num1 = teclado.nextFloat();
				System.out.println("Digite um número: ");
				num2 = teclado.nextFloat();
				Calculadora.divisao(num1, num2);
			break;
			
			default:
				System.out.println("Opção de menu inválido!");
			break;
			}
			
		}
		
	}

}
