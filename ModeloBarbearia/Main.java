package ModeloBarbearia;

public class Main {
 
 public static void main (String[]args) {
  
  String nome = "Tiago";
  System.out.println(nome);
  
  Serviço serviço = new Serviço(1, "Barba", 30);
  System.out.println(serviço.getDescrição());
  System.out.println(serviço.getValor());
  

  Cliente cliente = new Cliente(1, "Gustavo", "Rua 30 de Outubro, 22", "22222-222");
  System.out.println(cliente.getNome());
  
  Usuário usuario = new Usuário(1, "Barbeiro", "Madrid");
  System.out.println(usuario);

 }

}