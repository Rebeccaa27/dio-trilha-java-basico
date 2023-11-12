import java.util.Scanner;

public class ContaTerminal {

    int numero;
    int agencia;
    String nomeCliente;
    double saldo;

    public static void main(String[] args) throws Exception {

        ContaTerminal conta = new ContaTerminal();
        // TODO:Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in);

        // Exibir as mensagens para o nosso usúario
        System.out.println("Por favor digite o número da sua agência: ");
        conta.numero = Integer.parseInt(scanner.nextLine());

        System.out.println("Usuário:" + conta.numero);

        System.out.println("Por favor digite sua agência: ");
        conta.agencia = Integer.parseInt(scanner.nextLine());

        System.out.println("Usuário:" + conta.agencia);

        System.out.println("Por favor digite seu nome: ");
        conta.nomeCliente = scanner.nextLine();

        System.out.println("Usuário:" + conta.nomeCliente);

        System.out.println("Por favor digite o valor do saldo: ");
        conta.saldo = Integer.parseInt(scanner.nextLine());

        System.out.println("Usuário:" + conta.saldo);

        System.out.println("Olá " + conta.nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + conta.agencia + ", conta " + conta.numero + " e seu saldo " + conta.saldo
                + " já está disponível para saque.");

    }
}
