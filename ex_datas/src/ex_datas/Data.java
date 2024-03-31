package ex_datas;

public class Data
{
	//ATRIBUTOS
	private int dia;
	private int mês;
	private int ano;
	
	//set = definir
	public void setData(int x,int y,int z)
	{
		dia = x;
		mês = y;
		ano = z;
	}
	
	// get = pegar
	public void getData()
	{
		System.out.print(dia + "/");
		System.out.print(mês + "/");
		System.out.println(ano);
	}
}


