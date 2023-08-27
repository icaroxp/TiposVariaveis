public class OperadoresLogicos {
    public static void main(String[] args)throws Exception{

/*Operadores lógicos são aqueles que comummente usamos para indicarmos igualdade, maior ou igual, maior, menor...
Podemos representar como:
 ==, !=, <, >, <=, >= /* */ 

//teste de Operadores aritmeticos:
int multiplicação = 20*13;
int soma = 12+33;
int subtração = 20-13;
double divisão = 20/13F; //em double e em float, precisamos colocar (em double f ou F no final do valor e em float, (f ou F);
int modulo = 18%3;  //aqui temos o restante de uma divisão, o resto dela
String nomeCompleto = "Icaro" + " " + "Xavier" + " " + "Peixoto";

System.out.println(nomeCompleto);
System.out.println(multiplicação);
System.out.println(soma);
System.out.println(subtração);
System.out.println(divisão);
System.out.println(modulo);



//aprendendo operadores (mudando o valor para positivo e negativo)
int num = 5;


System.out.println(++ num ); //incrementando +1 quando o programa rodar


System.out.println(-- num);//decrementando em -1 quando o programa rodar



//mostrando valores booleanos:

boolean va = true; //aqui eu disse que a boolean va é true;

System.out.println(!va); //aqui eu disse que a boolean va vai imprimir que va é false (pois usei a inversão dentro do print, dentro da memoria va ainda continua sendo true, mudando apenas no print)

va = !va; //agora eu disse que nossa variavel passou de fato a ser false, ivnertemos o valor da variavel do tipo booleana;

System.out.println(va);

//agora vamos abreviar com uso de operador alternário:

/*Por exemplo, quando queremos dizer que, se a for igual a b, uma mensagem será exbibida como (verdadeiro caso for verdade),
 * e caso fou falso (falso);
 * normalmente diriamos: EX: a=5; b=6;
 * 
 * String resultado = "";
 * if(a==b)
 *  resultado = "veradeiro";
 * else
 *  resultado="falso";
 * System.out.println(resultado);
 * 
 * Assim, estaria correto, entretanto temos forma de colocar isso abreviadamente, como exemplo abaixo:
 */

    
    int a = 5; int b = 6;

        String resultado = a==b ?"Verdadeiro" : "falso";

        System.out.println(resultado);






    }
}
