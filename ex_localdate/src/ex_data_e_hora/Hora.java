package ex_data_e_hora;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Hora
{
	//ATRIBUTOS
	private LocalTime horario;
	
	//CONSTRUTOR
	public Hora()
	{
		//MÉTODO QUE IMPRIME A HORA ATUAL SEM FORMATAÇÃO
			this.horario = LocalTime.now();
	}
	
	//MÉTODO QUE IMPRIME A HORA ATUAL FORMATADA
	public void horaAtual()
	{
		System.out.println("Hora atual: " + horario);
	}
	
	//MÉTODO QUE FORMATA HORA ATUAL
	public void formataHora()
	{
		//CRIA OBJETO QUE FORMATA A HORA
		DateTimeFormatter HorarioForm =
		DateTimeFormatter.ofPattern("HH:mm:ss");
		
		//CRIA UMA VARIAVEL QUE RECEBE A HORA FORMATADA
		String horaForm = horario.format(HorarioForm);
		
		//IMPRIME A HORA FORMATADA
		System.out.println("Hora formatada: " + horaForm);
	}
}
