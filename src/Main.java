import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Banco banco = new Banco();

        int opcao;
        do {
            System.out.println("\n---------MENU---------");
            System.out.println("1. Criar conta (corrente ou poupança)");
            System.out.println("2. Depositar em uma conta");
            System.out.println("3. Sacar de uma conta");
            System.out.println("4. Listar todas as contas");
            System.out.println("5. Consultar saldo");
            System.out.println("6. Sair");
            System.out.println("Escolha uma opcao: ");
            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao) {
                case 1:
                    System.out.println("Digite o número do conta: ");
                    String numero =  sc.nextLine();
                    System.out.println("Digite o nome do titular: ");
                    String titular = sc.nextLine();
                    System.out.println("Escolha o tipo de conta: (1.Corrente, 2.Poupança): ");
                    int tipo =  sc.nextInt();
                    sc.nextLine();
                    if (tipo == 1) {
                        System.out.println("Digite o valor do limite: ");
                        double limite = sc.nextDouble();
                        ContaCorrente cc = new ContaCorrente(numero, titular, limite);
                        banco.adicionarConta(cc);
                    } else {
                        ContaPoupanca cp = new ContaPoupanca(numero, titular);
                        banco.adicionarConta(cp);
                    }
                    break;

                case 2:
                    System.out.println("Digite o número da conta: ");
                    numero = sc.nextLine();
                    ContaBancaria contaDeposito = banco.buscarConta(numero);
                    if (contaDeposito != null) {
                        System.out.println("Digite o valor do depósito: ");
                        double valor = sc.nextDouble();
                        contaDeposito.depositar(valor);
                    } else {
                        System.out.println("Conta não encontrada no sistema!");
                    }
                    break;

                case 3:
                    System.out.println("Digite o número da conta: ");
                    numero = sc.nextLine();
                    ContaBancaria contaSaque = banco.buscarConta(numero);
                    if (contaSaque != null) {
                        System.out.println("Digite o valor do saque: ");
                        double valor = sc.nextDouble();
                        contaSaque.sacar(valor);
                    } else {
                        System.out.println("Conta não encontrada no sistema");
                    }
                    break;

                case 4:
                    System.out.println("Digite o número da conta: ");
                    numero = sc.nextLine();
                    ContaBancaria contaSaldo = banco.buscarConta(numero);
                    if (contaSaldo != null) {
                        System.out.println("Saldo disponível: R$" + contaSaldo.consultarSaldo());
                    } else {
                        System.out.println("Conta não encontrada no sistema");
                    }
                    break;

                case 5:
                    System.out.println("-----Contas cadastradas no sistema-----");
                    for(ContaBancaria c : banco.listarContas()) {
                        System.out.println(c);
                    }
                    break;

                case 6:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente!");
            }

        } while (opcao != 6);

        sc.close();
    }
}