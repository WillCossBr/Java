package ex_string_reversa;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class String_reversa
{

	public static void main(String[] args)
	{
		System.out.println("Leia uma sequência de N strings e"
		+ "as imprima em ordem reversa. Utilize um método.\n");
		
		/*Cria um lista de nomes, já preenchidos*/
		List<String> nomes = new ArrayList<>(List.of
		(
				"João",
				"Alessandra",
				"Gabriel",
				"Edson"
		));
		
		/*Imprimindo os elementos da lista*/
		System.out.println("Elementos ordem normal: ");
		System.out.println(nomes);
		
		/*imprimindo a lista de modo reverso*/
		System.out.println("\nElementos em ordem reversa: ");
		for (int i = nomes.size() - 1; i >= 0; i--)
		{
			System.out.println(nomes.get(i));
		}
		
		/*usando métodosm modo reverso*/
		System.out.println("\nMétodo modo reverso: ");
		Collections.reverse(nomes);
		System.out.println(nomes);
		
	}

}
