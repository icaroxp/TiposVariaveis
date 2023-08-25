public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
    

        //quando um número pode ser mudado, podemos atribuir um valor a ele, por exemplo;
        int valormutavel = 1;

        //depois, podemos utilizar esse "valormutavel" com oturo valor:

        valormutavel = 3;

        //temos também as constantes, ou seja, aqueles que, quando definidos, não poderão ser mudados durante a aplicação:

        final double VALOR_DE_PI = 3.14;

        //com isso, começamos com final (nesse caso, utilizamos double por ser um valor "quebrado") seguinte o nome da varivael (seno maiúscula para que ela não possa ser mudada.);


        String meuNome = "Icaro Xavier Peixoto";

        System.out.println(meuNome);
        System.out.println(VALOR_DE_PI);
        System.out.print(valormutavel);
    }
}
