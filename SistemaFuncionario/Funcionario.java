package SistemaFuncionario;

public class Funcionario {
    protected String nome;
    protected String cpf;
    protected String salario;
    private String cargo;

    public String Funcionario;

    public Funcionario(String nome, String cpf, String salario, String cargo, String funcionario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.cargo = cargo;
        Funcionario = funcionario;
    }

    public double bonificacao(double salario) {

        salario = salario * 0.1;

        return salario;
    }
}


