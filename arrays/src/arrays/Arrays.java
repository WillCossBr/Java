package arrays;

public class Arrays
{
	public static void main(String[] args)
	{
		/*Cria um array*/
		String[] nomes = {"João", "Mária", "Pedro", "Lucas", "Ana"};
		
		System.out.println("Cria um array(lista) e itera seu index e a imprime!");
		
		/*laço for itera o array*/
		for(int i = 0; i < nomes.length; i++)
		{
			System.out.println(nomes[i]);
		}
	}
}