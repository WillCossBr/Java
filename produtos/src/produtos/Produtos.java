package produtos;

public class Produtos
{
	private int id;
    private String nome;

    public Produtos(int id, String nome)
    {
        this.id = id;
        this.nome = nome;
    }
    
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
    
}
