package pc;
public class pc {
    private computador computer;

    public pc() {
        this.computer = new computador();
    }

    public void LigarComputador() {
        computer.ligar();
    }
    public void desligarComputador() {
        computer.desligar();
    }
    
    public boolean computadorLigado() {
        return computer.estaLigado();
    }
}
