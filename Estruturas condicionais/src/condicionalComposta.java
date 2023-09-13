public class condicionalComposta {
    public static void main(String[] args) {
    
        //Aqui vamos fazer o teste de uma condi;ão simples utilizando apenas o if
        double saldo=25.0;
        double valorSolicitado=17.0;

        if(valorSolicitado<saldo){
        saldo = saldo - valorSolicitado;
    System.out.println("Novo saldo: " + saldo);

    }else
    System.out.println(saldo);
    }
}