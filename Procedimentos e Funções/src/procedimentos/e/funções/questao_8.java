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
 * @details Faça uma função que recebe, por parâmetro, a altura e o sexo de uma 
 * pessoa e retorna o seu peso ideal. Para homens, calcular o peso ideal usando 
 * a fórmula peso ideal = 72.7 x alt - 58 e, para mulheres, peso ideal = 62.1 x 
 * alt - 44.7. 
 * @note Lista 1 de Procedimentos e Funções / Programação Orientada a Objetos 2023.2 - IFBA Campus Camaçari - Prof. Dr. Fábio Marques
 **/

/*
=----------------------=
=-> Classe Principal <-=
=----------------------=
*/
public class questao_8
{
    // < Função principal >
    public static void main(String[] args) 
    {
        // < Entrada de dados >
        entrada();
    }
    
    // < Subprogramas >
    public static void entrada()
    {
        // < Declaração de variáveis locais >
        String sexo, resposta;
        float altura;
        
        // < Entrada de dados >
        sexo = JOptionPane.showInputDialog(null, "MASCULINO ou FEMININO\n\nInforme o sexo:", "Cálculo de Peso Ideal", 3);
       
        // < Verifica se o sexo é válido>
        if (!(sexo.equalsIgnoreCase("masculino") || sexo.equalsIgnoreCase("feminino")))
        {
            JOptionPane.showMessageDialog(null, "Informe um sexo válido!", "Cálculo de Peso Ideal", 2);
            entrada();
        }
        
        // < Entrada de dados >
        resposta = JOptionPane.showInputDialog(null, "Informe a altura:", "Cálculo de Peso Ideal", 3);
        altura = Float.parseFloat(resposta);
        
        // < Envia os dados para o cálculo do peso ideal >
        peso_ideal(sexo, altura);
    }
    
    // < Função para aplicação da fórmula ideal = 72.7 x alt - 58 ou ideal = 62.1 x alt - 44.7 > 
    public static void peso_ideal(String sexo, float altura)
    {
        float ideal;
        
        if (sexo.equalsIgnoreCase("feminino"))
        {
            ideal = (float) (72.7 * altura - 58);
        }
        else
        {
            ideal = (float) (62.1 * altura - 44.7);
        }
        
        saida(ideal, altura, sexo);
    }
    
    // < Função para impressão do resultado >
    public static void saida(float ideal, float altura, String sexo)
    {
        JOptionPane.showMessageDialog(null, "Sexo: " + sexo.toLowerCase() + "\n\nO peso ideal para a altura " + altura + " é de " + Math.round(ideal) + "kg.", "Cálculo de Peso Ideal", 1);
    }
}
