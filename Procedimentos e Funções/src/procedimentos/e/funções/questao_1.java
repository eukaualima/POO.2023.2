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
 * @details Faça uma função que recebe por parâmetro o raio de uma esfera e 
 * calcula o seu volume (v = 4/3 * π * r3), onde r é o raio da esfera e π é 
 * uma constante igual a 3,14159265.
 * @note Lista 1 de Procedimentos e Funções / Programação Orientada a Objetos 2023.2 - IFBA Campus Camaçari - Prof. Dr. Fábio Cruz
 **/

/*
=----------------------=
=-> Classe Principal <-=
=----------------------=
*/
public class questao_1 {
    // < Subprogramas >
    
    // < Coleta o número do raio através da entrada de dados >
    public static float informa_raio()
    {
        // < Declaração de variáveis locais >
        String resposta;
        float r;
        
        // < Entrada de dados >
        resposta = JOptionPane.showInputDialog(null, "Informe o raio da esfera:", "Cálculo de raio", 3);
        
        // < Converte o número informado >
        r = Float.parseFloat(resposta);
        
        // < Retorna o número do raio que foi informado pelo usuário >
        return r;
    }
    
    // < Aplicação da fórmula v = 4/3 * π * r3 >
    public static float volume(float r)
    {
        // < Declaração de variáveis locais >
        float pi, v;
        
        // < Atribui o valor de π >
        pi = (float) 3.14159265;
        
        // < Aplicação da fórmula de volume >
        v = ((4/3) * pi * ((float ) Math.pow(3, r)));
        
        // < Retorna o volume >
        return v;
    }
    
    public static void saida(float v)
    {
        JOptionPane.showMessageDialog(null, "O volume da esfera informada é de:\n" + v + " m³");
    }
    public static void main(String[] args) {
        // < Declaração de variáveis >
        float r, v;
        
        // < Coleta o raio da esfera >
        r = informa_raio();
        
        // < Calcula o volume da esfera >
        v = volume(r);
        
        // < Saída com o resultado do cálculo da fórmula >
        saida(v);
    }
}
