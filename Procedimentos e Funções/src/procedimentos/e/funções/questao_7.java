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
 * @details Faça uma função que recebe a média final de um aluno por parâmetro e
 * retorna o seu conceito, conforme a tabela abaixo, para o programa principal:
 * Nota 		Conceito 
 * de 0,0 a 4,9 	D 
 * de 5,0 a 6,9 	C 
 * de 7,0 a 8,9 	B 
 * de 9,0 a 10,0 	A 
 * @note Lista 1 de Procedimentos e Funções / Programação Orientada a Objetos 2023.2 - IFBA Campus Camaçari - Prof. Dr. Fábio Marques
 **/

/*
=----------------------=
=-> Classe Principal <-=
=----------------------=
*/
public class questao_7
{
    // < Função principal >
    public static void main(String[] args) {
        // < Declaração de variáveis locais >
        String conceito;
        float mf;
        
        // < Entrada de dados >
        mf = entrada();
        
        // < Definição do conceito da MF >
        conceito = conceito_mf(mf);
        
        // < Imprime o conceito >
        JOptionPane.showMessageDialog(null, "Média Final do aluno:\n" + mf + "\nConceito: \n" + conceito, "Conceito de Média Final", 1);
    }
    
    // < Subprogramas >
    // < Função para entrada de dados >
    public static float entrada()
    {
        // < Declaração de variáveis locais >
        String resposta;
        float mf;
        
        // < Entrada de dados >
        resposta = JOptionPane.showInputDialog(null, "Informe a média final do aluno:", "Conceito de Média Final", 3);
        mf = Float.parseFloat(resposta);
        
        // < Verifica se a média é < 0 >
        if (mf < 0)
        {
            JOptionPane.showMessageDialog(null, "Média final inválida!", "Conceito de Média Final", 2);
            return entrada();
        }
        
        // < Retorna a media final do aluno >
        return mf;
    }
    
    // < Função para definição do conceito da MF >
    public static String conceito_mf(float mf)
    {
        // < Declaração de variáveis locais >
        String conceito;
        
        // < Verifica o conceito >
        if (mf >= 0.0 && mf <= 4.9)
        {
            conceito = "D";
        }
        else if (mf >= 5.0 && mf <= 6.9)
        {
            conceito = "C";
        }
        else if (mf >= 7.0 && mf <= 8.9)
        {
            conceito = "B";
        }
        else
        {
            conceito = "A";
        }
        
        return conceito;
    }
}
