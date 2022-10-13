import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {
    private int id, idade;
    private String nome, telefone;
    private ArrayList<Cliente> clientes;//cliente é, denominado arrey liste de clientes

    Cliente(){//construtor
         clientes = new ArrayList<Cliente>();//ler cliente de arrey liste e passa para cliente sem parametro
    }
    //funcao para cliente, set privado
    Cliente(int id, int idade, String nome, String telefone){
        this.setId(id);
        this.setNome(nome);
        this.setTelefone(telefone);
        this.setIdade(idade);
    }
    //funcao para adicionar cliente
    public void adicionaCliente(Cliente cliente){//1° arrey liste 2° criado
        if (clientes != null){
            clientes.add(cliente);//chamar instancia e adicionar 
        }else{
            System.out.println("Cliente invalido!");
        }
    }
    //imprimir arrayliste
    public void imprimirArrayListe(){
        if(clientes.size() > 0){ // size numero de elementos no arrey
            System.out.println("Clientes Cadastrado(s)");
            for (Cliente Cliente : clientes) {
                System.out.println(Cliente);
            }
        }else{
            System.out.println("Array de Clientes vazio!");
        }
    }

    public boolean verificarId(Scanner leitor, Cliente cliente){
        System.out.println("Id do cliente: ");
        int id = leitor.nextInt();
        if(id > 0){
          System.out.println("Nome do cliente: ");
          String nome = leitor.next();
          leitor.nextLine();

          System.out.println("Idade do cliente: ");
          int idade = leitor.nextInt();
            
          System.out.println("Telefone do cliente: ");
          String telefone = leitor.next();
          leitor.nextLine();

          cliente.adicionaCliente(new Cliente(id, idade, nome, telefone));
          return true;
        }else{
            System.out.println("ID invalido");
            return false;
        }
    } 

    public int tamanhoArrayCliente(){
        return clientes.size();
    }

    public void setId(int id){
        this.id = id;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setTelefone(String telefonee){
        this.telefone = telefonee;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdade(){
        return this.idade;
    }

    public String getTelefone(){
        return this.telefone;
    }

    public String getNome(){
        return this.nome;
    }

    public int getId(){
        return this.id;
    }

    public String toString() {
        return "ID: "+ this.getId() + "\n" +
               "Nome: " + this.getNome() + "\n" +
               "Idade: "+ this.getIdade() + "\n" +
               "Telefone: " + this.getTelefone();
    }
}