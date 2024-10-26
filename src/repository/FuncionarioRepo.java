package repository;

import domain.Funcionario;
import fakedb.FuncionarioFakeDB;

public class FuncionarioRepo extends BaseRepository<Funcionario>{

    // criando uma ligação com fakeDB
    private FuncionarioFakeDB db;

    // gerando um constrcutor 
    public FuncionarioRepo(){
        super();
        // instanciou a classe banco de dados
        this.db = new FuncionarioFakeDB();

        // criando uma lista de Funcinario
        this.fonteDeDados = this.db.getTabela();
    }
    
    @Override
    public Funcionario Create(Funcionario instancia) {
        // criando uma proxChave para instancia
        int proxChave = this.fonteDeDados.getLast().getCodigo() + 1;

         // setando o codigo com o setter
        instancia.setCodigo(proxChave);
        
        // pegando a fonte de dados para add dentro da lista
        this.fonteDeDados.add(instancia);
        // retornando instancia
        return instancia;
    }

    @Override
    public Funcionario Read(int codigo) {
        // alogritmo de busca
        // criando uma busca com for each
        for (Funcionario funcionario : this.fonteDeDados) {
            
            if(funcionario.getCodigo() == codigo){
                return funcionario;
            }
        }
        return null;
    }

    @Override
    public Funcionario Update(Funcionario instancia) {
        Funcionario funcionario = this.Read(instancia.getCodigo());

        if(funcionario != null){
            // settando os valores
            funcionario.setNome(instancia.getNome());
            funcionario.setEmail(instancia.getEmail());
            funcionario.setTelefone(instancia.getTelefone());
            funcionario.setCargo(instancia.getCargo());
            funcionario.setSalario(instancia.getSalario());

            return funcionario;
        }
        return null;
    }

    @Override
    public Funcionario Delete(int codigo) {
        // verificando se encontra o objt
        Funcionario funcionario = this.Read(codigo);

        // tentando achar o objt para deletar
        if(funcionario != null){

             // apos achar remove
            this.fonteDeDados.remove(funcionario);
            // retorna e verifica se é esse que o usuario queria apagar
            return funcionario;
        } else {
            return null;
        }
    }
    
}
