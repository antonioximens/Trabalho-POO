package service;

import java.util.ArrayList;

import domain.Fornecedor;
import repository.FornecedorRepo;

public class FornecedorService extends BaseService<Fornecedor> {

    private FornecedorRepo fornecedorRepo;

    public FornecedorService(){
        super();

        this.fornecedorRepo = new FornecedorRepo();
    }
    @Override
    public ArrayList<Fornecedor> LerTodos() {
        return this.fornecedorRepo.ReadAll();
    }

    @Override
    public Fornecedor Ler(int codigo) {
        return this.fornecedorRepo.Read(codigo);
    }

    @Override
    public Fornecedor Criar(Fornecedor obj) {
        return this.fornecedorRepo.Create(obj);
    }

    @Override
    public Fornecedor Atualizar(Fornecedor obj) {
        return this.fornecedorRepo.Update(obj);
    }

    @Override
    public Fornecedor Deletar(int codigo) {
        return this.fornecedorRepo.Delete(codigo);
    }
    
}
