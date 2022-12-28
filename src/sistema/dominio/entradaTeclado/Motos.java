package sistema.test;

import java.math.BigDecimal;

public class Motos {

   private String moto;
   private double valorMoto;
   private double valorDepositado;

   private int senha = 1234;



    public String getMoto() {
        return moto;
    }

    public void setMoto(String moto) {
        this.moto = moto;
    }

    public double getValorMoto() {
        return valorMoto;
    }

    public void setValorMoto(double valorMoto) {
        this.valorMoto = valorMoto;
    }

    public double getValorDepositado() {
        return valorDepositado;
    }

    public void setValorDepositado(double valorDepositado) {
        this.valorDepositado = valorDepositado;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
}
