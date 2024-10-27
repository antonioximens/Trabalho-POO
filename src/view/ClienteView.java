package view;

import java.util.ArrayList;

import domain.Cliente;
import service.ClienteService;

public class ClienteView extends BaseView {

    private ClienteService srv;

    // condição de parada try.catch
    //private boolean condicaoParada = true;

    public ClienteView(){
        super();
        this.srv = new ClienteService();
    }
    
    // executando o tratamento de erro
    //while(condicaoParada != false){
        //menu
    //}

    // implementando os metodos do pai 
    @Override
    public void ExibirMenu() {
       // criando uma opcao
       int op = 0;

       // criando uma repetiçao para executar o menu
       while(op != 9){

            // passando a lista do menu e coloando o limpa console
            Util.ClearConsole();
            System.out.println("Classe Cliente: ");
            System.out.println("Menu de Opções");
            System.out.println("1- Listar");
            System.out.println("2- Localizar");
            System.out.println("3- Adicionar");
            System.out.println("4- Atualizar");
            System.out.println("5- Remover");
            System.out.println("9- Sair");
            
            // chamando a op para ser lida
            op = this.scanner.nextInt();

            // logo cria um switch case para olhar as opcoesss
            switch (op) {
                // opcao de listar as classes
                case 1:
                    // chamando com o this o metodo que esta no pai e implementado qui
                    this.Listar();
                    break;
                case 2:
                    // chamando com o this o metodo que esta no pai e implementado qui
                    this.Localizar();
                    break;
                    case 3:
                    // chamando com o this o metodo que esta no pai e implementado qui
                    this.Adicionar();
                    break;
                    case 4:
                    // chamando com o this o metodo que esta no pai e implementado qui
                    this.Atualizar();
                    break;
                    case 5:
                    // chamndo com o this o metodo que esta no pai e implementado qui
                    this.Remover();
                    break;
                    case 9:
                    System.out.println("Encerrando Sistema\nSaindo...");
                    break;
            
                default:
                System.out.println("Opção invalida!");
                    break;
            }
       }
    }

    @Override
    public void Listar() {
        // metodo listar, antes tem que add o limpa console
        Util.ClearConsole();
        System.out.println("Listando...\n");
        
        // declarando o ArrayList para percorrer a lista e seu tipo
        // que recebe srv pois ele faz o caminho
        ArrayList<Cliente> lista = this.srv.LerTodos();
        for (Cliente cliente : lista) {
            this.ImprimirEmLinha(cliente);
        } 

        // msg para o usuario clicar no enter e usando dois netxLine para nao dar bug
        // quanndo for digitar
        System.out.println("Clique <ENTER> para continuar...");
        this.scanner.nextLine();
        this.scanner.nextLine();
    }

    @Override
    public void Localizar() {
       // metodo localizar, antes tem que add o limpa console
       Util.ClearConsole();
       System.out.println("Localizando...");

       // pegando o id para saber qual objto achar
       System.out.println("Informe o código do Cliente: ");
       int codigo = this.scanner.nextInt();

       // Chamando a classe cliente o metodo ler para achar item especifico
       Cliente cliente = this.srv.Ler(codigo);

       // verificando se encontrou o item
       if( cliente != null){
        // se encontrou ele retorna o obj
            this.ImprimirEmLinha(cliente);
       } else {
        // se nao ele mostra a msg de erro
            System.out.println("Problema: - Classe Cliente não encontrada.");
       }
       
       // msg para o usuario clicar no enter e usando dois netxLine para nao dar bug
       // quanndo for digitar
       System.out.println("Clique <ENTER> para continuar...");
       this.scanner.nextLine();
       this.scanner.nextLine();

    }

    @Override
    public void Adicionar() {
       // metodo adicionar, antes tem que add o limpa console
       Util.ClearConsole();
       scanner.nextLine(); // Limpa o buffer do scanner
       System.out.println("Adicionando...");

       // adicionando a descrição da classe produto
       System.out.println("Informe o CPF do cliente: ");
       String cpf = scanner.nextLine();
       System.out.println("Informe o Nome do cliente: ");
       String nome = scanner.nextLine();
       System.out.println("Informe o Email do cliente: ");
       String email = scanner.nextLine();
       System.out.println("Informe o Telefone do cliente: ");
       String telefone = scanner.nextLine();

       // instanciando um novo objt da classe cliente
       Cliente cliente = new Cliente();
       cliente.setCodigo(0);
       cliente.setCpf(cpf);
       cliente.setNome(nome);
       cliente.setEmail(email);
       cliente.setTelefone(telefone);

       Cliente clienteNovo = this.srv.Criar(cliente);
       if(clienteNovo != null) {
        System.out.println("Classe de Cliente adicionada com sucesso");
       } else {
        System.out.println("Problema - Classe de Cliente não foi adicionada");
       }

       // criando s nextLine para evitar bug
       System.out.println("Clique <ENTER> para continuar...");
       this.scanner.nextLine();
       this.scanner.nextLine();
       
    }    
    
    @Override
    public void Atualizar() {
        // metodo atualizar, antes tem que add o limpa console
        Util.ClearConsole();
        System.out.println("Atualizando....");

        System.out.println("Informe o código do Cliente: ");
        int codigo = this.scanner.nextInt();
        scanner.nextLine(); // Consome a nova linha deixada pelo nextInt()

        Cliente cliente = this.srv.Ler(codigo);

        if(cliente != null){

            System.out.println("Informe o CPF do cliente: ");
            String cpf = scanner.nextLine();

            System.out.println("Informe o Nome do cliente: ");
            String nome = scanner.nextLine();

            System.out.println("Informe o Email do cliente: ");
            String email = scanner.nextLine();

            System.out.println("Informe o Telefone do cliente: ");
            String telefone = scanner.nextLine();

            cliente.setCpf(cpf);
            cliente.setNome(nome);
            cliente.setEmail(email);
            cliente.setTelefone(telefone);

            if(this.srv.Atualizar(cliente) != null){
                System.out.println("Classe de Cliente atualizada com sucesso");
            } else {
                System.out.println("Problema - Classe de Cliente não foi atualizada");
            }
        } else {
            System.out.println("Problema - Classe de Cliente não foi encontrada");
        }

        System.out.println("Clique <ENTER> para continuar...");
        this.scanner.nextLine();
        
    }

    @Override
    public void Remover() {
        // metodo Remover, antes tem que add o limpa console
        Util.ClearConsole();
        System.out.println("Removendo....");

        // pegar o numero do id para remover
        System.out.println("Informe o código do cliente: ");
        int codigo = this.scanner.nextInt();

        // verificando se existe o codigo informado
        Cliente cliente = this.srv.Ler(codigo);

        // devolvendo e removnedo o objt
        if(cliente != null){
            if(this.srv.Deletar(codigo) != null){
                System.out.println("Cliente removido com sucesso");
            } else {
                System.out.println("Problema - Classe de Cliente não foi removida");
            }
        } else {
            System.out.println("Problema - Classe de Cliente não foi encontrada");
        }
    }

    // metodo de imprimir lista
    private void ImprimirEmLinha(Cliente cliente){
        String msg = "Classe de Cliente - ";
        msg += "Código: " + cliente.getCodigo() + " | ";
        msg += "CPF: " + cliente.getCpf() + " | ";
        msg += "Nome: " + cliente.getNome() + " | ";
        msg += "Email: " + cliente.getEmail() + " | ";
        msg += "Telefone: " + cliente.getTelefone();
        System.out.println(msg);
    }    
}