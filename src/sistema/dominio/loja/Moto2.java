package sistema.dominio;



import java.math.BigDecimal;
import java.math.RoundingMode;


public class Moto2 {

    private BigDecimal toBigDecimal(String valor) {
        try {
            return new BigDecimal(valor).setScale(2, RoundingMode.HALF_EVEN);
        } catch (Exception ex) {
            return BigDecimal.ZERO;
        }
    }

    private String moto;
    private double valor;

    private double comissaVenda = 0.3;


    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getMoto() {
        return moto;
    }

    public void setMoto(String moto) {
        this.moto = moto;
    }

    public void setComissaVenda(double comissaVenda) {
        this.comissaVenda = comissaVenda;
    }

    public void setBonus(double bonus) {
    }

    public double getComissaVenda() {
        return comissaVenda;
    }

    public double getBonus() {

        return this.valor * (this.comissaVenda / 100);

    }

    public double getValor() {
        return valor;


    }


}



