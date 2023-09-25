import java.util.Random;
import java.util.concurrent.ThreadLocalRandom; //Importamos aqui para que tenhamos valores para o valorPretendido (3)

public class candidatos {

    public static void main(String[] args) {
    String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
    for(String candidato: candidatos){
            entrandoEmContato(candidato);
        }
    }
    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuartentando = true;
        boolean atendeu = false;
        do{
            atendeu = atender();
            continuartentando = !atendeu;
            if(continuartentando)
            tentativasRealizadas++;
            else
            System.out.println("CONTATO REALIZADO COM SUCESSO");

        }while(continuartentando && tentativasRealizadas < 3);
        if(atendeu)
        System.out.println("CONSEGUIMOS CONTATO COM "+ candidato+" NA "+ tentativasRealizadas);
        else
        System.out.println("NÃO CONSEGUIMOS CONTATO COM "+candidato+" NÚMERO MÁXIMO DE TENTATIVAS REALIZADAS");
        
    }

    //metodo auxiliar
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
        System.out.println("Imprimindo a lista de candidatos, indicando o índice do elemento");
        for(int indice=0; indice < candidatos.length;indice++){
            System.out.println("O candidato de numero "+ (indice+1) + " é o"+ candidatos[indice]);
        }
    }

    static void selecaoCandidatos(){       //2- declaramos outro método sem valor retornável, também com base No salarioPretendido(que trabalharemos em cima dele)

        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};       // Array com a lista de candidatos
    
        int candidatosSelecionados=0;       //Aqui vamos indicar um int com x candidatos selecionados para que possamos fazer uma verificação de quantos ja foram.
        int candidatosAtual=0;          //Aqui vamos ter indicando a quantia de candidatos atual, ambos iguais a zero pois são índice do array.
        double salarioBase=2000.0;
            while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length){       /*Dentro de nosso while, temos que, vamos selecionar os candidatos até 
                chegarem em 5, pois é a quantia que precisamos, e, os candidatos que serão selecionado(no maximo 5), sejam menores que o valor total de candidatos( no máximo 10 que foram os que declaramos) */
                String candidato=candidatos[candidatosAtual];   //Aqui dizemos que, nosso candidato atual é zero(ou seja, ainda nenhum selecionado), então, quando verificamos se o salário dele for menor, igual o maior do que o salário base
                double salarioPretendido = valorPretendido();         //Esse algoritmo, é um algoritmo auxiliar para representar um valor para os candidatos sugeridos
                System.out.println("O candidato "+candidato+" solicitou este valor de salário: "+salarioPretendido); //Aqui damos um print para falor que tal candidato, solicitou tal valor para seu salario
                if(salarioBase>=salarioPretendido){         //Aqui ja vamos "peneirar" o quanto o candidato quer, ou seja, quando o salaribase é maior, ele é selecionado.
                System.out.println("O candidato "+candidato+" foi selecionado para a vaga");
                    candidatosSelecionados++; //Então, caso salarioBase>=salarioPretendido, esse candidato é selecionado e passa para o próximo candidato
                }
        candidatosAtual++; //Após executarmos o método acima, precisamos passar para o próximo candidato, retirando aquele que já foi selecionado, então, candidatoAtual++, muda o candidato para o próximo
        
        }

    }


    static double valorPretendido() {       //3- Então, temos esse método para auxiliar
     return ThreadLocalRandom.current().nextDouble(1800, 2200);
}



    static void analisarCandidato(double salarioPretendido){    //1- primeiro declaramos um método que não vai nos retornar valor nenhum
/*Para que possamos analisar o candaidto, queremos saber o valor de salário que o candidato deseja ter, então iniciamos o
 * double de salario pretendido no próprio método, pois trabalharemos com base nele, atraves da resposta de cada candidato com base em seu salarioPretendido.
*/
double salarioBase = 2000.0;        //Indicamos o salário base .
if(salarioBase > salarioPretendido){    //dizemos que se o salario base for maior, dê o print.
    System.out.println("LIGAR PARA O CANDIDATO");
}
else if(salarioBase==salarioPretendido){        //se o salario for igual, de o print de contra proposta.
    System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");

}
else{       //se não, aguardar proximo candidato
    System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
}
//AGORA, QUE JA FIZEMOS A PARTE DE SEPARAR CADA MENSAGEM EM CADA CASO, VAMOS PARA A SELEÇÃO DOS CANDIDATOS (-1).
}


//começamos, la em cima, na parte do ARRAY COM A LISTA DE CANDIDATOS, listando alguns candidatos para nossa lista (-2 e -3).

//Agora, vamos imprimir a lista com os candidatos selecionados
}
