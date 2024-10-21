package fakedb;

import java.util.ArrayList;

import domain.Cliente;

public class ClienteFakeDB extends BaseFakeDB<Cliente> {

    // implementando o metodo do pai
    @Override
    void preencherDados() {
        // instanciando a tabela do pai para se torna uma lista de Cliente
        // a tabela pega dod pai e o array smp generico e com ()
        this.tabela = new ArrayList<Cliente>();

        // instanciando a Cliente para preencher
        // e usando o add para alocar a instacia logo fica
        // this.tabela(do pai).add(instancia aqui dentro)
        this.tabela.add(new Cliente(1, "Antônio", "antonio@email.com", "(67)981305611", "100.973.120-15"));
        this.tabela.add(new Cliente(2, "Maria Eduarda", "maria.eduarda@email.com", "(67)991376495", "091.779.842-90"));
        this.tabela.add(new Cliente(3, "Felipe", "felipe@email.com", "(67)999208065", "079.820.412-91"));
        this.tabela.add(new Cliente(4, "Júlia", "julia@email.com", "(67)998260120", "080.771.243-70"));
        this.tabela.add(new Cliente(5, "Lohanna", "lohannao@email.com", "(67)99170589631", "001.745.398-02"));
    }

    //criando um contructor
    public ClienteFakeDB(){
        super();
    }    
}
