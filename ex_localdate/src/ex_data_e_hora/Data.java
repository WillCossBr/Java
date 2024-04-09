package ex_data_e_hora;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Data
{
	//ATRIBUTOS
	private LocalDate dataHoje;
	
	//CONSTRUTOR
	public Data()
	{
		//CAPTURA DATA ATUAL E PASSA PARA VAR dataHoje
		this.dataHoje = LocalDate.now();
	}

	//MÉTODO QUE IMPRIME A DATA ATUAL SEM FORMATAÇÃO
	 public void dataAtual()
	 {
		 System.out.println("Data Atual: " + dataHoje);
	 }

	 //MÉTODO QUE IMPRIME A DATA ATUAL FORMATADA
	 public void formataData()
	 {
		 //CRIA OBJETO QUE FORMATA A DATA
		 DateTimeFormatter formatador =
	     DateTimeFormatter.ofPattern("dd/MM/yyyy");
		 
		 //CRIA UMA VARIAVEL QUE RECEBE A DATA FORMATADA
	     String dataForm = dataHoje.format(formatador);
	     
	     //IMPRIME A DATA FORMATADA
	     System.out.println("Data Formatada: " + dataForm);
	 }
}