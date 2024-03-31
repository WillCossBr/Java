package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Principal
{

	public static void main(String[] args)
	{
		//CRIANDO UMA LISTA	
		ArrayList<String> lista = new ArrayList<>();
		
		//ADICIONANDO ELEMENTOS À LISTA
		lista.add("Elemento 1");
		lista.add("Elemento 2");
		lista.add("Elemento 3");
		
		//ITERANDO UMA LISTA COM O LAÇO FOR TRADICIONAL
		System.out.println("Iterando uma lista com laço for tradicional: ");
		for(int i = 0; i < lista.size(); i++)
		{
			String elemento = lista.get(i);
			System.out.println(elemento);
		}
		
		System.out.println("*********************************************");
		System.out.println("Iterando uma lista com Iterator: ");
		//OBTENDO UM ITERATOR PARA A LISTA
		Iterator<String> iterator = lista.iterator();
		
		//ITERANDO SOBRE OS ELEMENTOS DA LISTA USANDO O ITERATOR
		//hasNext = VERIFICA SE AINDA EXISTE ELEMENTOS NO CONJUNTO
		while(iterator.hasNext())
		{
			//next = PRÓXIMO ELEMENTO
			String elemento = iterator.next();
			System.out.println(elemento);
		}
		
		System.out.println("*********************************************");
		
		System.out.println("Vantagens de usar o iterator: ");
		System.out.println("1 - Abstração da estrutura de dados"
		+ ", não necessita se preucupar com os detalhes internos"
		+ "da estrutura, como índices ou como os elementos são"
		+ "armazenados.");
		
		System.out.println("2 - Suporte para todos os tipos de"
		+ "coleção, incluindo listas, conjuntos, mapas e muito mais."
		+ "Abordagem uniforme para iterar sobre diferentes tipos"
		+ "de coleção.");
		
		System.out.println("3 - Performance, pois pode ser mais eficiente"
				+ " do que um laço for em termos de desempenho.");
	}

}
