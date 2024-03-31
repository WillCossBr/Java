package produtos;

import java.util.Scanner;
import java.util.ArrayList;

public class Principal
{

	public static void main(String[] args)
	{
		//Cria lista que armazena produtos
		ArrayList<Produtos> lista_prod = new ArrayList<>();
		
		//Cria Scanner que captura dados de entrada
		try (Scanner teclado = new Scanner(System.in))
		{
			//MENU
			int opcao;
			System.out.println("*************************");
			System.out.println("Menu de opções: ");
			System.out.println("1 - Adicionar Produtos");
			System.out.println("2 - Listar Produtos");
			System.out.println("3 - Sair");
			opcao = teclado.nextInt();
			
			//ADICIONAR PRODUTOS
			while(opcao == 1)
			{
			System.out.println("*************************");
			System.out.println("Digite o Id: ");
			int id;
			id = teclado.nextInt();
			teclado.nextLine();
			
			System.out.println("Digite o Nome: ");
			String nome;
			nome = teclado.nextLine();
			
			//Adiciona produtos a lista
			lista_prod.add(new Produtos(id, nome));
			
			System.out.println("Menu de opções: ");
			System.out.println("1 - Adicionar Produtos");
			System.out.println("2 - Listar Produtos");
			System.out.println("3 - Sair");
			opcao = teclado.nextInt();
			
			}
			
			if(opcao == 2)
			{
				System.out.println("*************************");
				System.out.println("Lista de Produtos: ");
				// Itera sobre a lista e imprime os produtos
				for (Produtos produto : lista_prod)
				{
	            System.out.print("ID: " + produto.getId());
	            System.out.print(" Nome: " + produto.getNome());
	            System.out.println();
				}
			}
			
			else
			if(opcao == 3)
			{
				System.out.println("Programa Encerrado!");
			}
		}

	}

}
