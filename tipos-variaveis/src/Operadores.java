import com.sun.org.apache.xpath.internal.operations.Bool;

public class Operadores {

    public static void main(String[] args) {

        // Operadores atribuição
        String nome = "Gabriel";
        int idade = 22;
        double peso = 68.5;
        char sexo = 'M';
        boolean doadorOrgao = true;
        // Classe e inicialização da classe = construtores
        //Date dataNascimento = new Date();

        // Operadores aritméticos
        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 17 % 3;

        //O operador de adição (+) utilizado por Strings concatena o texto
        String nomeCompleto = "Gabriel" + "Hedric";

        //Operadores unários
        int numero = 5;
        numero++;
        System.out.println(numero);

        boolean variavel = true;
        System.out.println(!variavel);

        //Operador ternário
        int a, b;
        a = 5;
        b = 6;
        // Condition ? true : false
        String resultado = a == b ? "verdadeiro" : "falso";
        System.out.println(resultado);

        //Operates relational

        int numeroUm = 1;
        int numeroDois = 2;

        boolean simNao = numeroUm == numeroDois;
        System.out.println("O número um é igual ao número dois? " + simNao);

        simNao = numeroUm != numeroDois;
        System.out.println("O número um é diferente do número dois? " + simNao);

        //Logical operates
        boolean conditionOne = true;
        boolean conditionTwo = true;

        if (conditionOne && conditionTwo) {
            System.out.println("Two conditions is true");
        }
    }
}
