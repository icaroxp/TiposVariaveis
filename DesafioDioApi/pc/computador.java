package pc;
public class computador {
    private boolean estaLigado;

    public computador() {
        this.estaLigado = false;
    }
    public void ligar() {
        estaLigado = true;
        System.out.println("O computador foi ligado");
    }
    public void desligar() {
        estaLigado = false;
        System.out.println("O computador foi desligado.");
    }
    public boolean estaLigado() {
        return estaLigado;
    }
}
