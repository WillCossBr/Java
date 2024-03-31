package calculadora;

public class Calculadora
{

	public static void soma(float a, float b)
	{
		float resultado;
		float som1;
		float som2;
		som1 = a;
		som2 = b;
		resultado = som1 + som2;
		System.out.println(resultado);
	}
	
	public static void subtracao(float a, float b)
	{
		float resultado;
		float sub1;
		float sub2;
		sub1 = a;
		sub2 = b;
		resultado = sub1 - sub2;
		System.out.println(resultado);
	}
	
	public static void multiplicacao(float a, float b)
	{
		float resultado;
		float mul1;
		float mul2;
		mul1 = a;
		mul2 = b;
		resultado = mul1 * mul2;
		System.out.println(resultado);
	}
	
	public static void divisao(float a, float b)
	{
		float resultado;
		float div1;
		float div2;
		div1 = a;
		div2 = b;
		resultado = div1 / div2;
		System.out.println(resultado);
	}

}

