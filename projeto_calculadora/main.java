package projeto_calculadora;

/**
 * 
 * Classe executora e principal do exercício.
 * 
 */

public class main {

    public static void main(String[] args){

        // Calculadora
        System.out.println("Exercício calculadora");
        calculadora.soma(3, 6);
        calculadora.subtracao(9, 1.8);
        calculadora.divisao(5, 2.5);
        calculadora.multiplicacao(7, 8);


        //Mensagem
        System.out.println("Exercício mensagem");
        mensagem.obterMensagem(9);
        mensagem.obterMensagem(14);
        mensagem.obterMensagem(1);
    
        //Emprestimo
        System.out.println("Exercício empréstimo");
        emprestimo.calcular(1000, emprestimo.getDuasParcelas());
        emprestimo.calcular(1000, emprestimo.getTresParcelas());
        emprestimo.calcular(1000, 5);    
    }
    
}
