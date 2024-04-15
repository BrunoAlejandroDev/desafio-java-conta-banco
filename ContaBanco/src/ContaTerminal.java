import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // instânciando o objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // criar os imputs para o usuário
        System.out.println("Digite o número da sua agência: (Ex: 1234)");
        int agencia = scanner.nextInt();

        System.out.println("Digite a identificação da sua agência: (Ex: 123-4)");
        String numAgencia = scanner.next();

        System.out.println("Digite o seu nome:");
        String nome = scanner.next();

        System.out.println("Digite o seu saldo:");
        double saldo = scanner.nextDouble();

        // imprimindo os dados do usuário
        System.out.println("-------");
        System.out.println("Olá " + nome + ". Obrigado por criar uma conta em nosso banco, sua agência é" + numAgencia + "com a conta de número" + agencia + " e seu saldo " + saldo + " já está disponível para saque");
        System.out.println("-------");
    }
}