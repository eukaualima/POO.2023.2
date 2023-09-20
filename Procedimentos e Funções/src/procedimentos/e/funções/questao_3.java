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
 * @details Faça uma função que recebe por parâmetro um valor inteiro e positivo 
 * e retorna o valor lógico Verdadeiro caso o valor seja primo e Falso em caso 
 * contrário.  O programa principal imprimirá o texto “O Número é Primo”, caso 
 * a função retorne verdadeiro.
 * @note Lista 1 de Procedimentos e Funções / Programação Orientada a Objetos 2023.2 - IFBA Campus Camaçari - Prof. Dr. Fábio Cruz
 **/

/*
=----------------------=
=-> Classe Principal <-=
=----------------------=
*/
public class questao_3 
{
    // < Função principal >
    public static void main(String[] args) {
        // < Declaração de variáveis locais >
        boolean verifica_primo;
        int n;
        
        // < Entrada de dados >
        n = entrada();
        
        // < Verifica se é número primo, com retorno true or false >
        verifica_primo = primo(n);
        
        // < "O programa principal imprimirá o texto “O Número é Primo”, caso a função retorne verdadeiro." >
        if (verifica_primo == true)
        {
            JOptionPane.showMessageDialog(null, "Número informado: " + n + "\n\nO Número é Primo", "Verificador de número primo", 1);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Número informado: " + n + "\n\nO Número não é Primo", "Verificador de número primo", 1);
        }
    }
    
    // < Subprogramas >
    // < Função para receber um número inteiro positivo qualquer >
    public static int entrada()
    {
        // < Declaração de variáveis locais >
        String resposta;
        int n;
        
        do {
            // < Coleta o número >
            resposta = JOptionPane.showInputDialog(null, "Informe um número INTEIRO e POSITIVO qualquer:", "Verificador de número primo", 3);
            n = Integer.parseInt(resposta);
        } while (n < 0);
        
        // < Retorna o valor informado pelo usuário >
        return n;
    }
    
    // < Função para verificar se o número é primo, retornando true or false >
    public static boolean primo(int n)
    {
        // < Declaração de variáveis locais >
        int cPrimos, cDiv = 0;
        
        // < Cálculo de divisores do número informado >
        for (cPrimos = 1; cPrimos <= n; cPrimos++)
        {
            if (n % cPrimos == 0)
            {
                cDiv++;
            }
        }
        
        // < Retorna o resultado lógico, true or false >
        return (cDiv == 2);
    }
}
