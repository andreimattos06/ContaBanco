import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\\n");
        int numero;
        String agencia;
        String nomeCliente;
        float saldo;

        System.out.println("Por favor digite o número da Agência!");
        numero = scanner.nextInt();

        System.out.println("Por favor digite o nome da Agência!");
        agencia = scanner.next();

        System.out.println("Por favor digite o nome do cliente!");
        nomeCliente = scanner.next();

        System.out.println("Por favor digite o saldo");
        saldo = scanner.nextFloat();

        System.out.printf("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + 
        " e seu saldo %.2f já está disponível para saque.", saldo);
        System.out.println();

    }
}
