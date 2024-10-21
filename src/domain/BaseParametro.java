package domain;

public class BaseParametro {
    // criando as propriedades
    // para ser utilizado para classes filhos
    protected int codigo;
    protected String nome;
    protected String email;
    protected String telefone;
    
    // gerando os getter e setters para as filhas fazerem alterações e ler os valores

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // criando os constructor vazio e com parametros
    public BaseParametro() {
    }
    
    // constructor com parametros
    public BaseParametro(int codigo, String nome, String email, String telefone) {
        this.codigo = codigo;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }
    

}
