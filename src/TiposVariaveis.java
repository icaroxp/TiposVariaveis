public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
    
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




//teste de Operadores aritmeticos:
        int multiplicação = 20*13;
        int soma = 12+33;
        int subtração = 20-13;
        double divisão = 20/13F; //em double e em float, precisamos colocar (em double f ou F no final do valor e em float, (f ou F);

        System.out.println(multiplicação);
        System.out.println(soma);
        System.out.println(subtração);
        System.out.println(divisão);
    

        
}
}