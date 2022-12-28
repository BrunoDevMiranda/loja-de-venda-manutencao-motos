package sistema.test;




import sistema.dominio.Controlle;

import sistema.dominio.loja.Acessorios;
import sistema.dominio.loja.Moto2;
import sistema.dominio.cliente.Cliente2;
import sistema.dominio.funcionario.Gerente2;
import sistema.dominio.funcionario.Vendedor2;
import sistema.dominio.loja.Oficina;


import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        Scanner cadastro = new Scanner(System.in);
        Scanner cadastroOficina = new Scanner(System.in);
        Scanner cadastroMoto = new Scanner(System.in);
        Scanner cadastroCliente = new Scanner(System.in);
        Scanner cadastroVendedor = new Scanner(System.in);
        Scanner cadastroGerente = new Scanner(System.in);


        Controlle autorizar = new Controlle();
        Moto2 moto = new Moto2();
        Cliente2 cliente = new Cliente2();
        Vendedor2 vendedor = new Vendedor2();
        Gerente2 gerente = new Gerente2();
        Acessorios acessorios = new Acessorios();
        Oficina oficina = new Oficina();




        System.out.println("---------------- | 01 |  CADASTRO DE COMPRA - MOTOS  | 01 |-----------------------------");
        System.out.println("---------------- | 02 |  CADASTRO DE COMPRA - ACESSÓRIOS  | 02 |-----------------------------");
        System.out.println("---------------- | 03 |  CADASTRO DE OFICINA | 03 |-----------------------------");


        int escolha = cadastro.nextInt();

        switch (escolha){

            case 1:


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

                        moto.setValor(19000);


                        moto.setMoto("Moto Escolhida foi Honda XRE 190, 2022 Aventure - Valor R$ 19.000");
                        System.out.println(moto.getMoto());
                    } else {
                        moto.setValor(219000);

                        moto.setMoto("Moto Escolhida foi Honda Gl1800, 2022 Touring - Valor R$ 219.000");
                        System.out.println(moto.getMoto());
                    }


                } else if (marca == 2) {

                    System.out.println("Marca Yamaha");
                    System.out.println("Escolha o Modelo");
                    System.out.println("-- R3 ABS - Digite -|1|");
                    System.out.println("-- XMAX BS - Digite - |2|");
                    int modelo = cadastroMoto.nextInt();

                    if (modelo == 1) {
                        moto.setValor(298000);
                        moto.setMoto("Moto Escolhida foi Yamaha R3 ABS, 2022, Sporting, Valor R$ : 298.000 ");
                        System.out.println(moto.getMoto());
                    } else {
                        moto.setValor(29000);
                        moto.setMoto("Moto Escolhida foi Yamaha XMAX BS, 2022, Scout, Valor R$ : 29.000 ");

                        System.out.println(moto.getMoto());
                    }

                } else {

                    System.out.println("Marca Yamaha");
                    System.out.println("Escolha o Modelo");
                    System.out.println("-- R3 ABS - Digite -|1|");
                    System.out.println("-- XMAX BS - Digite - |2|");
                    int modelo = cadastroMoto.nextInt();
                    if (modelo == 1) {
                        moto.setValor(190000);

                        moto.setMoto("Moto Escolhida foi BMW, R1250 GS, 2022, Adveture's, Valor R$ : 190.000 ");
                        System.out.println(moto.getMoto());
                    } else {
                        moto.setValor(85000);
                        System.out.println("Moto Escolhida foi BMW, R2850 GS, 2022, Sporting,Valor R$ : 85.000 ");
                        moto.setMoto(moto.getMoto());
                    }

                }


                System.out.println("-----------------------------CLIENTE-----------------------------------------");


                System.out.println("Digite o nome do Cliente: ");
                cliente.setNome(cadastroCliente.nextLine());
                System.out.println("Nome : " + cliente.getNome());

                System.out.println("Digite o endereço do Cliente: ");
                cliente.setEndereco(cadastroCliente.nextLine());
                System.out.println("Endereço : " + cliente.getEndereco());

                System.out.println("Digite o cpf do Cliente: ");
                cliente.setCpf(cadastroCliente.nextLine());
                System.out.println("CPF : " + cliente.getCpf());

                System.out.println("Digite o idade do Cliente: ");
                cliente.setIdade(cadastroCliente.nextInt());
                System.out.println("Idade : " + cliente.getIdade());

                System.out.println("Digite o codigo do Cliente: ");
                cliente.setCodigoCliente(cadastroCliente.next());
                System.out.println("Codigo do Cliente : " + cliente.getCodigoCliente());


                System.out.println("Valor depositado pelo  o cliente");
                cliente.setValorPago(cadastroCliente.nextDouble());
                cliente.setValorPago(cliente.getValorPago());


                System.out.println("Moto escolhida pelo cliente : " + moto.getMoto());


                System.out.println("-----------------------------GERENTE-----------------------------------------");

                System.out.println("Digite o nome do Gerente: ");
                gerente.setNome(cadastroGerente.nextLine());
                System.out.println("Nome : " + gerente.getNome());


                System.out.println("Digite o Matricula do Gerente: ");
                gerente.setMatricula(cadastroGerente.nextInt());
                System.out.println("Matricula do Gerente : " + gerente.getMatricula());

                System.out.println("Senha do Gerente para autorizar a venda");
                gerente.setSenha(cadastroGerente.nextInt());


                System.out.println("Moto escolhida pelo cliente : " + moto.getMoto());

                autorizar.setValorMoto(moto.getValor());
                autorizar.setValorPagoCliente(cliente.getValorPago());

                System.out.println("-----------------------CONDIÇÃO DE COMPRA------------------------------------------");

                autorizar.liberaVenda(gerente);

                System.out.println("-----------------------COMISSÃO E BONUS---------------------------------------------");


                gerente.setComissao(moto.getBonus());
                gerente.condicao();


                System.out.println("-----------------------------VENDEDOR-----------------------------------------");

                System.out.println("Digite o nome do Vendedor: ");
                vendedor.setNome(cadastroVendedor.nextLine());
                System.out.println("Nome : " + vendedor.getNome());


                System.out.println("Digite o Matricula do Vendedor: ");
                vendedor.setMatricula(cadastroVendedor.nextInt());
                System.out.println("Codigo do Vendedor : " + vendedor.getMatricula());

                System.out.println("Cliente Atendido: " + cliente.getNome() + " Codigo: " + cliente.getCodigoCliente());
                System.out.println("Moto escolhida pelo cliente : " + moto.getMoto());


                autorizar.autorizado(vendedor);

                System.out.println("-----------------------COMISSÃO E BONUS---------------------------------------------");


                vendedor.setComissao(moto.getBonus());
                vendedor.condicao();


                System.out.println("---------------FIM--------------");
                break;

            case 2:

                System.out.println("-----------------------------ACESSÓRIOS-----------------------------------------");


                System.out.println("Escolha o ACESSÓRIO");
                System.out.println("-- Capacete -   |1|");
                System.out.println("-- Retrovisor - |2|");
                System.out.println("-- bau -        |3|");


                int acessorio = cadastro.nextInt();


                if (acessorio == 1) {
                    System.out.println("Capacetes");
                    System.out.println("Escolha o Modelo");
                    System.out.println("-- Capacete Sportivo -|1|");
                    System.out.println("-- Capacete profissional de alto impacto - |2|");


                    int modelo = cadastro.nextInt();
                    if (modelo == 1) {

                        acessorios.setAcessorio(500);

                        System.out.println("Capacete Sportivo valor R$: " + acessorios.getAcessorio());
                        System.out.println(acessorios.getRelatorio());

                    } else {
                        acessorios.setAcessorio(1800);

                        acessorios.setRelatorio("Capacete profissional de alto impacto valor R$: " + acessorios.getAcessorio());
                        System.out.println(acessorios.getRelatorio());


                    }


                } else if (acessorio == 2) {

                    System.out.println("Retrovisor");
                    System.out.println("Escolha o Modelo");
                    System.out.println("-- Retrovisor profundidade -|1|");
                    System.out.println("-- Retrovisor anti-reflexo - |2|");


                    int modelo = cadastro.nextInt();

                    if (modelo == 1) {


                        acessorios.setAcessorio(450);

                        acessorios.setRelatorio("Retrovisor profundidade valor R$: " + acessorios.getAcessorio());
                        System.out.println(acessorios.getRelatorio());

                    } else {
                        acessorios.setAcessorio(300);

                        acessorios.setRelatorio("Retrovisor anti-reflexo valor R$: " + acessorios.getAcessorio());
                        System.out.println(acessorios.getRelatorio());
                    }

                } else {

                    System.out.println("Báu");
                    System.out.println("Escolha o Modelo");
                    System.out.println("-- Báu 20L com olhos de gato -|1|");
                    System.out.println("-- Báu 18l com faixa reflexivas - |2|");


                    int modelo = cadastro.nextInt();
                    if (modelo == 1) {

                        acessorios.setAcessorio(390);

                        acessorios.setRelatorio("Báu 20L com olhos de gato R$: " + acessorios.getAcessorio());
                        System.out.println(acessorios.getRelatorio());

                    } else {
                        acessorios.setAcessorio(350);

                        acessorios.setRelatorio("Báu 18l com faixa reflexivas valor R$: " + acessorios.getAcessorio());
                        System.out.println(acessorios.getRelatorio());

                    }
                }


                System.out.println("---------------FIM--------------");
                break;


            case 3:

                System.out.println("-----------------------------OFICINA-----------------------------------------");



                System.out.println("Digite a Marca da moto");
                System.out.println(" Digite 1 - Honda");
                System.out.println(" Digite 2 - Yamaha");
                System.out.println(" Digite 3 - BMW");


                int marcaOfina = cadastroOficina.nextInt();


                if (marcaOfina == 1) {
                    System.out.println("Marca Honda");
                    System.out.println("Escolha o Qual Serviço:");
                    System.out.println("-- Revisão completa -|1|");
                    System.out.println("-- Troca de pneus - |2|");
                    int modelo = cadastro.nextInt();
                    if (modelo == 1) {

                        oficina.setManutencao(2500);

                        oficina.setRelatorio("Revisão da moto ficou no valor R$ :" + oficina.getManutencao());
                        System.out.println(oficina.getRelatorio());
                    } else {
                        oficina.setManutencao(1400);

                        oficina.setRelatorio("Troca dos Pneus ficou no valor R$ :" + oficina.getManutencao());
                        System.out.println(oficina.getRelatorio());


                    }


                } else if (marcaOfina == 2) {

                    System.out.println("Marca Yamaha");
                    System.out.println("Escolha o Qual Serviço:");
                    System.out.println("-- Revisão completa -|1|");
                    System.out.println("-- Troca de pneus - |2|");
                    int modelo = cadastro.nextInt();

                    if (modelo == 1) {
                        oficina.setManutencao(1800);

                        oficina.setRelatorio("Revisão da moto ficou no valor R$ :" + oficina.getManutencao());
                        System.out.println(oficina.getRelatorio());
                    } else {
                        oficina.setManutencao(3500);

                        oficina.setRelatorio("Troca dos Pneus ficou no valor R$ :" + oficina.getManutencao());
                        System.out.println(oficina.getRelatorio());
                    }

                } else {

                    System.out.println("Marca Yamaha");
                    System.out.println("Escolha o Qual Serviço:");
                    System.out.println("-- Revisão completa -|1|");
                    System.out.println("-- Troca de pneus - |2|");
                    int modelo = cadastro.nextInt();
                    if (modelo == 1) {
                        oficina.setManutencao(9000);

                        oficina.setRelatorio("Revisão da moto ficou no valor R$ :" + oficina.getManutencao());
                        System.out.println(oficina.getRelatorio());
                    } else {
                        oficina.setManutencao(7000);

                        oficina.setRelatorio("Troca dos Pneus ficou no valor R$ :" + oficina.getManutencao());
                        System.out.println(oficina.getRelatorio());

                    }


                    System.out.println("---------------FIM--------------");
                break;

                }
        }


    }}
