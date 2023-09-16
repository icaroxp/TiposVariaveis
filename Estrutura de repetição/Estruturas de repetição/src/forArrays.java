public class forArrays {
    public static void main(String[] args) {

        String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS"}; //Aqui começamos uam variável string de array
        //Indicamos a variável guardará mais valores utilizando [] após declarar a variável
        //Após isso, declaramos os valores que terão, abrindo = {""} declarando dentro, e separando cada um com ,





        for (int x=0; x < alunos.length; x++){ //Aqui dentro temos um for normal, temos a inicialização no x=0;
            //temos que enquanto x for menor que alunos(o .lenght indica tamanho, enquanto esse índice, for menor do que o tamanho, ele continua executando)
            
            System.out.println("O aluno no índice x"+x+" "+"é"+" "+alunos[x]);
            //Nesse print, indicamos que o aluno na posição x, que colocamos para que ele inicie com posição 0
            //indicamos o nome do aluno em tal posição de cada índice
        }

        //PODEMOS TAMBÉM TRABALHAR COM O FOR/EACH, QUE É UM POUCO MAIS ABREVIADO ESSES ÍNDICES:
       
        for(String aluno : alunos){ //Aqui vamos indicar um for, um elemtno do tipo string
            //Aqui dezemos que o alun :(a cada iteração, o aluno atual atualiza a variável) agora chamamos
            //alunos que foram indicados no primeiro array.
            System.out.println("Nome do aluno é: "+ aluno);
        }



    }
}
