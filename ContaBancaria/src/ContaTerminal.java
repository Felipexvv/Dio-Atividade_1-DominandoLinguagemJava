import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor digite seu nome: ");
        nomeCliente = scanner.next();

        System.out.println("Digite o numero da sua Agencia EXEMPLO:(067-8) ");
        agencia = scanner.next();

        System.out.println("Digite o numero da Conta: ");
        numero = scanner.nextInt();

        System.out.println("Digite o saldo da conta: ");
        saldo = scanner.nextDouble();

        if (saldo >= 100000) {
            System.out.println("Temos um bem de vida aqui");
        }else if (saldo >= 4000) {
            System.out.println("Tempos um classe media aqui");
        }else {
            System.out.println("Temos um cidadao brasileiro classe normal pobre e sem nada triste");
        }


        System.out.println("Ola meu nome é " + nomeCliente + " ,Obridado por criar uma conta em nosso banco, sua agencia é " + agencia + " , Conta: " + numero + " e seu saldo é " + saldo + " ja disponicel para saque");
    }
}
