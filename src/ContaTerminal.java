import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        String agencia = "067-8";
        String nome = "MARIO ANDRADE";
        double saldo = 237.48;

        System.out.println("Por favor, digite o número da Conta!");
        int numero = sc.nextInt();


        System.out.println("Olá "+ nome +", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia +", conta "+ numero +" e seu saldo "+ saldo +" já está disponível para saque.");
    }
}