package ModeloBarbearia;

public class Main {
 
 public static void main (String[]args) {
  
  String nome = "Tiago";
  System.out.println(nome);
  
  Serviço serviço = new Serviço(1, "Barba", 30);
  System.out.println(serviço.getDescrição());
  System.out.println(serviço.getValor());
  

  Cliente cliente = new Cliente(2, "Alef", 'M', "98888-8888", "Rua Oito de Dezembro, 99");
  System.out.println(cliente);
  
  Usuário usuario = new Usuário(1, "barbeiro", "senha");
  System.out.println(usuario);

 }

}