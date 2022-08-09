package projects_java.projeto_calculadora;

/**
 * Exercício da Aula de métodos
 * /**
 */

 public class calculadora {

    public static void soma(double numero1, double numero2) {

        double resultado = numero1 + numero2;
        System.out.println("A soma dos números é " + resultado + "!");
    }

    public static void subtracao(double numero1, double numero2){

        double resultado = numero1 - numero2;
        System.out.println("A subtração de " + numero1 + " menos " + numero2 + " é igual a " + resultado + "!");
    }

    public static void multiplicacao(double numero1, double numero2){

        double resultado = numero1 * numero2;
        System.out.println("A multiplicação de " + numero1 + " vezes " + numero2 + " é igual a " + resultado + "!");
    }

    public static void divisao(double numero1, double numero2){

        double resultado = numero1 * numero2;
        System.out.println("A divisão de " + numero1 + " por " + numero2 + " é igual a " + resultado + "!");
    }

}