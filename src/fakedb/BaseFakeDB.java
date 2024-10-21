package fakedb;

import java.util.ArrayList;

// classe abstrata do fake Pai 
// usando generic
public abstract class BaseFakeDB<TDominio> {
    // criando um ArrayList para armazerna dados genericos
    // TDominio sempre vem depois do ArrayList
    // atributo protegido
    protected ArrayList<TDominio> tabela;

    // pegando o get, pois é classe abstrata. Logo nao se seta valores
    public ArrayList<TDominio> getTabela() {
        return tabela;
    }

    // metodo abstrato
    abstract void preencherDados();

    // criando um constructor
    // todas vez que chamar essa classe vai ser executado o preencherDados
    public BaseFakeDB(){
        this.preencherDados();
    }
}
