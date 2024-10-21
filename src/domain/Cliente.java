package domain;

// extends de uma base Pai
public class Cliente extends BaseParametro {
    // atributos da filha smp privado
    private String cpf;

    // gerando os getter e setters
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // gerando os constructor
    public Cliente() {
        // boas praticas
        super();
    }

    // constructor com params
    public Cliente(int codigo, String nome, String email, String telefone, String cpf) {
        super(codigo, nome, email, telefone);
        this.cpf = cpf;
    }    
}
