import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: conhecer e importar a classe Scanner
            Scanner sc = new Scanner(System.in);
		    int numero;
		    String agencia;
		    String nomeCliente;
		    double saldo;

        // Exibir as mensagens para o nosso usuário
            System.out.println("---------------CONTA BANCÁRIA---------------");
		    System.out.println();
		    

        // Obter pela scanner os valores digitados no teminal
            System.out.println("Por favor, digite o número da Conta: (1021)");
		    numero = sc.nextInt();

            System.out.println("Agora digite o número da Agência: (067-8)");
		    agencia = sc.next();

		    System.out.println("Me informe seu nome: ");
		    nomeCliente = sc.next();
		    sc.nextLine();

		    System.out.println("Agora me informa seu saldo atual: ");
		    saldo = sc.nextDouble();

        // Exbir a mensagem da conta criada
            System.out.println();
		    System.out.printf("Olá %s, obrigado por criar uma conta em "
				+ "nosso banco, sua agência é %s, "
				+ "conta %d e seu saldo %.2f já está disponível"
				+ " para saque.", nomeCliente, agencia, numero, saldo);

		

    }
}
