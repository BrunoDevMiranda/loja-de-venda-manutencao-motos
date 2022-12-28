package sistema.dominio;

import sistema.dominio.funcionario.Gerente;
import sistema.dominio.funcionario.Gerente2;
import sistema.dominio.funcionario.Vendedor;
import sistema.dominio.funcionario.Vendedor2;

import java.util.Scanner;

public class Controlle {

    private Moto moto;
    private int vendaSenha = 1234;
    private double valorMoto;
    private double valorPagoCliente;

    private double troco;





        public void liberaVenda (Gerente gerente){

            boolean liberou = gerente.liberarVenda(this.vendaSenha);

            if (liberou && (getValorMoto() == getValorPagoCliente())) {
                System.out.println("Venda Liberada");
            } else {
                System.out.println("Venda Não foi autorizada");
            }
        }

        public void vendaEfetuda (Vendedor vendedor){

            boolean venda = true;

            if (venda == (getValorMoto() == getValorPagoCliente())) {
                System.out.println("Venda Efetuada");

            } else {
                System.out.println("Venda não pode ser concluida");
            }

        }


    public void liberaVenda (Gerente2 gerente) {

        boolean liberou = gerente.liberarVenda(this.vendaSenha);

        if (liberou == true) {
            System.out.println("Autorizado Pelo Gerente");
            if (getValorMoto() <= getValorPagoCliente()) {
                System.out.println("Autorizado Pelo Sistema");
            }else {
                System.out.println("Sistema não autorizou a compra");
                System.out.println("Procure o Gerente");
            }

        }

    }



    public void autorizado (Vendedor2 vendedor){


        System.out.println("Gerente autorizou a venda? ");
        System.out.println("Digite 1 para SIM");
        System.out.println("Digite 2 para Não");


        Scanner scanner = new Scanner(System.in);

        int autorizou = scanner.nextInt();

        if (autorizou == 1) {
            System.out.println("Seguir com a Venda");
        } else {
            System.out.println("Venda não pode ser concluida");
        }

    }













    public Moto getMoto() {
        return moto;
    }

    public void setMoto(Moto moto) {
        this.moto = moto;
    }

    public int getVenda() {
        return vendaSenha;
    }

    public void setVenda(int venda) {
        this.vendaSenha = venda;
    }

    public double getValorMoto() {
        return valorMoto;
    }

    public void setValorMoto(double valorMoto) {
        this.valorMoto = valorMoto;
    }

    public double getValorPagoCliente() {
        return valorPagoCliente;
    }

    public void setValorPagoCliente(double valorPagoCliente) {
        this.valorPagoCliente = valorPagoCliente;
    }
}
