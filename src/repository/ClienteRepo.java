package repository;

import domain.Cliente;
import fakedb.ClienteFakeDB;

public class ClienteRepo extends BaseRepository<Cliente>{
    // criando um atributo para acessar o bancoFAkeDB
    private ClienteFakeDB db;

    public ClienteRepo(){
        super();
        // garantindo que a lista seja criada
        this.db = new ClienteFakeDB();

        // criando para guardar em fonte de dados
        this.fonteDeDados = this.db.getTabela();
    }

    @Override
    public Cliente Create(Cliente instancia) {
        // criando uma proxChave para instancia
        int proxChave = this.fonteDeDados.getLast().getCodigo() +1;

        // setando o codigo com o setter
        instancia.setCodigo(proxChave);
        // pegando a fonte de dados para add dentro da lista
        this.fonteDeDados.add(instancia);
        //retornando a instancia
        return instancia;
    }

    @Override
    public Cliente Read(int codigo) {
        // algoritmo de busca
        // type | nome qualquer | onde vmos olhar ou buscar
        for (Cliente cliente : fonteDeDados) {
            // fazendo comparação com a chave
            // verificando se encontra
            if(cliente.getCodigo() == codigo){
                return cliente;
            }
        }
        // se não, ele retorna null
        return null;
    }

    @Override
    public Cliente Update(Cliente instancia) {
        // verificando se encontra o objt
        Cliente cliente = this.Read(instancia.getCodigo());

        // caso encontrar, ele atualiza
        if(cliente != null){
            cliente.setCpf(instancia.getCpf());
            cliente.setNome(instancia.getNome());
            cliente.setEmail(instancia.getEmail());
            cliente.setTelefone(instancia.getTelefone());

            // retornando
            return cliente;
        }
        return null;
    }

    @Override
    public Cliente Delete(int codigo) {
        // verificando se encontra o objt
        Cliente cliente = this.Read(codigo);

        // tentando achar o objt para deletar
        if(cliente != null){
            // apos achar remove
            this.fonteDeDados.remove(cliente);
            // retorna e verifica se é esse que o usuario queria apagar
            return cliente;
        } else {
            return null;
        }
    }

}
