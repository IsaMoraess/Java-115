/*Crie uma classe com um método chamdo maiorValor, que recebe 2 valores e retorna o maior.
Cria uma classe com o método main que lê dois números pelo teclado, chama o método
maiorValor e mostra uma frase informando que é o maior valor, a partir do retorno do método
maiorValor. Use os métodos da classe JOptionPane. */

public class Calculadora {
    // Método que retorna o maior valor entre dois números
    public static double maiorValor(double a, double b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
