package ex_priorityqueue;

import java.util.PriorityQueue;

public class Principal
{

	public static void main(String[] args)
	{
		//CRIANDO FILA
		PriorityQueue<Integer> fila = new PriorityQueue<Integer>();
		
		//ADICIONANDO ELEMENTOS PARA FILA USANDO ADD()
		fila.add(10);
		fila.add(20);
		fila.add(15);
		
		//IMPRIMINDO ELEMENTO DO TOPO DA FILA
		System.out.println("Imprimindo elemento do topo da fila: ");
		System.out.println(fila.peek());
		System.out.println("*************************************");
		
		//IMPRIMINDO E REMOVENDO O PRIMEIRO ELEMENTO
		System.out.println("Imprimindo e removendo o elemento do topo da fila :");
		System.out.println(fila.poll());
		System.out.println("******************************");
		
		//IMPRIMINDO O ELEMENTO DO TOPO NOVAMENTE
		System.out.println("Imprimindo o elemento do topo novamente: ");
		System.out.println(fila.peek());
		System.out.println("******************************");
	}

}
