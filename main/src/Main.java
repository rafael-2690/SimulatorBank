import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option;
        String name = "Rafael Pinto Pereira";
        String count = "Corrente";
        double balance = 2500.00;

        System.out.printf("""
                ************************************************
                Dados iniciais do cliente:
                
                Nome: %s
                Tipo conta: %s
                Saldo: %.2f
                ************************************************
                
                Operações
                
                1- Consultar saldo
                2- Receber valor
                3- Transferir valor
                4- Sair
                
                Digite a opção desejada:
                
                """, name, count, balance);
        do {
            option = input.nextInt();

            switch (option) {

                case 1:
                    System.out.printf("O seu saldo atual é de: %.2f %n", balance);
                    break;

                case 2:
                    System.out.println("Digite o valor que irá receber: ");
                    double valorReceber = input.nextDouble();
                    balance += valorReceber;
                    System.out.printf("Realizado o recebimento de R$%.2f %n", valorReceber);
                    break;

                case 3:
                    System.out.println("Digite o valor que deseja transferir: ");
                    double valorPagar = input.nextDouble();
                    if (valorPagar > balance) {
                        System.out.println("Saldo insuficiente, para realizar essa operação, digite outra opção");
                    }else {
                        balance -= valorPagar;
                        System.out.printf("Realizado a transferência de R$%.2f %n", valorPagar);
                    }
                    break;

                case 4:
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }while (option != 4);
    }
}