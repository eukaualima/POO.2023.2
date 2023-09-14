// < Pacote que o programa faz parte >
package aula02;

// < Importação de bibliotecas >
import javax.swing.JOptionPane;

// < Classe principal do programa >
public class calculadora {
    
    // < Função principal do programa >
    public static void main(String[] args) {
        String resposta_1;
        int opcao;
        float resultado, n1, n2;
        
        resposta_1 = JOptionPane.showInputDialog(null, "Qual cálculo deseja fazer?\n0 - Multiplicação;\n1 - Divisão;\n2 - Soma;\n3 - Subtração.\n\nDigite no campo a opção que deseja acessar:", "Calculadora - POO / Kauã", 1);
        opcao = Integer.parseInt(resposta_1);
        switch (opcao) {
            case 0: // Multiplicação
                resposta_1 = JOptionPane.showInputDialog(null, "Informe o PRIMEIRO número da multiplicação: ", "Calculadora - POO / Kauã", 1);
                n1 = Float.parseFloat(resposta_1);
                
                resposta_1 = JOptionPane.showInputDialog(null, "Informe o SEGUNDO número da multiplicação: ", "Calculadora - POO / Kauã", 1);
                n2 = Float.parseFloat(resposta_1);
                
                resultado = n1 * n2;
                
                JOptionPane.showMessageDialog(null, "Resultado da multiplicação:\n" + n1 + " * " + n2 + " = " + resultado);
                
            case 1: // Divisão
                do {
                    resposta_1 = JOptionPane.showInputDialog(null, "Não utilize 0!\nInforme o PRIMEIRO número da divisão:", "Calculadora - POO / Kauã", 1);
                    n1 = Float.parseFloat(resposta_1);
                } while (n1 == 0);
                
                resposta_1 = JOptionPane.showInputDialog(null, "Informe o SEGUNDO número da divisão:", "Calculadora - POO / Kauã", 1);
                n2 = Float.parseFloat(resposta_1);
                
                resultado = n1 / n2;
                
                JOptionPane.showMessageDialog(null, "Resultado da divisão:\n " + n1 + " / " + n2 + " = " + resultado);
                break;
            case 2: // Soma
                resposta_1 = JOptionPane.showInputDialog(null, "Informe o PRIMEIRO número da soma: ", "Calculadora - POO / Kauã", 1);
                n1 = Float.parseFloat(resposta_1);
                
                resposta_1 = JOptionPane.showInputDialog(null, "Informe o SEGUNDO número da soma: ", "Calculadora - POO / Kauã", 1);
                n2 = Float.parseFloat(resposta_1);
                
                resultado = n1 + n2;
                
                JOptionPane.showMessageDialog(null, "Resultado da soma:\n " + n1 + " + " + n2 + " = " + resultado);
                break;
            case 3: // Subtração
                resposta_1 = JOptionPane.showInputDialog(null, "Informe o PRIMEIRO número da subtração: ", "Calculadora - POO / Kauã", 1);
                n1 = Float.parseFloat(resposta_1);
                
                resposta_1 = JOptionPane.showInputDialog(null, "Informe o SEGUNDO número da subtração: ", "Calculadora - POO / Kauã", 1);
                n2 = Float.parseFloat(resposta_1);
                
                resultado = n1 - n2;
                
                JOptionPane.showMessageDialog(null, "Resultado da subtração " + n1 + " - " + n2 + " = " + resultado);
                break;
            default:
                resposta_1 = JOptionPane.showInputDialog(null, "Informe o PRIMEIRO número da soma: ", "Calculadora - POO / Kauã", 1);
                n1 = Float.parseFloat(resposta_1);
                
                resposta_1 = JOptionPane.showInputDialog(null, "Informe o SEGUNDO número da soma: ", "Calculadora - POO / Kauã", 1);
                n2 = Float.parseFloat(resposta_1);
                
                resultado = n1 + n2;
                
                JOptionPane.showMessageDialog(null, "Resultado da soma " + n1 + " + " + n2 + " = " + resultado);
                break;
        }
    }
}
