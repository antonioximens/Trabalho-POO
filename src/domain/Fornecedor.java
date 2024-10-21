package domain;

public class Fornecedor extends BaseParametro {
    // atributos da filha smp privado
    private String razaoSocial;
    private String cnpj;
    
    // gerando os getters e setters
    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    // gerando os constructors
    public Fornecedor() {
        // boas praticas
        super();
    }

    // constructor com params
    public Fornecedor(int codigo, String nome, String email, String telefone, String razaoSocial, String cnpj) {
        super(codigo, nome, email, telefone);
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
    }
    
    
    
}
