package service;

import java.util.ArrayList;

import domain.Cliente;
import repository.ClienteRepo;

public class ClienteService extends BaseService<Cliente>{
    private ClienteRepo clienteRepo;

    public ClienteService(){
        super();
        // chamando o repo com this para pode usar os metodos do crud
        // caso na ofaça essa inicialização ele da um erro

        this.clienteRepo = new ClienteRepo();

    }
    @Override
    public ArrayList<Cliente> LerTodos() {
        return this.clienteRepo.ReadAll();
    }

    @Override
    public Cliente Ler(int codigo) {
        return this.clienteRepo.Read(codigo);
    }

    @Override
    public Cliente Criar(Cliente obj) {
        return this.clienteRepo.Create(obj);
    }

    @Override
    public Cliente Atualizar(Cliente obj) {
       return this.clienteRepo.Update(obj);
    }

    @Override
    public Cliente Deletar(int codigo) {
        return this.clienteRepo.Delete(codigo);
    }
    
}
