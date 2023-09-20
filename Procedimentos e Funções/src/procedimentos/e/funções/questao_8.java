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
 * @note Lista 1 de Procedimentos e Funções / Programação Orientada a Objetos 2023.2 - IFBA Campus Camaçari - Prof. Dr. Fábio Cruz
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
        
        resposta = JOptionPane.showInputDialog(null, "Informe a altura:", "Cálculo de Peso Ideal", 3);
        altura = Float.parseFloat(resposta);
        
        // < Envia os dados para o cálculo do peso ideal >
        peso_ideal(sexo, altura);
    }
    
    public static void peso_ideal(String sexo, float altura)
    {
        double ideal;
        
        if (sexo.equalsIgnoreCase("feminino"))
        {
            ideal = 72.7 * altura - 58;
        }
        else
        {
            ideal = 62.1 * altura - 44.7;
        }
        
        saida(ideal);
    }
}
