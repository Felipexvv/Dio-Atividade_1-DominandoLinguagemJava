import java.util.Scanner;

public class CaixaBancario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;
        

        while (continuar != false) {
            
            System.out.println("Menu");
            System.out.println("[1] Depositar");
            System.out.println("[2] Sacar");
            System.out.println("[3] Consultar Saldo");
            System.out.println("[0] Encerrar");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor para Deposito");
                    double deposito = scanner.nextDouble(); 
                    saldo = saldo + deposito; 
                    System.out.println("Saldo Atual:" + saldo);
                    break;
                case 2:
                    // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                    System.out.println("Digite o valor para Saque");
                    double saque = scanner.nextDouble(); 
                    if(saldo < saque){
                      System.out.println("Saldo insuficiente");
                    }else{
                      saldo = saldo - saque;
                      System.out.println("Saldo Atual:" + saldo);
                    }
                    break;
                case 3:
                    // TODO: Exibir o saldo atual da conta.
                    System.out.println("Saldo Atual:" + saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}
