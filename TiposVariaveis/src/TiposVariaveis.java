

public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
    
/*variáveis devem conter apenas letras, _, $ ou os números de 0 a 9;

deve obrigatoriamente se iniciar por uma letra, ou _ ou $, JAMAIS com números;

Boa prática é iniciar com letra minúscula

Não pode conter espaço

Não podemos usar palavras-chave da linguagem

O nome deve ser único dentro de um escopo
As variáveis em java mais comummente utilizadas são: 
byte.
short.
int.
long.
char.
float.
double.
boolean./* */


//quando um número pode ser mudado, podemos atribuir um valor a ele, por exemplo;
        int valormutavel = 1;

//depois, podemos utilizar esse "valormutavel" com oturo valor:

        valormutavel = 3;

//temos também as constantes, ou seja, aqueles que, quando definidos, não poderão ser mudados durante a aplicação:

        final double VALOR_DE_PI = 3.14;

//com isso, começamos com final (nesse caso, utilizamos double por ser um valor "quebrado") seguinte o nome da varivael (seno maiúscula para que ela não possa ser mudada.);


        String texto = "Qualquer texto entre aspas é uma string.";

        System.out.println(texto);
        System.out.println(VALOR_DE_PI);
        System.out.println(valormutavel);





        
}
}