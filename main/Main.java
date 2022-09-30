package main;
import java.util.Scanner;

public class Main {
  
    public static void main (String [] args ){
        Scanner in = new Scanner (System.in);
        int op;
        
        String nome;
        String status;
        int codCadastro,idade;
        double peso;

        Funcionario f1;
        Cliente c1;
        Cachorro dog1;
        Gato cat1 = null;
        

        do{
            System.out.println("Digite a sua opcao");
            exibirMenu();
            op = in.nextInt(); in.nextLine();
            
            switch (op){
                case 1: System.out.println("Cadastrar cliente");
                        System.out.println("Digite o nome: ");
                        nome =  in.nextLine();
                        System.out.println("Digite o Status: ");
                        status = in.nextLine();
                        System.out.println("Digite o numero de cadastro: ");
                        codCadastro = in.nextInt();
                
                        c1 = new Cliente (nome,status,codCadastro);
                        System.out.println(c1);

                        break;
                case 2: System.out.println("Cadastrar funcionário");
                        System.out.println("Digite o nome: ");
                        nome =  in.nextLine();
                        System.out.println("Digite o Status: ");
                        status = in.nextLine();
                        System.out.println("Digite o numero de cadastro: ");
                        codCadastro = in.nextInt();
                
                        f1 = new Funcionario(nome,status,codCadastro);
                        System.out.println(f1);
                        
                        break;
                case 3: System.out.println("Fazer serviço de banho e/ou tosa");
                        System.out.println("1 - banho || 2 - tosa || 3 - ambos");
                        
                            System.out.println("Digite qual é o Servico");
                            op = in.nextInt();

                        
                        switch (op){
                            case 1:System.out.println("Banho"); 

                                break;
                            case 2:System.out.println("Tosa"); 
                                
                                cat1.getServiço().setTosa("tosado");

                                System.out.println("a tosa está" + cat1.getServiço().getTosa());        
                            
                            
                                break;
                            case 3:System.out.println("Banho e tosa");
                                
                                break;        
                        }


                        break;
                case 4: System.out.println("Cadastrar gato");
                        System.out.println("Digite o nome de gato: ");
                        nome = in.nextLine();
                        System.out.println("Diggite o peso do gato");
                        peso = in.nextDouble();
                        System.out.println("Didite a idade do gato");
                        idade = in.nextInt();

                        cat1 = new Gato (nome,peso,idade);
                        System.out.println(cat1);

                        break;

                case 5: System.out.println("Cadastrar cachorro");
                        System.out.println("Digite o nome do cachorro: ");
                        nome = in.nextLine();
                        System.out.println("Diggite o peso do cachorro");
                        peso = in.nextDouble();
                        System.out.println("Didite a idade do cachorro");
                        idade = in.nextInt();

                        dog1 = new Cachorro (nome,peso,idade);
                        System.out.println(dog1);
                        
                        break;

                case 6: System.out.println("");
                        break;
                case 7: System.out.println("");
                        break;
                case 8: System.out.println("");
                        break;
                case 0: System.out.println("Bye Bye !!");
                default: System.out.println("Voce digitou uma opcao errada");
                        break;
            }
        }while (op != 0);
     in.close();   
    }
    public static void exibirMenu(){
        System.out.println("1 - Cadastrar Cliente");
        System.out.println("2 - Cadastrar Funcionário");
        System.out.println("3 - Fazer Servico de banho e/ou tosa");
        System.out.println("4 - ");
        System.out.println("5 - ");
        System.out.println("6 - ");
        System.out.println("7 - ");
        System.out.println("8 - ");
        System.out.println("0 - Sair do programa");
    }
}

