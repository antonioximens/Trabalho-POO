package fakedb;

import java.util.ArrayList;

import domain.Fornecedor;

public class FornecedorFakeDB extends BaseFakeDB<Fornecedor> {

    @Override
    void preencherDados() {
        // instnaciando a tabela e criando uma lista de fornecedor
        this.tabela = new ArrayList<Fornecedor>();

        // adicionado dentro da tabela
        this.tabela.add(new Fornecedor(1, "Real Cesta", "real.cesta@email.com", "(67) 33658941", "Real Cesta LTDA", "01.045.847.0001-30"));
        this.tabela.add(new Fornecedor(2, "Inova", "inoca@email.com", "(67) 33194762", "Inova Tech LTDA", "20.346.216.0001-21"));
        this.tabela.add(new Fornecedor(3, "Laucher Games", "laucher.game@email.com", "(67) 33248019", "Laucher Games LTDA", "44.019.613.0001-51"));
        this.tabela.add(new Fornecedor(4, "Vitória Transportes", "transporte.vitoria@email.com", "(67) 33100914", "Vitória Transporte LTDA", "01.045.847.0001-63"));
        this.tabela.add(new Fornecedor(5, "Kitudes Doces", "kitudes@email.com", "(67) 33368791", "Kitudes Doces LTDA", "31.456.812.0001-71"));
    }

    // criando um constructor
    public FornecedorFakeDB(){
        super();
    }
    
}
