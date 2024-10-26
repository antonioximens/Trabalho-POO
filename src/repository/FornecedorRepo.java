package repository;

import domain.Fornecedor;
import fakedb.FornecedorFakeDB;

public class FornecedorRepo extends BaseRepository<Fornecedor> {
    // criando um ligação com fakeDB
    private FornecedorFakeDB db;

    // criando o constructor 
    public FornecedorRepo(){
        // instanciando db
        this.db = new FornecedorFakeDB();
        // criando uam ligação com fonteDeDados
        this.fonteDeDados = this.db.getTabela();
    }
    @Override
    public Fornecedor Create(Fornecedor instancia) {
        // criando uma proxChave para instancia
        int proxChave = this.fonteDeDados.getLast().getCodigo() +1;

        // setando o codigo com o setter
        instancia.setCodigo(proxChave);
        // pegando a fonte de dados para add dentro da lista
        this.fonteDeDados.add(instancia);

        // retirnando o objt
        return instancia;
    }

    @Override
    public Fornecedor Read(int codigo) {
        // algoritmo de busca
        // type | nome qualquer | onde vmos olhar ou buscar
        for (Fornecedor fornecedor : fonteDeDados) {
            // fazendo comparação com a chave
            // verificando se encontra
            if(fornecedor.getCodigo() == codigo){
                return fornecedor;
            }    
        }
        // se não, ele retorna null
        return null;
    }

    @Override
    public Fornecedor Update(Fornecedor instancia) {
        Fornecedor fornecedor = this.Read(instancia.getCodigo());

        if(fornecedor != null){
            fornecedor.setCnpj(instancia.getCnpj());
            fornecedor.setNome(instancia.getNome());
            fornecedor.setEmail(instancia.getEmail());
            fornecedor.setTelefone(instancia.getTelefone());

            return fornecedor;
        }
        return null;
    }

    @Override
    public Fornecedor Delete(int codigo) {
        // verificando se encontra o objt
        Fornecedor fornecedor = this.Read(codigo);

        // tentando achar o objt para deletar
        if(fornecedor != null){
            // apos achar remove
            this.fonteDeDados.remove(fornecedor);

            // retorna e verifica se é esse que o usuario queria apagar
            return fornecedor;
        }
        return null;
    }
    
}
