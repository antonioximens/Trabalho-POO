package service;

import java.util.ArrayList;

import domain.Funcionario;
import repository.FuncionarioRepo;

public class FuncionarioService extends BaseService<Funcionario> {
    private FuncionarioRepo funcionarioRepo;

    public FuncionarioService(){
        super();
        this.funcionarioRepo = new FuncionarioRepo();
    }
    @Override
    public ArrayList<Funcionario> LerTodos() {
        return this.funcionarioRepo.ReadAll();
    }

    @Override
    public Funcionario Ler(int codigo) {
        return this.funcionarioRepo.Read(codigo);
    }

    @Override
    public Funcionario Criar(Funcionario obj) {
        return this.funcionarioRepo.Create(obj);
    }

    @Override
    public Funcionario Atualizar(Funcionario obj) {
       return this.funcionarioRepo.Update(obj);
    }

    @Override
    public Funcionario Deletar(int codigo) {
       return this.funcionarioRepo.Delete(codigo);
    }
    
}
