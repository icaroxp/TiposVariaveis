
import java.util.Locale;
import java.util.Scanner;

import javax.xml.validation.Validator;

public class planoTelefonico {

    public static void main(String[] args) {
        
Scanner scanner = new Scanner (System.in).useLocale(Locale.US);

System.out.println("Digite o plano desejado, para 5gb de YOUTUBE, digite T"+" "+" para Whatsapp e Instagram grátis, digite M"+" "+"Para 100 minutos de ligação, digite B");
String plano = scanner.next();

switch (plano){
    case"T":{
        System.out.println("5gb YOUTUBE");
        break;
    }
        case "M":{
        System.out.println("Whatsapp e Instagram grátis");
        break;
    }
        case "B":{
        System.out.println("Para 100 minutos de ligação");
        break;
    }
}



        
    }
}
