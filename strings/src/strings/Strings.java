package strings;

public class Strings
{
	public static void main(String[] args)
	{
		/*variável recebe uma string*/
		String msg = "Mário";
		
		/*Concatenação de Strings (junta as palavras)*/
		msg = "Super" + " " + msg;
		
		/*Monstra a msg concatenada*/
		System.out.println(msg);
		
		/*Mostra o tamanho da mensagem*/
		System.out.printf("tamanho em caracteres: %d\n" ,msg.length());
		
		/*Todas as letras ficam maiusculas*/
		msg = msg.toUpperCase();
		
		/*Mostra mensagem com letras maiusculas*/
		System.out.println(msg);
		
/*********************************************************************/
		
		System.out.println("*******************************************");
		System.out.print("Crie um código que compare duas strings e "
		+ "veja se a string 1 pertence a string2 ou não.\n");
		
		String msg1 = "objeto";
		String msg2 = "Java é um paradigma orientado a objetos";
		
		System.out.println("mensagem completa: " + msg2);
		System.out.println("palavra a ser procurada: " + msg1);
		
		/*laço if*/
		/*função contains itera a string 1 procurando a string 2*/
		if(msg2.contains(msg1))
		{
			System.out.println("A palavra: " + msg1  + " aparece na frase: " + msg2);
		}
		
		else
		{
			System.out.println("A palavra: " + msg1  + " não aparece na frase: " + msg2);
		}

/******************************************************************************************/
		
		System.out.println("*******************************************");
		System.out.println("Compare duas strings");
		
		String x = "Java";
		String y = "java";
		
		/*condicional if*/
		if(x.equals(y))
		{
			System.out.println("palavras iguais!");
		}
		
		else
		{
			System.out.println("palavras Diferentes!");
		}
	
	}
}

