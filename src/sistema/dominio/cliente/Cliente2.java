package sistema.dominio.cliente;

import sistema.dominio.Pessoa;
import sistema.dominio.Pessoa2;

public class Cliente2 extends Pessoa2 {

    private String codigoCliente;

    private double valorPago;


    public void imprimiCliente(){

            System.out.println("Nome : "+ this.getNome());
            System.out.println("Endereço : "+ this.getEndereco());
            System.out.println("CPF : "+ this.getCpf());
            System.out.println("Idade : "+ this.getIdade());
            System.out.println("Codigo do Cliente : "+ this.getCodigoCliente());
        System.out.println("#########################################################");
            System.out.println("Valor pago pelo cliente foi : "+this.valorPago);
            System.out.println("Moto escolhida pelo cliente :" + getMoto());
        System.out.println("#########################################################");

        }


    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }



    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }
}
