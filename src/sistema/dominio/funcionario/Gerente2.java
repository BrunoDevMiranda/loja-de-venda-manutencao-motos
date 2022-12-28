package sistema.dominio.funcionario;



public class Gerente2 extends Funcionario2 {


    private double totalComissao ;

    private double bonus;

    private int senha = 1234;


    public double getTotalComissao() {
        return totalComissao ;
    }

    public void setTotalComissao(double totalComissao) {
        this.totalComissao = totalComissao;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public boolean liberarVenda(int senha){
        if (this.senha == senha){
            return true;
        }else {
            return false;
        }
    }



    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public void condicao(){

        System.out.println("Comissão por venda foi de R$ " + this.getComissao());
        System.out.println("Bonus por venda foi de R$ " + 150);



    }








    }


