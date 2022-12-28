package sistema.test;

import sistema.dominio.Moto;
import sistema.dominio.funcionario.Gerente;


import java.util.Scanner;

public class test {
    public static void main(String[] args) {


        Scanner cadastroMoto = new Scanner(System.in);
        Scanner cadastroCliente = new Scanner(System.in);
        Scanner cadastroVendedor = new Scanner(System.in);
        Scanner cadastroGerente = new Scanner(System.in);

        Motos motos = new Motos();






        System.out.println("---------------- |  |  CADASTRO DE COMPRA  |  |-----------------------------");




                System.out.println("-----------------------------MOTOS-----------------------------------------");


                System.out.println("Digite a Marca da moto");
                System.out.println(" Digite 1 - Honda");
                System.out.println(" Digite 2 - Yamaha");
                System.out.println(" Digite 3 - BMW");

                int marca = cadastroMoto.nextInt();


                if (marca == 1) {
                    System.out.println("Marca Honda");
                    System.out.println("Escolha o Modelo");
                    System.out.println("-- YRE 190 - Digite -|1|");
                    System.out.println("-- Gl1800 - Digite - |2|");
                    int modelo = cadastroMoto.nextInt();
                    if (modelo == 1) {

                        motos.setValorMoto(19000);

                        System.out.println("Moto Escolhida foi Honda XRE 190, 2022 Aventure - Valor R$ 19.000");
                        motos.setMoto("Moto Escolhida foi Honda XRE 190, 2022 Aventure - Valor R$ 19.000");
                    } else {
                        motos.setValorMoto(219000);
                        System.out.println("Moto Escolhida foi Honda Gl1800, 2022 Touring - Valor R$ 219.000");
                        motos.setMoto("Moto Escolhida foi Honda XRE 190, 2022 Aventure - Valor R$ 19.000");

                    }


                }else if (marca == 2) {

                    System.out.println("Marca Yamaha");
                    System.out.println("Escolha o Modelo");
                    System.out.println("-- R3 ABS - Digite -|1|");
                    System.out.println("-- XMAX BS - Digite - |2|");
                    int modelo = cadastroMoto.nextInt();

                    if (modelo == 1) {
                        motos.setValorMoto(298000);
                        motos.setMoto("Moto Escolhida foi Yamaha R3 ABS, 2022, Sporting, Valor R$ : 298.000 ");
                        System.out.println("Moto Escolhida foi Yamaha R3 ABS, 2022, Sporting, Valor R$ : 298.000 ");
                    } else {
                        motos.setValorMoto(29000);
                        motos.setMoto("Moto Escolhida foi Yamaha XMAX BS, 2022, Scout, Valor R$ : 29.000 ");
                        System.out.println("Moto Escolhida foi Yamaha XMAX BS, 2022, Scout, Valor R$ : 29.000 ");
                    }

                } else {

                    System.out.println("Marca Yamaha");
                    System.out.println("Escolha o Modelo");
                    System.out.println("-- R3 ABS - Digite -|1|");
                    System.out.println("-- XMAX BS - Digite - |2|");
                    int modelo = cadastroMoto.nextInt();
                    if (modelo == 1) {
                        motos.setValorMoto(190000);

                        motos.setMoto("Moto Escolhida foi BMW, R1250 GS, 2022, Adveture's, Valor R$ : 190.000 ");
                        System.out.println("Moto Escolhida foi BMW, R1250 GS, 2022, Adveture's, Valor R$ : 190.000 ");
                    } else {
                        motos.setValorMoto(85000);
                        System.out.println("Moto Escolhida foi BMW, R2850 GS, 2022, Sporting,Valor R$ : 85.000 ");
                        motos.setMoto("Moto Escolhida foi BMW, R2850 GS, 2022, Sporting,Valor R$ : 85.000 ");
                    }

                }






                System.out.println("-----------------------------CLIENTE-----------------------------------------");


                System.out.println("Digite o nome do Cliente: ");
                String nomeCliente = cadastroCliente.nextLine();
                System.out.println("Nome : "+ nomeCliente);

                System.out.println("Digite o endereço do Cliente: ");
                String endereco = cadastroCliente.nextLine();
                System.out.println("Endereço : "+ endereco);

                System.out.println("Digite o cpf do Cliente: ");
                String cpf = cadastroCliente.nextLine();
                System.out.println("CPF : "+ cpf);

                System.out.println("Digite o idade do Cliente: ");
                int idade = cadastroCliente.nextInt();
                System.out.println("Idade : "+ idade);

                System.out.println("Digite o codigo do Cliente: ");
                String codigo = cadastroCliente.next();
                System.out.println("Codigo do Cliente : " + codigo);


                System.out.println("Valor depositado pelo  o cliente");
                double dinheiro = cadastroCliente.nextDouble();
                motos.setValorDepositado(dinheiro);


                System.out.println("Moto escolhida pelo cliente : " + motos.getMoto());










                System.out.println("-----------------------------GERENTE-----------------------------------------");

                System.out.println("Digite o nome do Gerente: ");
                String nomeg = cadastroGerente.nextLine();
                System.out.println("Nome : "+ nomeg);

//                System.out.println("Digite o endereço do Gerente: ");
//                String enderecog = cadastroGerente.nextLine();
//                System.out.println("Endereço : "+ enderecog);
//
//                System.out.println("Digite o cpf do Gerente: ");
//                String cpfg = cadastroGerente.nextLine();
//                System.out.println("CPF : "+ cpfg);
//
//                System.out.println("Digite o idade do Gerente: ");
//                int idadeg = cadastroGerente.nextInt();
//                System.out.println("Idade : "+ idadeg);

                System.out.println("Digite o Matricula do Gerente: ");
                int matriculag = cadastroGerente.nextInt();
                System.out.println("Codigo do Gerente : "+ matriculag);

                System.out.println("Senha do Gerente para autorizar a venda");
                int senha = cadastroGerente.nextInt();

                System.out.println("Moto escolhida pelo cliente : " + motos.getMoto());


               boolean autoriza  =true;

                if (autoriza &&(senha == motos.getSenha())){
                    System.out.println("Autorizado Pelo Gerente");
                    if (motos.getValorDepositado() == motos.getValorMoto()){
                        System.out.println("Autorizado Pelo Sistema");

                    }else {
                        System.out.println("Sistema não autorizou a compra");
                        System.out.println("Procure o Gerente");
                    }


                }else {
                    System.out.println("Gerente não autorizou");
                }






        System.out.println("-----------------------------VENDEDOR-----------------------------------------");

                System.out.println("Digite o nome do Vendedor: ");
                String nomev = cadastroVendedor.nextLine();
                System.out.println("Nome : "+ nomev);

//                System.out.println("Digite o endereço do Vendedor: ");
//                String enderecov = cadastroVendedor.nextLine();
//                System.out.println("Endereço : "+ enderecov);
//
//                System.out.println("Digite o cpf do Vendedor: ");
//                String cpfv = cadastroVendedor.nextLine();
//                System.out.println("CPF : "+ cpfv);
//
//                System.out.println("Digite o idade do Vendedor: ");
//                int idadev = cadastroVendedor.nextInt();
//                System.out.println("Idade : "+ idadev);

                System.out.println("Digite o Matricula do Vendedor: ");
                int matriculav = cadastroVendedor.nextInt();
                System.out.println("Codigo do Vendedor : "+ matriculav);

                System.out.println("Cliente Atendido: "+ nomeCliente +" Codigo: " + codigo );
                System.out.println("Moto escolhida pelo cliente : " + motos.getMoto());


                boolean autorizado = true;
                if (autoriza == autorizado){
                    System.out.println("Venda Concluída com Sucesso");
                }





        }





    }
