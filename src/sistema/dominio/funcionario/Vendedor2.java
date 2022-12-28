package sistema.dominio.funcionario;



public class Vendedor extends Funcionario{


    private int motosVendidas;


    public Vendedor(String nome, String cpf, String endereco, int idade, int matricula, double salario) {
        super(nome, cpf, endereco, idade, matricula, salario);

    }


    public void imprimiVendedor() {

        double total = this.getSalario() + this.getComissao();

        System.out.println("Nome : " + this.getNome());
        System.out.println("Endereço : " + this.getEndereco());
        System.out.println("CPF : " + this.getCpf());
        System.out.println("Idade : " + this.getIdade());
        System.out.println("Matricula : " + this.getMatricula());
        System.out.println("Salario :" + this.getSalario());


    }

    public void condition(){
        System.out.println("Valor pago pelo cliente foi : "+getValorPago());
        System.out.println("#########################################################");
        System.out.println("Moto escolhida pelo cliente :" + getMoto());
        System.out.println("#########################################################");
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
