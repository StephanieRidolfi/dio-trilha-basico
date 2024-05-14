import java.util.Scanner;

public class ContaTerminal {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            // Solicitar e armazenar informações da conta
            System.out.println("Por favor, digite o número da Agência:");
            String agencia = scanner.nextLine();
    
            System.out.println("Por favor, digite o número da Conta:");
            int numeroConta = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha após o nextInt()
    
            System.out.println("Por favor, digite o nome do Cliente:");
            String nomeCliente = scanner.nextLine();
    
            System.out.println("Por favor, digite o saldo da Conta:");
            String saldoStr = scanner.nextLine();
            double saldo = Double.parseDouble(saldoStr);
    
            // Exibir mensagem com as informações da conta
            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco,\nsua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
    
            // Fechar o scanner
            scanner.close();
        }
    }
    


