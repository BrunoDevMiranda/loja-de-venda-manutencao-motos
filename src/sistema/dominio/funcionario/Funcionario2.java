package sistema.dominio.funcionario;

import sistema.dominio.Moto;
import sistema.dominio.Pessoa;

public abstract class Funcionario extends Pessoa {


    protected int matricula;
    protected double salario;

    protected double comissao;

    private double valorPago;

    public Moto[] motos;


    public Funcionario(String nome, String cpf, String endereco, int idade, int matricula, double salario) {
        super(nome, cpf, endereco, idade);
        this.matricula = matricula;
        this.salario = salario;
        this.comissao = comissao;
    }

    public Funcionario(String nome, String cpf, String endereco, int idade, Moto[] motos) {
        super(nome, cpf, endereco, idade);
        this.motos = motos;
    }

    public double getComissao() {

        return comissao ;
    }


    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
