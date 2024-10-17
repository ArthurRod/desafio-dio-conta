package conta_terminal;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta !");
        int numConta = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Por favor, digite o número da Agencia !");
        String numAgencia = scanner.nextLine();
        
        System.out.println("Por favor, digite o seu nome !");
        String nomeCliente = scanner.nextLine();

        double saldo = 237.48;
        
        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(Locale.of("pt", "BR"));
        String saldoFormatado = formatoMoeda.format(saldo);

        // Exibir o resultado
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                numAgencia + ", conta " + numConta + " e seu saldo " + saldoFormatado + " já está disponível para saque.");

        scanner.close();
    }
}
