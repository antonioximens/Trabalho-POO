package domain;

public class Funcionario extends BaseParametro{
        // atributos da filha smp privado
        private String cargo;
        private double salario;
        
        // gerando os getters e setters
        public String getCargo() {
            return cargo;
        }
        public void setCargo(String cargo) {
            this.cargo = cargo;
        }
        public double getSalrio() {
            return salario;
        }
        public void setSalrio(double salario) {
            this.salario = salario;
        }

        // gerando os constructors
        public Funcionario() {
            super();
        }

        // constructor com params
        public Funcionario(int codigo, String nome, String email, String telefone, String cargo, double salario) {
            super(codigo, nome, email, telefone);
            this.cargo = cargo;
            this.salario = salario;
        }

}
