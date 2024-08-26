import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;


        System.out.println("Digite o número da conta bancária: ");
         numero = scanner.nextInt();
         
         // Consome a nova linha restante
         scanner.nextLine();
 
         // Recebe o nome do cliente
         System.out.println("Digite o nome do cliente: ");
         nomeCliente = scanner.nextLine();
 
         // Recebe a agência da conta bancária
         System.out.println("Digite a agência da conta bancária: ");
         agencia = scanner.nextLine();
 
         // Recebe o saldo da conta bancária do cliente
         System.out.println("Digite o saldo da conta bancária do cliente: ");
         saldo = scanner.nextDouble();
 
         // Exibe as informações coletadas
         System.out.println("Olá, " + nomeCliente +
         ", obrigado por criar uma conta em nossa agência " + agencia +
         ". O número de sua conta é: " + numero +
         ". Seu saldo de R$ " + saldo + " já está disponível para saque!");
     
         
         scanner.close();

        
    }
}
