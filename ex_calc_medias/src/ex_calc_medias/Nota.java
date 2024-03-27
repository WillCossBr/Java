package ex_calc_medias;

public class Nota
{
	/*atributos*/
	int nota1;
	int nota2;
	int nota3;
	
	/*métodos*/
	
	public void media_aritmetica()
	{
		int media_ari = (nota1 + nota2 + nota3) / 3;
		
		System.out.println("Média Aritmética: " + media_ari + "%");
	}
	
	public void media_ponderada()
	{
		int media_pon = (((nota1 * 2) + (nota2 * 3) + (nota3 * 4)) / (2 + 3 + 4));
		
		System.out.println("Média Ponderada: " + media_pon + "%");
	}
	
}


