package ex_data_e_hora;

public class Principal
{
    public static void main(String[] args)
    {
        //OBJETO DA CLASSE DATA
        Data data = new Data();
        
      //OBJETO DA CLASSE HORA
        Hora hora = new Hora();
        
/******************************************************/
        
        //CHAMA O MÉTODO QUE RETORNA A DATA
        data.dataAtual();
        
        //CHAMA O MÉTODO QUE RETORNA A DATA FORMATADA
        data.formataData();
        
        
        System.out.println("***************************");
/*******************************************************/
        
        //CHAMA O MÉTODO QUE RETORNA A DATA
        hora.horaAtual();
        
        //CHAMA O MÉTODO QUE RETORNA A DATA FORMATADA
        hora.formataHora();
        
    }
}