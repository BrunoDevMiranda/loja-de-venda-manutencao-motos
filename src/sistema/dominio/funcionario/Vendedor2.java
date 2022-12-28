package sistema.dominio.funcionario;



public class Vendedor2 extends Funcionario2{


    private int motosVendidas;

    private double totalComissao;





    public void condicao(){

        System.out.println("Comissão por venda foi de R$b " + this.getComissao());
        System.out.println("Bonus por venda foi de R$" + 50);



    }


    public int getMotosVendidas() {
        return motosVendidas;
    }

    public double getTotalComissao() {
        return totalComissao;
    }

    public void setTotalComissao(double totalComissao) {
        this.totalComissao = totalComissao;
    }

    public void setMotosVendidas(int motosVendidas) {
        this.motosVendidas = motosVendidas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }


}
