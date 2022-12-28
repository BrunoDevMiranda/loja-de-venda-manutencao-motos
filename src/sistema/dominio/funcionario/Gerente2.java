package sistema.dominio.funcionario;



public class Gerente extends Funcionario {


    private int totalComissao ;

    private int motosVendidas;

    private int senha = 1234;


    public Gerente(String nome, String cpf, String endereco, int idade, int matricula, double salario) {
        super(nome, cpf, endereco, idade, matricula, salario);

    }

    public boolean liberarVenda(int senha){
        if (this.senha == senha){
            return true;
        }else {
            return false;
        }
    }





    @Override
    public double getComissao() {
        return this.comissao ;
    }

    @Override
    public void setComissao(double comissao) {
        this.comissao = comissao;
    }



    public void setMotosVendidas(int motosVendidas) {
        this.motosVendidas = motosVendidas;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public void imprimiGerente() {




        for (int i = 0; i < motosVendidas; i++) {
            totalComissao += motosVendidas + 100;
        }

        double total = this.getSalario() + this.getComissao() + totalComissao;

        System.out.println("Nome : " + this.getNome());
        System.out.println("Endereço : " + this.getEndereco());
        System.out.println("CPF : " + this.getCpf());
        System.out.println("Idade : " + this.getIdade());
        System.out.println("Matricula : " + this.getMatricula());
        System.out.println("Salario :" + this.getSalario());


    }

    public void condition(){
        System.out.println("Valor pago pelo cliente foi : "+getValorPago());
        System.out.println("###############################################################################" +
                "###################################");
        System.out.println("Moto escolhida pelo cliente :" + getMoto()+"  #");
        System.out.println("###############################################################################" +
                "###################################");
    }




    }


