package projects_java.src;

/**
 * Exercício 1 e 2
 * Variáveis, Tipos de dados, Operadores  
 * Criação de variáveis locais
 * main é o ponto inicial para construção de métodos no java
 * 
 */



 public class main {

    public static void Main(String[] args) {

        int quantidadeProduto = 50;
        int QuantidadeProduto = 10; // não é uma boa pratica
        final int NUMERO_TENTIVAS = 5;
        int QUANTIDADE_OPCOES = 25; // não é uma boa pratica, somente variaveis final em letras maiusculas e com _
        
        // esses nomes abaixo não são boas práticas, apenas mais didático
        byte b1 = 10;
        short s1 = 2000;
        final long l1 = 254500050005560L; // ironicamente não pode receber valores tão grandes

        float f1 = 10.98F;
        double d1 = 45.99D;
        char c1 = 'a'; // somente uma letra e com aspas simples
        String st1 = "Aqui é uma string!";
        boolean bo1 = true;
        

        System.out.println(quantidadeProduto);
        System.out.println(QuantidadeProduto);
        System.out.println(NUMERO_TENTIVAS);
        System.out.println(QUANTIDADE_OPCOES);
        System.out.println(b1);
        System.out.println(s1);
        System.out.println(l1);
        System.out.println(f1);
        System.out.println(d1);
        System.out.println(c1);
        System.out.println(st1);
        System.out.println(bo1);

    }}