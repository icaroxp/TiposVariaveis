
public class estruturaWhile{
    public static void main(String[] args) {
        
        /*While é uma estrutura de controle de fluxo, ou seja, 
        o comando será executado até que a expressão se torne falsa*/

        double mesada = 50.0;
        System.out.println("Joaozino recebeu R$50.00 em mesada, e após isso, foi ao mercado comprar doces.");

        while(mesada > 0){
            Double valorDoce = 10.0;


            System.out.println("Doce do valor: "+valorDoce +" "+"Adicionado no carrinho");
            mesada=mesada-valorDoce;      
         }

    System.out.println("Mesada: "+mesada);
    System.out.println("Joaozinho gastou toda a sua mesada em doces :(");
    }

}