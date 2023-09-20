package procedimentos.e.funções;
/*
=-----------------=
=-> Importações <-=
=-----------------=
*/
import javax.swing.*;

/*
=---------------=
=-> Cabeçalho <-=
=---------------=
*/
/**
 * @author Kauã dos Santos Lima
 * @since 20/09/2023
 * @details Escreva um procedimento que recebe as 3 notas de um aluno por 
 * parâmetro e uma letra. Se a letra for A o procedimento calcula e imprime a 
 * média aritmética das notas do aluno, se for P, a sua média ponderada (pesos: 
 * 5, 3 e 2) e se for H, a sua média harmônica.
 * @note Lista 1 de Procedimentos e Funções / Programação Orientada a Objetos 2023.2 - IFBA Campus Camaçari - Prof. Dr. Fábio Cruz
 **/

/*
=----------------------=
=-> Classe Principal <-=
=----------------------=
*/
public class questao_2 
{
    // < Função principal >
    public static void main(String[] args) {
        // < Chama o subprograma de coleta de notas > 
        notas();
    }
    
    // < Subprogramas >
    // < Função para o cálculo da média aritmética >
    public static float media_aritmetica(float a, float b, float c)
    {
        // < Declaração de variáveis locais >
        float m;
        
        // < Calcula a média aritmética >
        m = (a + b + c) / 3;
        
        // < Retorna o valor do cálculo> 
        return m;
    }

    // < Função para o cálculo da média ponderada >
    public static float media_ponderada(float a, float b, float c)
    {
        // < Declaração de variáveis locais >
        float m;
        
        // < Calcula a média ponderada; 5, 3 e 2 como pesos >
        m = (5 + 3 + 2) / (a + b + c);
        
        // < Retorna o valor do cálculo >
        return m;
    }
    
    // < Função para o cálculo da média harmônica >
    public static float media_harmonica(float a, float b, float c)
    {
        // < Declaração de variáveis locais >
        float m;
        
        // < Calcula a média harmônica >
        m = 3 / ((1 / a) + (1 / b) + (1 / c));
        
        // < Retorna o valor do cálculo >
        return m;
    }
    
    // < Função de menu para resultado de médias >
    public static void menu(float nota_1, float nota_2, float nota_3)
    {
        // < Declaração de variáveis locais >
        String resposta;
        
        loop: do {
            // < Variável temporária para guardar a média >
            float m;
            
            // < Coleta a opção que o usuário deseja acessar >
            resposta = JOptionPane.showInputDialog(null, "Nota 1: " + nota_1 + "\nNota 2: " + nota_2 + "\nNota 3: " + nota_3 + "\n\nEscolha uma das opções abaixo:\nA) Média aritmética das notas do aluno;\nP) média ponderada;\nH) média harmônica.\nS) Finaliza o programa.\n", "Menu de Seleção", 1);
            
            // < Verifica a resposta do usuário >
            switch(resposta)
            {
                case "A": case "a": // Mostra a média aritmética das 3 notas
                    m = media_aritmetica(nota_1, nota_2, nota_3);
                    JOptionPane.showMessageDialog(null, "Nota 1: " + nota_1 + "\nNota 2: " + nota_2 + "\nNota 3: " + nota_3 + "\n\nA média aritmética é:\n" + m);
                    break;
                case "P": case "p": // Mostra a média ponderada das 3 notas
                    m = media_ponderada(nota_1, nota_2, nota_3);
                    JOptionPane.showMessageDialog(null, "Nota 1: " + nota_1 + "\nNota 2: " + nota_2 + "\nNota 3: " + nota_3 + "\n\nA média ponderada é:\n" + m);
                    break;
                case "H": case "h": // Mostra a média harmônica das 3 notas
                    m = media_harmonica(nota_1, nota_2, nota_3);
                    JOptionPane.showMessageDialog(null, "Nota 1: " + nota_1 + "\nNota 2: " + nota_2 + "\nNota 3: " + nota_3 + "\n\nA média harmônica é:\n" + m);
                    break;
                case "s": case "S": // Fecha o programa
                    break loop;
                default: // Retorna erro
                    JOptionPane.showMessageDialog(null, "Informe uma letra válida!", "Menu de Seleção", 1);
                    break;
            }
            
        } while (true);
    }
    
    // < Função para a coleta das 3 notas do aluno >
    public static void notas()
    {
        // < Declaração de variáveis locais >
        String resposta_1, resposta_2, resposta_3;
        float nota_1, nota_2, nota_3;
        
        // < Coleta a nota 1 > 
        resposta_1 = JOptionPane.showInputDialog(null, "Nota 1: ?\nNota 2: ?\nNota 3: ?\n\nInforme nota 1:", "Inserção de notas", 3);
        nota_1 = Float.parseFloat(resposta_1);
        
        // < Coleta a nota 2 > 
        resposta_2 = JOptionPane.showInputDialog(null, "Nota 1: " + nota_1 + "\nNota 2: ?\nNota 3: ?\n\nInforme nota 2:", "Inserção de notas", 3);
        nota_2 = Float.parseFloat(resposta_2);
        
        // < Coleta a nota 3 > 
        resposta_3 = JOptionPane.showInputDialog(null,"Nota 1: " + nota_1 + "\nNota 2: " + nota_2 + "\nNota 3: ?\n\nInforme nota 3:", "Inserção de notas", 3);
        nota_3 = Float.parseFloat(resposta_3);
        
        // < Chama a função menu, enviando as 3 notas recebidas >
        menu(nota_1, nota_2, nota_3);
    }
}
