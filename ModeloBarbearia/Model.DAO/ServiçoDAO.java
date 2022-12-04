package Model.DAO;

import Model.Serviço;
import java.util.ArrayList;

public class ServiçoDAO {


    public void insert (Serviço serviço) {
       Banco.serviço.add(Serviço);         
    }

    public boolean update (Serviço serviço) {
       for (int i = 0; i < Banco.serviço.size(); i++) {
        if (idSaoIguais(Banco.serviço.get(i), serviço)) {
            Banco.serviço.set(i, serviço);
            return true;
         }
       } 
       return false;
    }
    public boolean delete(Serviço serviço) {
        for (serviço serviçoLista : Banco.serviço) {
            if(idSaoIguais(serviçoLista, serviço)) {
                Banco.serviço.remove(serviçoLista);
                return true;
            }
        }
        return false;
    }
    private boolean idSaoIguais(Serviço serviço, Serviço serviçoAComparar) {
        return serviço.getId() == serviçoAComparar.getId();
    }

}
