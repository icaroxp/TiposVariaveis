import java.util.Locale;
import java.util.Scanner;


public class switchCase{
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in).useLocale(Locale.US);

        //Aqui vamos fazer o uso de switchCase, ou seja, queremos automatizar, deixar mais limpo, sem precisar do uso do else if repetidas vezes
        //É mais fácil que criemos uma case para nossas siglas e dentro delas criamos condições para cada print




System.out.println("Digite o tamanho de sua roupa: ");
String sigla = scanner.next();

switch (sigla){
 case "P":{
    System.out.println("PEQUENO");
    break;
}
 case "M":{
    System.out.println("MEDIO");
break; 
}
 case "G":{
    System.out.println("GRANDE");
    break;
 }
 default:
 System.out.println("INDEFINIDO");
}


    }
}