package laço_while;

public class While
{
	public static void main(String[] args)
	{
		/*contador de 0 até 10*/
		
		/*variável*/
		int contador = 0;
		
		/*mostra uma mensagem*/
		System.out.println("Contador de 0 até 10");
		
		/*Laço de repetição while
		 * primeiro a condição depois o comnado*/
		while(contador < 11)
		{
			System.out.println(contador);
			contador ++;
		}
	}
}
