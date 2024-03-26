package projeto_alunos;

public class Principal
{

	public static void main(String[] args)
	{
		
		/*instânciando objeto aluno joao*/
		Aluno João = new Aluno();
		
		/*atributos do aluno*/
		João.cpf = "111.111.111-11";
		João.nome = "João Pedro da Silva";
		João.matricula = 1001;
		
		/*instânciando objeto aluno maria*/
		Aluno Maria = new Aluno();
		
		Maria.cpf = "222.222.222-22";
		Maria.nome = "Maria Luiza Monteiro";
		Maria.matricula = 1002;
		
		/*ponteiro*/
		Aluno antigo;
		
		/*condicional*/
		if(João.matricula < Maria.matricula)
		{
		
			antigo = João;
		}
		
		else
		{
			antigo = Maria;
		}
		
		System.out.println("Aluno mais antigo é: "
		+ antigo.nome);
		System.out.println("*************************");
		
		Aluno José = new Aluno();
		
		/*atributos do aluno José*/
		José.cpf = "333.333.333-33";
		José.nome = "José Carlos de Alcantra";
		José.matricula = 1003;
		
		/*Impirime os dados de José*/
		/*metodo que imprime todos os atributos juntos*/
		System.out.println(José.informações());
		
	}

}
