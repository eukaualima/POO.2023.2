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
 * @since 21/09/2023
 * @details Faça um procedimento que receba, por parâmetro, uma matriz B(9,9) 
 * de reais e some os elementos das linhas pares de B. 
 * @note Lista 1 de Procedimentos e Funções / Programação Orientada a Objetos 2023.2 - IFBA Campus Camaçari - Prof. Dr. Fábio Marques
 **/

/*
=----------------------=
=-> Classe Principal <-=
=----------------------=
*/
public class questao_11
{
    // < Função principal >
    public static void main(String[] args) 
    {
        // < Entrada de dados >
        entrada();
    }
    
    // < Subprogramas >
    // < Procedimento para entrada de dados >
    public static void entrada()
    {
        // < Declaração de variáveis locais >
        String resposta;
        int i, j;
        float [][]B;
        
        // < Declara o valor de índices da matriz >
        B = new float [2][2];
        
        // < Entrada de dados >
        for (i = 0; i < 2; i++)
        {
            for (j = 0; j < 2; j++)
            {
                resposta = JOptionPane.showInputDialog(null, "Informe " + (i + 1) + "x" + (j + 1) + ":");
                B[i][j] = Float.parseFloat(resposta);
            }
        }
        
        // < Chama o procedimento de soma dos valores pares >
        soma_pares(B);
    }
    
    // < Procedimento para soma de valores pares >
    public static void soma_pares(float [][]B)
    {
        // < Declaração de variáveis locais >
        int i, j;
        float soma = 0;
        
        // < Faz a soma das linhas pares >
        for (i = 0; i < B.length; i++)
        {
            for (j = 0; j < B.length; j++)
            {
                if (i % 2 == 0 && j % 2 == 0)
                {
                    soma += B[i][j] + B[i][i];
                }
            }
        }
        
        // < Retorna a soma total para a saída >
        saida(soma);
    }
    
    // < Procedimento para saída com resultado da soma >
    public static void saida(float soma)
    {
        JOptionPane.showMessageDialog(null, "Resultado da soma de linhas pares da matriz B(9, 9):\n" + soma);
    }
}
