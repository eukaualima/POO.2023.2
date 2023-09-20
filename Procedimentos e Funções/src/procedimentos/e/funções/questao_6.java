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
 * @details Faça uma função que recebe um valor inteiro e verifica se o valor é 
 * positivo ou negativo. A função deve retornar um valor booleano para o 
 * programa principal que imprimirá o resultado.
 * @note Lista 1 de Procedimentos e Funções / Programação Orientada a Objetos 2023.2 - IFBA Campus Camaçari - Prof. Dr. Fábio Cruz
 **/

/*
=----------------------=
=-> Classe Principal <-=
=----------------------=
*/
public class questao_6
{
    // < Função principal >
    public static void main(String[] args) {
        // < Declaração de variáveis locais >
        boolean pn;
        int v;
        
        // < Entrada de dados >
        v = entrada();
        
        // < Verifica se é negativo ou positivo >
        pn = pos_neg(v);
        
        // < Imprime o resultado >
        if (pn == true)
        {
            JOptionPane.showMessageDialog(null, "Número positivo!");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Número negativo!");
        }
    }
    
    // < Subprogramas >
    // < Função para entrada de dados >
    public static int entrada()
    {
        // < Declaração de variáveis locais >
        String resposta;
        int v;
        
        // < Entrada de dados >
        resposta = JOptionPane.showInputDialog(null, "Informe um número:");
        v = Integer.parseInt(resposta);
        
        return v;
    }
    
    // < Função para verificar se o número é positivo ou negativo >
    public static boolean pos_neg(int v)
    {
        return (v > 0);
    }
}
