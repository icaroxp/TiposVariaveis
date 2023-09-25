import java.util.Random; 
public class exDoWhile {
    public static void main(String[] args) {
        //Joaozinho resolveu ligar para o amigo e dizer que comeu muitos doces.
    
        System.out.println("Discando");
        do{
            System.out.println("Telefone tocando");

        }while(tocando());
        System.out.println("Alo");


    }
    private static boolean tocando(){ //Nosso método tocando 
        boolean atendeu = new Random().nextInt(3)==1; //Nosso metodo random entre1 e 3, quando ele atende
        System.out.println("Atendeu? "+atendeu);
        return ! atendeu; //dizemos que quandoe ele atendeu, não precisamos mais que ele toque
    }
}
