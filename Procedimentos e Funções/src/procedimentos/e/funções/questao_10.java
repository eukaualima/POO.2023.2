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
 * @details Faça um procedimento que recebe um vetor de valores inteiros por 
 * parâmetro e ordena-os em ordem crescente.
 * @note Lista 1 de Procedimentos e Funções / Programação Orientada a Objetos 2023.2 - IFBA Campus Camaçari - Prof. Dr. Fábio Marques
 **/

/*
=----------------------=
=-> Classe Principal <-=
=----------------------=
*/
public class questao_10
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
        int qt_numeros, i, maior = 0, temp;
        int []vetor;
        
        // < Entrada de dados >
        resposta = JOptionPane.showInputDialog(null, "Quantos números deseja ordenar?", "Ordenador de número inteiros", 3);
        qt_numeros = Integer.parseInt(resposta);
        
        // < Declara o valor do vetor >
        vetor = new int [qt_numeros];
        
        // < Preenche o vetor >
        for (i = 0; i < vetor.length; i++)
        {
            resposta = JOptionPane.showInputDialog(null, "Número #" + (i + 1), "Ordenador de número inteiros", 3);
            vetor[i] = Integer.parseInt(resposta);
        }
        
        ordenar(vetor);
    }
    
    // < Procedimento para ordenar os números em ordem crescente>
    public static void ordenar(int []vetor)
    {
        // < Declaração de variáveis locais >
        int i, j, maior = vetor[0], temp;
        boolean ordenou;
        
        // < Ordena os números >
        do 
        {
            ordenou = false;
            j = 0;
            for (i = 0; i < (vetor.length - 1); i++)
            {
                j++;
                if (vetor[i] > vetor[j])
                {
                    temp = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = temp;
                    ordenou = true;
                }
            }
        } while (ordenou == true);
        
        // < Chama o procedimento de impressão >
        printf(vetor);
    }
    
    // < Procedimento para impressão dos números em ordem crescente >
    public static void printf(int []vetor)
    {
        // < Declaração de variáveis locais >
        String resposta = "";
        int i;
        
        // < Concatenação dos valores >
        for (i = 0; i < vetor.length; i++)
        {
            if ((i + 1) % 5 != 0)
            {
                resposta += vetor[i] + "  ";
            }
            else
            {
                resposta += vetor[i] + "\n";
            }
        }
        
        // < Impressão dos valores >
        JOptionPane.showMessageDialog(null, resposta, "Ordenador de números inteiros", 1);
    }
}
