package service;

import java.util.ArrayList;

public abstract class BaseService<TDominio>{
    // crud: Create, Read,  ReadALL, update e delete ;

    // ReadAll é um metodo publico abstrato com uma lista de TDominio que percorre toda 
    // a lista
    public abstract ArrayList<TDominio> LerTodos();
    // ler algum item especifico precisa mostrar a chave que é dele
    public abstract TDominio Ler(int codigo);
    public abstract TDominio Criar(TDominio obj);
    public abstract TDominio Atualizar(TDominio obj);
    public abstract TDominio Deletar(int codigo);
}
