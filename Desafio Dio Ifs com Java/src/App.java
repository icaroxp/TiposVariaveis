import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitorDeEntardas = new Scanner(System.in);
        System.out.println("Digite o valor do seu salário: ");
        double valorSalario = leitorDeEntardas.nextDouble();

        System.out.println("Digite o adicional dos benefícios");
        double adicionalBeneficios = leitorDeEntardas.nextDouble();

        double valorImposto;
                if(valorSalario >=0.00 && valorSalario <= 1100.00){
            valorImposto= 0.05*valorSalario;
        }else if(valorSalario>=1100.01 && valorSalario <=2500.00){
            valorImposto=0.10*valorSalario;
        }else{
            valorImposto=0.15*valorSalario;
        }
        double saida = valorSalario - valorImposto+ adicionalBeneficios;
        System.out.println(saida);
        
        

        }
    }

