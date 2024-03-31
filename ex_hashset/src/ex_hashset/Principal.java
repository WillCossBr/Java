package ex_hashset;

import java.util.HashSet;

public class Principal
{

	public static void main(String[] args)
	{
		HashSet<String> nomes = new HashSet<String>();
		
		nomes.add("João");
		nomes.add("Maria");
		nomes.add("Pedro");
		nomes.add("Ana");
		//JOÃO JA EXISTE PORTANTO NÃO SERA ADICIONADO
		nomes.add("João");
		nomes.add("Luiza");
		nomes.add("Rafael");
		
		//MOSTRAR CONJUNTO
		System.out.println("Conjunto completo: ");
		System.out.println(nomes);
		System.out.println("******************************");
		
		//REMOVER ITEM
		nomes.remove("Maria");
		System.out.println("Remove item do conjunto: ");
		System.out.println(nomes);
		System.out.println("******************************");
		
		//DESCOBRE O TOTAL DO CONJUNTO
		System.out.println("Total do conjunto:");
		System.out.println(nomes.size());
		System.out.println("******************************");
		
		//CONFERE SE O ITEM DO CONJUNTO EXISTE
		if(nomes.contains("Rafael"))
		{
			System.out.println("Ele está presente!");
		}
		
		else
		{
			System.out.println("Não está presente!");
		}
	}

}
