import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite um valor");
    double valor = scanner.nextDouble();

    if(valor>0){
      System.out.println("Deposito realizado com sucesso!");
      
          System.out.println("Saldo atual: R$"+new DecimalFormat("0.00").format(valor));
    }else if (valor == 0) {
      System.out.println("Encerrando o programa...");

  }else {
    System.out.println("Valor invalido! Digite um valor maior que zero.");

  }
}
}