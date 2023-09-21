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
 * @details A prefeitura de uma cidade fez uma pesquisa entre os seus habitantes, 
 * coletando dados sobre o salário e número de filhos. Faça um programa que leia 
 * os dados em vetores e crie um procedimento que imprima a média de salário da 
 * população, a média do número de filhos, o maior salário e o percentual de 
 * pessoas com salário até R$550,00. Obs: O usuário deve informar a  quantidade 
 * de entrevistados.
 * @note Lista 1 de Procedimentos e Funções / Programação Orientada a Objetos 2023.2 - IFBA Campus Camaçari - Prof. Dr. Fábio Marques
 **/

/*
=----------------------=
=-> Classe Principal <-=
=----------------------=
*/
public class questao_9
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
        int qt_entrevistados, i;
        int []vetor_filhos;
        float m_salario, m_filhos;
        float []vetor_salario;
        float []maior_salario;
        float percentual_550;
        
        // < Entrada de dados >
        resposta = JOptionPane.showInputDialog(null, "COLETA DE DADOS DA POPULAÇÃO\n• Você irá receber no fim deste programa:\n    - Média de salários da população;\n    - média de filhos por entrevistado;\n    - maior salário;\n    - percentual de pessoas com salário de até R$550,00.\n\nInforme a quantidade de entrevistados:", "Prefeitura de Javapolis", 3);
        qt_entrevistados = Integer.parseInt(resposta);
        
        // < Define o valor dos vetores para registro dos dados >
        vetor_salario = new float [qt_entrevistados];
        maior_salario = new float [1];
        vetor_filhos = new int [qt_entrevistados];
        
        // < Coleta a informação dos entrevistados >
        for (i = 0; i < vetor_salario.length; i++)
        {
            resposta = JOptionPane.showInputDialog(null, "COLETA DE DADOS DA POPULAÇÃO\n• Entrevista nº "+ (i + 1 ) + " de " + qt_entrevistados + "\n• Pergunta 1 de 2\n\nSalário do cidadão #" + (i + 1) + ":", "Prefeitura de Javapolis | Entrevistado " + (i + 1) + " de " + qt_entrevistados, 3);
            vetor_salario[i] = Float.parseFloat(resposta);
            
            resposta = JOptionPane.showInputDialog(null, "COLETA DE DADOS DA POPULAÇÃO\n• Entrevista nº "+ (i + 1 ) + " de " + qt_entrevistados + "\n• Pergunta 2 de 2\n\nQuantidade de filhos do cidadão #" + (i + 1) + ":", "Prefeitura de Javapolis | Entrevistado " + (i + 1) + " de " + qt_entrevistados, 3);
            vetor_filhos[i] = Integer.parseInt(resposta);
        }
        
        // < Chama a função de média de salário da população >
        m_salario = media_salario(vetor_salario);
        
        // < Chama a função de média de número de filhos da população >
        m_filhos = media_filhos(vetor_filhos);
        
        // < Chama a função de escolha do maior salário - retorna o maior salário e o índice >
        maior_salario = coleta_maior_s(vetor_salario);
        
        // < Chama a função para calcular o percentual de pessoas com salário até R$550,00 >
        percentual_550 = percentual_salario(vetor_salario);
        
        // < Procedimento para imprimir o resultado ao usuário >
        printf(qt_entrevistados, m_salario, m_filhos, maior_salario, percentual_550);
    }
    
    // < Função para o somatório dos salários dos cidadãos >
    public static float somatorio_salario(float []vetor_salario)
    {
        // < Declaração de variáveis locais >
        float s = 0;
        int i;
        
        // < Somatório dos salários dos cidadãos >
        for (i = 0; i < vetor_salario.length; i++)
        {
            s += vetor_salario[i];
        }
        
        // < Retorna o somatório >
        return s;
    }
    
    // < Função para o cálculo da média de salário >
    public static float media_salario(float []vetor_salario)
    {
        // < Declaração de variáveis locais >
        float m, somatorio;
        
        // < Somatório dos salários >
        somatorio = somatorio_salario(vetor_salario);
        
        // < Cálculo da média >
        m = somatorio / vetor_salario.length;
        
        return m;
    }
    
    // < Função para o somatório dos filhos >
    public static int somatorio_filhos(int []vetor_filhos)
    {
        // < Declaração de variáveis locais >
        int s = 0, i;
        
        // < Somatório da quantidade de filhos >
        for (i = 0; i < vetor_filhos.length; i++)
        {
            s += vetor_filhos[i];
        }
        
        // < Retorna o somatório >
        return s;
    }
    
    // < Função para o cálculo da média de filhos >
    public static float media_filhos(int []vetor_filhos)
    {
        // < Declaração de variáveis locais >
        int somatorio;
        float m;
        
        // < Somatório dos filhos >
        somatorio = somatorio_filhos(vetor_filhos);
        
        // < Cálculo da média de filhos >
        m = somatorio / vetor_filhos.length;
        
        // < Retorna a média >
        return m;
    }
    
    // < Função para seleção do maior salário >
    public static float[] coleta_maior_s(float []vetor_salario)
    {
        // < Declaração de variáveis locais >
        float []salario_maior;
        int i;
        
        // < Definição do vetor de informações do salário >
        salario_maior = new float [2];
        
        // < Seleciona o maior salário >
        for (i = 0; i < vetor_salario.length; i++)
        {
            if (salario_maior[0] < vetor_salario[i])
            {
                salario_maior[0] = vetor_salario[i];
                salario_maior[1] = i;
            }
        }
        
        // < Retorna o maior salário >
        return salario_maior;
    }
    
    // < Função para o cálculo do percentual de pessoas com salário de até R$550,00 >
    public static float percentual_salario(float []vetor_salario)
    {
        // < Declaração de variáveis locais >
        int i;
        float pessoas_550 = 0, porcentagem;
        
        // < Calcula a quantidade de pessoas com salário de até R$550,00 >
        for (i = 0; i < vetor_salario.length; i++)
        {
            if (vetor_salario[i] <= 550.0)
            {
                pessoas_550++;
            }
        }
        
        // < Calcula a porcentagem de pessoas com salário de até R$550,00 >
        porcentagem = (pessoas_550 / vetor_salario.length) * 100;
        
        // < Retorna a porcentagem de pessoas com salário d eaté R$550,00 >
        return porcentagem;
    }
    
    // < Procedimento para impressão dos cálculos >
    public static void printf(int entrevistados, float m_salario, float m_filhos, float []maior_salario, float porcentagem)
    {
        JOptionPane.showMessageDialog(null, "RESULTADO DA COLETA DE DADOS DA POPULAÇÃO\n• Total de entrevistados:"
                + "\n" + entrevistados + ""
                + "\n• Média salarial da população:"
                + "\nR$" + m_salario + ""
                + "\n• Média de filhos por habitante entrevistado:"
                + "\n" + m_filhos + ""
                + "\n• Maior salário:"
                + "\nR$" + maior_salario[0] + " (Cidadão #" + (int) (maior_salario[1] + 1) + ")"
                + "\n• Porcentagem de cidadãos que recebem até R$550,00:"
                + "\n" + porcentagem + "%", "Prefeitura de Javapolis | Página Final", 1);
    }
}
