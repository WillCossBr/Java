package ex_hashmap;

import java.util.HashMap;

public class Principal
{

	public static void main(String[] args)
	{
		HashMap<String, String> capitais = new HashMap<String, String>();
		
		capitais.put("Brasil", "Brasília");
		capitais.put("Argentina", "Buenos Aires");
		capitais.put("Paraguai", "Assunção");
		capitais.put("Uruguai", "Montevidéu");
		
		//IMPRIMIR TUDO
		System.out.println(capitais);
		
		//IMPRIMINDO APENAS A CAPITAL DO URUGUAI
		System.out.println(capitais.get("Uruguai"));
	}

}
