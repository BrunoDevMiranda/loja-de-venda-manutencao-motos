package sistema.dominio.funcionario;

import sistema.dominio.Moto;
import sistema.dominio.Pessoa;
import sistema.dominio.Pessoa2;

public abstract class Funcionario2 extends Pessoa2 {


    protected int matricula;
    protected double salario;

    protected double comissao;

    private double valorPago;

    public Moto[] motos;




    public double getComissao() {

        return comissao ;
    }


    public Moto[] getMotos() {
        return motos;
    }

    public void setMotos(Moto[] motos) {
        this.motos = motos;
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
