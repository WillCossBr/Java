package projeto_alunos;

public class Aluno
{
	String nome;
	int matricula;
	String cpf;
	
	/*Método que retorna todos os atributos do aluno*/
	public String informações()
	{
		return "CPF: " + cpf + "\n" +
				"Nome: " + nome + "\n" +
				"Matrícula: " + matricula;
	}
}
