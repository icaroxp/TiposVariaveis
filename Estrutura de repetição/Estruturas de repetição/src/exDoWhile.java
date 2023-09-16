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
    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? "+atendeu);
        return ! atendeu;
    }
}
