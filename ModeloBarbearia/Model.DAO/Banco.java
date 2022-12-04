package ModelDAO;

import Model.Agendamento;
import Model.Cliente;
import Model.Serviço;
import Model.Usuário;
import java.util.ArrayList;

public class Banco {

    public static ArrayList <Usuário> usuário;
    public static ArrayList <Cliente> cliente;
    public static ArrayList <Serviço> serviço;
    public static ArrayList <Agendamento> agendamento;

    public static void inicia() {
        usuário = new ArrayList <Usuário>();
        cliente = new ArrayList <Cliente>();
        serviço = new ArrayList <Serviço>();
        agendamento = new ArrayList <Agendamento>();



    }
}
