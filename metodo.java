import javax.swing.JOptionPane;

public class metodo {
    public static void main(String[] args) {
        // Lê dois números do usuário
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));
        
        // Chama o método maiorValor
        double maior = Calculadora.maiorValor(num1, num2);

        // Mostra o maior valor
        JOptionPane.showMessageDialog(null, "O maior valor é: " + maior);
    }
}
