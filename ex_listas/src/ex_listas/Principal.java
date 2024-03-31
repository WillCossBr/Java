package ex_listas;

//IMPORTE A BIBLIOTECA
import java.util.LinkedList;

public class Principal
{

	public static void main(String[] args)
	{
		//OBJETO LISTA ENCADEADA
		LinkedList<String> alunos = new LinkedList<String>();
		
		//ADICIONANDO ALUNOS A LISTA
		alunos.add("Mário");
		alunos.add("Luigi");
		alunos.add("Peach");
		alunos.add("Yoshi");
		
		//MOSTRANDO A LISTA(COMPLETA)
		System.out.println("Lista completa:");
		System.out.println(alunos);
		System.out.println("********************************");
		
		//MOSTRANDO A LISTA POR ÍNDICE
		System.out.println("Lista por índice: ");
		System.out.println("Posição[3]: " + alunos.get(3));
		System.out.println("********************************");
		
		//REMOVER ELEMENTO POR ÍNDICE
		alunos.remove(1);
		System.out.println("Lista com índice 1 removido: ");
		System.out.println(alunos);
		System.out.println("********************************");
		
		//MOSTRA TAMANHO TOTAL DA LISTA
		System.out.println("Tamanho total da lista: ");
		System.out.println(alunos.size());
		System.out.println("********************************");
		
		//REMOVE TODOS OS ELEMENTOS
		alunos.clear();
		System.out.println("Remvoer todos elementos da lista: ");
		System.out.println(alunos);
		System.out.println("********************************");
		
	}
}
