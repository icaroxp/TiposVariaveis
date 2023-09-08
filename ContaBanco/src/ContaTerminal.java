
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //TODO: Conhecer e importar a classe Scanner

        //Exibir as mensagens para o nosso usuário 

        //Obter pela scanner os valores digitados no terminal

        //Exibir a mensagem conta criada



        System.out.println("Por favor, digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o número da agência: ");
        String numeroAgencia = scanner.next();


        System.out.println("Por favor, digite o primeiro e segundo nome: ");
        String nomeUm = scanner.next();
        String nomeDois = scanner.next();

        System.out.println("Por favor, digite o valor do saldo incial desejado para saque: ");
        double saldoIncial=scanner.nextDouble();

        System.out.println("Olá" +" "+ nomeUm + " " + nomeDois+ ", " + "obrigado por criar uma conta em nosso banco, sua agência é"+ " " +numeroAgencia+", conta"+" "+ numeroConta+" "+ "e seu saldo"+" "+ saldoIncial+" "+"já está disponível para saque.");

    }
}
