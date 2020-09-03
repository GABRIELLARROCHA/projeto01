package aula1;

import com.sun.org.apache.xpath.internal.objects.XString;

public class Programa02 {

    public static void main(String[] args) {

        System.out.println( "Seja bem-vindo ao mundo Java" ); //String (precisa de aspas "")
        System.out.println(46); // int (integer)- para números inteiros
        System.out.println(76.5); //double (casas decimais) - utilizar ponto e não virgula
        System.out.println(true); // boolean (variável para verdadero) sistema binário
        System.out.println(false); // boolean (variavel para falso) sistema binário
        // variáveis e numeros nao se usa aspas""

        int idade = 31; // variável idade recebe 31
        System.out.println(idade); // nesse caso o nome "idade" é uma variável pois nao existe aspas entre parentese

        String nome = "Gabriella"; //Inicializada na sua criacão
        System.out.println(nome);

        String sobrenome; // so foi criada (declarar variavel)
        sobrenome = "Rocha";
        System.out.println(sobrenome);

        String complemento;
        complemento = "Oliveira";
        System.out.println(complemento);

        String nacionalidade;
        nacionalidade = "Brasileira";
        System.out.println(nacionalidade);


        double altura = 1.58; // funcao para números decimais
        System.out.println(altura);

        boolean teste = false;
        System.out.println(teste);

        System.out.println(nome + " tem " + idade + " anos "); // tem que dar espaco dentro das aspas para ao rodar o programa as informacoes nao aparecam todas coladas

        System.out.println(nome + " tem " + idade + " anos " + " , " + nacionalidade);


       /* int minha_idade; // variavel composta com separador de anderlane ( _ ) mais ultilizada para bancos de dados
        int minha-idade; // html
        int minhaIdadeMaisImportante; // Camel case (usar as juncoes de palavras sinalizando por letras maiusculas no inicio da palavra*/

        // palavras reservadas já identificadas pelo sistema nao podem ser utilizadas como variaveis EX: int, boolean , public class etc..


        /*System.out.println( "aprofundando conhecimentos em JAVA ");
        System.out.println();
        System.out.println();*/   //Atalho para comentário em bloco é (command + shiftb + / )


        int x = 4;
        int y = 5;

        System.out.println(x + y); //9
        System.out.println(x - y); //- 1
        System.out.println(x * y); //20
        System.out.println(y / x); // 1,25 mas como nao esta sinalisado como numeros decimais o resultado é 1 (inteiro) e nao considera arredondamentos

        System.out.println(5.0/4.0); // 1.25 com casa decimal
        System.out.println(5%4); // módulo (resto)


        System.out.println("Calcule a área do losango");
        System.out.println("Para D=6.82 e d= 3.41");

        double D = 6.82;
        double d = 3.41;
        double AreaDolosango = D*d/2;

        System.out.println("ÁREA DO LOSANGO = " + AreaDolosango);













    }
}
