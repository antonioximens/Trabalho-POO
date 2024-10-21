package fakedb;

import java.util.ArrayList;

import domain.Funcionario;

public class FuncionarioFakeDB extends BaseFakeDB<Funcionario> {

    @Override
    void preencherDados() {
        // criando uma lista de funcionario
        this.tabela = new ArrayList<Funcionario>();

        // adicionando um instancia de funcionario dentro de tabela
        this.tabela.add(new Funcionario(1, "Nehde", "nehde@email.com", "(97) 991804320", "Secretária", 1400.50));
        this.tabela.add(new Funcionario(2, "Carlos", "carlos@email.com", "(97) 998822664", "Gerente Finanças", 3500.50));
        this.tabela.add(new Funcionario(3, "Miguel", "miguel@email.com", "(97) 991405147", "Serviço Geral", 2200.30));
        this.tabela.add(new Funcionario(4, "Leticia", "leticia@email.com", "(97) 991987220", "Designer", 1100.50));
        this.tabela.add(new Funcionario(5, "Valfrido", "valfrido@email.com", "(97) 998041290", "Gerente de Projeto", 15000.50));
    }

    // criando o constructor
    public FuncionarioFakeDB(){
        super();
    }
    
}
