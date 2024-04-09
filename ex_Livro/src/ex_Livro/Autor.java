package ex_Livro;

public class Autor
{
	//ATRIBUTOS
	private String nome;
	private String nacionalidade;
	private String email;
	
	//MÉTODOS GET's
	public String getNome()
	{
		return nome;
	}
	
	public String getNacionalidade()
	{
		return nacionalidade;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	//MÉTODOS SET's
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	public void setNacionalidade(String nacionalidade)
	{
		this.nacionalidade = nacionalidade;
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}
}
