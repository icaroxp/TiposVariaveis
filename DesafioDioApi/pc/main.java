package pc;
public class main {
    public static void main(String[] args) {
        pc computerAPI = new pc();

        // Verifica se o computador está ligado
        System.out.println("Computador está ligado? " + computerAPI.computadorLigado());

        // Liga o computador
        computerAPI.LigarComputador();

        // Verifica novamente se o computador está ligado
        System.out.println("O computador está ligado? " + computerAPI.computadorLigado());

        // Desliga o computador
        computerAPI.desligarComputador();

        // Verifica novamente se o computador está ligado
        System.out.println("O computador esta ligado? " + computerAPI.computadorLigado());
    }
}
